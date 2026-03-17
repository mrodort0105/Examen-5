/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.util;

public class ContadorItems {
    private static int totalItems = 0;

    public static void incrementar() {
        totalItems++;
    }

    public static int getTotalItems() {
        return totalItems;
    }
}