/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

/**
 *
 * @author jarle
 */
public class Garaje {

    private int espacios;
    private Carro[] carros;
    private int contador = 0;

    public Garaje(int espacios) {
        this.espacios = espacios;
        this.carros = new Carro[espacios];
    }

    public void aparcarCarro(Carro carro) {
        if (contador < espacios) {
            this.carros[contador++] = carro;

        } else {
            System.err.println("Garaje Lleno");
        }
    }

    public void listarCarros() {
        for (int i = 0; i < contador; i++) {
            System.out.println(i + "." + carros[i]);
        }
    }

    public static void main(String[] args) {
        Carro c1 = new Carro(2001, "Toyota", "Corolla");
        Carro c2 = new Carro(2003, "Hyundai", "Accent");
        Carro c3 = new Carro(2025, "Kia", "Rio");
        Carro c4 = new Carro(2022, "Honda", "Civic");

        Garaje g = new Garaje(3);
        g.aparcarCarro(c1);
        g.aparcarCarro(c2);
        g.aparcarCarro(c3);
        g.aparcarCarro(c4);
        
        System.out.println(g);

        g.listarCarros();
    }

    @Override
    public String toString() {
        return "Garaje{"
                + "espacios=" + espacios
                + ", ocupados=" + contador
                + '}';
        
    }
    
}
