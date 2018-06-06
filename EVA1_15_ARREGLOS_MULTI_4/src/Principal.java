
import java.util.Scanner;

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
        int[][] aiEdades; 
        int iNoGrp, iNoAlu;//Cantidad de grupos, cantidad de alumnos,
        Scanner scCaptu= new Scanner(System.in);
        
        System.out.println("Introduce el numero de grupos: ");
        iNoGrp= scCaptu.nextInt();//el # de grupos son las filas del arreglo
        
        aiEdades= new int [iNoGrp][];
        //FOR PARA PREGUNTAR PARA CADA GRUPO LA CANTIDAD DE ALUMNOS
       // for (int i = 0; i < aiEdades.iNoGrp; i++) //Ambos son validos
        for (int i = 0; i < aiEdades.length; i++) {
            System.out.println("Cuantos alumnos tiene el grupo "+(i+1)+":");
            iNoAlu=scCaptu.nextInt();
            aiEdades[i]= new int [iNoAlu];// Para cada fila, determinen el # de columnas
        }
        // Capturar las edades: recorrer el arreglo
        for (int i = 0; i < aiEdades.length; i++) {//Filas(Grupos)
            for (int j = 0; j < aiEdades[i].length; j++) {//Alumnos para el grupo actual
                System.out.println("Cual es la edad de Gpo "+i+"- Alumno "+j+"?");
                aiEdades[i][j]= scCaptu.nextInt();//Capturamos la edad
            }
            
        }
        //Imprimir las edades calculadas
        for (int i = 0; i < aiEdades.length; i++) {//Filas(Grupos)
            for (int j = 0; j < aiEdades[i].length; j++) {//Alumnos para el grupo actual
                System.out.println("La edad de grupo "+i+"- Alumno "+j+" es "+aiEdades[i][j]);
            }
            
        }        
        //Calcular el promedio de edades
        int iAcum, iAcumTodos=0, iAcumNoAlu=0;
        for (int i = 0; i < aiEdades.length; i++) {//Filas(Grupos)
            iAcum=0;
            iAcumNoAlu=iAcumNoAlu+ aiEdades.length;// cuantos alumnos
            for (int j = 0; j < aiEdades[i].length; j++) {//Alumnos para el grupo actual
                iAcum= iAcum +aiEdades[i][j];
                iAcumTodos= iAcumTodos+aiEdades[i][j];
                
            }
        System.out.println("El promedio del grupo "+i+"= "+iAcum/aiEdades[i].length);    
        }  
        System.out.println("El promedio de todos los grupos es "+ (iAcumTodos / iAcumNoAlu));
    }
    
}
