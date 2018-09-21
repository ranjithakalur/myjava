import java.util.*;

public class ReverseSent{
    public static void main(String[] args) {
        String sentence = "Go work";
        String reversed = reverse(sentence);
        System.out.println("The reversed sentence is: " + reversed);
    }

    public static String reverse(String sentence)
    {
        if (sentence.isEmpty())
            return sentence;

        char a = sentence.charAt(0);
        System.out.println(a);
        return reverse(sentence.substring(1)) + sentence.charAt(0);
        //char a = sentence.charAt(0);
        //System.out.println(a);
    }
}
