/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author Sheila
 */
    class exponenRec{
        public int pangkatExp(int base, int exp){
            if(exp == 0){
                return 1;
            }else{
                return base * pangkatExp(base, exp - 1);
            }
        }
    }

public class Exponen {
    public static void main(String[] args) {
        exponenRec exp = new exponenRec();
        int e = exp.pangkatExp(2, 3);
        System.out.println( "Hasil dari nilai exponen adalah " + e);
    }
}
