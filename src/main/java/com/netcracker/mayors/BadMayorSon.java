package com.netcracker.mayors;

public class BadMayorSon implements IMayor {
    private String lastName;

    public BadMayorSon(String lastName) {
        this.lastName = lastName;
    }

    public String promises() {
        return "I'll continue the father's business";
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
