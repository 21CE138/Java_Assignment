package JavaAssignment_4;

public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();
        for (int i = 1; i <= 10; i++) {
            queue.enqueue(i);
        }
        while (!queue.empty()) {
            System.out.println(queue.dequeue() + " ");
        }
        System.out.println();
    }
}
