package com.shlok.Collections.Queue.Hospital;

import java.util.LinkedList;
import java.util.Queue;

public class Reception implements Comparable<Reception> {
    private int Age;
    private String Name;
    private int ID;
    private String disease;
    
    private final Queue<Reception> wating = new LinkedList<>();
    private final Queue<Reception> inprogress = new LinkedList<>();

    public String getDisease() {
        return disease;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public Queue<Reception> getWating() {
        return wating;
    }
    public Queue<Reception> getInprogress() {
        return inprogress;
    }
    public void addPatient(Reception patient) {
        if (patient == null) {
            return;
        }

        wating.offer(patient);
    }
    @Override
    public String toString() {
        return "Reception [Age=" + Age + ", Name=" + Name + ", ID=" + ID + ", disease=" + disease + ", wating=" + wating
                + ", inprogress=" + inprogress + "]";
    }

    @Override
    public int compareTo(Reception other) {
        return Integer.compare(this.ID, other.ID);
    }

}
