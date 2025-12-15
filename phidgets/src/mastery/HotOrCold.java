package mastery; 
import com.phidget22.*;

public class HotOrCold {
	public static void main(String[] args) throws Exception{
		DigitalOutput redLED = new DigitalOutput();
		
		redLED.setHubPort(1);
		redLED.setIsHubPortDevice(true);
		
		redLED.open(1000);
		
		DigitalOutput greenLED = new DigitalOutput();
		
		greenLED.setHubPort(4);
		greenLED.setIsHubPortDevice(true);
		
		greenLED.open(1000);

        TemperatureSensor temp = new TemperatureSensor();

        temp.open(1000);

        while(true){
        	if (temp.getTemperature() > 20 && temp.getTemperature() < 24) {
        		greenLED.setState(true);
        		redLED.setState(false);
        		
        	} else {
        		greenLED.setState(false);
        		redLED.setState(true);
        	}
        	
        	System.out.println("Temperature: " + temp.getTemperature() + " °C" );
        	System.out.println();
            Thread.sleep(100);
        }
    }
}
