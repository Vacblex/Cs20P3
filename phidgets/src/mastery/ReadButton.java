package mastery;
import com.phidget22.*;

public class ReadButton {
    public static void main(String[] args) throws Exception{
        
        DigitalInput redButton = new DigitalInput();

        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);

        redButton.open(1000);
        
        DigitalInput greenButton = new DigitalInput();

        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        greenButton.open(1000);

        while(true){
        	if (redButton.getState() == true) {
        		System.out.println("Red Button State: " + redButton.getState());
        		System.out.println();
        		while (redButton.getState() == true) {
        			Thread.sleep(1);
        		}
        		if (redButton.getState() == false) {
        			System.out.println("Red Button State: " + redButton.getState());
        			System.out.println();
        		}
        	}
        	if (greenButton.getState() == true) {
        		System.out.println("Green Button State: " + greenButton.getState() + "---");
        		System.out.println();
        		while (greenButton.getState() == true) {
        			Thread.sleep(1);
        		}
        		if (greenButton.getState() == false) {
        			System.out.println("Green Button State: " + greenButton.getState() + "---");
        			System.out.println();
        		}
        	}
        }
    }
}
