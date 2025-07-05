//import java.util.function.BiPredicate;
import java.util.function.Predicate;

//1
// public class Predicatee{
//     public static void main(String[] args) {
//         Predicate<Integer> val = (x)-> x%2 == 0;
//          System.out.println(val.test(3));

//     }
// }

//2
// public class Predicatee{
//     public static void main(String[] args) {
        
//         Predicate<String> startWithA = (x) -> x.toLowerCase().startsWith("a");
//         Predicate<String> endWithZ = (x) -> x.toLowerCase().endsWith("z");
//         Predicate<String> andOperator = startWithA.and(endWithZ);
//         System.out.println(andOperator.test("jhhjfhn"));
//     }
// }


//3. Check if one string starts with a, ends with z and contains p

public class Predicatee{
    public static void main(String[] args) {
        Predicate<String> startWithA = (x) -> x.toLowerCase().startsWith("a");
         Predicate<String> endWithZ = (x) -> x.toLowerCase().endsWith("z");
         Predicate<String> containsP = (x) -> x.toLowerCase().contains("p");

         Predicate<String> check = startWithA.and(endWithZ).and(containsP);
         System.out.println(check.test("applez"));
        
    }
}


//BiPredicate - takes two parameters

//1.Checking Even or Odd 
// public class Predicatee{
//     public static void main(String[] args) {
//         BiPredicate<Integer, Integer> evenOddCheck = (a,b)-> (a%2==0 && b%2 !=0) || (a%2 !=0 && b%2==0);
//         System.out.println(evenOddCheck.test(1,2));
//     }
// }

//2.Check if one string starts with z and other with a

// public class Predicatee{
//     public static void main(String[] args) {
//         BiPredicate<String, String> strCheck = (a, b) -> 
//             (a.startsWith("a") && b.startsWith("z")) || (a.startsWith("z") && b.startsWith("a"));

//             System.out.println(strCheck.test("abc","zxy"));


//     }
// }

