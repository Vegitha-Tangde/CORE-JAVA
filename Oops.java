//17/6/25
//OOPS
// import java.util.*;

// class Student{
//     int age;
//     String name;

//     void playGames(){
//         System.out.println(this.name + " "+"play games");
//     }
//     void giveInfo(){
//         System.out.println("Name is: "+this.name + " and Age is: "+ this.age);
//     }
// }

// public class Oops {  //main class
//     public static void main(String[] args){
//         Student st = new Student();
//         st.age = 24;
//         st.name = "ABC";

//         // System.out.println("Age is "+st.age);
//         // System.out.println("Name is "+st.name);

//         st.playGames();
//         st.giveInfo();
//     }
    
// }

//Calculator

//import java.util.*;

class Calc{
    int add(int... args){
        int sum=0;
        for(int val:args){
            sum+=val;
        }
        return sum;
    }
    int sub(int a, int b){
        return a-b;
    }
    int divide(int a, int b){
        return a/b;
    }
    int multiply(int... args){
        int prod = 1;
        for(int val:args){
            prod=prod*val;
        }
        return prod;
    }
}
public class Oops{
public static void main(String[] args){
    Calc c = new Calc();
    c.add(2,3,4);
    c.sub(10,5);
    c.multiply(2,8,9);
    c.divide(100,5);
}
}

// OOPs Pillars  -  Encapsulation   ,  Abstraction  ,   Inheritance  ,   Polymorphism