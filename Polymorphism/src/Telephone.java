
class Telephone {
  public Telephone(){
    System.out.println("Haha");
    Call();
  }
  public void Call(){
    System.out.println("Call telephone");
  }
}
class Iphone extends Telephone{
  public Iphone(){
    System.out.println("I got an iphone. Haha!");
  }
  public void Call(){
    System.out.println("Call Jobs");
  }
}
