/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.model;
import biblioteca.model.Autor;
import java.util.Arrays;

public class Libro extends ItemBiblioteca {
    private Autor[] autores;
    private int numeroPaginas;

    public Libro(int id, String titulo, int anioPublicacion, Autor[] autores, int numeroPaginas) {
        super(id, titulo, anioPublicacion);
        this.autores = autores;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String obtenerDescripcion() {
        return "Libro con " + numeroPaginas + " páginas. Autores: " + Arrays.toString(autores);
    }
}