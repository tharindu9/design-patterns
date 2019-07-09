package com.tharindu.factory;

public class Corolla implements Car {

    String name;
    int price;

    Corolla(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String goFast(){
        return  "18 seconds for get 100ms-1 speed";
    }

    @Override
    public String toString(){
        return "car is " + getName() +  "and price is "+ getPrice()  + " speed " + goFast() ;
    }
}
