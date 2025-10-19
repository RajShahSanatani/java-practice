import java.util.*;

public class code10 {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = new String(); // creates empty string
        char ch[] = {'p','y','t','h','o','n'};

        System.out.println(s);   // prints "hello"
        System.out.println(s1);  // prints ""

        String s3 = new String(ch);
        System.out.println(s3);  // prints "python"

        System.out.println(s1.length());   // prints 0
        System.out.println(s.charAt(3));   // prints 'l'
        System.out.println(s3.substring(2)); // prints "thon"
        System.out.println(s1.equals(s3)); // prints false
        System.out.println(s.toLowerCase()); // prints "hello"
        System.out.println(s.toUpperCase()); // prints "HELLO"
        System.out.println(s1.trim()); // prints "" (still empty)
        System.out.println(s.replace('o', 'a')); // prints "hella"
        StringBuffer sb = new StringBuffer("Bharati Vidyapeeth");
        System.out.println(sb);
        sb.append(s);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());

    }
}
