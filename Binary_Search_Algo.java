public class Binary_Search_Algo {
    public static int BS(int[] arr, int low,int high,int key){
        if(low<=high) {
            int mid=low+(high-low)/2;
            if(key==arr[mid]) {
                return mid;
            } else if(key<arr[mid]){
                high=mid-1;
                return BS(arr,low,high,key);
            } else if(key>arr[mid]){
                low=mid+1;
                return BS(arr,low,high,key);
            }
        }
        return -1;
    }
    public static int IterativeBS(int[] arr,int low,int high,int key){
        if(low>high) return -1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(key==arr[mid]) return mid;
            else if(arr[mid]<key){
                low=mid+1;
            } else high=mid-1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,6,8,10};
        int res=BS(arr,0, arr.length-1,10 );
        if(res!=-1){
            System.out.printf("element found at position %d\t",res);
        } else System.out.println(-1);
    }
}
