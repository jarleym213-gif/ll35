/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

/**
 *
 * @author jarle
 */
public class Guerrero extends Personaje {

    public Guerrero(String nombre, int vida, int fuerza, int posicion) {
        super(nombre, vida, fuerza, posicion);
    }

    public Guerrero(Personaje p) {
        super(p.getNombre(), p.getVida(), p.getFuerza(), p.getPosicion());
    }

    @Override
    public void Atacar() {
        System.out.println(getNombre() + " Atacó e hizo " + (getFuerza() / 1.25) + " de daño.");
    }

    public void Avanzar() {
        setPosicion(getPosicion() + 3);
        System.out.println("Nueva posición: " + getPosicion());
    }

    public static void main(String[] args) {
        Guerrero g = new Guerrero("Gladiador", 200, 100, 0);
        System.out.println("Posición inicial: " + g.getPosicion());
        g.Avanzar();
        g.Turno();
        
    }
///Tarea completar la clase mago
}
