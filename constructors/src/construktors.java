/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RIFQIYAH
 */
public class construktors {
    long modelNim;
    String modelNama;
    String modelAlamat;
    String modelJurusan;
    int modelAngkatan;
    
    public construktors (){
        modelNim = 201869040026L;
        modelNama = "Rifqiyah";
        modelAlamat = "Puspo";
        modelJurusan = "Teknik Informatika";
        modelAngkatan = 2018;
    }
    
 public static void main(String[] args){
        construktors profil = new construktors();
        System.out.println("Nim             = " +profil.modelNim);
        System.out.println("Nama            = " +profil.modelNama);
        System.out.println("Alamat          = " +profil.modelAlamat);
        System.out.println("Jurusan         = " +profil.modelJurusan);
        System.out.println("Angkatan        = " +profil.modelAngkatan);
 }
}