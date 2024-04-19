package DSAimplementation.SortingTechniques;

public class SelectionSort {

    public static void Swap (int[] arr, int a,int b){
        int c =  arr[a];
        arr[a]= arr[b];
        arr[b]= c;
    }

    public static void selectionSortAlgo(int[] arr){  
        int n=arr.length;
        for (int i=0;i<= n-2; i++){
            int min =i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]) min=j;
            }
            Swap(arr, i, min);
        }
    }
}
