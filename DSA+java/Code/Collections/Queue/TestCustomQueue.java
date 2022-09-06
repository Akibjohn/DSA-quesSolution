public class TestCustomQueue {
    public static void main(String[] args) {
        CustomQueue queue=new CustomQueue();
        for(int i=0;i<20;i++){
            queue.add(i+1);
        }
        System.out.println("Elements in Queue:"+queue);
        //remove () method =>removes first element from the queue
        System.out.println("remove():Element removed from the queue: "+queue.remove());
        //element() => returns head of the queue
        System.out.println("element():Head of the queue: "+queue.element());
         //poll () => removes and returns the head
         System.out.println("Poll():Returned Head of the queue: "+queue.poll());
        // //returns head of the queue
        System.out.println("peek():Head of the queue: "+queue.peek());
        // //print the contents of the Queue
        System.out.println("Final Queue:"+queue);
    }
    
}
