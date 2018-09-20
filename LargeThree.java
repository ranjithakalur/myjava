import java.util.*;

public class LargeThree {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter three number: ");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    if(a > b && a > c){
      System.out.println("Largest number is "+a);
    }
    else if(b > a && b > c){
      System.out.println("Largest number is "+b);
    }
    else{
      System.out.println("Largest number is "+c);
    }
  }
}
