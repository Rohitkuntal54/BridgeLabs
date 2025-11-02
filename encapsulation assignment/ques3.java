interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String number, String type, double rate) {
        this.vehicleNumber = number;
        this.type = type;
        this.rentalRate = rate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle No: " + vehicleNumber + ", Type: " + type + ", Rate: " + rentalRate);
    }
}


class Car extends Vehicle implements Insurable {
    private String policyNumber;

    public Car(String num, double rate, String policy) {
        super(num, "Car", rate);
        this.policyNumber = policy;
    }

    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return getRentalRate() * 0.05; }
    public String getInsuranceDetails() { return "Car Insurance Policy: " + policyNumber; }
}

class Bike extends Vehicle implements Insurable {
    private String policyNumber;

    public Bike(String num, double rate, String policy) {
        super(num, "Bike", rate);
        this.policyNumber = policy;
    }

    public double calculateRentalCost(int days) { return getRentalRate() * days * 0.8; } // cheaper
    public double calculateInsurance() { return getRentalRate() * 0.02; }
    public String getInsuranceDetails() { return "Bike Insurance Policy: " + policyNumber; }
}


class Truck extends Vehicle implements Insurable {
    private String policyNumber;

    public Truck(String num, double rate, String policy) {
        super(num, "Truck", rate);
        this.policyNumber = policy;
    }

    public double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; } // higher rate
    public double calculateInsurance() { return getRentalRate() * 0.08; }
    public String getInsuranceDetails() { return "Truck Insurance Policy: " + policyNumber; }
}

public class ques3 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("CAR123", 2000, "POL1001"),
            new Bike("BIKE555", 500, "POL2002"),
            new Truck("TRK999", 3000, "POL3003")
        };

        int days = 5;

        for (Vehicle v : vehicles) {
            v.displayDetails();
            double rent = v.calculateRentalCost(days);
            double insurance = ((Insurable) v).calculateInsurance();

            System.out.println(((Insurable) v).getInsuranceDetails());
            System.out.println("Rental Cost for " + days + " days: " + rent);
            System.out.println("Insurance Cost: " + insurance);
            System.out.println("Total: " + (rent + insurance));
            System.out.println("----------------------------------");
        }
    }
}
