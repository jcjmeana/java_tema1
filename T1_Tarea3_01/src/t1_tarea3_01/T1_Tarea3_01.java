/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_tarea3_01;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T1_Tarea3_01 {

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
        System.out.println("\nLa multiplicación de "+num1+" y "+num2+" es: "+(num1*num2));
    }
    
}
