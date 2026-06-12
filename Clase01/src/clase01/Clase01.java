/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase01;

/**
 *
 * @author jarle
 */
public class Clase01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //sout + ctrl espacio-  atajo para System.out.println
        String nombre = "Jarley";
        int num1 = 1;
        int num2 = 4;
        double resultado;
        System.out.println("Hola, Bienvenido " + nombre);
        System.out.println("Sumo 2 numeros " + (num1 + num2));
        
        
        try {
         
           resultado = (double)(num1 + num2) / 2;
            System.out.println("Resultado " + resultado);
        } catch (java.lang.ArithmeticException e) {
             System.out.println("No  se puede dividir entre cero");
        }

    }

}
