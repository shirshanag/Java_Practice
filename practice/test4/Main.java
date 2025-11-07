class Circle{
    private double radius;
    private String color;
    Circle(){
        radius=1.0;
        color="Red";
    }
    Circle(double r){
        radius=r;
        color="Red";
    }
    double getRadius(){
        return radius;
    }
    double getArea(){
        return Math.PI*radius*radius;
    }
    public static void main (String[] args){
        Circle c= new Circle();
        Circle c1=new Circle(5.0);
        
        System.out.println(c.getRadius()+ " "+c.getArea());
        System.out.println(c1.getRadius()+ " "+c1.getArea());
    }
}
