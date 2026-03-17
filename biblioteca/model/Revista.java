/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.model;

public class Revista extends ItemBiblioteca {
    private int numero;
    private String periodicidad;

    public Revista(int id, String titulo, int anioPublicacion, int numero, String periodicidad) {
        super(id, titulo, anioPublicacion);
        this.numero = numero;
        this.periodicidad = periodicidad;
    }

    @Override
    public String obtenerDescripcion() {
        return "Revista No. " + numero + " - Periodicidad: " + periodicidad;
    }
}

