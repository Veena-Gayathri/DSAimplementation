package DSAimplementation.SortingTechniques;

public class InsertionSort extends SelectionSort{
    
    public static void Swap(int[] arr, int i, int j){
        arr[i]= arr[i]^arr[j];
        arr[j]= arr[i]^arr[j];
        arr[i]= arr[i]^arr[j];
        System.out.println("I used bit manipulation");
    }
   
    public static void InsertionSortAlgo(int[] arr){ 
        int n= arr.length;
        for(int i =0; i< n; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                Swap(arr, j, j-1);
                j--;
            }
        }
    } 
}
