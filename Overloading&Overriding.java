//17/6/25
//Method Overloading
//1
// import java.util.*;

// class Sum{
//     int sum(int a,int b){
//         return a+b;
//     }
//     int sum(int a,int b,int c){
//         return a+b+c;
//     }

// }
// public class main{
// public static void main(String[] args){
//     Sum s = new Sum();
// System.out.println(s.add(2,3));
// System.out.println(s.add(2,3,4));
// }
// }

//Method Overriding

// class Animal{
//     void sleep(){
//         System.out.println("Sleeping");
//     }
//     void eats(){
//         System.out.println("Eating");
//     }
// }
// class Dog extends Animal{
//     void eats(){           //Method Overriding
//         System.out.println("Dog is Eating");
//     }
//     void barks(){
//         System.out.println("The dog is barking");
//     }
// }
// class Pug extends Dog{
//     void smallSize(){
//         System.out.println("Small dog");
//     }
// }
// public class Inheritance {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eats();
        
//     }
// }

