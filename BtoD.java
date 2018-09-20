import java.util.*;

public class BtoD{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter binary number:");
    long num = input.nextLong();
    long dec = decimal(num);
    System.out.println("==>"+dec);
  }
  public static int decimal(long num){
    int dec = 0;
    int i = 0;
    long rem;
    while(num!=0){
      rem = num%10;
      dec += rem*Math.pow(2,i);
      num = num/10;
      i++;
    }
    return dec;
  }
}
