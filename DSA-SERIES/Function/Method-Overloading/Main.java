class Overload{
    public static void main(String[] args){
        fun(67);//points to the function having int argument
        fun("Rahul");//points to the function having String argument
        fun(20,30,"Rahul","Manoj");//points to function having two int and as many no of string 
    }
    static void fun(int a,int b, String...c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(c));
    }
    static void fun(int num){
        System.out.println(num);
    }
    static void fun(String num){
        System.out.println(num);
    }
    
}
