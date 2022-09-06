
public class TestArrayList {
    public static void main(String[] args) {
        CustomArrayList al=new CustomArrayList();
        int value=100;
        for(int i=0;i<20;i++){
            
            al.add(value-=2);
        }
        
        System.out.println(al);
        al.sort();
        System.out.println(al);

    }
}
