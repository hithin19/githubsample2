public class sqroot {

    static int sqroot1(int n){
        if(n==0||n==1)
              return 1;
        int i=1, res=1;
        while(res<n){
            i++;
            res=i*i;

        }
        return i-1;
    }//time complexity -o(rootn) as-o(1)


    static int sqroot2(int x){
        int low=0,high=x/2; int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int msq=mid*mid;
            if(msq==x)
                return mid;
            else if(msq>x)
                  high =mid-1;
            else{
                
                low=mid+1;
                ans=mid;
            }
            
        }

        return ans;
    }
    public static void main(String[] args)
	{
		int x = 11;
		System.out.print(sqroot1(x));
	}
    
}
