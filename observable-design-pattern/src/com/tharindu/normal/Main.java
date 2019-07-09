package com.tharindu.normal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SubjectNormal subjectNormal = new SubjectNormal();
        new ObserverOne(subjectNormal);
        new ObserverOne(subjectNormal);
        new ObserverOne(subjectNormal);
        new ObserverOne(subjectNormal);
        new ObserverOne(subjectNormal);
        new ObserverOne(subjectNormal);
        System.out.println("please enter the word");
        Scanner sc  = new Scanner(System.in);
        subjectNormal.setStatus(sc.nextLine());

    }
}
