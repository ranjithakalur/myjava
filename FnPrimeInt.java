import java.util.*;

public class FnPrimeInt{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the two numbers:");
    int a = input.nextInt();
    int b = input.nextInt();
    System.out.println();

    int low,big;
    if(a>b){
      low = b;
      big = a;
    }
    else{
      low = a;
      big = b;
    }
    while(low<big){
      if(checkprime(low))
        System.out.println(low+" ");
      low ++;

    }
  }

  public static boolean checkprime(int num){
    boolean flag = true;
    for(int i = 2; i<=num/2;i++){
      if(num%i==0){
      flag = false;
      break;
    }
  }
  return flag;
  }
}
