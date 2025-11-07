class Vehicle{
    protected int  speed;
    protected String color, ownerName,regNumber;
    void showData(){
        System.out.println("This is a vehicle class!!");
    }
}
class Bus extends Vehicle{
    private String routeNumber;
    Bus(int s, String c,String owner,String regno, String r){
        speed=s;
        color=c;
        ownerName=owner;
        regNumber=regno;
        routeNumber=r;
    }
    void showData(){
        super.showData();
        System.out.println("Speed of car: "+speed + " color: "+color + " Owner Name: "+ownerName +" regnumber: "+regNumber +" Route No.: "+routeNumber);
    }
    
}
class Car extends Vehicle{
    private String manuname;
    Car(int s, String c, String owner,String regno,String manu){
        speed=s;
        color=c;
        ownerName=owner;
        regNumber=regno;
        manuname=manu;
    }
    void showData(){
        super.showData();
          System.out.println("Speed of car: "+speed + " color: "+color + " Owner Name: "+ownerName +" regnumber: "+regNumber +" Manufacture Name: "+manuname);
        
}
public static void main(String[] args){
    Bus b= new Bus(6000,"Blue","Raju","SLD20","A50");
    Car c= new Car(8000,"Red","Majnu","M005","BMW");
    b.showData();
    c.showData();
}
}
