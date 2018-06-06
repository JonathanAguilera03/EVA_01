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
        int aiDatosOrigen[]= new int[5];
        aiDatosOrigen[0]=10;
        aiDatosOrigen[1]=20;
        aiDatosOrigen[2]=30;
        aiDatosOrigen[3]=40;
        aiDatosOrigen[4]=50;
        //MI "COPIA" DEL ARREGLO
        int aiCopia[]=aiDatosOrigen;
        for (int i = 0; i < aiCopia.length; i++) {
            System.out.println(aiCopia[i]);
           
        }
        //MODIFICO AIDATOORIGEN
        aiDatosOrigen[2]=200;
        System.out.println("REIMPRESION DE COPIA");
        for (int i = 0; i < aiCopia.length; i++) {
            System.out.println(aiCopia[i]);
            
        }
         System.out.println("imprimiendo el espacio que ocupa en la memoria");//en este caso es la misma
                                                                              //es el mismo arreglo no es copia
        System.out.println(aiDatosOrigen);
        System.out.println(aiCopia);
        
    }
    
}
