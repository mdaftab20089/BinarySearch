public class LowerBound {
    /* for a value x lower bound of is denoted as :-
    arr[index] >= x ;
     */
    public static int LB(int[] arr,int n,int key){
        int low=0;
        int high= n-1;
        //int mid=(low+high)/2;
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=key){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;

    }


    public static void main(String[] args) {
        int[] arr={1,2,4,6,8,10};
        int key=9;
        int res=LB(arr, arr.length, key);
        System.out.printf("lower bound of %d is %d",key,res);

    }
}
