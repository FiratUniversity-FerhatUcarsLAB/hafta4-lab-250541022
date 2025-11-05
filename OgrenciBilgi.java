/*
 * Ad Soyad: Elif Babürhan
 * Ogrenci No: 250541022
 * Tarih: 05/11/2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;
public class Ogrencibilgisistemi {
    public static void main(String[] args)
        Scanner input = new Scanner(System.in);

    System.out.println("===Ogrencibilgisistemi===");
    int n = input.nextInt();
    
    // adini iste
    System.out.println("Adinizi giriniz:");
    String adi = input.nextLine();

    // soyadını iste
    System.out.println("Soyadınızı giriniz:");
    String soyad = input.nextLine();

    //örenci numarasını iste
    System.out.println("Oğrenci numaranızı giriniz:");
    int numara = input.nextLine();

    // yasını iste
    System.out.println("Yasınızı giriniz:");
    int yas = input.nextInt();

    // GPA notunu iste
    System.out.println("GPA notunuzu giriniz:");
    double GPA = input.nextDouble();

    // GPA notuna göre başarı durumu kontrol edilir

    String BasariDurumu;
    if(gpa > = 2) {
        BasariDurumu = "Basarili Ogrenci";
    }
    else if(gpa < = 2) {
        BasariDurumu = "Basarisiz Ogrenci";
    }
    System.out.println("===Ogrencibilgisistemi===");
    System.out.println("Ad Soyad:" adi + soyad);
    System.out.println("Ogrenci numarası:" + numara );
    System.out.println("Yas: " + yas );
    System.out.println("GPA : %.2f%n", GPA );

    input.close();
}
