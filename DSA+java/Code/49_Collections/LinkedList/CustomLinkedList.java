public class CustomLinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

    Node head;
    Node tail;
    private int size;

    public int size() {
        return this.size;
    }

    public void addFirst(int data) {
        Node tba = new Node(data, null);
        if (size == 0) {
            head = tba;
            tail = tba;
        } else {
            tba.next = head;
            head = tba;
        }
        size++;
    }

    public void addLast(int data) {
        Node tba = new Node(data, null);
        if (size == 0) {
            head = tba;
            tail = tba;
        } else {
            tail.next = tba;
            tail = tba;
        }
        size++;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public int getFirst() {
        if (size == 0) {
            System.out.println("Error: Empty");
            return -1;
        }
        return head.data;

    }

    public int getlast() {
        if (size == 0) {
            System.out.println("Error: Empty");
            return -1;
        }
        return tail.data;
    }

    public void removeFirst() {
        if (size == 0)
            System.out.println("Error: Invalid");
        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
        } else {
            head = head.next;
            size--;
        }
    }
    // public void removeLast(){
    // if(size==0) System.out.println("Error: Invalid");
    // if(size==1){
    // head=null;
    // tail=null;
    // size=0;
    // }
    // else{

    // }
    // }
    public int getAt(int idx) {
        if (size == 0) {
            System.out.println("List is empty");
            return -1;
        } else if (idx < 0 || idx >= size) {
            System.out.println("Invalid arguments");
            return -1;
        }
        Node temp = head;
        while (idx-- > 0) {
            temp = temp.next;
        }
        return temp.data;

    }
    public void addAt(int idx, int data){
        
       

    }

}
