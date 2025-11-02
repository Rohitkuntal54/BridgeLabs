interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String id, String driver, double rate, String location) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
        this.currentLocation = location;
    }

   
    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: " + ratePerKm);
    }

    public abstract double calculateFare(double distance);
}


class Car extends Vehicle implements GPS {
    public Car(String id, String driver, double rate, String location) {
        super(id, driver, rate, location);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50; 
    }

    @Override
    public String getCurrentLocation() {
        return "Car currently near Main Street.";
    }

    @Override
    public void updateLocation(String newLocation) {
        System.out.println("Car location updated to: " + newLocation);
    }
}

class Bike extends Vehicle implements GPS {
    public Bike(String id, String driver, double rate, String location) {
        super(id, driver, rate, location);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); 
    }

    @Override
    public String getCurrentLocation() {
        return "Bike currently near Market Area.";
    }

    @Override
    public void updateLocation(String newLocation) {
        System.out.println("Bike location updated to: " + newLocation);
    }
}


class Auto extends Vehicle implements GPS {
    public Auto(String id, String driver, double rate, String location) {
        super(id, driver, rate, location);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20; // small base charge
    }

    @Override
    public String getCurrentLocation() {
        return "Auto currently near City Station.";
    }

    @Override
    public void updateLocation(String newLocation) {
        System.out.println("Auto location updated to: " + newLocation);
    }
}
public class ques8 {
    public static void processRides(Vehicle[] rides, double distance) {
        for (Vehicle v : rides) {
            v.getVehicleDetails();
            double fare = v.calculateFare(distance);
            System.out.println("Fare for " + distance + " km: ₹" + fare);

            GPS gps = (GPS) v;
            System.out.println(gps.getCurrentLocation());
            gps.updateLocation("New Destination");
            System.out.println("----------------------------------");
        }
    }

    public static void main(String[] args) {
        Vehicle[] rides = {
            new Car("C101", "Alice", 15, "Downtown"),
            new Bike("B202", "Bob", 8, "Mall Road"),
            new Auto("A303", "Charlie", 10, "Bus Stand")
        };

        processRides(rides, 10.5); 
    }
}
