
class Shadowing{
    static int num=90;//this will be shadowed at line 10
    public static void main(String[] args){
        System.out.println(num);//90
        int num=40;//the class variable at line 6 is shadowed by this
        System.out.println(num);//40
        fun();
    }
    static void fun(){
        System.out.println(num);
    }
}
