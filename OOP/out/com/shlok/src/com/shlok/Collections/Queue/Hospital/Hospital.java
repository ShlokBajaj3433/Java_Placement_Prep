package com.shlok.Collections.Queue.Hospital;

import java.util.*;

public class Hospital {
	private final Reception reception = new Reception();

	public void addNewPatient(Reception patient) {
		reception.addPatient(patient);
	}

	public void addMultiplePatients(Reception... patients) {
		if (patients == null) {
			return;
		}

		for (Reception patient : patients) {
			if (patient != null) {
				reception.addPatient(patient);
			}
		}
	}

	void displayWaitingPatients() {
		System.out.println("Waiting Patients:");
		for (Reception patient : reception.getWating()) {
			System.out.println("ID: " + patient.getID() + ", Name: " + patient.getName() + ", Age: " + patient.getAge() + ", Disease: " + patient.getDisease());
		}
	}

	void displayInProgressPatients() {
		System.out.println("In Progress Patients:");
		for (Reception patient : reception.getInprogress()) {
			System.out.println("ID: " + patient.getID() + ", Name: " + patient.getName() + ", Age: " + patient.getAge() + ", Disease: " + patient.getDisease());
		}
	}

	void movePatientToInProgress() {
		if (!reception.getWating().isEmpty()) {
			Reception patient = reception.getWating().poll();
			reception.getInprogress().offer(patient);
			System.out.println("Moved Patient to In Progress: ID: " + patient.getID() + ", Name: " + patient.getName());
		} else {
			System.out.println("No patients in waiting queue.");
		}
	}
	  
	void sortById() {
		List<Reception> patients = new ArrayList<>(reception.getWating());
		Collections.sort(patients);

		reception.getWating().clear();
		reception.getWating().addAll(patients);
	}

	void sortByName() {
		List<Reception> patients = new ArrayList<>(reception.getWating());
		patients.sort(new SortByPatientName());

		reception.getWating().clear();
		reception.getWating().addAll(patients);
	}

}

class SortByPatientName implements Comparator<Reception> {

	@Override
	public int compare(Reception patient1, Reception patient2) {
		return patient1.getName().compareTo(patient2.getName());
	}

}
class SortByPatientAge implements Comparator<Reception> {

	@Override
	public int compare(Reception patient1, Reception patient2) {
		return Integer.compare(patient1.getAge(), patient2.getAge());
	}
}
