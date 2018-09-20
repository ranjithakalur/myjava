import java.util.*;

public class PrimeInter{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 2 number:");
    int a = input.nextInt();
    int b = input.nextInt();
    System.out.println("\n");

    int low,big;
    if(a>b){
      big=a;
      low=b;
  }
    else{
      big=b;
      low=a;
}
    while(low<big){
      boolean flag = false;
      for(int i=2; i<=low/2; i++){
        if(low%i==0){
          flag=true;
          break;
        }
      }
      if(!flag)
        System.out.println(low+" ");
        low++;
    }
  }
}
