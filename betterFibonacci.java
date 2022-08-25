import java.util.*;
import java.lang.*;
import java.io.*;

class betterFibonacci{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int number = 78;
     boolean add = true;
     String series = "78 , ";
     int variable = 78;
     for(int i = 0; i < 80; i++){
        int random = (int)(Math.random() * (7 - 1 + 1) + 1);
        println("Random: " + random);
        if(add){
            int temp = number;
            number = variable + random;
            variable = variable + temp;
            add = false;
            series = series + variable + " , ";
        }
        else{
            int temp = number;
            number = variable + random;
            variable = variable - temp;
            add = false;
            series = series + variable + " , ";
        }
     }
     println(series);
  }

  static void println(String text) {
     System.out.println(text);
   }

   static void print(String text) {
     System.out.print(text);
   }
}