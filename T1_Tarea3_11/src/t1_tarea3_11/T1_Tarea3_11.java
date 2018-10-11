/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_tarea3_11;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T1_Tarea3_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Conversor de Kb a Mb: ");
        System.out.print("\nIntroduce los Kb: ");
        int Kb = scan.nextInt();
        System.out.println(Kb+" Kb son "+(Kb/1024)+" Mb");
    }
    
}
