/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NonStatic;

/**
 *
 * @author RIFQIYAH
 */
public class KelasLuar {
    //Class dalam/Inner Class Pertama
    private class Mobil{
        private String merk = "SUZUKI";
        private float kecepatan = 360.0f;
        private void jalankan(){
            System.out.println("Merk Mobil: "+merk);
            System.out.println("Kecepatan Mobil: "+kecepatan);
        }
    }
    
    //Class dalam/Inner Class Kedua
    private class Pengguna{
        private String nama = "Wildan";
        private int umur = 19;
        private void identitas(){
            System.out.println("Nama Saya: "+nama);
            System.out.println("Usia Saya: "+umur);
        }
    }
    
    public static void main(String[] args){
        //Membuat Instance dari KelasLuar
        KelasLuar outerclass = new KelasLuar();
        //Membuat Instance dari KelasDalam (Mobil)
        KelasLuar.Mobil data1 = outerclass.new Mobil();
        //Membuat Instance dari KelasDalam (Pengguna)
        KelasLuar.Pengguna data2 = outerclass.new Pengguna();
        
        //Menampilkan Hasil Output
        System.out.println("===== DATA DARI CLASS MOBIL ========");
        data1.jalankan();
        System.out.println("===== DATA DARI CLASS PENGGUNA =====");
        data2.identitas();
    }
}
