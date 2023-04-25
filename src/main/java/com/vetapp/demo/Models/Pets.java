package com.vetapp.demo.Models;
import java.util.List;

public class Pets {
    private String name;
    private String ownerName;
    private String breed;
    private int age;
    private String gender;
    private List<String> medicalConditions;

    public Pets(String name, String ownerName, String breed, int age, String gender, List<String> medicalConditions) {
        this.name = name;
        this.ownerName = ownerName;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.medicalConditions = medicalConditions;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public List<String> getMedicalConditions() {
        return medicalConditions;
    }

    public void setMedicalConditions(List<String> medicalConditions) {
        this.medicalConditions = medicalConditions;
    }

    public String toString() {
        return "Name: " + name + "\n" +
                "Owner Name: " + ownerName + "\n" +
                "Breed: " + breed + "\n" +
                "Age: " + age + "\n" +
                "Gender: " + gender + "\n" +
                "Medical Conditions: " + medicalConditions;
    }
}
