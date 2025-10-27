class Main{
    public static void main(String args[]){
        int weather=2;
        String res=(weather==1)?"Nice Weather"
                    :(weather==2)?"Rainy weather"
                    :"Bad weather";
        System.out.println("Weather is:"+res);
    }
}
