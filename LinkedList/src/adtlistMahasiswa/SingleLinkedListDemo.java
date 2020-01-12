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
public class SingleLinkedListDemo {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa ("201869040022 ", "Dhyan Putri F  ", 3.77);
        Mahasiswa mhs2 = new Mahasiswa ("201869040026 ", "Rifqiyah       ", 3.42);
        Mahasiswa mhs3 = new Mahasiswa ("201869040030 ", "Fahriza Aulia  ", 3.42);
        Mahasiswa mhs4 = new Mahasiswa ("201869040035 ", "iyowes gapopo  ", 5.00);
        Mahasiswa mhs5 = new Mahasiswa ("201869040100 ", "Imron Rosyadi  ", 2.00);
        SingleLinkedLIst ssl = new SingleLinkedLIst();
        ssl.buatNode(mhs1);
        ssl.buatNode(mhs2);
        ssl.buatNode(mhs3);
        System.out.println("Sebelum DIURUTKAN :");
        ssl.cetak("NIM\t    | Nama  \t  | IPK\t |");
        System.out.println("Sesudah DIURUTKAN :");
        ssl.sort();
        ssl.cetak("NIM\t    | Nama  \t  | IPK\t |");
        System.out.println("Dimasukkan data baru ");
        ssl.sisip(mhs5, mhs2);
        System.out.println("Sebelum DIURUTKAN : ");
        ssl.cetak("NIM\t    | Nama \t   | IPK\t |");
        System.out.println("sesudah diurutkan : ");
        ssl.sort();
        ssl.cetak("NIM\t    | Nama\t    | IPK\t |");
        System.out.println("Data di hapus di depan : ");
        ssl.hapusDiDepan();
        ssl.cetak("NIM\t    | Nama\t    | IPK\t |");
        System.out.println("Data di hapus di belakang : ");
        ssl.hapusData(mhs5);
        ssl.cetak("NIM\t    | Nama\t    | IPK\t |");
          
    }

}
