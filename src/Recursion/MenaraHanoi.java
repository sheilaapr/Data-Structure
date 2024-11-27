/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author Sheila
 */
class menara{
    public void recMenara(int jmlBalok, String asal, String bantuan, String tujuan){
        if(jmlBalok == 1){
            System.out.println("Balok 1 dipindah dari " + asal + " ke " + tujuan);
        }else{
            recMenara(jmlBalok - 1, asal, tujuan, bantuan);
            System.out.println("Balok " + jmlBalok + " dipindah dari " + asal + " ke " + tujuan);
            recMenara(jmlBalok - 1, bantuan, asal, tujuan);
        }
    }
}

public class MenaraHanoi {
    public static void main(String[] args) {
        menara menara = new menara();
        menara.recMenara(3, "A", "B", "C");
    }
}
