package mastery;
import com.phidget22.*;

public class ButtonLED {
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
        
        int countgreen = 0;
        int countred = 0;

        while(true){

            if(greenButton.getState()){
                redLED.setState(false);
                countgreen++;
                System.out.println("green count = " + countgreen);
        		while (greenButton.getState() == true) {
        			Thread.sleep(1);
        		}
            } else {
                redLED.setState(true);
            }

            if(redButton.getState()){
                greenLED.setState(false);
                countred++;
                System.out.println("red count = " + countred);
        		while (redButton.getState() == true) {
        			Thread.sleep(1);
        		}
            } else {
                greenLED.setState(true);
            }
            
        }
    }
}
