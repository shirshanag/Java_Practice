class Person{
    public String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Main{
    public static void main(String[] args){
        Person obj1=new Person("John",21);
        System.out.println(obj1.name);
        System.out.println(obj1.age);
    }
}
