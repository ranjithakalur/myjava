import java.util.*;

public class Quadratic {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a:");
    double a = input.nextDouble();
    System.out.println("Enter b:");
    double b = input.nextDouble();
    System.out.println("Enter c:");
    double c = input.nextDouble();
    double root1,root2;
    double det = b*b-4*a*c;
    if(det>0){
       root1 = (-b + Math.sqrt(det))/(2*a);
       root2 = (-b - Math.sqrt(det))/(2*a);
       System.out.format("root1=%.2f and root2=%.2f",root1, root2);
    }
    else if(det == 0){
      root1=root2=-b/(2*a);
      System.out.format("root1=root2=%.2f",root1);
    }
    else{
      double real = -b/(2*a);
      double imaginary = Math.sqrt(-det) / (2 * a);

        System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", real, imaginary, real, imaginary);

    }


  }
}
