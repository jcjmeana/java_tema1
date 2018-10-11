/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_tarea1_05;

/**
 *
 * @author acer
 */
public class T1_Tarea1_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(TURQUESA+"\tLUNES\tMARTES\tMIÉRCO.\tJUEVES\tVIERNES");
        System.out.println(AMARILLO+"16:10"+RESETEAR+"\tBADAT\tFOL\t\t\t");
        System.out.println(AMARILLO+"17:10"+RESETEAR+"\tBADAT\tPROG\t\t\t");
        System.out.println(AMARILLO+"18:10"+RESETEAR+"\tEIE\tBADAT\t\tPROG\tENDES");
        System.out.println(AMARILLO+"19:30"+RESETEAR+"\tEIE\tBADAT\t\tPROG\tENDES");
        System.out.println(AMARILLO+"20:30"+RESETEAR+"\tFOL\t\tPROG\tBADAT\tENDES");
        System.out.println(AMARILLO+"21:30"+RESETEAR+"\tFOL\t\tPROG\tBADAT\t");
    }
    public static final String AMARILLO = "\u001B[43m";
    public static final String RESETEAR = "\u001B[0m";
    public static final String TURQUESA = "\u001B[46m";
}
