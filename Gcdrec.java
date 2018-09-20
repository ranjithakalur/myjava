import java.util.*;

public class Gcdrec {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int a = input.nextInt();
    int b = input.nextInt();
    int hcf = hcf(a,b);
    System.out.println("Hcf is "+hcf);
  }
  public static int hcf(int a, int b){
    if(b!=0){
      return hcf(b,a%b);
    }
    else{
      return a;
    }
  }
}
