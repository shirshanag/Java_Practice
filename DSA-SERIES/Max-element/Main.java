class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] arr={1,2,23,4,56};
        // Print the maximum element
		System.out.println("Max element:"+max(arr));
	}
	public static int max(int[] arr){
	    int max=arr[0];
	    for(int i=1;i<arr.length;i++){
	        if(arr[i]>max){ // comparing element by index
	            max=arr[i];
	        }
	    }
	   return max;
	}
}
