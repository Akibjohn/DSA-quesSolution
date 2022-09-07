public class new1 {
    public static void swap(String arr[],int i, int j){
        String temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static String largestNumber(int[] arr) {
        String[] strArr=new String[arr.length];
        StringBuilder sb =new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            strArr[i] = String.valueOf(arr[i]);
        }
        for(int i=0;i<strArr.length-1;i++){
            for(int j=i+1;j<strArr.length;j++){
                System.out.println(strArr[i]+" "+strArr[j]);
                System.out.println((strArr[i]+strArr[j]).compareTo((strArr[j]+strArr[i])));
                if((strArr[i]+strArr[j]).compareTo((strArr[j]+strArr[i]))<0){
                    // System.out.println(strArr[i]+" "+strArr[j]);
                    // System.out.println((strArr[i]+strArr[j]).compareTo((strArr[j]+strArr[i])));
                    swap(strArr,i,j);
                }
            }
        }
        
        for(int i=0;i<strArr.length;i++){
            sb.append(strArr[i]);
        }        
            
            
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] arr={3,30,34,5,9};
        System.out.println(largestNumber(arr));
    }
    
}
