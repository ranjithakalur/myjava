import java.util.*;

public class MultTable{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number:");
    int num = input.nextInt();
    int prod = 1;
    System.out.println("Table is\n");
    for(int i =1 ; i<=10; i++){
      prod = num * i;
      System.out.println(i+"*"+num+"="+prod);
    }
  }
}
