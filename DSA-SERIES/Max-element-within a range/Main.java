import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] arr={1,2,23,4,56};
        // Print the maximum element
		System.out.println("Max element:"+max(arr,1,3));
	}
	public static int max(int[] arr,int start,int end){
	    int max=arr[0];
	    for(int i=start;i<=end;i++){
	        if(arr[i]>max){ // comparing element by index
	            max=arr[i];
	        }
	    }
	   return max;
	}
}
