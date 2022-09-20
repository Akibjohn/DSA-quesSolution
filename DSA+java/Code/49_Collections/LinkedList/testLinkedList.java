public class testLinkedList{
    public static void main(String[] args) {
        CustomLinkedList ll=new CustomLinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        System.out.println(ll.size());
        ll.display();
        System.out.println(ll.getFirst());
        System.out.println(ll.getlast());
        System.out.println(ll.getAt(10000));
    }
}
