class Commision{
    private double sales;
    Commision(double sales){
        this.sales=sales;
    }
    double commision(){
        if (sales<5000){
            return sales*0.05;
        }
        else if(sales<10000){
            return sales*0.10;
        }
        else {
            return sales*0.15;
        }
    }
}
class Demo{
    public static void main(String[] args){
        Scanner sale=new Scanner(System.in);
        double s=sale.nextDouble();
        if(s<0){
            System.out.println("Invalid !!");
        }
        else{
            Commision sl= new Commision(s);
            System.out.println("Commision:"+sl.commision());
        }
    }
}
