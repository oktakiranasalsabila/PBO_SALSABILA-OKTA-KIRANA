/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salsabila_19092022;

/**
 * salsabila okta kirana
 * @author AyUmiYuNo1
 */
public class latihan12 {
     public static void main(String[] args){
        int number1= 10;
        int number2= 23;
        int number3= 5;
        int score=0;
        
        //score = (number3 < number1 ) ? (number3 < number2) ? number3 : number1 : number2;
        score = (number2 > number1 ) ? (number2 > number3) ? number2 : number1 : number3;
        
        System.out.println("Number 1 = " +number1);
        System.out.println("Number 2 = " +number2);
        System.out.println("Number 3 = " +number3);
        System.out.println("Nilai tertingginya adalah = "+score);
        //System.out.println("Nilai terendah nya adalah = "+score);
         
    }
}
