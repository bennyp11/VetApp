package com.vetapp.demo.Models;

import java.util.List;

public class AppointmentQuestionnaire {
    private Long id;
    private String petName;
    private String ownerName;
    private String breed;
    private int age;
    private String gender;
    private List<String> medicalConditions;
    private List<String> medications;
    private List<String> allergies;
    private List<String> vaccinations;
    private Appointments appointment;
    private Pets pet;
    private Customers customer;

    public AppointmentQuestionnaire(String petName, String ownerName, String breed, int age, String gender,
                                     List<String> medicalConditions, List<String> medications, List<String> allergies,
                                     List<String> vaccinations, Appointments appointment, Pets pet, Customers customer) {
        this.petName = petName;
        this.ownerName = ownerName;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.medicalConditions = medicalConditions;
        this.medications = medications;
        this.allergies = allergies;
        this.vaccinations = vaccinations;
        this.appointment = appointment;
        this.pet = pet;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getMedicalConditions() {
        return medicalConditions;
    }

    public void setMedicalConditions(List<String> medicalConditions) {
        this.medicalConditions = medicalConditions;
    }

    public List<String> getMedications() {
        return medications;
    }

    public void setMedications(List<String> medications) {
        this.medications = medications;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<String> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public Appointments getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointments appointment) {
        this.appointment = appointment;
    }

    public Pets getPet() {
        return pet;
    }

    public void setPet(Pets pet) {
        this.pet = pet;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }
}
