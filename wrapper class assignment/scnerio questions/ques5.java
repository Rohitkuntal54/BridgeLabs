import java.util.ArrayList;

public class ques5 {

    
    public static void logTemperature(Double temp) {
        System.out.println("Logged temperature: " + temp);
    }

   
    public static void logTemperature(double temp) {
        System.out.println("Logged temperature (primitive): " + temp);
    }

    public static void main(String[] args) {
        
        ArrayList<Double> temperatureData = new ArrayList<>();

       
        double reading1 = 23.5;
        double reading2 = 28.7;
        temperatureData.add(reading1);
        temperatureData.add(reading2);

        
        logTemperature(reading1); 
        logTemperature(Double.valueOf(reading2)); 

        
        double firstReading = temperatureData.get(0); 
        double secondReading = temperatureData.get(1);

        System.out.println("\nReadings from ArrayList:");
        System.out.println("First reading: " + firstReading);
        System.out.println("Second reading: " + secondReading);
    }
}

