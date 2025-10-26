class Main{
    public static void main(String args[]){
      //Take input as strings
        String text=" Hello World!! ";
        String text1="hello";
        String text2="hello";
        String text3="World";
        String text4="world";
      //Find length of string
        System.out.println("Length of the string:"+text.length());
      //Convert string to uppercase
        System.out.println("Capital String:"+text.toUpperCase());
      //convert string to lowercase
        System.out.println("Lowercase string:"+text.toLowerCase());
      //Find the index of character in the string
        System.out.println("Find character in a string:"+text.indexOf("World"));
      //Find the character in the string
        System.out.println("Find character of a string in specified position:"+text.charAt(4));
      //Find string is equal or not
        System.out.println("Equal or not: "+text1.equals(text2));
      
        System.out.println("Equal or not: "+text3.equals(text4));
      //Removing blank spaces from the begining and ending of the string
        System.out.println("Before: ["+text+"]");
        System.out.println("After: ["+text.trim()+"]");
        
    }
}
