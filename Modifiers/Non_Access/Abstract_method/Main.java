abstract class Main{
    public int age=24;
    public String fname="John";
    public abstract void rup();// Create abstract object of the abstract class . It has no body
    
}
class Student extends Main{
    public int graduationyear=1998;
    public void rup(){
        System.out.println("I am a passout");//Body of the abstract method in the subclass
    }

}
class Demo{
    public static void main(String [] args){
        Student obj1=new Student();
        System.out.println("Name:"+obj1.fname);
        System.out.println("Graduation year:"+obj1.graduationyear);
        System.out.println("Age:"+obj1.age);
        
        obj1.rup();
    }
}
