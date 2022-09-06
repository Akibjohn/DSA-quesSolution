import java.util.*;

public class freqMap{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(n-->0){
            int key=input.nextInt();
            hm.put(key, hm.getOrDefault(key, 0)+1);
        }
        for(int key:hm.keySet()){
            if(hm.get(key)==key) System.out.println(key);
        }
        System.out.println(hm);
        

    }
}