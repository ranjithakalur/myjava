import java.util.*;

public class Factorialrec {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = input.nextInt();
    int sum = multiply(num);
    System.out.println("fact is ="+sum);
  }
  public static int multiply(int num){
    if(num>=1){
      return num * multiply(num-1);
    }
    else{
      return 1;
    }
  }
}
