/**
 * Created by SunDa on 4/16/2017.
 */
class Node {

    int data;
    Node next;

    public Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}

class stack{
    Node head;
    int size = 0;
    int sum = 0;

    public stack(){
        head = null;
    }

    public boolean empty(){
        if(head == null)
            return true;
        return false;
    }

    public int size(){
        return size;
    }

    public int top(){
        return head.data;
    }

    public void push(int n){
        Node node = new Node(n, head);
        head = node;
        size++;
    }

    public void pop(){
        head = head.next;
        size--;
    }

    public int missing(stack s)
    {
        if(empty())
            return 1;

        int stackSum = (size+1)*(size+2)/2;
        return stackSum - sum;
    }

    public void push(int[] array)
    {
        for(int i = 0; i < array.length; i++) {
            Node node = new Node(array[i], head);
            head = node;
            size++;
            sum += array[i];
        }
    }
}


