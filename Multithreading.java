//Multithreading
//Main method
// public class Multithreading {
//     public static void main(String[] args) {
//         System.out.println("Hello World");
//         System.out.println(Thread.currentThread().getName());
//     }
// }

//1

//(i) extends thread
//(ii) run()
//(iii) start()

// class World extends Thread{
//     @Override
//     public void run(){
//         System.out.println(getName());
//         System.out.println("World running");
//     }
// }
// public class Multithreading {
//     public static void main(String[] args) {
//         World w = new World();
//         //Infinite loop
//         for(; ;){
//             w.run();
//         }
//     }
// }

//2

// class World extends Thread{
//     @Override
//     public void run(){
//         System.out.println(getName());
//     }
// }
// public class Multithreading {
//     public static void main(String[] args) {
//         World w = new World();
//         w.setName("World");
//         w.start();
//         System.out.println(w.getState()); // Gives output as RUNNABLE which means it is ready to run in cpu
//     }
// }

//24/06/25

//Using Runnable
//1
// class Multithread implements Runnable{
//     @Override
//     public void run(){
//         System.out.println("Code executed by "+ Thread.currentThread().getName()); //third  (Thread-0)
//     }
// }
// public class Multithreading{
//     public static void main(String[] args){
//         System.out.println("Code executed by "+ Thread.currentThread().getName()); //Prints main first
//         Multithread obj = new Multithread();
//         Thread th = new Thread(obj);
//         th.start();
//         System.out.println("Finished code with "+ Thread.currentThread().getName());//second
//     }
// }

//2 - sleep class 

// class Multithread implements Runnable{
//     @Override
//     public void run(){
//         System.out.println("Code executed by "+ Thread.currentThread().getName()); //third  (Thread-0)
//     }
// }
// public class Multithreading{
//     public static void main(String[] args)throws InterruptedException{
//         System.out.println("Code executed by "+ Thread.currentThread().getName()); //Prints main first
//         Multithread obj = new Multithread();
//         Thread th = new Thread(obj);
//         th.start();
//         Thread.sleep(1000); //To execute the thread-0 before finished code , waits for 1 second
//         System.out.println("Finished code with "+ Thread.currentThread().getName());//second
//     }
// }

//Using Thread
//-Only difference b/w runnable and thread is, in thread no need to pass the obj to the thread constructor
//1

// class Multithread extends Thread{
//     @Override
//     public void run(){
//         System.out.println("Code executed by "+ Thread.currentThread().getName());
//     }
// }
// public class Multithreading{
//     public static void main(String[] args) {
//         System.out.println("Code executed by "+ Thread.currentThread().getName());
//         Multithread obj = new Multithread();
//         obj.start();
//         System.out.println("Finished code with "+ Thread.currentThread().getName());
//     }
// }

// 3 threads, 3 methods and run

class Multithread{
    public synchronized void task1(){
        try{
            System.out.println("Inside task1");
            Thread.sleep(10000);
            System.out.println("Lock released from task1");
            Thread.sleep(2000);
        }
        catch(Exception e){
        }
    }
    public void task2()throws InterruptedException{
        System.out.println("Inside task2");
        synchronized (this){
            System.out.println("Task2 inside synchronized");
            Thread.sleep(5000);
        }
        System.out.println("Outside task2 after lock released");
    }
    public void task3(){
        System.out.println("Inside task3");
    }
}

public class Multithreading{
    public static void main(String[] args) {
        Multithread obj = new Multithread();
        Thread t1 = new Thread(()->obj.task1());
        Thread t2 = new Thread(()-> {
            try{
                obj.task2();
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        });
        Thread t3 = new Thread(()->obj.task3());

        t1.start();
        t2.start();
        t3.start();

    }
}