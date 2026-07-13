import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,3,5,7,2,1};
        qs(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int qSort(int[] arr,int low,int high){
        int pivort=arr[low];
        int l=low;
        int r=high;
        while(l<r){
            while(arr[l]<=pivort && l<=high-1){
                l++;
            }
            while(arr[r]>pivort && r>=low+1){
                r--;
            }
            if(l<r){
                swap(arr,l,r);
            }
        }
        swap(arr,low,r);
        return r;
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void qs(int[] arr,int low,int high){
        if(low<high){
            int p=qSort(arr, low, high);
            qs(arr, low, p-1);
            qs(arr, p+1, high);
        }
    }
}
