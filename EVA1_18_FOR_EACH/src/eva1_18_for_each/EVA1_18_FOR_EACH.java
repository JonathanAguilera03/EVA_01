/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_for_each;

/**
 *
 * @author Jonathan Aguilera
 */
public class EVA1_18_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Arreglo con 10 elementos. llenarlo con valores
       int aiDatos[]= {1,2,3,4,5,6,7,8,9,10};
        for (int iVal : aiDatos) {
            System.out.println("Valor= del arreglo de 1 dimension "+ iVal);
        }
        String asCadenas[]= {"Jonathan","Alejandro","Aguilera", "Moya", "!!!"};
        for (String asCadena : asCadenas) {
            System.out.println("Cadena= "+asCadena);
        }
        int aiMatriz[][]=new int [3][3];
        aiMatriz [0][0]=10;
        aiMatriz [0][1]=20;
        aiMatriz [0][2]=30;
        aiMatriz [1][0]=40;
        aiMatriz [1][1]=50;
        aiMatriz [1][2]=60;
        aiMatriz [2][0]=70;
        aiMatriz [2][1]=80;
        aiMatriz [2][2]=90;
        for (int[] is : aiMatriz) { //es un for para recorrer el arreglo, la desventaja es que no te da las pocisiones, en caso de quererlas ---
            for (int i : is) { //Hay que hacer un contadoe
                System.out.println("Valor del arreglo de 2 dimenciones = "+i);
            }
        }
        int aiMatriz3D[][][]=new int [2][2][2];
        aiMatriz3D [0][0][0]=10;
        aiMatriz3D [0][0][1]=20;
        aiMatriz3D [0][1][0]=30;
        aiMatriz3D [0][1][1]=40;
        aiMatriz3D [1][0][0]=50;
        aiMatriz3D [1][0][1]=60;
        aiMatriz3D [1][1][0]=70;
        aiMatriz3D [1][1][1]=80;
        for (int[][] ises : aiMatriz3D) { //funciona igual el numero de dimenciones, es el numero de for que vas a usar para recorrer el arreglo.
            for (int[] e : ises) {
                for (int i : e) {
                    System.out.println("Valor del arreglo de 3 dimensiones= "+ i);
                }
            }
        }
      
    }
}
