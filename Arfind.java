import java.util.*;

public class Arfind{
  public static void main(String[] args){
    Scanner input  = new Scanner(System.in);
    System.out.println("Enter d length");
    int n  = input.nextInt();
    int a[] = new int[n];
    System.out.println("Enter the elements:");
    for(int i=0;i<n;i++){
        a[i] = input.nextInt();
      }
      boolean flag = false;
    System.out.println("Enter the num:");
    int num = input.nextInt();
    for(int i=0;i<n;i++){
      if(a[i] == num){
        System.out.println("Found at position "+(i+1));
        flag = true;
      }
    }
    if(!flag){
      System.out.println("Not found");
    }
  }
}
