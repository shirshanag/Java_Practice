import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args){
        String word="Hello";
        char target='o';
        System.out.print(Check_string(word,target));
    }
        public static boolean Check_string(String str,char target){
              for(int i=0;i<str.length();i++){
                 if(target==str.charAt(i)){
                    return true; 
            }
              }
              return false;
      
        }
       
    
}
