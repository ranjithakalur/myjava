import java.util.Scanner;

public class Mult{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    float a = input.nextFloat();
    float b = input.nextFloat();
    float c = a * b;
    System.out.println("Product is "+ c);
  }
}
