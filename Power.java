import java.util.*;

public class Power{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter base and exp:");
    int base = input.nextInt();
    int exp = input.nextInt();
    int result = 1;
    while(exp!=0){
      result = result * base;
      exp --;
    }
    System.out.println(result);
  }
}
