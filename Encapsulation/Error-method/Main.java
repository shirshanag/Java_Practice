class Student{
    private String name;//Here name is a private variable
    public int age;
    public String getMethod(){
        return name;
    }
    public void setmethod(String myName){
        this.name=myName;
    }
    
}
class Main{
    public static void main(String[] args){
         Student obj1=new Student();
         System.out.println(obj1.name);//we cannot access private variable in another  class
    }
   
}
