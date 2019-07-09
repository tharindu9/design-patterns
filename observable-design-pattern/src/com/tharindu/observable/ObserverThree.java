package com.tharindu.observable;

public class ObserverThree extends Obeserver {

    ObserverThree(Subject subject){
        this.subject=subject;
        this.subject.addObservers(this);
    }

    @Override
    public void udate(String string) {
        System.out.println("observer three "+ string);
    }

}
