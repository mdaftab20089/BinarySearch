public class PeakElement {
    public static int PE(int arr[],int n){
        if(n==1) return 0;
        // boundary condition.
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        // middle of the element
        for(int i=1; i<n-1; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
                return i;
            }
        }
        return -1;
    }
    public static int PEBS(int arr[],int n){
        int high=n;
        int low=0;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid+1]) {
                high=mid;
            } else low=mid+1;
        }
        return low;
    }

    public static void main(String[] args) {
        int arr[]={1,3,4,2,5,6,3};
        System.out.println(PEBS(arr, arr.length));
    }
}
