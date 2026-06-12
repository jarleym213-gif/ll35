/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

/**
 *
 * @author jarle
 */
public class Mago extends Personaje {

    private int mana;

    public Mago(String nombre, int vida, int fuerza, int posicion, int mana) {
        super(nombre, vida, fuerza, posicion);
        this.mana = mana;
    }

    public Mago(Personaje p, int mana) {
        super(p.getNombre(), p.getVida(), p.getFuerza(), p.getPosicion());
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void Atacar() {

        if (mana > 0) {

            System.out.println(getNombre() + " lanzó un hechizo e hizo " + getFuerza() * 2 + " de daño.");

            mana -= 10;

            System.out.println("Mana restante: " + mana);

        } else {
            System.out.println(getNombre() + " no tiene suficiente mana para atacar.");
        }
    }

    //Estoy sobreescribiendo Turno para que se imprim que cantidad de mana tengo
    @Override
public void Turno() {

    System.out.println("TURNO");
    System.out.println("Nombre: " + getNombre());
    System.out.println("Vida: " + getVida());
    System.out.println("Fuerza: " + getFuerza());
    System.out.println("Posición: " + getPosicion());
    System.out.println("Mana: " + getMana());

    Moverse();

    System.out.println("Nueva posición: " + getPosicion());

    Atacar();
}

    public void Avanzar() {
        //Para emezar en la posicion 10
        setPosicion(getPosicion() + 10);
        //System.out.println("Nueva posición: " + getPosicion());
    }

    public static void main(String[] args) {

        Personaje p = new Personaje("Mandrake", 100, 50, 0);

        Mago m = new Mago(p, 30);
      //  System.out.println("Posición inicial: " + m.getPosicion());
        m.Avanzar();
        m.Turno();
        m.Atacar();
        m.Atacar();
        m.Atacar();
    }
}
