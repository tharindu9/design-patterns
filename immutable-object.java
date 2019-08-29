package lk.easylearning9;

import java.util.ArrayList;
import java.util.List;

/**
 * This code example show that how to create read only objects
 * or it is common as immutable objects
 *
 * five rules should be follow to create immutable objects
 * 1 no setters allowed
 * 2 create constructor to set values to object
 * 3 make all properties private and final
 * 4 Object reference should not be allowed to change by mutable objects
 * 5 prevent methods from overridden
 */


final class ImmutableAnimal{

  private final String name ;
  private  final int age;
  private final List<String> favoriteFoods;

  public ImmutableAnimal(String name, int age, List<String> favoriteFoods) {
    if(name == null || name.trim().length()==0){
      throw  new RuntimeException("name should not be null");
    }
    this.name = name;
    if(age<0){
      throw new RuntimeException("age must be greater than 0");
    }
      this.age = age;
    if(favoriteFoods == null){
      throw new RuntimeException("add some favorite fruits");
    }
      this.favoriteFoods = favoriteFoods;

  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public String favoriteFruits(int index){
    return this.favoriteFoods.get(index);
  }

  public void getFavoriteFruits(){
    for (String food : this.favoriteFoods){
      System.out.println(food);
    }
  }

}

public class Main {

    public static void main(String[] args) {
	// write your code here
       ArrayList<String> favoriteFruits = new ArrayList<>();
       favoriteFruits.add("rice");
       favoriteFruits.add("chicken");
      ImmutableAnimal immutableAnimal = new ImmutableAnimal("jimmy" , 20 ,favoriteFruits);

      System.out.println(" animal name " + immutableAnimal.getName()
        + " animal age " + immutableAnimal.getAge() + " fruit " + immutableAnimal.favoriteFruits(1)
      );

    }
}
