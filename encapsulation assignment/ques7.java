import java.util.ArrayList;
import java.util.List;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis; 
    public Patient(int id, String name, int age, String diagnosis) {
        this.patientId = id;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    
    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    protected String getDiagnosis() { return diagnosis; }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}

// InPatient subclass
class InPatient extends Patient implements MedicalRecord {
    private double roomCharges, treatmentCharges;
    private List<String> records = new ArrayList<>();

    public InPatient(int id, String name, int age, String diagnosis, double roomCharges, double treatmentCharges) {
        super(id, name, age, diagnosis);
        this.roomCharges = roomCharges;
        this.treatmentCharges = treatmentCharges;
    }

    @Override
    public double calculateBill() {
        return roomCharges + treatmentCharges;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ": " + records);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee, testCharges;
    private List<String> records = new ArrayList<>();

    public OutPatient(int id, String name, int age, String diagnosis, double consultationFee, double testCharges) {
        super(id, name, age, diagnosis);
        this.consultationFee = consultationFee;
        this.testCharges = testCharges;
    }

    @Override
    public double calculateBill() {
        return consultationFee + testCharges;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ": " + records);
    }
}


public class ques7 {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient(101, "Alice", 35, "Appendicitis", 5000, 7000),
            new OutPatient(102, "Bob", 28, "Flu", 500, 800)
        };

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Diagnosis: " + p.getDiagnosis());
            double bill = p.calculateBill();
            System.out.println("Total Bill: ₹" + bill);

            MedicalRecord record = (MedicalRecord) p;
            record.addRecord("Diagnosis: " + p.getDiagnosis());
            record.addRecord("Bill Amount: ₹" + bill);
            record.viewRecords();
            System.out.println("----------------------------------");
        }
    }
}
