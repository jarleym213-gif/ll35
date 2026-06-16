/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

/**
 *
 * @author jarle
 */
public class Carro extends Vehiculo {
    
    private static final double KILOMETRAJE_VIEJO = 10000.0;
    
    private Double kilometraje = 0.0;
    private int año;
    private int puertas;
    private String traccion;
    private int pasajeros;
    private boolean nuevo = true;
    private String[] extras;
    private String color;

    public Carro() {
        super(4);
    }

    public Carro(String marca, String modelo) {
        super(marca, modelo, 4);
    }

    public Carro(int año, String marca, String modelo) {
        super(marca, modelo, 4);
        this.año = año;
    }

    public Double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        this.kilometraje = kilometraje;        
        this.nuevo = kilometraje < KILOMETRAJE_VIEJO;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public String[] getExtras() {
        return extras;
    }

    public void setExtras(String[] extras) {
        this.extras = extras;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //método tostring para ver la informacion
    @Override
    public String toString() {
        return "Carro{" + "marca=" + super.getMarca() + ", modelo=" + super.getModelo()
                + ", a\u00f1o=" + año
                + ", kilometraje=" + kilometraje
                + ", nuevo=" + (nuevo ? "Si" : "No") + '}';
    }

    public static void main(String[] args) {
        Carro c = new Carro(2025, "Toyota", "Corolla");
        System.out.println(c);
        c.setKilometraje(10000.0);
        System.out.println(c);
    }
}
