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
        int aiDatosOrigen[]= new int[5];
        aiDatosOrigen[0]=10;
        aiDatosOrigen[1]=20;
        aiDatosOrigen[2]=30;
        aiDatosOrigen[3]=40;
        aiDatosOrigen[4]=50;
        //ESTA VEZ SI ES MI COPIA
        int aiCopia[]= new int[aiDatosOrigen.length];//Se le pone el mismo tamaño del arreglo al que le vas a haver la copia
        //NO SIRVE
        //aiCopia=aiDatosOrigen;
        for (int i = 0; i < aiDatosOrigen.length; i++) {
            aiCopia[i]=aiDatosOrigen[i];
        }
        for (int i = 0; i < aiCopia.length; i++) {
            System.out.println(aiCopia[i]);
    }
        //Modificar Origenal
        aiDatosOrigen[3]=999;
        //REIMPRIMIR LA COPIA
        System.out.println("REIMPRIMIENDO COPIA");
        for (int i = 0; i < aiDatosOrigen.length; i++) {
            System.out.println(aiCopia[i]);
        }
        //COMPROBANDO LA DIRECCION
        System.out.println("imprimiendo el espacio que ocupa en la memoria");//ocupan diferente espeacio
                                                                             //SI es una copia.
                System.out.println(aiDatosOrigen);
        System.out.println(aiCopia);
    }
    
    
}
