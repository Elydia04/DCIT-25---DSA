import java.util.Queue;
import java.util.LinkedList;


// offer() - adds an element to the end of the queue
// poll() - removes and returns the element at the front of the queue
// peek() - returns the element at the front of the queue without removing it
// isEmpty() - checks if the queue is empty
// size() - returns the number of elements in the queue
// contains() - checks if a specific element is present in the queue
public class Fifo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("karen");
        queue.offer("john");
        queue.offer("michael");
        queue.offer("susan");

        queue.poll();
        System.out.println(queue.peek()); // Output: karen

        System.out.println(queue.isEmpty());

        System.out.println(queue.size());

        System.out.println(queue.contains("michael"));
    }
}
