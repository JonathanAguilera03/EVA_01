
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan Aguilera
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiEdad[];
        Scanner scCaptu= new Scanner(System.in);//Captura desde el teclado
      //  System.out.println(aiEdad[5]);error, se debe inicializar (new)
        System.out.println("Introduce la cantidad de edades a capturar: ");
        int iCant= scCaptu.nextInt();//CAPTURA DESDE EL TECLADO, AL DAR ENTER, UN 
        aiEdad= new int[iCant];
        for (int i = 0; i < aiEdad.length; i++) {
            System.out.println("Introduce la edad:");
            aiEdad[i]=scCaptu.nextInt();
            
        }
        // IMPRIMIR LA EDAD
        //FOR(VARIABLE : ARREGLO) for-each-->para cada
        for (int b: aiEdad) {
            System.out.println("Edad= " +b);
            
        }
    }
    
}
