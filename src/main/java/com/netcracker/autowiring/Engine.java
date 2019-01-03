package com.netcracker.autowiring;

public class Engine {
    private String engineModel;

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    @Override
    public String toString() {
        return engineModel;
    }
}
