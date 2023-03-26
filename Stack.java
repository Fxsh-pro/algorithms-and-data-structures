public class Stack<T> {
    public class Node{
        T data;
        Node next;
        public Node(T val){
            this.data = val;
            this.next = null;
        }
        public Node(T val, Node next){
            this.data = val;
            this.next = next;
        }
    }
    Node head;
    public Stack(){
        this.head = null;
    }
    public void push(T val){
        if(head==null){
            head = new Node(val);
            return;
        }
        Node temp = head;
        while (temp.next!=null)
            temp = temp.next;
        temp.next = new Node(val);
    }
    public void pop(){
        if(head==null)
            return;
        head = head.next;
    }
    public void show(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }

}
