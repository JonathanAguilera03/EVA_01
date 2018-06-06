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
        Principal pObj = new Principal();
        //PARA DESHACERSE DE LA MEMORIA DE UN OBJETO
        pObj=null; //LIBERAMOS LA MEMORIA CREADA PARA EL OBJETO
        /*TODO OBJETO EN MEMORIA QUE NO ES REFERENCIADO POR ALGUNA VARIABLE EN EL PROGRAMA, ES ELIMINADO
        POR EL GRABAGE COLLECTOR*/
        Principal pObj2 = new Principal();
        Principal pCopia = pObj2; //NO DUPLICAMOS EL OBJETO, DUPLICAMOS LA DIRECCION 
        //QUEREMOS ELIMINAR pObj
        pObj=null;//NO SE ELIMINA EL OBJETO, PORQUE COPIA SIGUE APUNTANDO
        pCopia=null;//AHORA SI, EL OBJETO SE ELIMINA, NO QUEDAN MAS REFERENCIAS AL OBJETO
    }
    
}
