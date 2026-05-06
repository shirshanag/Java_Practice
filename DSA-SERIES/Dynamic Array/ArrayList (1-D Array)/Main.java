class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>(10);
		list.add(23);
		list.add(78);
		list.add(30);
		list.add(30);
		list.add(31);
		list.add(32);
		list.add(33);
		list.add(34);
		list.add(35);
		list.add(36);
		list.add(37);
		// Dynamic array created
		System.out.println("Before updating:"+list);
		list.set(0,20);
		// After updating the element
		System.out.println("After updating:"+list);
		list.remove(3);
		// After removing a element from index 3
		System.out.println("After removing element at index 3:"+list);
		// Accessing the array using for loop
		ArrayList<Integer> l=new ArrayList<>(10);
		for(int i=0; i<3;i++){
		    l.add(in.nextInt());
		}
		for(int i=0; i<3;i++){
		    System.out.println(l.get(i));
		}

	}
}
