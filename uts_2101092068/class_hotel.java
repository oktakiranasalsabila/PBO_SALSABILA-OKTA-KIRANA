/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_2101092068;

/**
 *
 * @author salsabila
 */
import java.io.*;

public class class_hotel {
 public static void main (String [] args) throws IOException{
  String nama="",kamar="";
  int jenis=0,status=0,lama=0,tarif=0;
  double diskon=0,bayar=0;
  
  BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
  
  //input
  System.out.println("--**-- SISTEM INFORMASI PERHOTELAN --**--");
  
  System.out.println("\nPilih Jenis Kamar");
  System.out.println("1. Kamar Biasa Rp 6000.000/hari");
  System.out.println("2. Kamar Premium Rp 700.000/hari");
  System.out.print("Jenis kamar yang dipesan \t: ");
  jenis = Integer.parseInt(br.readLine());
  
  System.out.print("\nLama Menginap \t\t\t: ");
  lama = Integer.parseInt(br.readLine());
  
  //proses perhitungan
  if (jenis==1){
   tarif = lama*600000;
   kamar="Kamar Biasa";
  }else if (jenis==2){
   tarif = lama*700000;
   kamar="Kamar Premium";
  }
  
  if (status==1){
    diskon = 0.02 * tarif;
   }
  else if (status==2){
    diskon = 0.03 * tarif;
  }
  
  bayar = tarif-diskon;
  
  //output
  System.out.println("\n\n---***--- NOTA PEMBAYARAN HOTEL CONTOH123 ---***---");
  System.out.println("Jenis Kamar \t\t\t: " + kamar);
  System.out.println("Tarif Penginapan \t\t: Rp " + tarif + ",-");
  System.out.println("Diskon Menginap \t\t: Rp " + diskon + ",-");
  System.out.println("Nominal yang harus dibayar \t: Rp " + bayar + ",-");
  System.out.println("====================================================");
 }
}
