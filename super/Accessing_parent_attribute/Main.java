class Main{
    String name="Shirsha";
}
class Name extends Main{
    String name="Nag";
    public void myName(){
        System.out.println(super.name);//Accessing parent attribute
        System.out.println(name);// Accessing the Name class attribute
    }
    
    
}
class Demo{
    public static void main(String[] args){
        Name nam=new Name();
        nam.myName();
    }
}
