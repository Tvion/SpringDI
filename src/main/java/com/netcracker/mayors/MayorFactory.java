package com.netcracker.mayors;

public class MayorFactory {

    public BadMayor createBadMayor(){
        return new BadMayor("FactorizedBadMayor");
    }

    public GoodMayor createGoodMayor(){
        return new GoodMayor("FactorizedGoodMayor");
    }
}
