package util;

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
    /**
     * Adiciona um Node no inicio da Stack.
     * @param data 
     */
    @Override
    public void push(Object data) {
        Node n = new Node(data);
        n.setNext(head);
        head = n;
        size++;
    }
    /**
     * Remove um Node do inicio da Stack.
     * @return dado.
     */
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
    /**
     * Pega o dado do inicio da Stack.
     * @return dado do head.
     */
    @Override
    public Object peek() {
        return isEmpty() ? null : head.getData();
    }
    /**
     * Calcula o tamanho da Stack.
     * @return tamanho da Stack.
     */
    @Override
    public int size() {
        return size;
    }
    
    
    /**
     * Verifira se a Stack está vazia.
     * @return Boolean.
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }
}