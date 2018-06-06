/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan Aguilera
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ARREGLO DE 5 OBJETOS DE TIPO PERSONA
        Persona apGente[]= new Persona [5];
         Persona apCopia[]= new Persona [apGente.length];//CREO LA COPIA
        apGente[0]= new Persona();
        apGente[1]= new Persona("Juan","Perez",98);
        apGente[2]= new Persona("Jesus","kakaroto",78);
        apGente[3]= new Persona("Jose","Jose",35);
        apGente[4]= new Persona("Spiry","Gonzales",25);

          for (int i = 0; i < apGente.length; i++) {
              apCopia[i]= new Persona();
            apCopia[i].setsNomb(apGente[i].getsNomb());
            apCopia[i].setsApe(apGente[i].getsApe());
            apCopia[i].setiEdad(apGente[i].getiEdad());
        }
          //IMPRIMIENDO ORIGINAL
                  System.out.println("IMPRIMIENDO Original-----------------------------------------");
        for (int i = 0; i < apGente.length; i++) {
            System.out.println("Nombre: "+ apGente[i].getsNomb());
            System.out.println("Apellido: "+ apGente[i].getsApe());
            System.out.println("Nombre Edad:  "+ apGente
                    [i].getiEdad());
        }
          //IMPRIMO LA COPIA
          System.out.println("IMPRIMIENDO COPIA----------------------------------------------------");
        for (int i = 0; i < apCopia.length; i++) {
            System.out.println("Nombre: "+ apCopia[i].getsNomb());
            System.out.println("Apellido: "+ apCopia[i].getsApe());
            System.out.println("Nombre Edad:  "+ apCopia[i].getiEdad());
        }
        apGente[2].setiEdad(2555555);
        //COMPROBACION, REIMPRIMIENDO LA COPIA
        System.out.println("COMPROBANDO LA COPIA------------------------------------------------------");
                for (int i = 0; i < apCopia.length; i++) {
            System.out.println("Nombre: "+ apCopia[i].getsNomb());
            System.out.println("Apellido: "+ apCopia[i].getsApe());
            System.out.println("Nombre Edad:  "+ apCopia[i].getiEdad());
        }
    }
    
}
 class Persona{
private String sNomb;
private String sApe;
private int iEdad;

    public void setsNomb(String sNomb) {
        this.sNomb = sNomb;
    }

    public void setsApe(String sApe) {
        this.sApe = sApe;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public String getsNomb() {
        return sNomb;
    }

    public String getsApe() {
        return sApe;
    }

    public int getiEdad() {
        return iEdad;
    }
    public Persona(String sNomb, String sApe, int iEdad) {
        this.sNomb = sNomb;
        this.sApe = sApe;
        this.iEdad = iEdad;
    }


    public Persona() {
        sNomb= "Jonathan Alejandro";
        sApe= "Aguilera Moya";
        iEdad=19;
    }



}
