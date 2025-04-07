import java.util.Scanner;

public class MainAritmatika {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Menghitung pengurangan
        System.out.print("Masukkan nilai 1: ");
        int nil1 = in.nextInt();
        System.out.print("Masukkan nilai 2: ");
        int nil2 = in.nextInt();
        Aritmatika.hitungPengurangan(nil1, nil2);

        // Menghitung perkalian
        System.out.print("Masukkan nilai 1: ");
        nil1 = in.nextInt();
        System.out.print("Masukkan nilai 2: ");
        nil2 = in.nextInt();
        Aritmatika.hitungPerkalian(nil1, nil2);

        // Menghitung penjumlahan
        System.out.print("Masukkan nilai 1: ");
        int value1 = in.nextInt();
        System.out.print("Masukkan nilai 2: ");
        int value2 = in.nextInt();
        Aritmatika a = new Aritmatika();
        a.hitungPenjumlahan(value1, value2);

        // Menghitung pembagian
        System.out.print("Masukkan nilai 1: ");
        String nilai1 = in.next();
        System.out.print("Masukkan nilai 2: ");
        String nilai2 = in.next();
        double hasil = a.hitungPembagian(nilai1, nilai2);
        System.out.print("Hasil pembagian: " + hasil);

        in.close(); // Menutup scanner
    }
}