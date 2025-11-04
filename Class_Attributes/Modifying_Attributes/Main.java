
public class Main{
    int x=10;
    public static void main(String[] args){
        Main obj1=new Main();
        System.out.println("Before Modifying: "+obj1.x);
        obj1.x=20;
        System.out.println("After Modifying: "+obj1.x);
    }
}
