public class Vehicle {
    
    private static double registrationFee = 5000.0; 

    
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber; 

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

   
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: ₹" + registrationFee);
    }

   
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: ₹" + registrationFee);
            System.out.println("----------------------------------");
        } else {
            System.out.println("Invalid Vehicle object!");
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car", "REG1234");
        Vehicle v2 = new Vehicle("Bob", "Bike", "REG5678");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(6000.0);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

