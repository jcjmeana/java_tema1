/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_tarea3_10;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class T1_Tarea3_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Conversor de Mb a Kb: ");
        System.out.print("\nIntroduce los Mb: ");
        int Mb = scan.nextInt();
        System.out.println(Mb+" Mb son "+(Mb*1024)+" Kb");
    }
    
}
