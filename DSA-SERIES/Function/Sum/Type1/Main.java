//Taking  input from user using scanner
class Main
{
	public static void main (String[] args) 
	{
    
	    int s=sum2();
	    System.out.println("Sum of two no.:"+s);
	}
	    static int sum2(){
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter first no1:");
		int num1=in.nextInt();
		System.out.println("Enter Second no:");
		int num2=in.nextInt();
		int sum2=num1+num2;
        //Here we are returning the sum as the returnntype is int
		return (sum2);
	    }
		// your code goes here
	    static void sum(){
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter first no1:");
		int num1=in.nextInt();
		System.out.println("Enter Second no:");
		int num2=in.nextInt();
		int sum=num1+num2;
        //Here we are not returning anything cause the return type is void. We just print the value
		System.out.println("Sum:"+sum);
		/* return_type method_name(){
		    body
		    return statement;
		}*/
	    }

}
