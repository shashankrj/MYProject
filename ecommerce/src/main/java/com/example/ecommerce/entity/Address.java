package com.example.ecommerce.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String city;
    private String state;
    private String country;
    private String addressLine;
    private String zipCode;
    private String label;
    private User user;

    public int getId() {
        return id;
    }

    public Address setId(int id) {
        this.id = id;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public Address setState(String state) {
        this.state = state;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Address setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public Address setAddressLine(String addressLine) {
        this.addressLine = addressLine;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Address setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public Address setLabel(String label) {
        this.label = label;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Address setUser(User user) {
        this.user = user;
        return this;
    }
}
