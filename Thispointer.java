//this pointer

class Student{
    String name;
    int age;

    void playGames(String name){
        System.out.println(this.name+" play games with "+name);
    }
}
public class Thispointer{
public static void main(String[] args){
    Student s = new Student();
    s.name = "ABC";
    s.playGames("XYZ");
}
}

