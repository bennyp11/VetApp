package com.vetapp.demo.Models;


public class Customers {
    
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String[] petNames;
    private String address;
    private int visits;
    
    public Customers(String name, String email, String password, String phoneNumber, String[] petNames, String address, int visits) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.petNames = petNames;
        this.address = address;
        this.visits = visits;
    }
    
    // Getters and setters for all instance variables
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String[] getPetNames() {
        return petNames;
    }
    
    public void setPetNames(String[] petNames) {
        this.petNames = petNames;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public int getVisits() {
        return visits;
    }
    
    public void setVisits(int visits) {
        this.visits = visits;
    }
    
    // toString() method for printing customer details
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + name + "\n");
        sb.append("Email: " + email + "\n");
        sb.append("Phone number: " + phoneNumber + "\n");
        sb.append("Pet names: ");
        for (String petName : petNames) {
            sb.append(petName + ", ");
        }
        sb.append("\n");
        sb.append("Address: " + address.toString() + "\n");
        sb.append("Visits: " + visits);
        return sb.toString();
    }
}
