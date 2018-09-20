import java.util.*;

public class Factorial{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = input.nextInt();
    int fact = 1;
    for(int i = 1; i<=num;i++){
      fact *= i;
    }
    System.out.println("fact is "+fact);
  }
}
