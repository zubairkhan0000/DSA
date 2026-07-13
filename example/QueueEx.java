import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Object> queue=new PriorityQueue<Object>();
        queue.offer(20);
        queue.offer(13);
        queue.offer(25);
        System.out.println("Queue:");
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        
    }
    
}
