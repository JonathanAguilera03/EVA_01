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
        //MATRIZ-----> ARREGLO DE DOS DIMENCIONE
        int[][] aiMatriz= new int [3][3]; // ARREGLO DE 3 FILAS x 3 COLUMNAS

        aiMatriz[0][0]=10;
        aiMatriz[0][1]=20;
        aiMatriz[0][2]=30;
        aiMatriz[1][0]=40;
        aiMatriz[1][1]=50;
        aiMatriz[1][2]=60;
        aiMatriz[2][0]=70;
        aiMatriz[2][1]=80;
        aiMatriz[2][2]=90;
        System.out.println(aiMatriz[0]);
        System.out.println(aiMatriz[1]);
        System.out.println(aiMatriz[2]);
        //PARA RECORRER UN ARREGLO MULTIDIMENCIONAL, NECESITAMOS UN CICLO PARA CADA DIMENSION. 
        //LOS FOR ESTAN ANIDADOS(UNO DENTRO DE OTRO)
        for (int i = 0; i < aiMatriz.length; i++) {//PRIMER CORCHETE (FILAS)
            for (int j = 0; j < aiMatriz.length; j++) {//SEGUNDO CORCHETE (COLUMNAS)
                System.out.print(aiMatriz[i][j]);
                
            }
            System.out.println(" ");
        }
    }
    
}
