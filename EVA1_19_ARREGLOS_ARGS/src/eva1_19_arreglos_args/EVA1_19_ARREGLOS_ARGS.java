/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_arreglos_args;

/**
 *
 * @author Jonathan Aguilera
 */
public class EVA1_19_ARREGLOS_ARGS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] aiDatos={0,1,2,3,4,5,6,7,8,9};
        imprimeArreglo(aiDatos); //Se usa una funcion en vez de poner varios fore cada vez que quiera imprimir.
        
        aiDatos=new int [10];
        aiDatos[0]=10;
        aiDatos[1]=15;
        aiDatos[2]=20;
        aiDatos[3]=30;
        aiDatos[4]=40;
        aiDatos[5]=50;
        aiDatos[6]=70;
        aiDatos[7]=80;
        aiDatos[8]=90;
        aiDatos[9]=100;
        imprimeArreglo(aiDatos);
    }
    public static void imprimeArreglo(int[] aiArre){  //La funcion
        for (int i : aiArre) {
            System.out.println("Valor = "+i);
        }
    
    }
    
}
