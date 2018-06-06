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
        int[][] aiMatriz= new int [3][];
        aiMatriz[0]=new int [2];
        System.out.println(aiMatriz[0]);
        System.out.println(aiMatriz[0][0]);
        aiMatriz[1]=new int [5];
        System.out.println(aiMatriz[1]);
        System.out.println(aiMatriz[1][4]);
        aiMatriz[2]=new int [10];
        System.out.println(aiMatriz[2]);
        System.out.println(aiMatriz[2][9]);
        for (int i = 0; i < aiMatriz.length; i++) {//Es el limite de la primera dimension 
            for (int j = 0; j < aiMatriz[i].length; j++) {//EL PRIMER FOR CONTROLA LAS FILAS Y ESTE LAS COLUMNAS
                System.out.println(aiMatriz[i][j]);
            }
            
        }
    }
    
}
