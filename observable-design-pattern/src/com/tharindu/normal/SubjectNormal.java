package com.tharindu.normal;

import java.util.ArrayList;
import java.util.List;

public class SubjectNormal {

   private List<ObserverOne> observerOnes = new ArrayList<>();

    private String status;
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyAllObservers(status);
    }

    public  void addObserver(ObserverOne observer){
        this.observerOnes.add(observer);

    }

    public  void notifyAllObservers(String s){
        for(ObserverOne obs : observerOnes){
            obs.update(s);
        }
    }

}
