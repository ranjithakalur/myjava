import java.util.*;

public class BtoO {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your choice:\n1==>Binary to Octal\n2==>Octal to Binary");
    int ch = input.nextInt();
    long res;
    if(ch==1){
      System.out.println("Enter the Binary number:");
      long bin = input.nextLong();
      res = tooctal(bin);
      System.out.println("Octal  is ==> "+res);
    }
    else if(ch==2){
      System.out.println("Enter the Octal number:");
      long dec  = input.nextLong();
      res = tobinary(dec);
      System.out.println("Binary is ==> "+res);
    }
    else{
      System.out.println("Wrong");
    }
  }

  public static int tooctal(long num){
    int i = 0;
    long rem = 0;
    int result = 0;
    while(num!=0){
      rem = num % 10;
      result += rem*Math.pow(2,i);
      i++;
      num = num/10;
    }
    i = 1;
    int oct = 0;
    while(result!=0){
      rem = result % 8;
      oct += rem*i;
      i = i*10;
      result = result/8;
    }
    return oct;
  }

  public static  int tobinary(long num){
    int i =0;
    int result = 0;
    long rem = 0;
    while(num!=0){
      rem = num % 10;
      result += rem*Math.pow(8,i);
      i++;
      num = num/10;
    }
    i = 1;
    int dec = 0;
    while(result!=0){
      rem = result%2;
      dec +=rem*i;
      i = i*10;
      result = result/2;
    }
    return dec;
  }
}
