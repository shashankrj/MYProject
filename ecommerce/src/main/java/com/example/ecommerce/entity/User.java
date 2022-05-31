package com.example.ecommerce.entity;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String firstName;
    private String middleName;
    private String lastName;
    private String password;
    private boolean iSDeleted;
    private boolean iSActive;
    private boolean  iSExpired;
    private boolean iSLocked;
    private int invalidAttemptCount;

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getMiddleName() {
        return middleName;
    }

    public User setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public boolean isiSDeleted() {
        return iSDeleted;
    }

    public User setiSDeleted(boolean iSDeleted) {
        this.iSDeleted = iSDeleted;
        return this;
    }

    public boolean isiSActive() {
        return iSActive;
    }

    public User setiSActive(boolean iSActive) {
        this.iSActive = iSActive;
        return this;
    }

    public boolean isiSExpired() {
        return iSExpired;
    }

    public User setiSExpired(boolean iSExpired) {
        this.iSExpired = iSExpired;
        return this;
    }

    public boolean isiSLocked() {
        return iSLocked;
    }

    public User setiSLocked(boolean iSLocked) {
        this.iSLocked = iSLocked;
        return this;
    }

    public int getInvalidAttemptCount() {
        return invalidAttemptCount;
    }

    public User setInvalidAttemptCount(int invalidAttemptCount) {
        this.invalidAttemptCount = invalidAttemptCount;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", iSDeleted=" + iSDeleted +
                ", iSActive=" + iSActive +
                ", iSExpired=" + iSExpired +
                ", iSLocked=" + iSLocked +
                ", invalidAttemptCount=" + invalidAttemptCount +
                '}';
    }
}
