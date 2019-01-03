package com.netcracker.cities;

import com.netcracker.mayors.IMayor;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class City {
    private IMayor mayor;
    private int happyPeoplePercent;
    private List<String> houses;
    private Set<String> citizens;
    private Map<Integer,String> cars;

    public City(IMayor mayor,List<String> houses) {
        this.mayor=mayor;
        this.houses=houses;
    }

    public int getHappyPeoplePercent() {
        return happyPeoplePercent;
    }

    public void setHappyPeoplePercent(int happyPeoplePercent) {
        this.happyPeoplePercent = happyPeoplePercent;
    }

    public Set<String> getCitizens() {
        return citizens;
    }

    public void setCitizens(Set<String> citizens) {
        this.citizens = citizens;
    }

    public Map<Integer, String> getCars() {
        return cars;
    }

    public void setCars(Map<Integer, String> cars) {
        this.cars = cars;
    }


    public IMayor getMayor() {
        return mayor;
    }

    public void setMayor(IMayor mayor) {
        this.mayor = mayor;
    }

    @Override
    public String toString() {
        return "City{" +"\n"+
                "mayor lastName=" + mayor.getLastName() +"\n"+
                "mayor promises=" + mayor.promises() +"\n"+
                "happyPeoplePercent=" + happyPeoplePercent +"\n"+
                "houses=" + houses +"\n"+
                "citizens=" + citizens +"\n"+
                "cars=" + cars +"\n"+
                '}';
    }
}
