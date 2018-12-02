/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayıtahmin;

import java.util.*;


/**
 *
 * @author sami dönmez
 */
public class Sayıtahmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner tahmin= new Scanner(System.in);
       Random rnd = new Random();
        int hak=0;//oyun tahmin hakkı
        int sayi1=0;//level üst sınırı
        int sayi=0;//tutulan random sayı
        int puan = 0;//level puan degeri
        boolean kontrol=true;//kontrol degişkeni
        int girilen;//tahmin degişkeni
        int levels;//level dagişkeni
//level seçim ve kontrol başlangıç
        while (kontrol) {
 System.out.print("level seciniz...: \n 1.level(0-10) \n 2.level(0-100) \n 3.level(0-1000) \n");
levels=tahmin.nextInt();
           if (levels==1) {
           sayi1=10;
           hak=5;
           puan=50;
           kontrol=false;
        }else if (levels==2) {
            sayi1=100;
            hak=10;
            puan=100;
            kontrol=false;
        }else if(levels==3) {
            sayi1=1000;
            hak=15;
            puan=200;
            kontrol=false;
        }
        else{
            System.out.println("Lütfen sadece 1,2 veya 3 degeri giriniz");
            kontrol=true;
        }
        }
        
  //level seçim ve kotrol son
  //random sayı tutma başlangıç
sayi = rnd.nextInt(sayi1);//0 ile 10 arasında(10 hariç) sayı üretip sayi değişkenine atacak
  //random sayı tutma son
  //tahmin etme ve kontrol alanı başlangıç
while (hak>0) {
            System.out.println("Tahmin giriniz...");
            girilen=tahmin.nextInt();
            if (girilen<sayi1) {
            if (girilen==sayi) {
                System.out.println("Sayıyı dogru tahmin ettiniz.Puanınız"+(hak*puan));
                break;
            }else if (girilen>sayi) {
                System.out.println("Lütfen tahmininizi azaltınız.\n kalan hakkınız: "+(hak-1));
                
            }else if(girilen<sayi){
                System.out.println("Lütfen tahmininizi arttırınız.\n kalan hakkınız: "+(hak-1));
                
            }
            hak-=1;
            }else{
                System.out.println("lütfen 0-"+sayi1+" arasında sayılar giriniz");
            }
          
        }
  //tahmin etme ve kontrol alanı son
}
}