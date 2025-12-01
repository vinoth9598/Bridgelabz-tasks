import java.util.LinkedList ;

public class QueueList {
    private LinkedList<Integer> list = new LinkedList<>();

    public void enqueue(int value){
        list.addLast(value);
    }
    public int dequeue(){
        if(list.isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return list.removeFirst();
    }
    public void printQueues(){
        System.out.println("Queue list " + list);
    }

    public int size(){
        return list.size();
    }

    public static void main(String[] args){
        QueueList queues = new QueueList();

        queues.enqueue(56);
        queues.enqueue(30);
        queues.enqueue(70);

        queues.printQueues();
        queues.size();

        System.out.println("dequeue from queue : " + queues.dequeue());
        System.out.println("size of the queue :" + queues.size());
    }
}
;