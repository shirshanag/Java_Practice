interface Animal{//Complete abstract class
    public void animalSound();// create method
    public void sleep();//create method
}
class Pig implements Animal{
    public void animalSound(){
        System.out.println("Wee Wee!!");
    }
    public void sleep(){
        System.out.println("zzz");
    }
    
}
class Main{
    public static void main(String[] args){
        Pig pig=new Pig();
        pig.animalSound();
        pig.sleep();
    }
}
