package mastery;
import com.phidget22.*;

public class TugWar {
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

        while(countgreen != 10 && countred != 10){

            if(greenButton.getState()){
                countgreen++;
                System.out.println("green count = " + countgreen);
        		while (greenButton.getState() == true) {
        			Thread.sleep(1);
        		}
            }
            if(redButton.getState()){
                countred++;
                System.out.println("red count = " + countred);
        		while (redButton.getState() == true) {
        			Thread.sleep(1);
        		}
            }
        }
	    if (countred == 10 && countgreen == 10) {
	    	System.out.println("Tie!");
	    	for (int i = 0; i < 5; i++) {
	    	    redLED.setState(true);
	    	    greenLED.setState(true);
	    	    Thread.sleep(500);
	    	    redLED.setState(false);
	    	    greenLED.setState(false);
	    	    Thread.sleep(500);
	    	}
		} else if (countred == 10) {
			System.out.println("Red win!");
	    	for (int i = 0; i < 5; i++) {
	    	    redLED.setState(true);
	    	    Thread.sleep(500);
	    	    redLED.setState(false);
	    	    Thread.sleep(500);
	    	}
	    } else if (countgreen == 10) {
	    	System.out.println("Green win!");
	    	for (int i = 0; i < 5; i++) {
	    	    greenLED.setState(true);
	    	    Thread.sleep(500);
	    	    greenLED.setState(false);
	    	    Thread.sleep(500);
	    	}
	    }
	}
}
