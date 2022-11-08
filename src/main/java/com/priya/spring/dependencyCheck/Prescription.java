package com.priya.spring.dependencyCheck;

import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class Prescription {

    int patientId;
    String patientName;
    List<String> medicine;

    public int getPatientId() {
        return patientId;
    }

    @Required
    public void setPatientId(int id) {
        this.patientId = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public List<String> getMedicine() {
        return medicine;
    }

    public void setMedicine(List<String> medicine) {
        this.medicine = medicine;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", medicine=" + medicine +
                '}';
    }
}
