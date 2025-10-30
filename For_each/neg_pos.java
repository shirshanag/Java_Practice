class Main{
    public static void main(String args[]){
        int [] arr={-10,-20,0,30};
        for (int n:arr){
            if(n<0){
                continue;
            }
            if(n==0){
                break;
            }
            System.out.println(n);
        }
    }
}
