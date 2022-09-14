

public class TestCustomStack {
    public static void main(String[] args) {
        CustomStack stack=new CustomStack();
        // System.out.println(stack);
        
        

        int data=1;
        for(int i=0;i<20;i++){
            stack.push(data++);
        }
        System.out.println(stack);
        // System.out.println(stack.search(3));
        // System.out.println(stack);
        // System.out.println(stack.pop());
        // System.out.println(stack.isEmpty());
        // System.out.println(stack.size());
        System.out.println("wellDone");
    }
}
