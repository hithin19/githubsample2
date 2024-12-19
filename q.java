import java.util.Arrays;

public class q {
    static void bubble(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,2,3,4,1};
        bubble(arr);
        System.out.print(Arrays.toString(arr));
    }
}
