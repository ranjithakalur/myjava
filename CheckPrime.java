import java.util.*;

public class CheckPrime {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = input.nextInt();
    boolean flag = false;
    for(int i=2;i<=num/2;i++){
      if(num%i == 0){
        flag = true;
        break;}
    }
    if(!flag)
      System.out.println("prime");
    else
      System.out.println("nOt");
  }
}
