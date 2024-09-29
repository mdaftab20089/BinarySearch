import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class First_Last_Occurrance {

    public static void FL(int[] arr,int x){
        int first=-1;
        int last=-1;
        boolean start=true;
        int n= arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]==x ) {
                if(start) {
                    first = i;
                    last=i;
                    start=false;
                }
                last=i;
            }
        }
        System.out.printf("{%d\t , %d}",first,last );
    }

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


    public static int UB(int[] arr,int n,int key){
        int low=0;
        int high= n-1;
        //int mid=(low+high)/2;
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>key){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;

    }
    public static void First_Last_Occurrance_Binary(int[] arr,int n,int k){
        //List<Integer> list=new ArrayList<>();
        int res=LB(arr,n,k);
        if(res==n || arr[res]!=k) System.out.println("{-1,-1}");
        System.out.printf("{%d,%d}",res,UB(arr,n,k)-1);

    }

    public static void main(String[] args) {
           int[] arr={1,2,3,4,5,5,5,6,8,8,8,9,9,9,9,9,9,10};
           First_Last_Occurrance_Binary(arr, arr.length-1, 5);
    }
}
