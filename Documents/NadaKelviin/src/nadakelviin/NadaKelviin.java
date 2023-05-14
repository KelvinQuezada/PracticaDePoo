/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nadakelviin;

/**
 *
 * @author petee
 */
public class NadaKelviin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gato2 gato1 =new Gato2();
        gato1.nombre="Imary";
        gato1.raza="runo";
        gato1.color="negro";
        gato1.edad=3;
        gato1.genero="Masculino";
        
        System.out.println("==================");
        System.out.println("Clase de Gatos");
        System.out.println("==================");
        System.out.println(gato1.nombre);
        System.out.println(gato1.raza);
        System.out.println(gato1.color);
        System.out.println(gato1.edad);
        System.out.println(gato1.genero);
        
    }
    
}
