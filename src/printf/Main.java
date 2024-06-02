package printf;

public class Main {
    public static void main(String[] args) {
        // Değişkenlerin tanımlanması
        int tamsayi = 123;
        double ondalik = 123.456;
        String yazi = "Merhaba";
        char karakter = 'A';
        boolean dogruYanlis = true;

        // Temel format belirteçleri
        System.out.printf("Tamsayı: %d\n", tamsayi); // %d: Ondalık tamsayı format belirteci
        System.out.printf("Ondalık: %.2f\n", ondalik); // %.2f: Ondalık sayı, 2 basamak hassasiyetle
        System.out.printf("Yazı: %s\n", yazi); // %s: String (dize) format belirteci
        System.out.printf("Karakter: %c\n", karakter); // %c: Tek bir karakter format belirteci
        System.out.printf("Boolean: %b\n", dogruYanlis); // %b: Boolean (true/false) format belirteci
        System.out.printf("Hexadecimal: %x\n", tamsayi); // %x: Ondalık sayının onaltılık (hexadecimal) temsili
        System.out.printf("Octal: %o\n", tamsayi); // %o: Ondalık sayının sekizlik (octal) temsili
        System.out.printf("Yüzde işareti: %%\n"); // %%: Yüzde işareti

        // Genişlik ve hassasiyet belirleme
        System.out.printf("Genişlik belirleme (10): %10d\n", tamsayi); // %10d: Genişlik 10 karakter, sağa hizalanmış
        System.out.printf("Hassasiyet belirleme: %.2f\n", ondalik); // %.2f: Ondalık sayı, 2 basamak hassasiyetle

        // Sıfır dolgu
        System.out.printf("Sıfır dolgu (5): %05d\n", tamsayi); // %05d: Genişlik 5 karakter, sıfırlarla doldurulmuş

        // Sol hizalama
        System.out.printf("Sol hizalama (-10): %-10d!\n", tamsayi); // %-10d: Genişlik 10 karakter, sola hizalanmış

        // Artı işareti
        System.out.printf("Artı işareti: %+d\n", tamsayi); // %+d: Pozitif sayılar için artı işareti

        // Tüm özellikleri bir arada kullanma
        System.out.printf("Genişlik 10, sıfır dolgu, artı işareti: %+010d\n", tamsayi); // %+010d: Genişlik 10, sıfır dolgu, artı işareti
        System.out.printf("Genişlik 10, sol hizalama: %-10s!\n", yazi); // %-10s: Genişlik 10, sola hizalama

        // Karmaşık örnekler
        System.out.printf("Genişlik 15, sıfır dolgu, artı işareti: %+015d\n", tamsayi); // %+015d: Genişlik 15, sıfır dolgu, artı işareti
        System.out.printf("Genişlik 15, sol hizalama: %-15s!\n", yazi); // %-15s: Genişlik 15, sola hizalama
        System.out.printf("Genişlik 15, ondalık hassasiyet: %15.3f\n", ondalik); // %15.3f: Genişlik 15, 3 basamak hassasiyet
        System.out.printf("Genişlik 15, negatif ondalık hassasiyet: %15.3f\n", -ondalik); // %15.3f: Genişlik 15, negatif değer, 3 basamak hassasiyet
        System.out.printf("Negatif sayı, genişlik 15, sıfır dolgu, artı işareti: %+015d\n", -tamsayi); // %+015d: Negatif sayı, genişlik 15, sıfır dolgu, artı işareti

        // Yeni kombinasyonlar
        System.out.printf("Genişlik 20, sıfır dolgu, artı işareti: %+020d\n", tamsayi); // %+020d: Genişlik 20, sıfır dolgu, artı işareti
        System.out.printf("Genişlik 20, sol hizalama: %-20s!\n", yazi); // %-20s: Genişlik 20, sola hizalama
        System.out.printf("Genişlik 20, ondalık hassasiyet: %20.4f\n", ondalik); // %20.4f: Genişlik 20, 4 basamak hassasiyet
        System.out.printf("Genişlik 20, negatif ondalık hassasiyet: %20.4f\n", -ondalik); // %20.4f: Genişlik 20, negatif değer, 4 basamak hassasiyet
        System.out.printf("Negatif sayı, genişlik 20, sıfır dolgu, artı işareti: %+020d\n", -tamsayi); // %+020d: Negatif sayı, genişlik 20, sıfır dolgu, artı işareti
        System.out.printf("Genişlik 8, sıfır dolgu, artı işareti: %+08d\n", tamsayi); // %+08d: Genişlik 8, sıfır dolgu, artı işareti
        System.out.printf("Genişlik 8, sol hizalama: %-8s!\n", yazi); // %-8s: Genişlik 8, sola hizalama
        System.out.printf("Genişlik 8, ondalık hassasiyet: %8.1f\n", ondalik); // %8.1f: Genişlik 8, 1 basamak hassasiyet
        System.out.printf("Genişlik 8, negatif ondalık hassasiyet: %8.1f\n", -ondalik); // %8.1f: Genişlik 8, negatif değer, 1 basamak hassasiyet
        System.out.printf("Negatif sayı, genişlik 8, sıfır dolgu, artı işareti: %+08d\n", -tamsayi); // %+08d: Negatif sayı, genişlik 8, sıfır dolgu, artı işareti
        System.out.printf("Genişlik 5, sıfır dolgu, artı işareti: %+05d\n", tamsayi); // %+05d: Genişlik 5, sıfır dolgu, artı işareti
        System.out.printf("Genişlik 5, sol hizalama: %-5s!\n", yazi); // %-5s: Genişlik 5, sola hizalama
        System.out.printf("Genişlik 5, ondalık hassasiyet: %5.2f\n", ondalik); // %5.2f: Genişlik 5, 2 basamak hassasiyet
        System.out.printf("Genişlik 5, negatif ondalık hassasiyet: %5.2f\n", -ondalik); // %5.2f: Genişlik 5, negatif değer, 2 basamak hassasiyet
        System.out.printf("Negatif sayı, genişlik 5, sıfır dolgu, artı işareti: %+05d\n", -tamsayi); // %+05d: Negatif sayı, genişlik 5, sıfır dolgu, artı işareti
    }
}
