package com.tharindu.normal;

public class ObserverOne {

    SubjectNormal subject;
    ObserverOne(SubjectNormal subject){
        this.subject=subject;
        this.subject.addObserver(this);
    }

    public void update(String s){
        System.out.println("Observer one "+s);
    }
}
