/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menghitung_luas.arsir;

/**
 *
 * @author Apipz
 */
public class MENGHITUNG_LUASARSIR {

        public static void main(String[] args) {
//segitiga ADE 
        Segitiga st1 = new Segitiga();
        st1.setAlas(5);
        st1.setTinggi(7);
        double luasADE = st1.getLuas();
         
//segitiga CBF 
        Segitiga st2 = new Segitiga();
        st2.setAlas(5);
        st2.setTinggi(7);
        double luasCBF = st2.getLuas();
         
//persegipanjang CDEF
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.setPanjang(35);
        pp1.setLebar((int) 17.5);
        double luasCDEF = pp1.getLuas();
         
//setengah lingkaran 
        Lingkaran l1 = new Lingkaran();
        l1.setJejari(7);
        double SetengahLingkaran = 0.5 * l1.getLuas();
         
//hitung luas daerah diarsir
        double luasArsir = luasADE + luasCBF + luasCDEF - SetengahLingkaran;
        System.out.println("Luas Segitiga CBF: " + luasCBF + " cm2");
        System.out.println("Luas Segitiga ADE : " + luasADE + " cm2");
        System.out.println("Luas Persegi Panjang CDEF: " + luasCDEF + " cm2");
        System.out.println("Luas Setengah Lingkaran : " + SetengahLingkaran + " cm2");
        System.out.println("=================================================");
        System.out.println("Luas daerah diarsir: " + luasArsir + " cm2");
    }
    }
    
