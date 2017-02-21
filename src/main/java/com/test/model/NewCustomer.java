package com.test.model;

/**
 * Created by owner on 2/20/2017.
 */
public class NewCustomer {
    private String FirstName;
    private String LastName;

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

    @Override
    public String toString(){
        return (FirstName + " " + LastName);
    }

}
