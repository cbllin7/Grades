/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package grades;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author King of Austell
 */


public class Grades {


    
        // TODO code application logic here
      
      public static void main(String[] args){
          try{
          
                  Scanner fileIn = new Scanner(System.in );
         PrintWriter fileout = new PrintWriter (new FileWriter( "grades.txt", true ));
          
          do{
          double Exam1=0, Exam2=0, Exam3=0;
         
      
      String data = " ";
          
    
         /* Scanner fileIn = new Scanner(System.in );
         PrintWriter fileout = new PrintWriter (new FileWriter( "grades.docx", true ));*/
          
          System.out.print("First Name: ");
          String firstName = fileIn.nextLine();          
          System.out.print("Last Name: ");
          String lastName = fileIn.nextLine();
          System.out.print("Exam 1: ");
          Exam1 = fileIn.nextDouble();
          System.out.print("Exam 2: ");
          Exam2 = fileIn.nextDouble();    
          System.out.print("Exam 3: ");
          Exam3 = fileIn.nextDouble();
          //System.out.print(lastName + ", " + firstName + ": " + Exam1 + " " + Exam2 + " " + Exam3 + " ");
            double average = (Exam1*.25) + (Exam2*.3) + (Exam3*.45);
            char letter = ' ';
if(average >= 90)
       letter= 'A';
   else if (average <90 && average >=80)
     letter = 'B';
   else if (average <80 && average >=70)
 letter = 'C';
   else if (average <70 && average >=60)
 letter = 'D';
   else if (average <60 && average>=0)
 letter = 'F';
   else
       System.out.println("invaild entry"); 

         
         /* if(average >= 90)
        return (char) 'A';
   else if (average <90 && average >=80)
       System.out.println("B");
   else if (average <80 && average >=70)
      System.out.println("C");
   else if (average <70 && average >=60)
     System.out.println("D");
   else if (average <60 && average>=0)
       System.out.println("F");
   else
       System.out.println("invaild entry"); */
         
           data = (lastName + ", " + firstName+ ": " + Exam1 + " " + Exam2 + " " + Exam3 + " " + letter);
   fileout.print(data);
  
          System.out.println();
           //fileout.close();
      
      
      }
         
          while(true) ;
         /* fileIn.close();
          fileout.close();*/
      } catch(IOException e){
          System.out.println("error");
      }
    
       
}
}


          
      
      