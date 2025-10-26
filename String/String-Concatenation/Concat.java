class Main{
    public static void main(String args[]){
      //Take string and int inputs
        String firstname="Shirsha";
        String secondname="Nag";
        String name="john";
        String title="Doe";
        String gender="Boy";
        int age=23;
      //concat first name and second name
        System.out.println(firstname+ " " +secondname);
      //concat name and age
        System.out.println("My name is " +name+ " and I am " +age+ " years old");
      //concat name and title
        System.out.println(name.concat(" ").concat(title));
      //concat name , title and gender
        System.out.println(name.concat(" ").concat(title).concat(" ").concat(gender));
    }
}
