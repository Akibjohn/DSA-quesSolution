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

    public void removeLast() {
        if (size == 0) {
            System.out.println("Empty");
            return;
        }
        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
        } else {
            // LinkedList 1->2->3->4->5
            // head = 1, tail = 5,size = 5
            // sl = 1,
            Node sl = head; // second last
            while (sl.next != tail) {
                sl = sl.next;
            }
            sl.next = null;
            tail = sl;
            size--;
        }
    }

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

    public void addAt(int idx, int data) {
        if (idx < 0 && idx > this.size) {
            System.out.println("Invalid Input");
            return;
        }
        if (idx == 0) {
            addFirst(data);
            return;
        }
        if(idx==this.size){
            addLast(data);
            return;
        }
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        Node first=temp;
        Node second=temp.next;
        Node tba =new Node(data, null);
        tba.next=second;
        first.next=tba;
        size++;
    }

    public int getKthFromLast(int k){
        Node s=head;
        Node e=head;
        for(int i=0;i<k;i++) e=e.next;
        while(e.next!=null){
            s=s.next;
            e=e.next;
        }
        return s.data;
    }

}
