public class CustomStack{
    int MAX_CAP=10,nel=0;
    int[] arr=new int[MAX_CAP];

    public void push(int data){
        if(MAX_CAP==nel) grow();
        if(this.size()==MAX_CAP){
            System.out.println("Stack Overflow");
            return;
        }
        arr[nel++]=data;
    }
    private void grow(){
        MAX_CAP*=2;
        int[] temp=new int[MAX_CAP];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
    }
    public int pop(){
        if(isEmpty()==true){
            System.out.println("Stack Underflow");
            return -1;
        }
        int popvalue=arr[nel-1];
        nel--;
        return popvalue;
    }
    public int peek(){
        return arr[nel-1];
    }
    public int size(){
        
        return nel;
    }
    public boolean isEmpty(){
        if(nel>=0) return false;
        return true;
    }
    public int search(int data){
        
        for(int i=0;i<nel;i++){
            if(arr[i]==data){
                return i;
            }
        }
        return -1;
    }
    public String toString(){
        if(this.size()==0){
            return"[]";
        }
        StringBuilder sb= new StringBuilder();
        sb.append("[");
        for(int i=0;i<size();i++){
            sb.append(arr[i]+", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }

}