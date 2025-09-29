/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author Marlon Rojas Galindo
 */
public class MainZoo {
    public static void main(String[] args) {
        Animal [] animales = new Animal [6];
        
        animales[0] = new Delfin();
        animales[1] = new Gato();
        animales[2] = new Perro();
        animales[3] = new Pajaro();
        animales[4] = new Pinguino();
        animales[5] = new Pulpo();
        
        for(Animal a : animales){
            
            if(a instanceof Mascota){
                ((Mascota) a).jugar();
            }
            
            a.hacerSonido();
            a.moverse();
        }
    }
}
