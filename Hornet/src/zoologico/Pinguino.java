/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author Marlon Rojas Galindo
 */
public class Pinguino extends Animal implements Mascota {

    @Override
    public void hacerSonido() {
        System.out.println("*Sonido de pinguino*");
    }

    @Override
    public void moverse() {
        System.out.println("*Se mueve muy pingüinesco*");
    }

    @Override
    public void jugar() {
        System.out.println("Se tira por la nieve");
    }
    
}
