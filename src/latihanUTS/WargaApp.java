/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanUTS;

/**
 *
 * @author Sheila
 */
public class WargaApp {
    public static void main(String[] args) {
        // Membuat objek Warga
        Warga warga1 = new Warga("Smith", 4, "Jl. Kenari No. 12", 12);
        Warga warga2 = new Warga("Johnson", 3, "Jl. Mawar No. 25", 25);

        // Menampilkan informasi warga
        warga1.displayWarga();
        warga2.displayWarga();
    }
}
