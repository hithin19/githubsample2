public class binaryse{
    static int binsearch(int arr[],int x){
        int low=0; int high=arr.length-1;
        
        while(low<=high){

            int mid=(low+high)/2;
            if(arr[mid]==x){
                   System.out.println("found");
                   return mid;
            }
            else if(x>mid){
                low=mid+1; 
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    static int recbs(int arr[],int low,int high,int x){
             if(high>=low){
                
             
             int mid=(low+high)/2;
             if(arr[mid]==x){ return mid;}
             else if(arr[mid]>x){
                recbs(arr, low, mid-1, x);
             }
             else{
                recbs(arr, mid+1, high, x);
             }
            }
            return -1;

    }
}