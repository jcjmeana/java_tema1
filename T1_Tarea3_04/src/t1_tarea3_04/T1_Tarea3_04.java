/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_tarea3_04;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T1_Tarea3_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = scan.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scan.nextInt();
        while (num2 == 0) {
            System.out.print("Error, no se puede completar la división con el divisor en 0.\n"
                    + "Introdúcelo de nuevo: ");
            num2 = scan.nextInt();
        }
        int suma = num1+num2;
        int resta = num1-num2;
        int multi = num1*num2;
        int division = num1/num2;
        
        System.out.println("\nNúmeros: "+num1+" y "+num2+".");
        System.out.println("---------------------");
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicación: "+multi);
        System.out.println("División: "+division);
    }
    
}
