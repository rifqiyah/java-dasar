/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RIFQIYAH
 */
public class myprofil {
    long modelNim;
    String modelNama;
    String modelAlamat;
    String modelJurusan;
    int modelAngkatan;
    
    public myprofil (long Nim, String Nama, String Alamat, String Jurusan, int Angkatan){
        modelNim = Nim;
        modelNama = Nama;
        modelAlamat = Alamat;
        modelJurusan = Jurusan;
        modelAngkatan = Angkatan;
        
    }
    
    public static void main(String[] args){
        myprofil profil = new myprofil(201869040026L, "Rifqiyah","Puspo","Tenik Informatika",2018);
        System.out.println("Nim             = " +profil.modelNim);
        System.out.println("Nama            = " +profil.modelNama);
        System.out.println("Alamat          = " +profil.modelAlamat);
        System.out.println("Jurusan         = " +profil.modelJurusan);
        System.out.println("Angkatan        = " +profil.modelAngkatan);
        
    }
}
