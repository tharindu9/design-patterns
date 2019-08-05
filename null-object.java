package com.company;


abstract class Person{

    String name;

    public abstract String getName();
}

class PersonFectory {

    public Person createPerson(String name){
        if(name!=null){
            return new RealPerson(name);
        }
        else {
            return new NullPerson();
        }
    }
}

class RealPerson extends Person{

    RealPerson(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }
}

class NullPerson extends Person{

    @Override
    public String getName(){
        return "Not found";
    }
}



public class NullObjectDemo {

    private static final String[] persons= {"Tharindu" ,"Ishan","metta","pasindu","amila","kasun" };

    public static void main(String[] args) {

       System.out.println(createPerson("Kishan").getName());

    }

    public static  Person createPerson(String name){
        PersonFectory personFectory =  new PersonFectory();
        Person person=null;
        for (int i = 0;i<persons.length;i++){

            if(name.equalsIgnoreCase(persons[i])){
                person = personFectory.createPerson(name);
                 break;
            }
            else {
                person = personFectory.createPerson(null);
            }
        }
        return  person;
    }
}
