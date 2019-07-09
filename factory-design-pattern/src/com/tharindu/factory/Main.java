package com.tharindu.factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter the car name");
        Scanner sc = new Scanner(System.in);
        CarFactory carFactory =new CarFactory();
        System.out.println(carFactory.createCar(sc.nextLine()));
    }
}
