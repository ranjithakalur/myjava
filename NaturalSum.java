import java.util.*;

public class NaturalSum{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = input.nextInt();
    int sum = 0;
    for(int i = 0; i <= num; i++){
      sum+=i;
    }
    System.out.println("Sum is "+sum);
}}
/*using while
while(i<=num){
sum+=i;
i++;
}*/
