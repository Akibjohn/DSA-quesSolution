public class CustomArrayList {
    int capacity=10,nel=0;
    int[] arr=new int[capacity];

    public int size(){ //size
        return nel;
    }

    public void add(int data){  //add
        if(nel==arr.length) grow();
        arr[nel++]=data;
    }
    private void grow(){
        capacity*=2;
        int[] temp=new int[capacity];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            temp[idx++]=arr[i];
        }
        arr=temp;
    }
    private boolean check(int idx){
        if(idx < 0 || idx>=this.size()){
            System.out.println("Invalid Index: "+idx);
            return false;
        }
        return true;
    }

    public int remove(int idx){   //remove
        if(!check(idx)){
            System.out.println("Invalid Index: "+idx);
            return -1;
        }
        int removeElem=arr[idx];
        for(int i=idx;i<nel-1;i++){
            swapRemove(i);
        }
        nel--;
        return removeElem;
    }
    private void swapRemove(int idx){
        int temp=arr[idx];
        arr[idx]=arr[idx+1];
        arr[idx+1]=temp;
    }
    public int get(int idx){  // get
        if(!check(idx)){
            System.out.println("Invalid Index: "+idx);
            return -1;
        }
        return arr[idx];
    }
    public void set(int idx,int data){ //set
        if(!check(idx)){
            System.out.println("Invalid Index: "+idx);
            return;
        }
        arr[idx]=data;

    }
    public void insert(int idx,int data){
        if(nel==arr.length) grow();
        if(!check(idx)){
            System.out.println("Invalid Index: "+idx);
            return;
        }
        for(int i=nel;i>idx;i--){
            swapInsert(i);
        }
        arr[idx]=data;
        nel++;
    }
    private void swapInsert(int idx){
        int temp=arr[idx];
        arr[idx]=arr[idx-1];
        arr[idx-1]=temp;
    }
    
    @Override
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
    
    public void sort(){
        for(int i=0;i<nel;i++){
            for(int j=1;j<nel-i;j++){
                if(arr[j-1]>arr[j]){
                    swapSort(j-1, j);
                }
            }
        }
    }

    private void swapSort(int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}