/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StacksQueues;

class Pembalik{
    public void ubah(String isi, ImplementasiStack st){
        for (int i = 0; i < isi.length(); i++) {
            char simpan = isi.charAt(i);
            st.push(simpan);
        }
    }
    public String result(ImplementasiStack st){
        String value = "";
        while(!st.isEmpty()){
            value += st.pop();
        }
        return value;
    }
}