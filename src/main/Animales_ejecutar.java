
package main;

import Animals.Animal;
import Animals.Gato;
import Animals.Leon;
import Animals.Lobo;
import Animals.Perro;


public class Animales_ejecutar {
    public static void main(String[] args) {
        Animal[] animal = new Animal[4];
        animal[0] = new Perro();
        animal[1] = new Gato();
        animal[2] = new Leon();
        animal[3] = new Lobo();
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Nombre = " + animal[i].getnombre());
            System.out.println("Sonido = " + animal[i].getsonido());
            System.out.println("Alimento = " + animal[i].getalimentos());
            System.out.println("Habitad = " + animal[i].gethabitad());
            System.out.println(" ");
        }
        
    }
}
