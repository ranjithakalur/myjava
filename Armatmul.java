import java.util.*;

public class Armatmul {
  public static void main(String[] args){
    Scanner input  = new Scanner(System.in);
    System.out.println("Enter the row and columns:");
    int row = input.nextInt();
    int column = input.nextInt();
    int a[][] = new int [row][column];
    int b[][] = new int [row][column];
    int prod[][] = new int [row][column];
    System.out.println("Enter 1st matrix:");
    for(int i=0;i<row;i++){
      for(int j=0;j<column;j++){
        a[i][j] = input.nextInt();
      }
    }
    System.out.println("Enter 2nd matrix:");
    for(int i=0;i<row;i++){
      for(int j=0;j<column;j++){
        b[i][j] = input.nextInt();
      }
    }

    System.out.println("Product is:");
    for(int i=0;i<row;i++){
      for(int j=0;j<column;j++){
        for(int k=0;k<column;k++){
          prod[i][j] = a[i][k] + b[k][j]; 
        }
      }
    }
  }
}
