/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author Marlon Rojas Galindo
 */
public class Pulpo extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("*glup glup*");
    }

    @Override
    public void moverse() {
        System.out.println("*se le pega un tentaculo*");
    }
    
}
