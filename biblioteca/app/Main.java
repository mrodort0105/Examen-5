/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.app;

import biblioteca.model.*;
import biblioteca.util.ContadorItems;
import biblioteca.model.Autor;

public class Main {
    public static void main(String[] args) {
        Autor a1 = new Autor("Gabriel García Márquez", "Colombiano");
        Autor a2 = new Autor("Borges", "Argentino");

        Autor[] autoresGabo = {a1};
        Libro l1 = new Libro(101, "Cien años de soledad", 1967, autoresGabo, 450);
        
        Libro l2 = new Libro(102, "Antología Personal", 1961, new Autor[]{a2}, 300);

        Revista r1 = new Revista(201, "National Geographic", 2024, 5, "Mensual");

        System.out.println("--- Inventario ---");
        System.out.println(l1 + " -> " + l1.obtenerDescripcion());
        System.out.println(l2 + " -> " + l2.obtenerDescripcion());
        System.out.println(r1 + " -> " + r1.obtenerDescripcion());

        System.out.println("\nTotal de items registrados: " + ContadorItems.getTotalItems());
    }
}