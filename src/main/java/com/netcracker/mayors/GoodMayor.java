package com.netcracker.mayors;

public class GoodMayor implements IMayor {

    private String lastName;

    public GoodMayor(String lastName) {
        this.lastName = lastName;
    }

    public String promises() {
        return "I'll open new hospitals and schools!";
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
