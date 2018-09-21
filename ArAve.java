import java.util.*;

public class ArAve{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    int n = input.nextInt();
    int a[] = new int[n];
    System.out.println("Enter the elements:");
    int sum = 0;
    int avg = 0;
    for(int i = 0;i<n;i++){
      a[i] = input.nextInt();
      sum = sum + a[i];
      avg = sum/n;
    }
    System.out.printf("Sum is %d\n average is %d\n",sum,avg);
    for(int i=0;i<n;i++){
      System.out.println("Array is "+a[i]);
    }
  }
}
