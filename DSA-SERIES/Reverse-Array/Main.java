import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        int[] arr={1,2,7,5,3};
        reverse(arr);
        System.out.println("Array reverse:"+Arrays.toString(arr));
    }
     public static void swap(int [] arr,int in1,int in2){
        int temp=arr[in1];
        arr[in1]=arr[in2];
        arr[in2]=temp;
    }

    public static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
    }
}
}
