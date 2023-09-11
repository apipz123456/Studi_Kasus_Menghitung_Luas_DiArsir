/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menghitung_luas.arsir;

/**
 *
 * @author Apipz
 */
public class Lingkaran {
    private int jejari;
    private double luas;
     
    // setter method untuk jejari
    public void setJejari(int r){
        if (r > 0){
            this.jejari = r;
        } else {
            this.jejari = 0;
        }
    }
     
    // getter method untuk luas
    public double getLuas(){
        // hitung luasnya
        this.luas = Math.PI * Math.pow(this.jejari, 2);
        return this.luas;
    }
}
