/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilgisayarkavramlari7;

/**
 *
 * @author maytemur Java 24-Recursive Fonksiyonlar
 */
public class Bilgisayarkavramlari7 {

    public static int f(int x) {
        if (x == 10) {
            return 10;
        }
        System.out.println("x: " + x);
        return x + f(x + 1);
    }
    //f(0): 0 + f(1)
    //f(0): 1 + f(2) 
    //f(0): 2 + f(3) 
    //... 
    //f(0): 8 + f(9) 
    //f(0): 9 + f(10) -----> 9+10
    // f(10): 10 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//          int toplam=0;
//          for (int i = 0; i < 10; i++) {
//              toplam+= i+1; //1 den 10 a kadar olan sayıların toplamı
//              System.out.println("toplam: "+ toplam + "  i: "+ i);  
//            
//        }
//          System.out.println("Sonuc: "+toplam);
//
        System.out.println("f(0):" + f(0));
    }

}
