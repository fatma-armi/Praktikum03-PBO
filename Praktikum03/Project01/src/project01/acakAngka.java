/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project01;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Isnaini Fatmala
 */
public class acakAngka {
    private int angka;
    private boolean mengulang = true;
    
    private int mengacak(){
        Random r = new Random();
        int terkecil = 0;
        int terbesar = 100;
        angka = r.nextInt(terbesar-terkecil) + terkecil;
        return angka;
    }
    
    public void menebakAngka(){
        Scanner input = new Scanner(System.in);
        int mengacak = mengacak();
        
        System.out.println("Hai.. nama saya Baymax, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
        while(mengulang){
            System.out.print("Tebakan anda : ");
            int tebakan = input.nextInt();
            if (tebakan == angka){
                System.out.println("\nYeee...Bilangan tebakan anda BENAR :-)");
                break;
            }
            else{
                if(tebakan > angka){
                    System.out.println("Hehehe...Bilangan tebakan anda terlalu besar");
                }
                else{
                    System.out.println("Hehehe...Bilangan tebakan anda terlalu kecil");
                }
            }
        }
    }
}
