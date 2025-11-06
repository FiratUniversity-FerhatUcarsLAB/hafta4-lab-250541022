/*
 * Ad Soyad: Elif Babürhan
 * Ogrenci No: 250541022
 * Tarih: 05/11/2025
 * Aciklama: Gorev 3 - Maas Hesap
 * Bir çalışanın maaş bilgilerini hesaplayan detaylı bir program yazılır
 * 
 */

 import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        // sabitler
        final double SGKKesintisi = 0.14;
        final double GelirVergisi = 0.15;
        final double DamgaVergisi = 0.759;

        System.out.println("===MAAS HESAPLAMA SISTEMI===");

        //Kullanıcıdan alınacak bilgiler
        System.out.print ("Çalışan ad soyad : ") ;
        String adSoyad = input.nextLine();
        System.out.print("Aylık Burut Maas (TL): ");
        double BrutMaas = input.nextDouble();
        System.out.print("Haftalık Çalışma Saati: ");
        int CalısmaSaati = input.nextInt();
        System.out.print("Mesai Saati: ");
        int MesaiSaati= input.nextInt();

        //Hesaplanacaklar
        //Toplam Gelir
        double mesaiUcreti = (brutMaas / 160) * MesaiSaati * 1.5;
        double ToplamGelir = (brutMaas + mesaiUcreti);

        //Kesintiler
        double SGKKesinti = ToplamGelir * SGK_ORANI;
        double GelirVergisi = ToplamGelir * GelirVergisi_ORANI;
        double DamgaVergisi = ToplamGelir * DamgaVergisi_ORANI;
        double ToplamKesinti = SGK + GelirVergisi + DamgaVergisi;
        double NetMaas = ToplamGelir - ToplamKesinti;

        //İstatistik
        double KesintiOranıYuzde = (ToplamKesinti / ToplamGelir)* 100.0;
        double SaatlikNetKazanc = NetMaas / 176.0;
        double GunlukNetKazanc = NetMaas / 22.0;

        //MaasBordrosu
        System.out.println("\n========================");
        System.out.println("      MAAS BORDROSU       ");
        System.out.println("==========================");
        System.out.println("Calısan:" + AdSoyad);
        System.out.println("\nGELIRLER:");
        System.out.printf("Brut Maas : %.2f TL%n", BrutMaas);
        System.out.printf("Mesai ucreti ("MesaiSaati"+ Saat) : %.2f TL%n",MesaiUcreti) ;
        System.out.printf("Toplam Gelir : %.2f TL%n ", ToplamGelir);
        System.out.println("\nKESINTILER:");
        System.out.printf(" SGK Kesintisi (14.0%%)      : %.2f TL%n", SGKKesinti );
        System.out.printf(" Gelir Vergisi (15.0%%)      : %.2f TL%n", GelirVergisiKesinti);
        System.out.printf(" Damga Vergisi (0.8%%)       : %.2f TL%n", DamgaVergisiKesinti);
        System.out.println(" ----------------------------");
        System.out.printf(" Toplam Kesinti              : %.2f TL%n", ToplamKesinti);
        System.out.printf("\nNET MAAS                     : %.2f TL%n", NetMaas);
        System.out.println("ISTATISTIKLER: ");
        System.out.printf(" Kesinti Orani               : %.1f TL%n", KesintiOraniYuzde);
        System.out.printf(" Saatlik Net Kazanc          : %.2f TL/saat%n", SaatlikMaas);
        System.out.printf(" Gunluk Net Kazanc           : %.2f TL/gun%n", GunlukMaas);
        System.out.println("============================================");

        // Scanner objesi kapat
        scan.close();

    }
}
