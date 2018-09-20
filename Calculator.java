import java.util.*;

public class Calculator{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your choice\n1-add\n2-sub\n3-mult\n4-div");
    int ch = input.nextInt();
    System.out.println("Enter the two numbers:");
    double a = input.nextDouble();
    double b = input.nextDouble();

    double result;

    switch(ch){
      case 1:result = a+b;
      break;
      case 2:result = a-b;
      break;
      case 3:result = a*b;
      break;
      case 4:result = a/b;
      break;
      default: System.out.println("Wrong choice");
      return;
    }
    System.out.println("Result is "+result);
  }
}
