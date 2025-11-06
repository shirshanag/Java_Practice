abstract class MotorVehicle{
    String modelName;
    int modelNumber;
    double modelPrice;
    MotorVehicle(String name,int num,double price){
        modelName=name;
        modelNumber=num;
        modelPrice=price;
    }
    void display(){
        System.out.println("Model Name: "+modelName + " Number: " + modelNumber + " Price: "+modelPrice);
    }
}
class Car extends MotorVehicle{
    double discount_rate;
    Car(String name,int num,double price,double dr){
    super(name,num,price);
    discount_rate=dr;
    }
    void display(){
        super.display();
         System.out.println("Discount_rate"+discount_rate);
    }
    void discount() {
        double discount = modelPrice * (discount_rate / 100);
        System.out.println("Discount Amount: " + discount);
    }
    public static void main(String[] args){
        Car car=new Car("BMW",100,771000,10);
        car.display();
        car.discount();
    }
}
