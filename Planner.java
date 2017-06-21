import java.io.File;                   // importing file class from io package
import java.util.Scanner;              // importing scanner class to create scanner object
import java.io.FileNotFoundException;  // importing to handle fileexception error
import java.io.PrintWriter;            // importing to write the data

// creating Planner class
public class Planner
{
   // main class
   public static void main(String[] args) throws FileNotFoundException
   {
      // initializing variables
      int choose;
      String location;
      String event;
      String date;
      String time;
      
      // creating scanner object choice
      Scanner choice = new Scanner (System.in);
      
      
      // printing user's desired layout
      System.out.print("Personal Planner");
      System.out.print("\n================");
      
      System.out.print("\n\nOptions:");
      System.out.print("\n========\n");
      System.out.print("1. Add Event");   
      System.out.print("\n2. Display Events"); 
      System.out.print("\n3. Quit\n\n");
      
      // allowing user to choose the options
      System.out.print("Enter Options (1,2, or 3): ");
      choose = choice.nextInt();
      
      // printing a line        
      System.out.println("");
            
            
         
      // this code executes when the user presses other than 1 and 2  
      while (choose != 3)
      { 
      
      
         // file object is created which denotes plan.txt
         File infile = new File("plan.txt");
         
         // PrintWriter object is created to allow user to write the data
         PrintWriter outFile = new PrintWriter("plan.txt");
         
         
            
         if (choose == 1)           // if user enters 1 then the following code is excuted
         {
            File in = new File("planner.txt");   // in object that belongs to planner.txt
            
            
            
            if (in.exists())     // checks if planner.txt exists or not
            {
               Scanner record = new Scanner (in);    // scanner object that reads planner.txt
               // scanner object that reads plan.txt
               Scanner temporaryRecord = new Scanner (infile);
               Scanner enter = new Scanner (System.in);  // allowing user to write the data
               
               
               // checks if the user entered anything other than string
               while (record.hasNextLine())
               {
                  outFile.println(record.nextLine());
               }
            
            
               // allwoing user to enter date, time, location and event
               System.out.print("Enter date (MM/DD/YY): ");         
               date = enter.nextLine();
               
               System.out.print("Enter time (HH:MM): ");       
               time = enter.nextLine();
               
               System.out.print("Enter location: ");
               location = enter.nextLine();
               
               System.out.print("Enter event: ");
               event = enter.nextLine();
            
            
               // printing the relevant information
               outFile.println(date);
               outFile.println(time);
               outFile.println(location);           
               outFile.println(event);
               outFile.println("");
               System.out.println("");
            
               // closing the files
               outFile.close();
               record.close();
            
            
               PrintWriter outfile = new PrintWriter("planner.txt");
               
               
               // checks to see if the user has input anything other than string
               while (temporaryRecord.hasNextLine())
               {               
                  // writing the data to planner.txt
                  outfile.println(temporaryRecord.nextLine());
               }
            
               // closing the files
               temporaryRecord.close();
               outfile.close();  
            }
            
            
            else
            {  
               // planner.txt should exist otherwise filenotexception error occurs
               PrintWriter outfile = new PrintWriter("planner.txt");
            
               // initializing the variable of a scope
               Scanner record = new Scanner (in);
               Scanner temporaryRecord = new Scanner (infile);
               Scanner enter = new Scanner (System.in);
            
            
               // data of planner.txt is read into plan.txt
               while (record.hasNextLine())
               {
                  outFile.println(record.nextLine()); 
               }
            
               // allwoing user to enter date, time, location and event
               System.out.print("Enter date (MM/DD/YY): ");
               date = enter.nextLine();
               
               System.out.print("Enter time (HH:MM): ");
               time = enter.nextLine();
               
               System.out.print("Enter location: ");     
               location = enter.nextLine();
               
               System.out.print("Enter event: ");
               event = enter.nextLine();
            
               // printing relevant information
               outFile.println(date);
               outFile.println(time);
               outFile.println(location);
               outFile.println(event);
               outFile.println("");
               System.out.println("");
            
            
               // closing the files
               outFile.close();
               record.close();
               
            
               // checks if user entered anything other than string
               while (temporaryRecord.hasNextLine())
               {
                  // writing data to planner.txt
                  outfile.println(temporaryRecord.nextLine());               
               }
            
               // closing files
               temporaryRecord.close();                        
               outfile.close();
            }
         }
         
         
                  
         // if user enter 2 then the following code is processed
         else if (choose == 2)
         {
            
            File in = new File("planner.txt");  
            
            // checks to see if planner.txt exists or not
            if (in.exists())
            {
               
               // scanner object to read from file
               Scanner read = new Scanner (in);
              
              
               // if there is no data written then the following message is printed
               if (!read.hasNextLine()) 
               {
                  // printing user's desired output
                  System.out.println("No events added!\n");
               }
               
               // printing data
               while (read.hasNextLine())
               {
                  System.out.println(read.nextLine());
               }
               read.close();
            }
            
            
            else
            {
               // creating planner.txt
               PrintWriter outfile = new PrintWriter("planner.txt");
               
               // reading data from planner.txt
               Scanner read = new Scanner (in);    
               
               // printing user's desired output
               if (!read.hasNextLine())
               {
                  System.out.println("No events added!\n");               
               
               // printing data from planner.txt
               while (read.hasNextLine())
               {
                  System.out.println(read.nextLine());
               }
               read.close();
            }
         
         }}    
         
         // printing user's layout
         System.out.print("Options:");
         System.out.print("\n========\n");
         
         System.out.print("1. Add Event");   
         System.out.print("\n2. Display Events"); 
         System.out.print("\n3. Quit\n\n");
         
         System.out.print("Enter Options (1,2, or 3): ");
         choose = choice.nextInt();
         System.out.println("");
      
      }  
   }
}
