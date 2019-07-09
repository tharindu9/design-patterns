package com.tharindu.factory;

public class CarFactory {

    public Car createCar(String string){

        if(string.equalsIgnoreCase("vits"))
            return new Vits(string);
        else if(string.equalsIgnoreCase("corolla"))
            return new Corolla(string);

        else
            return null;
    }
}
