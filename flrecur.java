public class flrecur {

    public static int firstoccre(int arr[],int l,int r,int x){
        if(r>=l){
            int mid=(l+r)/2;
            if(arr[mid]>x)
                      return firstoccre(arr,l,mid-1,x);
            else if(x>arr[mid])
                     return firstoccre(arr, mid+1, r, x);
            else{
                if(mid==0||arr[mid-1]!=arr[mid])
                          return mid;
                else          
                    return firstoccre(arr, l, mid-1, x);
            }
         }

        return-1;
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
    public static void main(String[] args){
        int arr[]={1, 2, 2, 2, 3, 4, 5, 5, 5, 6};
        int x=2;
        int a=firstoccre(arr, 0, arr.length-1, x);
        System.out.println("First occurrence of " + x + " is at index: " + a);
        x = 5;
        int lastIndex = lastoccre(arr, 0, arr.length - 1, x);
        System.out.println("Last occurrence of " + x + " is at index: " + lastIndex);
    } 
    
}
