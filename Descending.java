public class Descending{
    public static void main(String args[]){
       
        int[] arr=new int[]{5,9,1,3,7,4};
        
        System.out.println("Numbers before arranging in Descending order:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            
        }
        System.out.println();
       
        System.out.println("Numbers after arranging in Descending Order:");
       
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}