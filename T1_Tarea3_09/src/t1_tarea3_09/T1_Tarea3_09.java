/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_tarea3_09;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T1_Tarea3_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Cálculo del volumen de un cono.\n");
        System.out.print("Introduce el radio: ");
        double radio = scan.nextInt();
        System.out.print("Introduce la altura: ");
        double altura = scan.nextInt();
        
        double volumen = ((Math.PI * (radio*radio) * altura)/3);
        System.out.println("El volumen del cono es "+volumen+" unidades cúbicas.");
    }
    
}
