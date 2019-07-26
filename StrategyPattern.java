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
