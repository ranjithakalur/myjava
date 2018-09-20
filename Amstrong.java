import java.util.*;

public class Amstrong{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = input.nextInt();
    int onum = num;
    int on = num;
    int result = 0;
    int rem;
    int n=0;
    while(on!=0){
      on = on/10;
      n++;
    }

    while(onum!=0){
      rem = onum%10;
      result +=Math.pow(rem,n);
      onum = onum/10;
    }
    if(result == num){
      System.out.println("Amstrong");
    }
    else{
      System.out.println("not");
    }
  }
}
