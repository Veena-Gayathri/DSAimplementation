package DSAimplementation.SortingTechniques;
import java.util.ArrayList;

public class MergeSort extends InsertionSort{


    public static void test(int[] arr){
        Swap(arr, 0, 1);
    }
    public static void MergeSortAlgo(int[] arr, int low, int high) {
        if(low>=high) return;
        int mid= (low+high)/2;
        MergeSortAlgo(arr, mid+1, high);
        MergeSortAlgo(arr, low, mid);
        mergeBoth(arr, low, mid, high);
    }
    public static void mergeBoth(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp= new ArrayList<Integer>();
        int start=low, end=high;
        int mid2=mid+1;
        while(mid>=low && high>=mid2){
            if(arr[low]<arr[mid2]){
                temp.add(arr[low]);
                low++;
            }
            else {
                temp.add(arr[mid2]);
                mid2++;
            }
        }
        while(high>=mid2){
            temp.add(arr[mid2]);
            mid2++;
        }
        while(low<=mid){
            temp.add(arr[low]);
            low++;
        }
        for(int i=start; i<=end; i++){
            arr[i]=temp.get(i-start);
        }

    }

}
