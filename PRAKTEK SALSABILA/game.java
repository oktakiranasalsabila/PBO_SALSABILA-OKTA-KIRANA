/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AyUmiYuNo1
 */
public class game {
       public static void main(String[] args){

        // membuat objek player
        pemain pemain1 = new pemain();
        pemain pemain2 = new pemain();
        pemain pemain3 = new pemain();
        
        // mengisi atribut player
        pemain1.name = "salsabila";
        pemain1.speed = 78;
        pemain1.healthPoin = 0;

        // menjalankan method
        pemain1.run();

        if(pemain1.isDead()){
            System.out.println("Game Over!");
        }

    }
}
