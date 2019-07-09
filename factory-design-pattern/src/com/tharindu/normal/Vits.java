package com.tharindu.normal;

public class Vits {

    String name;
    int price;

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

    public String goFast(){
        return  "20 seconds for get 100ms-1 speed";
    }

    @Override
    public String toString(){
        return "car is " + getName() +  " and price is "+ getPrice() ;
    }
}
