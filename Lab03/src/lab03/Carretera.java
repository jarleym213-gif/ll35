/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jarle
 */
public class Carretera {

    private static final int ANNIO_VIEJO = 1999;
    private final String nombre;
    private final ArrayList<Carro> carros;

    public Carretera(String nombre) {
        this.nombre = nombre;
        this.carros = new ArrayList<>();
    }

    public void agregarCarro(Carro carro) {
        this.carros.add(carro);
        verificarEstado();
    }

    public void agregarCarros(ArrayList<Carro> carros) {
        Iterator<Carro> iterador = carros.iterator();
        while (iterador.hasNext()) {
            agregarCarro(iterador.next());
        }
        verificarEstado();
    }

    public void listarCarros() {
        System.out.println("Carretera: " + this.nombre);

        Iterator<Carro> ite = carros.iterator();

        while (ite.hasNext()) {
            Carro next = ite.next();
            System.out.println(next);
        }
    }

    public String obtenerEstadoTrafico(int cantidad) {
        if (cantidad <= 3) {
            return "tiene un flujo ligero";
        }
        if (cantidad <= 5) {
            return "tiene un flujo moderado";
        }
        if (cantidad <= 8) {
            return "está comenzando a congestionarse";
        }
        if (cantidad <= 11) {
            return "se está generando un embotellamiento en la carretera.";
        }
        return "La carretera está colapsada, hay mucho embotellamiento";
    }

    public void verificarEstado() {
        int cantidad = cantidadCarros();
        String estado = obtenerEstadoTrafico(cantidad);
        System.out.printf("La carretera %s %s%n", nombre, estado);
    }

    public static void main(String[] args) {
        Carretera carretera = new Carretera("General Cañas");
        Carro c1 = new Carro(1999, "Toyota", "Corolla");
        c1.setKilometraje(150000.0);
        Carro c2 = new Carro(2003, "Hyundai", "Accent");
        c2.setKilometraje(12000.0);
        Carro c3 = new Carro(2025, "Kia", "Rio");
        c3.setKilometraje(500.0);
        Carro c4 = new Carro(2022, "Honda", "Civic");
        c4.setKilometraje(8000.0);

        carretera.agregarCarros(new ArrayList<>(List.of(c1, c2, c3, c4)));

        carretera.listarCarros();
        carretera.removerCarrosAntiguos();

    }

    //Realizar metodo
    private void removerCarrosAntiguos() {
        //Iterar recorrer toda la carretera
        Iterator<Carro> iterador = carros.iterator();

        while (iterador.hasNext()) {
            Carro carro = iterador.next();

            if (2026 - carro.getAño() > 20) {
                System.out.println("Se eliminó el " + carro + "Por ser antiguo.");
                iterador.remove();
            }
        }
    }

    //Realizar metodo
    private int cantidadCarros() {
        return carros.size();
    }

}
