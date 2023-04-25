package com.vetapp.demo.Models;
import java.time.LocalDateTime;
import java.util.List;

public class Appointments {
    private Long id;
    private LocalDateTime dateTime;
    private Customers customer;
    private List<Pets> pets;
    private List<AppointmentQuestionnaire> questionnaires;

    public Appointments(LocalDateTime dateTime, Customers customer, List<Pets> pets, List<AppointmentQuestionnaire> questionnaires) {
        this.dateTime = dateTime;
        this.customer = customer;
        this.pets = pets;
        this.questionnaires = questionnaires;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public List<Pets> getPets() {
        return pets;
    }

    public void setPets(List<Pets> pets) {
        this.pets = pets;
    }

    public List<AppointmentQuestionnaire> getQuestionnaires() {
        return questionnaires;
    }

    public void setQuestionnaires(List<AppointmentQuestionnaire> questionnaires) {
        this.questionnaires = questionnaires;
    }
}
