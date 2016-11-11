import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ExceptionTest {
  public static void main(String[] args){
    try{
      Test1();
    }
    catch(MyException e){
      System.out.println(e.getMessage());
    }
  }
  static public void Test1() throws MyException{
    throw new Exception2();
  }
}

class MyException extends Exception{
  public String getMessage(){
    return "This is a general exception";
  }
}
class Exception1 extends MyException{
  public String getMessage(){
    return "This is the exception #1";
  }
}
class Exception2 extends MyException{
  public String getMessage(){
    return "This is the exception #2";
  }
}