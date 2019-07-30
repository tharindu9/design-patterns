package com.company;

interface  Apperal{

    void getDesign();
}

class BoyTouser implements Apperal{


    @Override
    public void getDesign(){
        System.out.println("Boys Touser design ");
    }

}

class LadiesTouser implements Apperal{
    @Override
    public void getDesign(){
        System.out.println("Ladies Touser design ");
    }

}
class BoysThrit implements Apperal{
    @Override
    public void getDesign(){
        System.out.println("Boys Tshirt design ");
    }

}
class LadiesTshirt implements Apperal{

    @Override
    public void getDesign(){

        System.out.println("Ladies Tshirt design ");
    }

}

interface CreateApperal {

    Apperal generateApperal(String apperalType);
}

class CreateBoysApperal implements CreateApperal{

    @Override
    public Apperal generateApperal(String apperalType){

        if(apperalType.equalsIgnoreCase("touser"))
           return new BoyTouser();
        else if(apperalType.equalsIgnoreCase("tshirt"))
            return  new BoysThrit();

        else
            return null;
    }

}

class CreateLadiesApperal implements CreateApperal{

    @Override
    public Apperal generateApperal(String apperalType){

        if(apperalType.equalsIgnoreCase("touser")){
           return new LadiesTouser();
        }

        else if(apperalType.equalsIgnoreCase("tshirt")) {
            return new LadiesTshirt();
        }
        else
            return null;
    }

}

class CreateProducer{

    public  static CreateApperal getApperalFactoey(boolean boy){

        if(boy)
            return new CreateBoysApperal();
        else
            return new CreateLadiesApperal();
    }

}

public class ApperalMain {
    
    public static void main(String[] args) {

        CreateApperal createApperal = CreateProducer.getApperalFactoey(false);
        createApperal.generateApperal("tshirt").getDesign();
    }

}
