import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={1,4,3,8,5,6,9,1,2,3};
        merge(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
   static void merge(int[] arr,int low,int high){
        if(low>=high) return;
        int mid=low+(high-low)/2;
        merge(arr,low,mid);
        merge(arr,mid+1,high);
        ms(arr,low,mid,high);
    }
    static void ms(int[] arr,int low,int mid,int high){
        int[] temp=new int[high-low+1];
        int left=low;
        int right=mid+1;
        int idx=0;
        while(left<=mid &&right<=high){
            if(arr[left]<=arr[right]){
                temp[idx++]=arr[left];
                left++;
            }
            else{
                temp[idx++]=arr[right];
                right++;
            }
        }
        while(left<=mid){
            temp[idx++]=arr[left];
            left++;
        }
        while(right<=high){
            temp[idx++]=arr[right];
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }

    }
}
