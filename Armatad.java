import java.util.*;

public class Armatad{
  public static void main(String[] args){
    Scanner input  = new Scanner(System.in);
    System.out.println("Enter row and column:");
    int row = input.nextInt();
    int column = input.nextInt();
    int a[][] = new int[row][column];
    int b[][] = new int[row][column];
    int sum[][] = new int[row][column];
    System.out.println("Enter first matrix");
    for(int i=0;i<row;i++){
      for(int j=0;j<column;j++){
        a[i][j] = input.nextInt();
      }
    }
    System.out.println("Enter second matrix:");
    for(int i=0;i<row;i++){
      for(int j=0;j<column;j++){
        b[i][j] = input.nextInt();
      }
    }
    System.out.println("Sum is:");
    for(int i=0;i<row;i++){
      for(int j=0;j<column;j++){
        sum[i][j] = a[i][j] + b[i][j];
      }
    }
    for(int i=0;i<row;i++){
      for(int j=0;j<column;j++){
        System.out.print(sum[i][j] +" ");
  }
System.out.println();
}}
}
