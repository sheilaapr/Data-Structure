/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanUTS;

/**
 *
 * @author Sheila
 */
public class DataArray {
    private Warga[] warga;
    private int nElemen;
    
    public DataArray(int max){
        warga = new Warga[max];
        nElemen = 0;
    }
    
    public void insert(String namaKK, int jumlahAK, String alamat, int noRumah){
//        boolean t = true;
//        if(nElemen == 0){
//            warga[nElemen] = new Warga(namaKK, jumlahAK, alamat, noRumah);
//            nElemen++;
//        }else{
//            int i = 0;
//            while(t){
//                if(warga[i].getNamaKK().compareToIgnoreCase(namaKK) == 0){
//                    System.out.println(namaKK + " sudah terdaftar");
//                    t = false;
//                }else{
//                    warga[nElemen] = new Warga(namaKK, jumlahAK, alamat, noRumah);
//                    nElemen++;
//                }
//                i++;
//            }
//        }
        
//        while(t){
//            int i = 0;
//            if(warga[i].getNamaKK().compareToIgnoreCase(namaKK) == 0){
//                System.out.println(namaKK + " sudah terdaftar");
//                t = false;
//            }else{
//                warga[nElemen] = new Warga(namaKK, jumlahAK, alamat, noRumah);
//                nElemen++;
//            }
//            i++;
//        }
//        if(i == 0){
//            warga[nElemen] = new Warga(namaKK, jumlahAK, alamat, noRumah);
//            nElemen++;
//        }
        for(int i = 0; i < nElemen; i++){
            if(warga[i].getNamaKK().compareToIgnoreCase(namaKK) == 0){
                System.out.println(warga[i].getNamaKK() + " sudah terdaftar");
            }
        }
        warga[nElemen] = new Warga(namaKK, jumlahAK, alamat, noRumah);
        nElemen++;
    }
    
    public void swap(int one, int two){
        Warga temp = warga[one];
        warga[one] = warga[two];
        warga[two] = temp;
    }
//    
    public void BubbleSort(){
        int batas, i;
        for(batas = nElemen - 1; batas > 0; batas--){
            for(i = 0; i < batas; i++){
                if(warga[i].getNoRumah()> warga[i + 1].getNoRumah()){
                    swap(i, i+1);
                }
            }
        }
    }
    
    public int doRecursion(int index){
        if(index == nElemen){
            return 0;
        }else{
            int jml = 1 + warga[index].getAnggota();
            return jml + doRecursion(index+1);
        }
    }
    
    public void displayArray(){
        for(int i = 0; i < nElemen; i++){
            System.out.print(i+1 +".");
            warga[i].displayWarga();
        }
    }
}
