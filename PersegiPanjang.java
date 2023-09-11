/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menghitung_luas.arsir;

/**
 *
 * @author Apipz
 */
public class PersegiPanjang {
    private int panjang ;
    private int lebar;
    private double luas;
    
    // setter method untuk panjang
    public void setPanjang(int p){
        if (p > 0){
            this.panjang = p;
        } else {
            this.panjang = 0;
        }
    }
     
    // setter method untuk lebar
    public void setLebar(int l){
        if (l > 0){
            this.lebar = l;
        } else {
            this.lebar = 0;
        }
    }
     
    // getter method untuk luas
    public double getLuas(){
        // hitung luasnya
        this.luas = this.panjang * this.lebar;
        return this.luas;
    }
}
    
    
