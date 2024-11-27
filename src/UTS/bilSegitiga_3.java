/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Sheila
 */
public class bilSegitiga_3 {

    public static void main(String[] args) {
        System.out.println("Menampilkan bilangan segitiga dari elemen ke-1 hingga ke-10: ");

        int jadiSegitiga = 0;

        for (int i = 1; i <= 10; i++) {
            jadiSegitiga += i;

            System.out.print(jadiSegitiga + ", ");
        }
    }
}
