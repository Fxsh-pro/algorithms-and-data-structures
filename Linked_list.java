
public class Linked_list<T> {
    public class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    Node head;
    public Linked_list() {
        this.head = null;
    }

    public void add(T data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void erase(T val){
        if(head == null) return;
        if (head.data == val){
            head = head.next;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast!=null){
            if(fast.next!=null)
                fast=fast.next;
            if (fast.data == val){
                slow.next = fast.next;

            }  else
                slow=slow.next;
            if (fast.next == null) break;
        }
        if(head.data == val)
            head = head.next;
    }

    public void printList() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
