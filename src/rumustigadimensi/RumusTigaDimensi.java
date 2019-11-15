/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumustigadimensi;

/**
 *
 * @author Zein-Pc
 */
public class RumusTigaDimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
            //siapkan variabel
            int p;
            p = 20;
            int l;
            l = 15;
            int t;
            t = 10;
            String kalimatLuas = "Luas Persegi Panjang adalah ";
            String kalimatKeliling = "Keliling Persegi Panjang adalah ";
            
            //proses
            int luas = 2 *( p * l) + 2 * (p * t) + 2 * (l * t);
            int keliling = 4 * (p + l + t);
            
            //tampilkan
            System.out.println (kalimatLuas+luas);
            System.out.println (kalimatKeliling+keliling);
            
        }
    
    
}
