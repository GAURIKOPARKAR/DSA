package Sorting_Programs;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[]= {8,9,7,6,5,4};
        int swap;

        for(int i = 1; i<arr.length-1;i++)
        {
            int temp = arr[i];
            for( int j = i-1 ; j>=0 ; j--){
                if(arr[j]>temp){
                    swap=temp;
                    temp=arr[j];
                    arr[j]=swap;

                }
            }
        }
       
    }
    
}
