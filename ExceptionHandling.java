//Exception Handling

//Arithmatic Exception

// public class ExceptionHandling {
//     public static void main(String[] args) {
//         int ans = 10/0;
//         System.out.println(ans);
//     }    
// }


import java.util.*;
// public class ExceptionHandling {
//     public static void main(String[] args) {
//         int[] numerators = {100,200,10,12,3};
//         int[] denominators = {10,2,5,6,0};

//         // for(int i =0;i<numerators.length;i++){  
//         //     int ans = (numerators[i]/denominators[i]);
//         //     System.out.println(ans);
//         //     }
//         //To handle exception
//         for(int i =0;i<numerators.length;i++){
//             try{
//             int ans = (numerators[i]/denominators[i]);
//             System.out.println(ans);
//             }
//             catch(ArithmeticException e){
//                 System.out.println("Exception occured is "+ e);
//             }
//         }
//     }    
// }


//ArrayIndexOutOfBoundsException

// public class ExceptionHandling {
//     public static void main(String[] args) {
//         int[] numerators = {100,200,10,12,3};
//         int[] denominators = {10,2,5,6,0};

//         for(int i =0;i<10;i++){
//             try{
//             int ans = (numerators[i]/denominators[i]);
//             System.out.println(ans);
//             }
//             catch(ArithmeticException e){
//                 System.out.println("Exception occured is "+ e);
//             }
//             catch(ArrayIndexOutOfBoundsException e){
//                 System.out.println(e);
//             }
//         }
//     }    
// }


//Finally - will always execute (prints)

// public class ExceptionHandling {
//     public static void main(String[] args) {
//         int[] numerators = {100,200,10,12,3};
//         int[] denominators = {10,2,5,6,0};

//         for(int i =0;i<10;i++){
//             try{
//             int ans = (numerators[i]/denominators[i]);
//             System.out.println(ans);
//             }
//             catch(ArithmeticException e){
//                 System.out.println("Exception occured is "+ e);
//             }
//             catch(ArrayIndexOutOfBoundsException e){
//                 System.out.println(e);
//             }
//             finally{
//                 System.out.println("Hello World");
//             }
//         }
//     }    
// }


//Q: NullPOinter Exception - Using a Student class and prints "Student should have a name"

// class Student{
//     String name;
//     int id;

//     Student(String name, int id){
//         this.name = name;
//         this.id = id;
//     }
//     public String getName(){
//         return this.name;
//     }
// }
// public class ExceptionHandling{
//     public static void main(String[] args) {
//         try{
//             Student s = null;
//            System.out.println(s.getName());
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//         finally{
//             System.out.println("Student should have a name");
//         }
        
//     }
// }

//FileNotFound Handling
// import java.io.FileReader;
// public class ExceptionHandling{
//     public static void main(String[] args) {
//         try{
//             FileReader fr = new FileReader("input.txt");
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//         finally{
//             System.out.println("The file should be present");
//         }
//     }
// }

// Throw and Throws

// class Student{
//     String name;
//     int id;

//     Student(String name, int id){
//         this.name = name;
//         this.id = id;
//     }
//     public String getName(){
//         return this.name;
//     }
// }
// public class ExceptionHandling{
//     public static void main(String[] args)throws Exception {
//         try{
//             Student s = null;
//            System.out.println(s.getName());
//         }
//         catch(Exception e){
//             throw new Exception("Student not found");
//         }
//         finally{
//             System.out.println("Student should have a name");
//         }
        
//     }
// }

//Q: Take an input and handle the case where the given input type is mismatched

// import java.util.*;

// public class ExceptionHandling{
//     public static void main(String[] args)throws Exception {
//         Scanner sc = new Scanner(System.in);
//         try{
//             int num = sc.nextInt();
//             System.out.println("The number is "+ num);
//         }
//         catch(Exception e){
//             throw new Exception("Invalid input");
//         }
//     }
// }

//Q: Age Validator - if age<18 throw exception
import java.util.*;

public class ExceptionHandling{
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);

        try{
            int age = sc.nextInt();
            if(age>18){
                System.out.println("Valid");
            }
            else{
                throw new Exception("Invalid input");
            }    
        }
        catch(Exception e){
            throw new Exception("Age invalid");
        }
    }
}