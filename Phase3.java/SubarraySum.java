import java.util.Arrays;

public class SubarraySum {
    public static void main(String[] args){
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sum = 0;
        int[] arr1;
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr.length;j++){
                sum = sum + arr[i][j];
                

            }
            System.out.println(sum);
            
        }
        
        
    }
}