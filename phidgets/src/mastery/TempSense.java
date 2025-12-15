package mastery;
import com.phidget22.*;
  
public class TempSense {
	public static void main(String[] args) throws Exception{

        TemperatureSensor temperatureSensor = new TemperatureSensor();

        temperatureSensor.open(1000);

        while (true) {
            System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        }
    }
}
