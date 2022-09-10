// Given an integer array and another integer element. The task is to find if the given element is present in array or not.

import java.util.*;

public class test{
    static int search(int arr[], int n, int x){
        for(int i=0; i<n; i++){
            if(arr[i] == x)
                return i;
        }
        return -1;
    }


}