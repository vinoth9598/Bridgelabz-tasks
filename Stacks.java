import java.util.LinkedList;

public class Stacks {

    private LinkedList<Integer> list = new LinkedList<>();

    public void push(int data){
        list.addFirst(data);
    }

    private void printStack() {
        System.out.println("stacks :" + list);
    }

    public int pop(){
        if(list.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return list.removeLast();
    }

    public int peek(){
        if(list.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return list.getFirst();
    }
    public static void main(String[] args){
        Stacks stack = new Stacks();

        stack.push(56);
        stack.push(30);
        stack.push(70);

        stack.printStack();

        System.out.println("Top element : " + stack.peek());
        System.out.println("Pop element :" + stack.pop());

    }


}
