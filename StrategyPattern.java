/**
 * In computer programming, the strategy pattern (also known as the policy pattern) 
 * is a behavioral software design pattern that enables selecting an algorithm at runtime. 
 * Instead of implementing a single algorithm directly, code receives run-time instructions as 
 * to which in a family of algorithms to use.
 */

import java.util.Scanner;

interface Application {

    void openApplicatipon();
}

class  Camera  implements Application{

    @Override
    public void  openApplicatipon(){
        System.out.println("Open camera ");
    }
}

class  Phone  implements Application{

    @Override
    public void  openApplicatipon(){
        System.out.println("Open phone ");

    }

}

class  Sms  implements Application{

    @Override
    public void  openApplicatipon(){
        System.out.println("Open sms ");

    }

}

class Context {

    Application application;

    Context(Application application ){
        this.application=application;
    }


    public void callToOpenApplication(){
        this.application.openApplicatipon();
    }

}

public class StrategyPattern {

    public static void main(String[] args) {

        System.out.println("enter the ");
        Scanner scanner = new Scanner(System.in);
        String type= scanner.nextLine();

        if(type.equalsIgnoreCase("camera")){
            Context context = new Context(new Camera());
            context.callToOpenApplication();

        }
        else if (type.equalsIgnoreCase("phone")){

            Context context = new Context(new Phone());
            context.callToOpenApplication();
        }
        else if(type.equalsIgnoreCase("sms")){
            Context context = new Context(new Sms());
            context.callToOpenApplication();
        }
        else {
            System.out.println("No application ");
        }
    }

}
// calculation example

package com.company;

interface  Operationable{

    int doOparation(int x , int y);
}

class Add implements  Operationable{

    @Override
    public int doOparation(int x , int y){
        return x+y;
    }

}

class  Sub implements  Operationable{

    @Override
    public int doOparation(int x , int y){
        return x-y;
    }
}

class Mul implements  Operationable{

    @Override
    public int doOparation(int x , int y){
        return x*y;
    }
}

class Div implements Operationable{

    @Override
    public int doOparation(int x , int y){
        return x/y;
    }
}

class  Context{

    private  Operationable operationable;

   Context(Operationable operationable){
        this.operationable = operationable;
    }

    public int doCal(int x , int y){
       return operationable.doOparation(x,y);
    }

}

public class CalculationMain {

    public static void main(String[] args) {

        //I need to add two numbers
        
        // without strategy design pattern
        int x = 30 ; int y = 15;
        Add add = new Add();
        System.out.println(add.doOparation(x,y));

        // I need to Subtitute
        Sub sub = new Sub();
        System.out.println(sub.doOparation(x,y));

        // I need to multiply
        Mul mul = new Mul();
        System.out.println(mul.doOparation(x,y));

        //I need to Div
        Div div = new Div();
        System.out.println(sub.doOparation(x,y));

        // *********************************** //

        // with strategy design pattern

        Context context = new Context(new Add());
        System.out.println(context.doCal(x,y));

        Context context1 = new Context(new Sub());
        System.out.println(context1.doCal(x,y));

        Context context2 = new Context(new Mul());
        System.out.println(context2.doCal(x,y));

        Context context3 = new Context(new Div());
        System.out.println(context3.doCal(x,y));
    }
}
