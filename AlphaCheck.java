import java.util.*;

public class AlphaCheck{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter anything:");
    char ch = input.next().charAt(0);
    if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
      System.out.println("Alphabet");
    else
      System.out.println("Not");
    }
}
