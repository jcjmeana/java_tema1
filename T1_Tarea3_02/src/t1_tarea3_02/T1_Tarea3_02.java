/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_tarea3_02;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T1_Tarea3_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Euros que deseas convertir en pesetas: ");
        double euros = scan.nextDouble();
        if (euros < 0) {
            System.out.println("No puedes utilizar valores negativos.");
        } else {
            System.out.println(euros+" euros son "+(euros*166.6)+" pesetas.");
        }
    }
    
}
