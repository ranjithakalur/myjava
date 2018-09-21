import java.util.*;

public class Arlarge{
  public static void main(String[] args){
    Scanner input  = new Scanner(System.in);
    System.out.println("length:");
    int n = input.nextInt();
    int a[] = new int[n];
    System.out.println("Enter the elements:");
    for(int i=0;i<n;i++){
      a[i] = input.nextInt();
    }
    int large = a[0];
    int small = a[0];
    for(int i=0;i<n;i++){
      if(large<a[i]){
        large = a[i];
      }
      if(small>a[i]){
        small = a[i];
      }
    }
    System.out.println("large is "+large);
    System.out.println("Small is "+small);
  }
}
