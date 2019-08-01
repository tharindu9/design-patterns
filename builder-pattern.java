package com.company.builder;
/**

The Builder is a design pattern designed to provide a 
flexible solution to various object creation problems in object-oriented programming. 
*/
import java.util.ArrayList;
import java.util.List;

interface Item {

    String name();
    Packing packing();
    int price();
}

interface Packing{

    String pack();
}

class Wapper implements Packing{

    @Override
    public String pack(){
        return "Use papers ";
    }
}

class Bottel implements Packing{

    @Override
    public String pack(){
        return "use Bottel ";
    }
}

abstract class Burger implements Item{

    @Override
    public Packing packing(){
        return new Wapper();
    }
}

class VegBurger extends Burger{

    @Override
    public String name(){
        return "veg burger ";
    }

    @Override
    public int price(){
        return 250;
    }
}

class ChickenBurger extends  Burger{

    @Override
    public String name(){
        return "chicken burger ";
    }
    
    @Override
    public int price(){
        return 450;
    }
}


class Coke extends Drinks{

    @Override
    public String name(){
        return "cock ";
    }

    @Override
    public int price(){
        return 200;
    }
}

class Pepsi extends Drinks {

    @Override
    public String name(){
        return "pepsi  ";
    }

    @Override
    public int price(){
        return 350;
    }
}

abstract class Drinks implements Item{

    @Override
    public Packing packing(){
        return new Bottel();
    }
}

class MealBuilder {

    public Meal vegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal nonVegMeal(){

        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
}

class Meal {

    List<Item> itemList = new ArrayList<>();

    public void addItem(Item item){
        itemList.add(item);
    }

    public int getPrice(){
        int totalPrice =0;
        for (Item item: itemList) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void showItems(){
        for (Item item: itemList) {
            System.out.print("name  " + item.name());
            System.out.print("price " + item.price());
            System.out.println(" packing " + item.packing().pack());
        }

    }

}

public class BuilderDemo {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal =mealBuilder.vegMeal();
        vegMeal.showItems();

        System.out.println("Non veg things ");

        Meal nonVeg = mealBuilder.nonVegMeal();
        nonVeg.showItems();
    }
}
