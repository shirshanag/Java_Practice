class Main{
    public static void main(String args[]){
        //Accessing Zeroth element of the array
        System.out.println("===Accessing Zeroth element of the array===");
        String [] arr={"Audi","Skoda","Wagonar"};
        System.out.println(arr[0]);
        //Change the Zeroth element of the array.
        System.out.println("===Change the Zeroth element of the array.===");
        arr[0]="BMW";
        for(String n:arr){
            System.out.println(n);
        }
        System.out.println("===Length of the array===");
        System.out.println(arr.length);
        System.out.println("===Creating Array with new keyword===");
        String [] car=new String[4];
        car[0]="Audi";
        car[1]="BMW";
        car[2]="Waganor";
        car[3]="Swift";
        System.out.println(car[0]);
        System.out.println("===Loop through an array===");
        for (String n : car){
            System.out.println(n);
        }
         System.out.println("===Loop through an array(Another method)===");
         for (int i=0 ; i<car.length;i++){
             System.out.println(car[i]);
         }
    
    
}
         
    }
