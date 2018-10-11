/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_tarea3_06;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T1_Tarea3_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Calcular el área de un triángulo.");
        System.out.print("Introduce la base: ");
        double base = scan.nextDouble();
        while (base < 0) {
            System.out.print("La base no puede ser negativa. Introdúcela de nuevo: ");
            base = scan.nextDouble();
        }
        System.out.print("Introduce la altura: ");
        double altura = scan.nextDouble();
        while (altura < 0) {
            System.out.print("La altura no puede ser negativa. Introdúcela de nuevo: ");
            altura = scan.nextDouble();
        }
        
        double area = (base*altura)/2;
        System.out.println("El área del triángulo es: "+area);
    }
    
}
