package DSAimplementation.SortingTechniques;

public class BubbleSort extends SelectionSort{

    public static void BubbleSortAlgo(int[] arr){
        int n= arr.length;
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]) Swap(arr, j, j+1);
            }
        }
    }
}
