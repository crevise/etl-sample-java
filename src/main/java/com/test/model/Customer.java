package com.test.model;

/**
 * Created by owner on 2/20/2017.
 */
public class Customer {
    private String FirstName;
    private String LastName;
    private String City;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString(){
        return (FirstName + " " + LastName + " - " + City);
    }


}
