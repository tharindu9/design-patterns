package com.tharindu.observable;

public class ObserverOne extends Obeserver{

    ObserverOne(Subject subject){
        this.subject=subject;
        this.subject.addObservers(this);
    }

    @Override
   public void udate(String string) {
        System.out.println("observer one "+ string);
    }
}
