
//Priority
import java.util.*;
// public class PriorityQ{
//     public static void main(String[] args) {
//         //Max
//         // PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
//         //     return (b-a);
//         // });
//         //Or
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//        //Min
//        PriorityQueue<Integer> pq1 = new PriorityQueue<>();

//        pq1.add(1);
//        pq1.add(13);
//        pq1.add(11);
//        pq1.add(17);
//        pq1.add(5);

//        while(pq1.size()>0){
//         int value = pq1.remove();
//         System.out.println(value);
//        }
//     }
// }

//HashSet

public class PriorityQ{
public static void main(String[] args) {
    
HashSet<Integer> hs = new HashSet<>();
hs.add(1);
hs.add(1);
hs.add(1);
hs.add(2);
hs.add(1);
hs.add(1);

System.out.println(hs.size());
}
}