<<<<<<< HEAD
public class Circle {
    
    private double radius;

    
    public Circle() {
        
        this(1.0);  
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    
    public double getArea() {
        return Math.PI * radius * radius;
    }

    
    public void displayInfo() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }
}
=======
public class Circle {
    
    private double radius;

    
    public Circle() {
        
        this(1.0);  
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    
    public double getArea() {
        return Math.PI * radius * radius;
    }

    
    public void displayInfo() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }
}
>>>>>>> 2a3bf8e (first)
