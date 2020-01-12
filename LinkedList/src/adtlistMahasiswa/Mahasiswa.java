/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adtlistMahasiswa;

/**
 *
 * @author RIFQIYAH
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private double ipk;
    
    //deklarasi konstruktor
    public Mahasiswa (String nim, String nama, double ipk){
        
        this.nama = nama;
        this.ipk = ipk;
        this.nim = nim;
    } 
    //deklarasi method
    //ambil nilai ipk
    public double getIpk (){
        return this.ipk;
    }
    
    //ambil nilai nim
    public String getNim(){
        return this.nim;
    }
    
    //ambil nilai nama
    public String getNama(){
        return this.nama;
    }
    
    //cetak di format dalam bentuk string
    @Override
    public String toString (){
        return String.format(nim + nama + ipk);
    }
}
