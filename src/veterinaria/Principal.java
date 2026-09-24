/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria;

/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args){// permite iniciar el programa
        Cliente cliente1 = new Cliente("111111111", "Ronaldo", "12345678");
        Mascota mascota1 = new Mascota("Luna", "Perro", 5, 25.5, cliente1);
        Mascota mascota2 = new Mascota("Goku", "Loro", 2, 0.8);
        
        System.out.println("Duenio:" + mascota1.getDuenio().getNombre());
        System.out.println("--------------");
        mascota2.mostrarResumen();
    } 
}
