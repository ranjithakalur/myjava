import java.util.*;

public class Fibanacci{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the limit:");
    int lim = input.nextInt();
    int f1 = 0;
    int f2 = 1;

    for(int i = 1; i<= lim; i++){
      System.out.print(f1+" , ");
      int sum = f1+f2;
      f1 = f2;
      f2 = sum;
    }
  }
}
