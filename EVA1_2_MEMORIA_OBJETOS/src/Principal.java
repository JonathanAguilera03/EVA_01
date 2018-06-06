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
        int iOtroVal=10;
        double dSalario=500.50;
        Prueba pObj= new Prueba();
        System.out.println("iOtroVal= "+iOtroVal);
        System.out.println("dSalario= "+dSalario);
        System.out.println("pObg= "+pObj);// ESTOY IMPRIMIENDO LA REFERENCIA (DIRECCION)
        System.out.println("iVal= "+ pObj.iVal);
    }
    
}
class Prueba{//LAS CLASES SIEMPRE VAN AFUERA.
int iVal=5;
}