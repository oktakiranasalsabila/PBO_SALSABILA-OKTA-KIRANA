/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SALSABILA_07012023_modul10;

/**
 *
 * @author LABMMKOMP23
 */
public class BukuAlamat {
    private String nama;
    private String alamat;
    private String notelp;
    private String email;

    public BukuAlamat(){
        nama = "";
        alamat = "";
        notelp = "";
        email = "";
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
