import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        int [] arr={1,2,4,5,3,6,7};
        Search(arr);
    }
        public static void Search(int[] arr){
            int ch=7;
            int flag=0;
            for (int i=1;i<=4;i++){
                if(ch==arr[i]){
                    flag=1;
                }
                else{
                    flag=0;
                }
                
                
            }
            if(flag==1){
                System.out.println("Search Found!!");
            }
            else{
                System.out.println("Search Not found!!");
            }
        
    }
}
