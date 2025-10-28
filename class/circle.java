<<<<<<< HEAD
package  com.bridgelabz.oops.levelone;

class Circle {

    double radius;

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 7.0; 

        circle.displayDetails();
    }
}
=======
package  com.bridgelabz.oops.levelone;

class Circle {

    double radius;

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 7.0; 

        circle.displayDetails();
    }
}
>>>>>>> 2a3bf8e (first)
