public class CarRental {
    
    private String customerName;
    private String carModel;
    private int rentalDays;


    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    private double getDailyRate() {
        switch (carModel.toLowerCase()) {
            case "sedan":
                return 50.0;
            case "suv":
                return 75.0;
            case "luxury":
                return 120.0;
            default:
                return 40.0;
        }
    }

    public double calculateTotalCost() {
        return rentalDays * getDailyRate();
    }
    public void displayRentalInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + getDailyRate());
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}
