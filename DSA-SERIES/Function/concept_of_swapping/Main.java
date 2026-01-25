class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String naam="Kunal";
		change(naam);
		System.out.println(naam);//naam and name refers to the same object
		int [] arr={10,20,30,40};
		carr(arr);//c_arr and arr refers to same array and modify c_arr the change       is visible at arr
		System.out.println(Arrays.toString(arr));
}
	static void change(String name){
	   name="Rahul";//Creating a new object and not updating it
	}
	static void carr(int [] c_arr){
	    c_arr[0]=99;//Here we are updating the value 
	}
}
