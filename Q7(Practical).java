7. Write a program to read a file and display only those lines that have the first two characters as '//' (Use try with resources).


import java.io.*;
import java.util.Scanner;

public class Lineprint2
{

 public static void main(string args[])

   try(filereader file = new filereader("C:\Users\Himanshu\Desktop\DEKSTOP\2nd Sem\JAVA\Java programs\Example.txt");
       scanner sc = new scanner(file))
  {
           while(sc.hasNextLine())

      { 
           String str = sc.nextline();
           string check = str.substring(0,2);
           if(check.equals("//"))
           system.out.printIn(str.substring(2));
              }
    
          } 
          
    }       
 
}      


Output -
  
example.txt 

hello
//world
java
//program

world
program
