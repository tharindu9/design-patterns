package com.tharindu.observable;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new  ObserverOne(subject);
        new ObsererTwo(subject);
        new ObserverThree(subject);

        System.out.println("enter message");
        Scanner sc = new Scanner(System.in);
        subject.setMessage(sc.nextLine());
    }
}
