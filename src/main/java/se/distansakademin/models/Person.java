package se.distansakademin.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private  long id;

    private  String firstName;

    private String year;

    public Person(String firstName, String year) {
        this.firstName = firstName;
        this.year = year;
    }

    public Person() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public  String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public  String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

