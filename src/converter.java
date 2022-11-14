import java.util.Scanner;

 class converter {
     private static Scanner keyboard = new Scanner(System.in);

     public static void main(String[] args) {
         double decimal;
         System.out.println("Enter decimal");
         decimal = keyboard.nextDouble();
         Fraction fraction = new Fraction(decimal);
         fraction.multiply(3);
         System.out.println(fraction);






     }
 }





