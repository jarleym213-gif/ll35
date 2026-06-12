/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase02;

import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author jarle
 */
public class Meses {

    String[] meses = {null,
        "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO",
        "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"}; //... COMPLETAR MESES

    public static void main(String[] args) {
        Meses m = new Meses();
        
        // int mes = 5;

        //MOSTRA VENTANA CON MENSAJE
        JOptionPane.showMessageDialog(null, m.meses, "MESES DEL AÑO",
                JOptionPane.INFORMATION_MESSAGE);

            try {
                //VENTANA PARA PREGUNTAR Y OBTENER UN VALOR
                String sMes = JOptionPane.showInputDialog(null, "CUAL ES TU MES 1-12");

//        System.out.println(Arrays.toString(m.meses));
                // MUESTRA EL MES CON JOptionPane
                String mes = m.meses[Integer.parseInt(sMes)];
                JOptionPane.showMessageDialog(null, "EL MES QUE SELECCIONASTE ES : " + mes);
                
            } catch (NumberFormatException e) {
                // 3. Manejo de error si ingresan letras
                JOptionPane.showMessageDialog(
                        null,
                        "Error: Debe ingresar únicamente números.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);

            } catch (ArrayIndexOutOfBoundsException e) {
                
                JOptionPane.showMessageDialog(
                        null,
                        "El mes debe estar entre 1 y 12", "Error", JOptionPane.ERROR_MESSAGE);
                
            }
             for (int i = 1; i < m.meses.length; i++) {
               System.out.println(m.meses[i]);
             }
        }
    }

// tarea agregar try catch 
