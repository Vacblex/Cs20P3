package mastery;
import com.phidget22.*;

public class Thermostat {
	public static void main(String[] args) throws Exception{
		DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        TemperatureSensor temp = new TemperatureSensor();
        
        temp.open(1000);
        
        double settemp = 21;
        double settemppast = 21;
        
        long start = System.currentTimeMillis();
        
        while(true){
        	long timer = System.currentTimeMillis(); //time when started, current time, time elapsed
        	long elapsed = timer - start;
        	
        	if(greenButton.getState() == true){
                settemp++;
            } else if(redButton.getState() == true) {
                settemp--;
            }
        	
        	if (temp.getTemperature() >= settemp - 2 && temp.getTemperature() <= settemp + 2) {
        		redLED.setState(false);
        		greenLED.setState(true);
        	} else {
        		redLED.setState(true);
        		greenLED.setState(false);
        	}
        	System.out.println("Set temperature " + settemp);
        	if (elapsed >= 10000) {
        		System.out.println("Temperature: " + temp.getTemperature());
        		System.out.println("Set temperature " + settemp);
        		System.out.println();
        		start = System.currentTimeMillis();
        	}
        }
    }
}
