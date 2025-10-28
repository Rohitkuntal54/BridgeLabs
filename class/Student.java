<<<<<<< HEAD
package com.bridgelabz.oops.levelone;

class Student {
    
    String name;
    int rollNumber;
    double marks;

    
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "Fail";
        }
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        
        Student student1 = new Student();
        student1.name = "Ananya Sharma";
        student1.rollNumber = 101;
        student1.marks = 87.5;

        
        student1.displayStudentDetails();
    }
}

=======
package com.bridgelabz.oops.levelone;

class Student {
    
    String name;
    int rollNumber;
    double marks;

    
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "Fail";
        }
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        
        Student student1 = new Student();
        student1.name = "Ananya Sharma";
        student1.rollNumber = 101;
        student1.marks = 87.5;

        
        student1.displayStudentDetails();
    }
}

>>>>>>> 2a3bf8e (first)
