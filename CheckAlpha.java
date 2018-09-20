import java.util.*;

public class CheckAlpha{
  public static void main(String[] args){
  //  char vow = {"a","e","i","o","u"};
  char vow[]= {'a','e','i','o','u'};
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a charactr:");
    char ch = input.next().charAt(0);
    for(int i=0;i<5;i++){
      if(ch == vow[i]){
        System.out.println("Vowel");
      }
      else{
        System.out.println("constraint");
      }
    }
    }
}
