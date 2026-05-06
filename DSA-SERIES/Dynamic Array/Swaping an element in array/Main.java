import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        int [] arr={1,2,3,4,5};
        System.out.println("Before Swapping:"+Arrays.toString(arr));
        swap(arr,0,3);
        System.out.println("After Swapping:"+Arrays.toString(arr));
    }
    static void swap(int [] arr,int in1,int in2){
        int temp=arr[in1];
        arr[in1]=arr[in2];
        arr[in2]=temp;
    }
}
