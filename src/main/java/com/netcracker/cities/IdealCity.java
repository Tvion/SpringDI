package com.netcracker.cities;

import com.netcracker.mayors.GoodMayor;
import com.netcracker.mayors.IMayor;

import java.util.*;

public class IdealCity {
    private IMayor mayor;
    private int happyPeoplePercent;
    private List<String> houses = new ArrayList<String>();
    private Set<String> citizens = new HashSet<String>();
    private Map<Integer,String> cars = new HashMap<Integer, String>();

    {
        mayor=new GoodMayor("IdealMan");

        happyPeoplePercent=100;

        houses.add("Church");
        houses.add("City Hall");
        houses.add("alcohol Market");
        houses.add("School");
        houses.add("Hospital");
        houses.add("Library");
        houses.add("Cinema");


        citizens.add("mayor");
        citizens.add("priest");
        citizens.add("alcohol seller");
        citizens.add("teachers");
        citizens.add("doctors");
        citizens.add("other civilian");

        cars.put(666,"mayor");
        cars.put(123,"priest");
        cars.put(316,"old doctor");
        cars.put(427,"alcohol seller");
        cars.put(333,"principal");

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


    public List<String> getHouses() {
        return houses;
    }

    public void setHouses(List<String> houses) {
        this.houses = houses;
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
