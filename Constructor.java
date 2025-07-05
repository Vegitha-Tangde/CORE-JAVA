//Constructor

// class Student{
//     String name;
//     int id;

//     Student(String name,int id){
//         this.name = name;
//         this.id = id;
//     }
// }

// public class Constructor {
//     public static void main(String[] args) {
//         Student s = new Student("A",24);
//         //System.out.println(s);  -> only prints address
//         System.out.println(s.name+" "+s.id);

//     }
// }

//2

// class Student{
//     String name;
//     int id;

//     Student(String name,int id){
//         this.name = name;
//         this.id = id;
//     }
// }

// public class Constructor {
//     public static void main(String[] args) {
//         Student s = new Student("A",24);
//         //System.out.println(s);  -> only prints address
//         Student s2 = s;
//         s2.name="B";
//         s2.id=25;
//         System.out.println(s2.name+" "+s2.id);
//         System.out.println(s.name+" "+s.id);

//     }
// }


//Qn: Create a class Car with attributes name, model,year. The class should have methods displayName,that prints details of the car.
// Make a constructor to initialize these attributes. Create an instance of car & display the details.                                                                          

// class Car{
//     String name;
//     String model;
//     int year;

//      Car(String name, String model, int year) {
//         this.name = name;
//         this.model = model;
//         this.year = year;
//     }
//     void displayName() {
//         System.out.println("Name: " + name);
//         System.out.println("Model: " + model);
//         System.out.println("Year: " + year);
//     }
// }
// public class Constructor{
//     public static void main(String[] args) {
//         Car c = new Car("ABC","xyz",2000);
//         c.displayName();

//     }
// }