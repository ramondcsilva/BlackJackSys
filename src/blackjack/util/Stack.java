package blackjack.util;

public class Stack implements IStack{
    private Node head;
    private int size;
    
    public class Node{
        private Object data;
        private Node next;

        public Node(Object data){
            this.data = data;
        }
        public Node getNext(){
            return next;
        }
        public void setNext(Node next){
            this.next = next;
        }
        public Object getData(){
            return data;
        }
        public void setData(Object data){
            this.data = data;
        }
    }
    
    @Override
    public void push(Object data) {
        Node n = new Node(data);
        n.setNext(head);
        head = n;
        size++;
    }

    @Override
    public Object pop() {
        if(isEmpty()){
            return null;
        }
        Object data = head.getData();
        head = head.getNext();
        size--;
        return data;
    }

    @Override
    public Object peek() {
        return isEmpty() ? null : head.getData();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}