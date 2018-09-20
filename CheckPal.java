import java.util.*;

public class CheckPal{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = input.nextInt();
    int checknum = num;
    int digit ;
    int rev = 0;
    while(num!=0){
      digit = num % 10;
      rev = rev * 10 + digit;
      num = num/10;
    }
    if(rev == checknum )
      System.out.println("palindrome");
    else
      System.out.println("not");
  }
}
