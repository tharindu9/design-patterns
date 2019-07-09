package com.tharindu.normal;

public class ObserverTwo {

    SubjectNormal subject;
    ObserverTwo(SubjectNormal subject){
        this.subject=subject;
    }

    public void update(String s){
        System.out.println("Observer two "+s);
    }
}
