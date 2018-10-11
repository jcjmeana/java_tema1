/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_tarea3_03;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T1_Tarea3_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Pesetas que deseas convertir en euros: ");
        double pesetas = scan.nextDouble();
        if (pesetas < 0) {
            System.out.println("No puedes utilizar valores negativos.");
        } else {
            System.out.println(pesetas+" pesetas son "+(pesetas/166.6)+" euros.");
        }
    }
    
}
