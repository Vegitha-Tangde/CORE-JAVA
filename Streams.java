//Streams

// public class Streams{

//     // public static int sum(int a, int b){
//     //     return a+b;
//     // }
//     //Instead of above , write below code to shorten
//     interface MathOp{
//         int operate(int a, int b);
//     }
//      public static void main(String[] args) {

//         MathOp op = (a,b)->(a+b);
//         MathOp op1 = (a,b)->(a-b);
//         MathOp op2 = (a,b)->(a*b);

//         System.out.println(op.operate(2,3));
//         System.out.println(op1.operate(2,3));
//         System.out.println(op2.operate(2,3));

//      }
// }

// //Even or not using lambda
// import java.util.function.Predicate;

// public class Streams{
//     public static void main(String[] args){
//         Predicate<Integer> val = (x)-> x%2 == 0;
//         System.out.println(val.test(3));
//     }
// }

//Printing given integers using stream
// import java.util.*;

// public class Streams{
//     public static void main(String[] args) {

//         List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//         System.out.println(list.stream().filter((x) -> x%2==0).count());
//     }
// }

//FILTER
//Printing 1-100 using stream
// import java.util.*;
// import java.util.List;
// import java.util.stream.Collectors;
// import java.util.stream.Stream;

// public class Streams{
//     public static void main(String[] args) {
//         List<Integer> num = Stream.iterate(1,(x)->x+1).limit(100).collect(Collectors.toList());
//         System.out.println(num);

//     }
// }


//starts with a and string greater than 3
// import java.util.*;
// import java.util.List;
// public class Streams{
//     public static void main(String[] args) {
//         List<String> al = Arrays.asList("abc","def","adfg","fgdd","ades","poi","a");
//         System.out.println(al.stream().filter((x)->(x.startsWith("a")&& x.length()>3)).count());

//     }
// }

//MAPPING

// import java.util.*;
// import java.util.stream.Collectors;
// public class Streams{
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(1,2,3,4,5);
//         System.out.println(nums.stream().map((x)->x*2).collect(Collectors.toList()));
//     }
// }

//Changing the string to UpperCase

// import java.util.*;
// import java.util.stream.Collectors;
// public class Streams{
//     public static void main(String[] args) {
//         List<String> str = Arrays.asList("absv","sdgf","srgd","dsgf");
//         System.out.println(str.stream().map((x)->x.toUpperCase()).collect(Collectors.toList()));
        
//     }
// }

//Printing count,sum,avg,max,min of integers at the same time using stream

// import java.util.*;
// import java.util.stream.Collectors;

// public class Streams{
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(1,2,3,4,5);
//         IntSummaryStatistics stats = nums.stream().collect(Collectors.summarizingInt(x->x));
//         System.out.println(stats.getMax());
//         System.out.println(stats.getCount());
//         System.out.println(stats.getMin());
//         System.out.println(stats.getAverage());
//         System.out.println(stats.getSum());
//     }
// }


//Printing 1-50 even numbers using stream

// import java.util.*;
// import java.util.stream.Stream;
// import java.util.stream.Collectors;
// public class Streams{
//     public static void main(String[] args) {
//         List<Integer> nums = Stream.iterate(2,(x)->x+2).limit(50).collect(Collectors.toList()); 
//         //takeWhile(x -> x <= 50) → stops the stream once value exceeds 50.
//         System.out.println(nums);
//     }
// }

//Print the name of employees who have salary greater than 50000

// import java.util.*;
// import java.util.stream.Collectors;
// class Employee{
//     String name;
//     double sal;
    
//     Employee(String name, double sal) {
//         this.name = name;
//         this.sal = sal;
//     }
// }
// public class Streams {
//     public static void main(String[] args) {
//       List<Employee> employees = Arrays.asList(
//             new Employee("Abc", 60000),
//             new Employee("Def", 45000),
//             new Employee("Ghi", 52000),
//             new Employee("Jkl", 48000)
//         );

//         System.out.println(
//             employees.stream()
//                      .filter(emp -> emp.sal > 50000)
//                      .map(emp -> emp.name)
//                      .collect(Collectors.toList()));
//     }
// }

//Or

// import java.util.ArrayList;

// class Employee{
//     String name;
//     int salary;
    
//     Employee(String name, int salary) {
//         this.name = name;
//         this.salary = salary;
//     }
//     public void setName(String name){
//         this.name = name;
//     }
//     public String getName(){
//         return this.name;
//     }
//     public void setSalary(int salary){
//         this.salary = salary;
//     }
//     public int getSalary(){
//         return this.salary;
//     }
    
// }

// public class Streams{
//     public static void main(String[] args) {
//         List<Employee> employees = new ArrayList<>();
//         employees.add(new Employee("abc",60000));
//         employees.add(new Employee("def",50000));
//         employees.add(new Employee("ghi",40000));
//         employees.add(new Employee("jkl",30000));
//         employees.add(new Employee("xyz",80000));

//         //List<String> names = .................
//     }
// }