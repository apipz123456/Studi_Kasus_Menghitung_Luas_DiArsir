/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menghitung_luas.arsir;

/**
 *
 * @author Apipz
 */
public class Segitiga {
    // atribut 
    private int alas;
    private int tinggi;
    private double luas;
     
    // setter method untuk alas
    public void setAlas(int a){
        if (a > 0){
            this.alas = a;
        } else {
            this.alas = 0;
        }
    }
     
    // setter method untuk tinggi
    public void setTinggi(int t){
        if (t > 0){
            this.tinggi = t;
        } else {
            this.tinggi = 0;
        }
    }
     
    // getter method untuk luas
    public double getLuas(){
        // hitung luasnya
        this.luas = this.alas * this.tinggi * 0.5;
        return this.luas;
    }
}
