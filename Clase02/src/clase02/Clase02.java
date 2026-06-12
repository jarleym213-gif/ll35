/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase02;

import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author jarle
 */
public class Clase02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numeros = new int[3];
        String[] nombres = {"Esteban", "Katherine", "Luis"};
        //  1  2  3 
        // [5][1][10][]
        //  0  1   2  3

        numeros[0] = 5;
        numeros[1] = 3;
        numeros[2] = 10;

        //for con indexes
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("cuando i es " + i + " el valor del numero es " + numeros[i]);
        }

        // for con varible
        int idx = 0;

        for (String nombre : nombres) {
            System.out.println((++idx) + "." + nombre);
        }

        System.out.println("Numeros: " + Arrays.toString(numeros));
        System.out.println("nombres: " + Arrays.toString(nombres));

//        [o][][x]
//        [][o][]
//        [x][][o]
        //arreglo bidimensional
        String[][] gato = new String[3][3];

        gato[0][0] = "O";
        gato[1][1] = "O";
        gato[2][2] = "O";
        gato[0][2] = "X";

        for (int fila = 0; fila < gato.length; fila++) {
            for (int columna = 0; columna < gato[fila].length; columna++) {

                String valor;
                // expresion ternaria
                valor = gato[fila][columna] == null ? "" : gato[fila][columna];

                //expresion completa
                if (gato[fila][columna] == null) {
                    valor = "";
                }
                else{
                    valor = gato[fila][columna];
                }

                System.out.print("[" + valor + "]");
            }
            System.out.println();
        }
    }
}
 