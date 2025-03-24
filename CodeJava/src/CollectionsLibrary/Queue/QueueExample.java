package CollectionsLibrary.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> que=new LinkedList<>();
        que.add(10);
        que.offer(20);
        System.out.println("Queue Structure:"+que);

        System.out.println("Head=="+que.peek());
        System.out.println("Head=="+que.element());

        System.out.println("Removed--"+que.remove());
        System.out.println("Removed--"+que.poll());

        System.out.println("Removed--"+que.poll());




    }
}
