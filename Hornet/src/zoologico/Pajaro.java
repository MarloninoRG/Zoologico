/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author Marlon Rojas Galindo
 */
public class Pajaro extends Animal implements Mascota {

    @Override
    public void hacerSonido() {
        System.out.println("Pio pio...");
    }

    @Override
    public void moverse() {
        System.out.println("Volar");
    }

    @Override
    public void jugar() {
        System.out.println("Canta");
    }
    
}
