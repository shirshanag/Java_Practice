public class Main{
    int x=25;
    public static void main(String [] args){
        Main obj1=new Main();
        Main obj2=new Main();
        obj2.x=30;
        System.out.println("Accessing attribute using object1: "+obj1.x);
        System.out.println("Accessing attribute using object2: "+obj2.x);
    }
}
