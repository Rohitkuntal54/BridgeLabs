package selfproblem;

import java.util.*;

class Patient {
    private String name;
    private List<Doctor> doctorsSeen;

    public Patient(String name) {
        this.name = name;
        this.doctorsSeen = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor d) {
        if (!doctorsSeen.contains(d)) doctorsSeen.add(d);
    }

    public void showDoctors() {
        System.out.println("Patient " + name + " has consulted:");
        for (Doctor d : doctorsSeen) {
            System.out.println(" - Dr. " + d.getName());
        }
    }
}

class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient p, String notes) {
        // establish association both ways
        if (!patients.contains(p)) patients.add(p);
        p.addDoctor(this);

        // communication simulation
        System.out.println("Consultation: Dr. " + name + " (" + specialization + ") with patient " + p.getName());
        System.out.println("Notes: " + notes);
    }

    public void showPatients() {
        System.out.println("Dr. " + name + "'s patients:");
        for (Patient p : patients) System.out.println(" - " + p.getName());
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor d) { doctors.add(d); }
    public void addPatient(Patient p) { patients.add(p); }

    public void showAll() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor d : doctors) System.out.println(" - Dr. " + d.getName());
        System.out.println("Patients:");
        for (Patient p : patients) System.out.println(" - " + p.getName());
    }
}

public class HospitalExample {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");

        Doctor drA = new Doctor("Ahuja", "Cardiology");
        Doctor drB = new Doctor("Verma", "General Medicine");

        Patient p1 = new Patient("Ravi");
        Patient p2 = new Patient("Sima");

        h.addDoctor(drA); h.addDoctor(drB);
        h.addPatient(p1); h.addPatient(p2);

        drA.consult(p1, "Checkup for chest pain. ECG recommended.");
        drB.consult(p1, "General symptoms. Prescribed rest and fluids.");
        drB.consult(p2, "Fever and sore throat. Throat swab taken.");

        System.out.println();
        drA.showPatients();
        drB.showPatients();
        System.out.println();
        p1.showDoctors();
        p2.showDoctors();
    }
}