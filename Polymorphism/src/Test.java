
import java.util.*;
public class Test {
    static public int count = 0;
    
    public static void main(String[] args){
      /*
      Dog dd = new Dog("Puppy");
      ShowAnimal(dd);
      Bird bb = new Bird("Birddy");
      ShowAnimal(bb);
      */
      Telephone tmp = new Telephone();
    }
    public static void ShowAnimal(Animal an){
      System.out.println(an.name);
      an.ShowType();
    }
}
class Animal{
  public String name;
  public Animal(String an_name){
    name = an_name;
  }
  public void ShowType(){
    System.out.println("I am an animal.");
    WhatToEat();
  }
  public void WhatToEat(){
    System.out.print("Haven't decided yet.");
  }
}
//what about the constructor after inheritance
class Dog extends Animal{
  public Dog(String dog_name){
    super(dog_name);
  }
  public void Bite(){
    System.out.println("The dog can bite you");
  }
  /*public void ShowType(){
    System.out.println("I am a dog.");
    WhatToEat();
  }*/
  public void WhatToEat(){
    System.out.println("Eat meat.");
  }
}
class Bird extends Animal{
  public Bird(String bird_name){
    super(bird_name);
  }
}