import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.println(isPalindrome(n));

	}
	public  static boolean isPalindrome(int x){
	     if(x<0){
	        return false;
	    }
	    else if (rev(x)==x){
	        return true;
	    }
	   
	    
	    else{
	        return false;
	    }
	}
	public static int rev(int num){
	   
	    int rev=0;
	    while (num!=0){
	        int rem=num%10;
    	    rev=rev*10+rem;
    	    num=num/10;
	    
	        
	    }
	    return rev;
	}
}
