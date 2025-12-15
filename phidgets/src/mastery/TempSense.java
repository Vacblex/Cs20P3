package mastery;
import com.phidget22.*;
  
public class TempSense {
	public static void main(String[] args) throws Exception{

        TemperatureSensor temp = new TemperatureSensor();

        temp.open(1000);

        while (true) {
        	double Fahrenheit = (temp.getTemperature() * 1.8) + 32;
            System.out.println("Temperature Celsius: " + temp.getTemperature());
            System.out.printf("Temperature Fahrenheit: %.2f%n", Fahrenheit);
            System.out.println();
            Thread.sleep(100);
        }
    }
}
