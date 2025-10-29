
class Main{
    public static void main(String args[]){
        boolean isLoggedin=true;
        boolean isAdmin=false;
        int securitylevel=1;
        if(isLoggedin && (isAdmin || securitylevel<=2 )){
            System.out.println("Access Granted!!");
        }
        else{
            System.out.println("Access Denied!!");
        }
    }
}
