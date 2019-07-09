package com.tharindu.normal;

import java.util.Scanner;

public class Main {

 /*this main methods shows how the take user input and process normally (without any design pattern )

    */
    public static void main(String[] args) {

        System.out.println("Please enter car name");
        Scanner sc = new Scanner(System.in);
        String vName = sc.nextLine();
        Corolla c = new Corolla();
        Vits v = new Vits();
        if (vName.equalsIgnoreCase("vits")){

            v.setName("vits");
            v.setPrice(100000);
            System.out.println(v);
        }

        else if(vName.equalsIgnoreCase("corolla")){
            c.setName("corolla");
            c.setPrice(200000);
            System.out.println(v);
        }
        else
            System.out.println("no matching car");
    }


}
