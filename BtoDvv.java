import java.util.*;

public class BtoDvv {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your choice:\n1==>Binary to Decimal\n2==>Decimal to Binary");
    int ch = input.nextInt();
    long res;
    if(ch==1){
      System.out.println("Enter the Binary number:");
      long bin = input.nextLong();
      res = todecimal(bin);
      System.out.println("Decimal is ==> "+res);
    }
    else if(ch==2){
      System.out.println("Enter the Decimal number:");
      long dec  = input.nextLong();
      res = tobinary(dec);
      System.out.println("Binary is ==> "+res);
    }
    else{
      System.out.println("Wrong");
    }
  }

  public static int todecimal(long num){
    int result = 0;
    int i =0;
    long rem = 0;
    while(num!=0){
      rem = num%10;
      result += rem * Math.pow(2,i);
      num = num/10;
      ++i;
  }
  return result;
}
  public static int tobinary(long num){
    int result = 0;
    int i = 1;
    long rem;
    while(num!=0){
      rem = num % 2;
      result += rem * i;
      System.out.println("\n ==>"+result);
      num = num/2;
      i=i*10;
    }
    return result;
  }

}
