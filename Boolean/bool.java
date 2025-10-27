class Main{
    public static void main(String args[]){
        int my_age=24;
        int voting_age=18;
      //Checking condition by printing boolean value
        System.out.println("True or false:"+(my_age==voting_age));
        System.out.println("True or false:"+(10==10));
        System.out.println("True or false:"+(10>16));
        System.out.println("True or false:"+(10<16));
      //Check wether the person is eligible to vote or not
        if(my_age>=voting_age){
            System.out.println(my_age+" year Older enough to give vote");
            }
        else{
            System.out.println("Can't caste vote");
        }
    }
}
