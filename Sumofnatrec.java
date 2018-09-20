import java.util.*;

public class Sumofnatrec {
  public static void main(String[] args){
    Scanner input  = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = input.nextInt();
    int sum =  findsum(num);
    System.out.println("Sum is : "+sum);
  }
  public static int findsum(int num){
    if(num!=0){
      return num  + findsum(num-1);
    }
    else{
      return num;
    }
  }
}
