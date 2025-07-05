//import java.util.*;
// class Animal{
//     void sleep(){
//         System.out.println("Sleeping");
//     }
//     void eats(){
//         System.out.println("Eating");
//     }
// }
// class Dog extends Animal{
//     void barks(){
//         System.out.println("The dog is barking");
//     }
// }
// public class Inheritance {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.barks();
//         d.sleep();
//         d.eats();
//     }
// }

//Multilevel Inheritance

//  class Animal{
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

//Hierarchical Inheritance

class Animal{
    void sleep(){
        System.out.println("Sleeping");
    }
    void eats(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    void eats(){           //Method Overriding
        System.out.println("Dog is Eating");
    }
    void barks(){
        System.out.println("The dog is barking");
    }
}
class Pug extends Animal{
    void smallSize(){
        System.out.println("Small dog");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.barks();
        d.eats();
        d.sleep();

        Pug p = new Pug();
        p.smallSize();
        p.eats();
        
    }
}