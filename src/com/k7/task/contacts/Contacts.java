package com.k7.task.contacts;

import java.util.Objects;

public class Contacts {
    private String name;
    private String surname;
    private String number;

    public Contacts(String name, String surname, String number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacts contacts = (Contacts) o;
        return Objects.equals(name, contacts.name) &&
                Objects.equals(surname, contacts.surname) &&
                Objects.equals(number, contacts.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, number);
    }
}
