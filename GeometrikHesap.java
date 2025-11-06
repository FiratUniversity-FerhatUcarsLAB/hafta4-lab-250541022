import  java.util.Scanner;
public class GeometrikHesap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        final double PI = 3.14159;
        System.out.println("===GEOMETRİK HESAP===");

        System.out.print("Dairenin yaricapini girin(cm):");
        double r = input.nextDouble();
        //Hesaplanacaklar
        double DaireAlanı = PI * r * r;
        double DaireCevresi = PI * 2 * r;
        double DaireCapı = 2 * r;
        double KureHacmi = PI * r * r * r * 4/3;
        double KureYuzeyAlanı = PI * r * r * 4;

        System.out.println("SONUÇ :");
    
        System.out.printf("%-18s: %8.2f cm^2%n", "Daire Alani", daireAlani);
        System.out.printf("%-18s: %8.2f cm%n", "Daire Cevresi", daireCevresi);
        System.out.printf("%-18s: %8.2f cm%n", "Daire Capi", daireCap);
        System.out.printf("%-18s: %8.2f cm^3%n", "Kure Hacmi", kureHacmi);
        System.out.printf("%-18s: %8.2f cm^2%n", "Kure Yuzey Alani", kureYuzeyAlani);

        input.close();
    }
