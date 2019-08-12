

abstract class Phone{

  String color;
  WorkShop workShop1;
  WorkShop workShop2;

  abstract void manufacture( );
}

class RedPhone extends Phone{

  RedPhone(WorkShop workShop1 , WorkShop workShop2 , String color){
    this.color = color;
    this.workShop1 = workShop1;
    this.workShop2 = workShop2;
  }

  @Override
  public void manufacture(){
    this.workShop1.work(this.color);
    this.workShop2.work(this.color);
  }
}

class  BlackPhone extends Phone{

  BlackPhone(WorkShop workShop1 , WorkShop workShop2 , String color){
    this.color = color;
    this.workShop1 = workShop1;
    this.workShop2 = workShop2;
  }

  @Override
  public void manufacture(){
    this.workShop1.work(this.color);
    this.workShop2.work(this.color);
  }

}

interface WorkShop{

  void work(String color);
}

class Produce implements WorkShop{

  @Override
  public void work(String color){
    System.out.println("I produce " + color + " color Phone");
  }
}

class Assembly implements WorkShop{

  @Override
  public void work(String color){
    System.out.println("I assembly " + color + " color Phone");
  }
}

public class BridgeDemo {
  public static void main(String[] args) {

    Phone phoneOne = new RedPhone(new Produce() , new Assembly() , "Red");
    Phone phoneTwo = new BlackPhone(new Produce() , new Assembly() , "Black");
    phoneOne.manufacture();
    phoneTwo.manufacture();
  }
}
