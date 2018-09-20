import java.util.*;

public class PN{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number:");
    double a = input.nextDouble();
    if(a < 0.0)
      System.out.println("A negative number");
    else if(a > 0.0)
      System.out.println("A positive number");
    else
      System.out.println("It is zero");
  }
}
