package mastery; 
import com.phidget22.*;

public class HumidSense {
	public static void main(String[] args) throws Exception{

        HumiditySensor humid = new HumiditySensor();
        TemperatureSensor temp = new TemperatureSensor();

        humid.open(1000);
        temp.open(1000);

        while(true){
        	if (humid.getHumidity() > 30) {
        		System.out.println("Humidity: " + humid.getHumidity() +"%");
        	} else {
        		System.out.println("Humidity is low");
        	}
        	
        	if (temp.getTemperature() > 21) {
        		System.out.println("Temperature: " + temp.getTemperature() + " °C" );
        	} else {
        		System.out.println("Temperature is too cold");
        	}
        	
        	System.out.println();
            Thread.sleep(100);
        }
    }
}
