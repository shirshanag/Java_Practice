import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        int arr[]={3,4,6,0,522,72};
        System.out.println("Minimum value in aray:"+min(arr));
    }
        
        public static int min(int[] arr){
              int min=arr[0];
             for(int i=0;i<6;i++){
           
             if(arr[i]<min){
                 min=arr[i];
             }
        }
        return min;
        
        
       
    }
}
