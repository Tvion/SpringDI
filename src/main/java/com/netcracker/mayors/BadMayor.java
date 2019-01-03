package com.netcracker.mayors;

public class BadMayor implements IMayor {

    private String lastName;

    public BadMayor(String lastName) {
        this.lastName = lastName;
    }

    public String promises() {
        return "I'll ban all drinks in the city!";
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
