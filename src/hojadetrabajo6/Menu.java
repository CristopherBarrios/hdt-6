/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo6;

/**
 *
 * @author moyha
 */
public class Menu {
    public void PrintMenu(){
        System.out.println("¿Qué tipo de pila desea usar?");
        System.out.println("1) HashMap");
        System.out.println("2) TreeMap");
        System.out.println("3) LinkedHashMap");
    }
    
    public void PrintMenu2(){
        System.out.println("¿Qué acción desea realizar?");
        System.out.println("1) Agregar una carta a su colección");
        System.out.println("2) Mostrar el tipo de una carta específica");
        System.out.println("3) Mostrar sus cartas");
        System.out.println("4) Mostrar sus cartas - ordenadas");
        System.out.println("5) Mostrar todas las cartas");
        System.out.println("6) Mostrar todas las cartas - ordenadas");
        System.out.println("7) Finalizar el programa");
    }
    
}
