
public class counto {

    static int countoccur(int arr[],int x){
        int count =0; int n=arr.length;
        for(int i=0;i<n;i++){
             if(arr[i]==x)
                count++;
        }
        return count;
    }
    //o(logn) time complexity
   public static int countoccu(int arr[] ,int x){
        int n=arr.length;
        int first =firstoccur(arr,0,n-1,x);

        if(first ==-1){return 0;}
        else 
            return(lastoccre(arr,0,n-1,x)-first+1);
    }
    public static int lastoccre(int arr[],int l,int r,int x){
        int n=arr.length;
        if(r>=l){
            int mid=(l+r)/2;
            if(arr[mid]>x)
                      return lastoccre(arr,l,mid-1,x);
            else if(x>arr[mid])
                     return lastoccre(arr, mid+1, r, x);
            else{
                if(mid==n-1||arr[mid+1]!=arr[mid])
                          return mid;
                else          
                    return lastoccre(arr, mid+1, r, x);
            }
         }

        return-1;
    }
   public static int firstoccur(int arr[],int l,int r,int x){
        while (r>=l) {
            int mid=(r+l)/2;
            if(arr[mid]>x){
                r=mid-1;
            }else if(arr[mid]<x){
                l=mid+1;
            }
            else{
                if(mid==0||arr[mid-1]!=arr[mid])
                       return mid;
                else 
                    r=mid-1;
            }
            
        }
        return -1;
    } 
    
}
