/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SALSABILA_07012023_modul10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LABMMKOMP23
 */
public class BukuAlamatExample {

    private BukuAlamat bukuAlamat[];
    private int jumlahData = 0;

    public BukuAlamatExample() {
        bukuAlamat = new BukuAlamat[100];
    }

    public int getJumlahData() {
        return jumlahData;
    }

    public void setJumlahData(int jumlahData) {
        this.jumlahData = jumlahData;
    }

    public BukuAlamat[] getBukuAlamat() {
        return bukuAlamat;
    }

    public void insertBukuAlamat(BukuAlamat bukuAlamat, int index) {
        this.bukuAlamat[index] = bukuAlamat;
    }

    public void updateBukuAlamat(BukuAlamat bukuAlamat, int index) {
        this.bukuAlamat[index] = bukuAlamat;
    }

    public void deleteBukuAlamat(int index) {
        this.bukuAlamat[index] = null;
    }

    public void tampilData() {
        for (int i = 0; i < jumlahData; i++) {
            BukuAlamat bukuAlamat = this.bukuAlamat[i];
            System.out.println("Data Ke---->" + (i + 1));
            System.out.println("Nama     :" + bukuAlamat.getNama());
            System.out.println("Alamat   :" + bukuAlamat.getAlamat());
            System.out.println("No Telp  :" + bukuAlamat.getNotelp());
            System.out.println("Email    :" + bukuAlamat.getEmail());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BukuAlamatExample b = new BukuAlamatExample();
        int pil = 0;
        b.setJumlahData(2);
        BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));

        while (pil != 5) {
            System.out.println("Pilih Menu  ");
            System.out.println("1. Insert Data  ");
            System.out.println("2. Edit Data  ");
            System.out.println("3. Delete Data  ");
            System.out.println("4. Tampil Data  ");
            System.out.println("5. Keluar  ");
            System.out.print("Pilihan   :  ");
            try {
                pil = Integer.parseInt(datain.readLine());
            } catch (Exception ex) {
            }

            switch (pil) {
                case 1:
                    for (int i = 0; i < b.getJumlahData(); i++) {
                        try {
                            BukuAlamat bukuAlamat = new BukuAlamat();
                            System.out.print("Input Nama   :");
                            bukuAlamat.setNama(datain.readLine());
                            System.out.print("Input Alamat :");
                            bukuAlamat.setAlamat(datain.readLine());
                            System.out.print("Input No Telp   :");
                            bukuAlamat.setNotelp(datain.readLine());
                            System.out.print("Input Email   :");
                            bukuAlamat.setEmail(datain.readLine());
                            b.insertBukuAlamat(bukuAlamat, i);
                        } catch (IOException ex) {
                        }
                    }
                    break;
                case 2:
                    b.tampilData();
                    break;
            }
        }

    }

}
