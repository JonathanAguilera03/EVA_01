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
        int[] aiDatos = new int[5];
        aiDatos[0]=10;
        aiDatos[1]=20;
        aiDatos[2]=30;
        aiDatos[3]=40;
        aiDatos[4]=50;
       int[] aiCopia= new int [5];
       
        System.out.println("IMPIRMIENDO ORIGINAL-------------------------");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println("["+i+"]= "+aiDatos[i]);
            //DATO POR DATO, COPIAR
             aiCopia[i]=aiDatos[i];
        }
        //Se crea un arreglo mas grande
        aiDatos=new int[10];
        System.out.println("DESPUES DE DARLE TAMAÑO COPIA------------------");
        //SE COPIA LA COPIA EN EL NUEVO ARREGLO
        for (int i = 0; i < aiDatos.length; i++) {
                           aiDatos[i]=aiCopia[i];
            System.out.println("["+i+"]= "+aiDatos[i]);

        }
        
    }
    
}
