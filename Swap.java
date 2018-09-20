import java.util.*;

public class Swap {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter A:");
    int a = input.nextInt();
    System.out.println("Enter B:");
    int b = input.nextInt();
    System.out.println("A="+a+"\nB="+b);
    int c = a;
    a = b;
    b = c;
    System.out.println("\nAfter Swap\nA="+a+"\nB="+b); 
  }
}
