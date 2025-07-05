//Printing String using lambda

import java.util.*;
public class Lambda{
    public static void main(String[] args) {
        List<String> al = Arrays.asList("a","b","c","d");
        al.forEach((x) -> System.out.println(x));
    }
}
