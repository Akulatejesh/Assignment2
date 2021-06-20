package CoreJava;
import java.util.*;
class Program 
 {
  public static void main(String args[]) 
  {
   //loop for rows
   for (int i = 1; i <=5; i++) 
   {
     //loop for columns
     for (int j = 1; j <=5; j++) 
     {
      if((i+j)>=6)
      System.out.print("* "); 
      else
      System.out.print("  ");//two space
     }
      System.out.println("");
   }
  }
}
