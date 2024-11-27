/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanUTS;

/**
 *
 * @author Sheila
 */
public class Warga {
    private String namaKK;
    private int jumlahAK;
    private String alamat;
    private int noRumah;
    
    public Warga(String namaKK, int jumlahAK, String alamat, int noRumah){
        this.namaKK = namaKK;
        this.jumlahAK = jumlahAK;
        this.alamat = alamat;
        this.noRumah = noRumah;
    }
    
    public void displayWarga(){
        System.out.print("Nama KK: " + namaKK);
        System.out.print(", anggota: " + jumlahAK + " orang");
        System.out.print(", alamat: " + alamat);
        System.out.println(", no: " + noRumah);
    }
    
    public String getNamaKK(){
        return namaKK;
    }
    
    public int getAnggota(){
        return jumlahAK;
    }
    
    public int getNoRumah(){
        return noRumah;
    }
}