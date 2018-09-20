import java.util.*;

public class Sumoftwoprime {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = input.nextInt();
    boolean flag = true;

    for(int i=2;i<=num/2;i++){
      if(isprime(i)){
        if(isprime(num-i)){
          System.out.printf("%d = %d + %d\n",num,i,num-i);
          flag = true;
        }
      }
    }
    if(!flag){
      System.out.println("Sorry");
    }

  }

  static boolean isprime(int n){
    boolean flag = true;
    for(int i = 2; i<n/2;i++){
      if(n%i==0){
        flag = false;
        break;
      }
    }
    return flag;
  }
}
