package com.bridgelabz.oops.levelone;

class MobilePhone {
    
    String brand;
    String model;
    double price;

    
    public void displayPhoneDetails() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        
        MobilePhone phone1 = new MobilePhone();
        phone1.brand = "Samsung";
        phone1.model = "Galaxy S21";
        phone1.price = 69999.00;

    
        MobilePhone phone2 = new MobilePhone();
        phone2.brand = "Apple";
        phone2.model = "iPhone 14";
        phone2.price = 79999.00;

        
        System.out.println("Mobile Phone 1 Details:");
        phone1.displayPhoneDetails();

        System.out.println("\nMobile Phone 2 Details:");
        phone2.displayPhoneDetails();
    }
}

