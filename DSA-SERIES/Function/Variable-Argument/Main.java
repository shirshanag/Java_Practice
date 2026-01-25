
class VarArgs{
    public static void main(String[] args){
        fun(10,20,30,40,50);//returns an array of integer
        fun();//returns an empty array
    }
    static void fun(int...n){//When we are not sure with the no. of values we want                       to pass in the method
        System.out.println(Arrays.toString(n));
    }
}
