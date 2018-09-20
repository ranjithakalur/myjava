import java.util.*;

public class Factors {
  public static void main(String[] args){
    Scanner input  = new Scanner(System.in);
    System.out.println("Enter the number:");
    int a = input.nextInt();
    System.out.println("Factors of"+a+"are:");
    for(int i = 1; i<=a; i++){
      if(a%i==0){
        System.out.println(i);
      }
    }
  }
}
