/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author Marlon Rojas Galindo
 */
public class Gato extends Animal implements Mascota {

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }

    @Override
    public void moverse() {
        System.out.println("Mover la cola");
    }

    @Override
    public void jugar() {
        System.out.println("Juega con una bola estambre");
    }
    
}
