import java.util.*;

public class Artransp{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the row and column:");
    int row  = input.nextInt();
    int column = input.nextInt();
    int mat[][] = new int[row][column];
    System.out.println("Enter the matrix");
    for(int i=0;i<row;i++){
      for(int j=0;j<column;j++){
        mat[i][j] = input.nextInt();
      }
    }
    System.out.println();
    for(int i=0;i<column;i++){
      for(int j=0;j<row;j++){
        System.out.print(mat[j][i]+" ");
      }
      System.out.println();
    }
  }
}
