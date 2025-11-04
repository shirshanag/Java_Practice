class Main{
    public void car(){
        System.out.println("Name of the car!!");
    }
    public void name(String car_name){
        System.out.println(car_name);
    }
    
}
class Second{
    public static void main(String[] args){
         Main obj1=new Main();
         obj1.car();
         obj1.name("BMW");
    }
   
    
}
