/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package biblioteca.model;
import biblioteca.util.ContadorItems;

public abstract class ItemBiblioteca {
    private int id;
    private String titulo;
    private int anioPublicacion;

    public ItemBiblioteca(int id, String titulo, int anioPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        ContadorItems.incrementar(); 
    }

    public abstract String obtenerDescripcion();

    @Override
    public String toString() {
        return String.format("ID: %d | Título: %s (%d)", id, titulo, anioPublicacion);
    }
    
    public String getTitulo() { return titulo; }
}
