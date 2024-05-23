package coding_test.algorithm.stack_queue;

import java.util.ArrayList;

public class Queue<T> {
    private ArrayList<T> queue = new ArrayList<>();

    // Enqueue
    public void enqueue(T item) {
        queue.add(item);
    }
    // Dequeue
    public T dequeue() {
        if (queue.isEmpty()){
            return null;
        } else {
            return queue.remove(0);
        }
    }
    // queue 의 내부 데이터 체크
    public StringBuilder look() {
        StringBuilder sb = new StringBuilder();

        if (queue.isEmpty()) {
            sb.append(0);
        } else {
            for (int i = 0; i < queue.size(); i++) {
                Integer t = (Integer) queue.get(i);
                sb.append(t + ", ");
            }
        } return sb;
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    // 실행
    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue<>();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        System.out.println(myQueue.look()); // 1,2,3

        System.out.println(myQueue.dequeue()); // 1
        System.out.println(myQueue.look()); // 2,3
    }
}
