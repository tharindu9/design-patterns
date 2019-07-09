package com.tharindu.observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Subject {

    private List<Obeserver> observers = new ArrayList<>();
    private String message ;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyAllObs(message);
    }

    public void  addObservers(Obeserver observer){
        this.observers.add(observer);
    }

    public  void notifyAllObs(String s){
        observers.stream().forEach(element -> element.udate(s));
    }
}
