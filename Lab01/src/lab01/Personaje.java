/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

/**
 *
 * @author jarle
 */
public class Personaje {

    private String nombre;
    private int vida;
    private int fuerza;
    private int posicion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Personaje(String nombre, int vida, int fuerza, int posicion) {
        this.nombre = nombre;
        this.vida = vida;
        this.fuerza = fuerza;
        this.posicion = posicion;
    }

    public Personaje() {
    }

    public void Atacar() {
        System.out.println(nombre + " Atacó e hizo " + (fuerza / 2) + " daño.");
    }

    public void Moverse() {
        Moverse(1);
    }

    public void Moverse(int numPasos) {
        this.posicion = this.posicion + numPasos;
    }

    public void Turno() {
        System.out.println("TURNO");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Vida: " + getVida());
        System.out.println("Fuerza: " + getFuerza());
        System.out.println("Posición: " + getPosicion());

        Moverse();
        System.out.println("Nueva posición: " + getPosicion());
        Atacar();
    }

    public static void main(String[] args) {
        Personaje p = new Personaje("TurboMan", 200, 100, 0);
        System.out.println(p.posicion);
        p.Moverse();
        p.Moverse(10);
        p.Moverse(4);
        System.out.println(p.posicion);
        p.Atacar();
    }
}
