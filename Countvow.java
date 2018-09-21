import java.util.*;

public class Countvow{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Ente the String:");
    String str = input.nextLine();
    int count = countvow(str);
    System.out.println("No.of vowels is "+count);
  }

  public static int countvow(String str){
    int c=0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
        c++;
      }
    }
    return  c;
  }
}
