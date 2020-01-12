/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyKasus;

/**
 *
 * @author RIFQIYAH
 */
public class NonStatic {
     //Class dalam/Inner Class Pertama
    private class Pesawat{
        private String merk = "Garuda";
        private float kecepatan = 400.0f;
        private void jalankan(){
            System.out.println("Merk Pesawat: "+merk);
            System.out.println("Kecepatan Pesawat: "+kecepatan);
        }
    }
    
    //Class dalam/Inner Class Kedua
    private class Pengguna{
        private String nama = "cece";
        private int umur = 20;
        private void identitas(){
            System.out.println("Nama Saya: "+nama);
            System.out.println("Usia Saya: "+umur);
        }
    }
    
    public static void main(String[] args){
        //Membuat Instance dari KelasLuar
        NonStatic outerclass = new NonStatic();
        //Membuat Instance dari KelasDalam (Mobil)
       NonStatic.Pesawat data1 = outerclass.new Pesawat();
        //Membuat Instance dari KelasDalam (Pengguna)
       NonStatic.Pengguna data2 = outerclass.new Pengguna();
        
        //Menampilkan Hasil Output
        System.out.println("===== DATA DARI CLASS PESAWAT ========");
        data1.jalankan();
        System.out.println("===== DATA DARI CLASS PENGGUNA =====");
        data2.identitas();
    }

}
