package DSAimplementation.SortingTechniques;

// import java.util.Scanner;

public class SortTest{

    public static void main(String[] args) {
        int[] arr ={ 3, 4, 5, 9, 2, 1,7,6, 8};
        // int n=arr.length;
        QuickSort.QuickSortAlgo(arr);
        // MergeSort.Swap(arr, 0, 1);
        // MergeSort.MergeSortAlgo(arr,0,n-1);
        // InsertionSort.InsertionSortAlgo(arr);
        // BubbleSort.BubbleSortAlgo(arr);
        // SelectionSort.selectionSortAlgo(arr);
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " "); 
        }
    }
}



