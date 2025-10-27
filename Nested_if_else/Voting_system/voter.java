class Main{
    public static void main(String args[]){
        int age=25;
        boolean isCitizen=true;
        if(age>18){
            System.out.println("Old Enough!!");
            if(isCitizen){
                System.out.println("And so you can vote!!");
            }
            else{
                System.out.println("You are not the citizen");
            }
        }
        else{
            System.out.println("You are not old enough");
        }
    }
}
