package com.tharindu.observable;

public class ObsererTwo extends  Obeserver{

    ObsererTwo(Subject subject){
        this.subject=subject;
        this.subject.addObservers(this);
    }

    @Override
    public void udate(String string) {
        System.out.println("observer two "+ string);
    }
}
