import java.util.*;

class alphabet{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     println("Enter the string: ");
     String line = sc.next();
     line = line.toUpperCase();
     char[] chars = line.toCharArray();
     int total = 0;
     for (int i = 0; i < chars.length; i++) {
        total = total + ((int)chars[i] - 64);
     }
     println("Addition: " + total);
     String bin = Integer.toBinaryString(total);
     println("Binary: " + bin);
  }

  public static void println(String text) {
     System.out.println(text);
   }

   public static void print(String text) {
     System.out.print(text);
   }
}