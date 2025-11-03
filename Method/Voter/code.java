public class Main{
    static void isVote(int age){
        if(age>=18){
            System.out.println("You can vote!!");
            
        }
        else if(age<18){
            System.out.println("You can't vote!!");
        }
        else{
            System.out.println("Verify you are not robbot!!");
        }
    }
    public static void main(String args[]){
        isVote(20);
        isVote(10);
       
    }
}
