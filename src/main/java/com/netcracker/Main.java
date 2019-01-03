package com.netcracker;

import com.netcracker.autowiring.MayorCar;
import com.netcracker.cities.City;
import com.netcracker.mayors.BadMayor;
import com.netcracker.mayors.GoodMayor;
import com.netcracker.mayors.LookupClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");



        City kansas = (City)context.getBean("kanzasCity");
        System.out.println("kanzas = " + kansas);
        System.out.println();

        City springfield=(City)context.getBean("springfieldCity");
        System.out.println("springfield = " + springfield);
        System.out.println();

//        City with inherited mayor
        City futureSpringfield=(City)context.getBean("futureSpringfieldCity");
        System.out.println("FutureSpringfield = " + futureSpringfield);
        System.out.println();


//        SpEL city
        City idealCityPrototype=(City)context.getBean("idealCityPrototype");
        System.out.println("IdealCity = " + idealCityPrototype);
        System.out.println();


//        Autowiring ByName
        MayorCar mayorCar=(MayorCar)context.getBean("mayorCar");
        System.out.println("mayorCar.getCar() = " + mayorCar.getCar());
        System.out.println();


//        Autowiring constructor
        MayorCar mayorCarConstr=(MayorCar)context.getBean("mayorCarConstr");
        System.out.println("mayorCarConstr.getCar() = " + mayorCarConstr.getCar());
        System.out.println();

//        Factories
        BadMayor factorizedBadMayor = (BadMayor)context.getBean("factorizedBadMayor");
        System.out.println("factorizedBadMayor = " + factorizedBadMayor.getLastName());
        System.out.println();


        GoodMayor factorizedGoodMayor = (GoodMayor)context.getBean("factorizedGoodMayor");
        System.out.println("factorizedGoodMayor = " + factorizedGoodMayor.getLastName());
        System.out.println();

//        Lookup
        LookupClass lookupClass=(LookupClass) context.getBean("lookup");
        BadMayor badMayor=lookupClass.createBadMayor();
        System.out.println(badMayor.getLastName());
        System.out.println();

        GoodMayor goodMayor=lookupClass.createGoodMayor();
        System.out.println(goodMayor.getLastName());
        System.out.println();


    }

}
