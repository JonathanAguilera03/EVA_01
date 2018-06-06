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
    public static final int ARRE_TAMA=30;//FINAL SE USA PARA
    public static void main(String[] args) {

        int aiEdad[]= new int [ARRE_TAMA];//DECLARAMOS UN IDENTIFICADOR DE TIPO ARREGLO
       //EN JAVA LOS ARREGLOS SIEMPRE EMPIEZAN EN 0
       //HAY QUE MOVERNOS A UN VALOR PREVIO AL TAMAÑO DEL ARREGLO 
      // for(int i=0;i< aiEdad.length;i++) <-- Equivalente al for de abajo y es mas adecuado
        for (int i = 0; i < ARRE_TAMA; i++) {
            System.out.println("aiEdad["+ i + "]="+ aiEdad[i]);
            
            
        }
        aiEdad[0]=25;//POSICION CERO (PRIMER POSICION DEL ARREGLO) UN VALOR DE 25
      //LLENAR CON VALORES ENTRE 0 Y 36
        for (int i = 0; i <aiEdad.length ; i++) {
            aiEdad[i]=(int)(Math.random()*36);
                            //Math.random regresa valores entre 0 y 1--> 0.13546545
                            //Hay que hacer un casting de double a entero (int)
            
        }
         
      for (int i = 0; i < ARRE_TAMA; i++) { //LEEMOS NUESTRO ARREGLO
            System.out.println("aiEdad["+ i + "]="+ aiEdad[i]);
      }
    }
}
