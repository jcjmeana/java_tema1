/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_tarea3_07;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T1_Tarea3_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce una base imponible de una factura: ");
        int base = scan.nextInt();
        double iva = 1.21;
        System.out.println("La BASE IMPONIBLE de "+base+" euros + IVA del 21% es "+(base*iva)+" euros.");
    }
    
}
