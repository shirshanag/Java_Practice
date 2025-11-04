public class Main{
    public void fullThrotle(){
        System.out.println("The car is at a maximum speed!!");
    }
    public void speed(int maxspeed){
        System.out.println("Maxspeed:"+maxspeed);
    }
    public static void main(String [] args){
        Main obj1=new Main();
        obj1.fullThrotle();
        obj1.speed(200);
    }
}
