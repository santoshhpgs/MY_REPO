package com.personal.sorting;

public class InsertionSort
{
    /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n-1; i++)
        {
            int key = arr[i+1];
            int j = i;
            /* Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position */
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    // Driver method
    public static void main(String args[])
    {        
        int arr[] = {12, 11, 13, 5, 6};
        InsertionSort ob = new InsertionSort();        
        ob.sort(arr);
        printArray(arr);
    }
    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
} /* This code is contributed by Rajat Mishra. */