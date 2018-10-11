/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_relacion1;

/**
 *
 * @author acer
 */
public class T1_Relacion1 {
    public static void main(String [] args){
        // Ejercicio 09
        char primeraVariable = 'a';
        char segundaVariable = 'b';
        char variableAuxiliar;
        System.out.println("Primera Variable: " +primeraVariable);
        System.out.println("Segunda Variable: "+segundaVariable);
        System.out.println("Hacemos el intercambio...\n");
        variableAuxiliar = primeraVariable;
        primeraVariable = segundaVariable;
        segundaVariable = variableAuxiliar;
        System.out.println("Primera Variable: " +primeraVariable);
        System.out.println("Segunda Variable: "+segundaVariable);
        
        // Ejercicio 10
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'
        , 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int primerNumero = (int) (Math.random() * 9);
        int segundoNumero = (int) (Math.random() * 9);
        while (primerNumero+segundoNumero > 26) {
            primerNumero = (int) (Math.random() * 9);
            segundoNumero = (int) (Math.random() * 9);
        }
        char letraDefinitiva = letras[primerNumero+segundoNumero];
        switch (letraDefinitiva) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("La letra "+letraDefinitiva+" es una vocal.");
            break;
            default:
                System.out.println("La letra "+letraDefinitiva+" es una consonante.");
            break;
        }
    }
}
