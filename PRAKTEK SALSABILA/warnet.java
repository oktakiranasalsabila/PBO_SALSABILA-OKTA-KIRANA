/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AyUmiYuNo1
 */
public class warnet {
    public static void main(String[] args) {
        WarnetExamle pelanggan = new WarnetExamle();

        pelanggan.setKode(1);
        pelanggan.setNamaPelanggan("salsa");
        pelanggan.setJenisPelanggan(1);
        pelanggan.setTglMasuk(2);
        pelanggan.setJamMasuk(5);
        pelanggan.setJamKeluar(8);
        pelanggan.setLama(2);

        pelanggan.Print();
        pelanggan.Pembayaran();




    }
}
