package DSAimplementation.SortingTechniques;

public class QuickSort extends SelectionSort {
    public static void QuickSortAlgo(int[] arr){
        int n = arr.length;
        int low = 0, high =n-1;
        performQuickSort(arr, low, high);
    }
    public static int pivotplace(int[] arr, int low, int high){
        int pivot = low;
        int i = low, j =high;
        while(i<j){
            while(arr[i]<=arr[pivot] && i< high) i++;
            while(arr[j]> arr[pivot] && j > low) j--;
            if(i<j) {
                Swap(arr, i, j);
            }
        }
        Swap(arr, j, pivot);
        return j;
    }
    public static void performQuickSort(int[] arr, int low, int high){
        int index;
        if(low< high){
            index = pivotplace(arr,low,high);
            performQuickSort(arr, low, index-1);
            performQuickSort(arr, index+1, high);
        }
    }

}
