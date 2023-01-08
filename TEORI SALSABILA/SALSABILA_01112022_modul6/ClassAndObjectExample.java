/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7;

/**
 *
 * @author USER
 */
class GajiKaryawan{
    String NIK;    // Langkah 1, buat class barukemudian inisialisasi semua variabel dan tipe data nya
    String nama;
    int umur;
    int golongan;
    int gaji;
    int potongan;
    int tunjangan;
    int totalGaji;
    
    //buat method untuk mencetak data
    
    public void print(){
        System.out.println("NIK : " +NIK);          // Langkah 4 : tambahkan method baru dgn nama print,kemudian panggil variabelnya
        System.out.println("Nama : " +nama);
        System.out.println("Umur : " +umur);
        System.out.println("Golongan : " +golongan);
       
       
    }
    
    //method menghitung gaji berdasarkan golongan
    public int gajiPerGolongan(){
        //jika golongan 3 maka gaji= 3000000,potongan=10%,tunjangan=400000
        //jika golongan 2 maka gaji= 2500000, potongan=5%,tunjangan=300000
        //jika golongan 1 maka gaji= 2000000, potongan=3%,tunjangan=200000
        
        if(golongan == 1){
            gaji = 2000000;
            potongan = 3 * gaji / 100;
            tunjangan = 200000;
            totalGaji = gaji + tunjangan - potongan;
            
        } else if (golongan == 2){
            gaji = 2500000;
            potongan = 5 * gaji / 100;
            tunjangan = 300000;
            totalGaji = gaji + tunjangan - potongan;
        } else if(golongan == 3){
            gaji = 3000000;
            potongan = 10 * gaji / 100;
            tunjangan = 400000;
            totalGaji = gaji + tunjangan - potongan;
        } else {
            System.out.println("Golongan tak tersedia");
        }
        System.out.println("Potongan : "+potongan);
        System.out.println("Tunjangan : "+tunjangan);
        System.out.println("Total Gaji : "+totalGaji);
        System.out.println("==========================");
        
        
        return totalGaji;
       
    }
}
public class ClassAndObjectExample {
    public static void main(String[] args) {
        GajiKaryawan karyawan1 = new GajiKaryawan();  // Langkah 2, buat objek dari class tadi
        GajiKaryawan karyawan2 = new GajiKaryawan();
        
        karyawan1.NIK = "2001092015";           // Langkah 3 : Masukkan Nilai dari masing2 variabel dgn format namaobjek.variabel
        karyawan1.nama = "Viola Yosevi";
        karyawan1.umur = 19;
        karyawan1.golongan = 1;
        karyawan1.gaji = 3000000;
        karyawan1.potongan = 150000;
        karyawan1.tunjangan = 300000;
        
        karyawan2.NIK = "2001092015";
        karyawan2.nama = "Viola Yosevi";
        karyawan2.umur = 19;
        karyawan2.golongan = 2;
        karyawan2.gaji = 3000000;
        karyawan2.potongan = 150000;
        karyawan2.tunjangan = 300000;
        
        // Langkah 5 : panggil semua nilai tadi dengan format namaobjek.namamethod
        //jadi kita tidak perlu panggil satu2 dengan System.out.println(karyawan1.NIK)...dst.
        karyawan1.print(); 
        karyawan1.gajiPerGolongan();
        karyawan2.print();
        karyawan2.gajiPerGolongan();
        
    }
    
}
