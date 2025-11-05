class Vehicle{
    protected String brand="BMW";
    public void honk(){
        System.out.println("Tuut Tuut!!");
    }
    
}
class Car extends Vehicle{
    private String model="M5";
    public static void main(String[] args){
        Car obj1=new Car();
        obj1.honk();
        System.out.println(obj1.brand+ " "+obj1.model);
    }
}
