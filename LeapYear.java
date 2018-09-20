import java.util.*;

public class LeapYear{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a year: ");
    int yr = input.nextInt();
    boolean leap = false;
    if(yr % 4 == 0){
      if(yr % 100 == 0){
        if(yr % 400 == 0)
          leap = true;
        else
          leap = false;
      }
     else
      leap = true;
  }
  else
    leap = false;
if(leap)
  System.out.println("it is a leap year");

else
  System.out.println("not");


}
}
