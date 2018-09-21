import java.util.*;

public class OtoD {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your choice:\n1==>Octal to Decimal\n2==>Decimal to octal");
    int ch = input.nextInt();
    long res;
    if(ch==1){
      System.out.println("Enter the Octal number:");
      long bin = input.nextLong();
      res = todecimal(bin);
      System.out.println("Decimal is ==> "+res);
    }
    else if(ch==2){
      System.out.println("Enter the Decimal number:");
      long dec  = input.nextLong();
      res = tooctal(dec);
      System.out.println("Octal is ==> "+res);
    }
    else{
      System.out.println("Wrong");
    }
  }
  public static int todecimal(long num){
    long rem = 0;
    int i = 0;
    int result = 0;
    while(num!=0){
      rem = num % 10;
      result += rem* Math.pow(8,i);
      i++;
      num = num/10;
    }
    return result;
  }

  public static int tooctal(long num){
    long rem = 0;
    int i = 1;
    int result = 0;
    while(num!=0){
      rem = num % 8;
      result += rem*i;
      i = i*10;
      num = num/8;
    }
    return result;
  }

}
