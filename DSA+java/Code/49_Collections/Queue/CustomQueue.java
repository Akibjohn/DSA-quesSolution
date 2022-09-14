public class CustomQueue{

    int capacity=10,nel=0;

    int[] arr=new int[capacity];

    public int size(){  //O(1)
        return nel;
    }

    public void add(int data){//O(1)
        if(nel==arr.length) grow();
        arr[nel++]=data;
    }

    public void grow(){
        capacity*=2;
        int[] temp=new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
    }

    public int peek(){//O(1)
        if(isEmpty()){
            System.out.print("nullValue");
            return 0;
        }
        return arr[0];
    }

    public int element(){//O(1)
        if(isEmpty()){
            System.out.print("ERROR:noSuchElement");
            return -1;
        }
        return arr[0];
    }
    private boolean isEmpty(){//O(1)
        if(nel==0) return true;
        return false;
    }

    public int remove(){//O(1)
        if(isEmpty()){
            System.out.print("Error");
            return -1;
        }
        int value=arr[0];
        for(int i=0;i<nel-1;i++){
            swap(i);
        }
        nel--;
        return value;
    }

    public int poll(){
        if(isEmpty()){
            // System.out.print("ERROR:noSuchElementException");
            return -1;
        }
        int value=arr[0];
        for(int i=0;i<nel-1;i++){
            swap(i);
        }
        nel--;
        return value;
    }

    private void swap(int i){
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;

    }

    @Override
    public String toString(){
        if(isEmpty())return "[]";
        StringBuilder sb=new StringBuilder();
        sb.append('[');
        for(int i=0;i<size();i++){
            sb.append(arr[i]+", ");
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append(']');
        return sb.toString();
    }

}