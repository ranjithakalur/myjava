import java.util.*;

public class FnArms {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int a  = input.nextInt();
    int b = input.nextInt();
    int big,low;

    if(a>b){
      big = a;
      low = b;
    }
    else{
      big = b;
      low = a;
    }

    while(low<big){
      if(checkarms(low))
        System.out.println(low+" ");
      low ++;
    }
  }

  public static boolean checkarms(int num){
    int result = 0;
    int n = 0;
    int on = num;
    while(on!=0){
      on = on/10;
      n++;
    }
    on = num;
    while(on!=0){
      int rem = on%10;
      result +=  Math.pow(rem,n);
      on = on/10;
    }
    if(result == num){
      return true;
    }
    else{
      return false;
    }
  }
}
