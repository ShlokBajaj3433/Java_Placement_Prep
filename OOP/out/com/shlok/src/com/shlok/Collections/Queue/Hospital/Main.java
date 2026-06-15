package com.shlok.Collections.Queue.Hospital;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        // Adding patients
        Reception patient1 = new Reception();
        patient1.setID(2);
        patient1.setName("Shlok");
        patient1.setAge(30);
        patient1.setDisease("Flu");

        Reception patient2 = new Reception();
        patient2.setID(1);
        patient2.setName("Jane Smith");
        patient2.setAge(25);
        patient2.setDisease("Cold");

        hospital.addNewPatient(patient1);
        hospital.addNewPatient(patient2);

        hospital.displayWaitingPatients();

        System.out.println("\nAfter sorting by ID:");
        hospital.sortById();
        hospital.displayWaitingPatients();

        System.out.println("\nAfter sorting by Name:");
        hospital.sortByName();
        hospital.displayWaitingPatients();

        System.out.println();
        hospital.movePatientToInProgress();
        hospital.displayInProgressPatients();
    }
}
