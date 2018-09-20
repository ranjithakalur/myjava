import java.util.*;

public class Gcd{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int a  = input.nextInt();
    int b = input.nextInt();
    int gcd = 1;
    for(int i = 1;i<=a && i<=b; i++){
      if(a%i == 0 && b%i == 0)
      gcd = i;
    }
    System.out.printf("GCD is %d",gcd);
    }
}
