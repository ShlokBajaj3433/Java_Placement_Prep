package com.shlok.Collections.Queue.Hospital;

public class App {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        // Display waiting patients
        hospital.displayWaitingPatients();

        // Move a patient to in-progress
        hospital.movePatientToInProgress();

        // Display in-progress patients
        hospital.displayInProgressPatients();
    }
}
