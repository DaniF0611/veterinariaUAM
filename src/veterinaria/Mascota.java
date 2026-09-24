/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria;

/**
 *
 * @author Usuario
 */
public class Mascota {

    private String nombre; //private: atributo en esta clase, nadie puede acceder
    private String especie; //private: atributo en esta clase, nadie puede acceder
    private int edad; //private: atributo en esta clase, nadie puede acceder
    private double peso; //private: atributo en esta clase, nadie puede acceder
    private Cliente duenio;

    public Mascota(String nombre, String especie, int edad, double peso) { // Constructor: Inicializa los atributos de la mascota al crear el objeto
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }

    public Mascota(String nombre, String especie, int edad, double peso, Cliente duenio) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.duenio = duenio;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; //this = esta
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void mostrarResumen(){
        System.out.println("Mascota: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.printf("Peso: %.2f kg%n", peso);
    }

    public Cliente getDuenio() {
        return duenio;
    }

    public void setDuenio(Cliente duenio) {
        this.duenio = duenio;
    }
}
