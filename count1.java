public class count1 {

    //sorted binay arr of 0s and 1s is given
   static int countar(int arr[],int n){
  //[0,0,0,1,1,1,1]
    int low=0 ,high=n-1;
    while(high>=low){
        int mid=(low+high)/2;
         if(arr[mid]==0){
              low=mid+1;
         }
         else{
            if(mid==0||arr[mid-1]==0)
                    return n-mid;
            else high=mid-1;
         }
    }
        return 0;
        }
    }
//time complexity is logn







