class Main{
    public Main(){
        System.out.println("Class Cinstructor is created!!");
    }
}
class Name extends Main{
    public Name(){
        super();//call parent constructor
        System.out.println("Subclass Constructor is created!!");
    }
}
class Demo{
public static void main(String[] args){
    Name name=new Name();
}
}
