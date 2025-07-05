//Encapsulation - setter and getters
//import java.util.*;
class Car{
    private int model;
    private String feature;

   int getModel(){
    return this.model;
   }
   void setModel(int model){
    this.model = model;
   }
   String getFeature(){
    return this.feature;
   }
   void setFeature(String feature){
    this.feature = feature;
   }
}

public class Encapsulation {
    public static void main(String[] args) {
        Car c = new Car();
        c.setModel(101);
        c.setFeature("abc");
        System.out.println(c.getModel());
        System.out.println(c.getFeature());

    }
    
}
