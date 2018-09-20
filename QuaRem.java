import java.util.Scanner;

public class QuaRem{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter divident:");
    int a = input.nextInt();
    System.out.println("Enter divisor:");
    int b = input.nextInt();
    float qua = a / b;
    float rem = a % b;
    System.out.println("Quotient= "+ qua + "  remider= "+rem);
  }
}
