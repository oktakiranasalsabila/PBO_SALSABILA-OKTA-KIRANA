/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7;

import java.util.Scanner;

/**
 *
 * @author USER
 */
class TiketBus{
    int kelas;
    int harga;
    int n;
    int diskon;
    int jumlah;
    int totalBayar;
    
    public void print(){
        System.out.println("Kelas : " +kelas);
        System.out.println("Banyak Tiket : " +n);
        
    }
    
    public int Harga(){
        if(n < 4){
           if(kelas == 1){
               System.out.println("Kelas ekonomi");
               harga = 350000;
               diskon = 0;
               jumlah = harga * n;
               totalBayar = jumlah;
           } if(kelas == 2){
               System.out.println("Kelas Eksekutif");
               harga = 500000;
               diskon = 0;
               jumlah = harga * n;
               totalBayar = jumlah;
           } if(kelas == 3){
               System.out.println("Kelas Super Eksekutif");
               harga = 650000;
               diskon = 0;
               jumlah = harga * n;
               totalBayar = jumlah;
           }
           
       } else{
               if(kelas == 1){
               System.out.println("Kelas ekonomi");
               harga = 350000;
               jumlah = harga *n;
               diskon = 10 * jumlah / 100;
               totalBayar = jumlah - diskon;
           } if(kelas == 2){
               System.out.println("Kelas Eksekutif");
               harga = 500000;
               jumlah = harga *n;
               diskon = 10 * jumlah / 100;
               totalBayar = jumlah - diskon;
           } if(kelas == 3){
               System.out.println("Kelas Super Eksekutif");
               harga = 650000;
               jumlah = harga *n;
               diskon = 10 * jumlah / 100;
               totalBayar = jumlah - diskon;           }
            
          }
        System.out.println("Harga Sebelum Diskon = " +jumlah);
        System.out.println("Diskon = " +diskon);
        System.out.println("Total Bayar = " +totalBayar);
        return totalBayar;
        
    }
  }
       

    
public class LatihanClassAndObject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TiketBus Bayar1 = new TiketBus();
        
        System.out.print("Masukkan Jenis Tiket  ");
        Bayar1.kelas = in.nextInt();
        System.out.print("Masukkan Banyak Tiket  ");
        Bayar1.n = in.nextInt();
                
        Bayar1.print();
        Bayar1.Harga();
    }
}
