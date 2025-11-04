class Main{
    int year;
    String modelname;
  public Main(String modelname){
      this(2020,modelname);
  }  
  public Main(int year, String modelname){
      this.year=year;
      this.modelname=modelname;
}
public void display(){
    System.out.println(year + " " +modelname);
}

public static void main (String[] args){
    Main obj1=new Main("SLD500");
    Main obj2=new Main(2001,"SLD501");
    obj1.display();
    obj2.display();
}
}
