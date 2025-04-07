public class Aritmatika {

    // Method untuk menghitung penjumlahan
    public void hitungPenjumlahan(int a, int b) {
        hitungPerkalian(a,b); //Jawaban nomor 4 bagian a
        int nilai = a + b;
        System.out.println("Nilai penjumlahan adalah: " + nilai);
    }

    // Method untuk menghitung perkalian
    public static void hitungPerkalian(int a, int b) {
        
        int nilai = a * b;
        System.out.println("Nilai perkalian adalah: " + nilai);

        //Jawaban nomor 5 bagian a
        //hitJum.hitungPenjumlahan(a, b); //akan error jika dipanggil disini

    }

    // Method untuk menghitung pengurangan
    public static void hitungPengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("Nilai pengurangan adalah: " + nilai);
    }

    public double hitungPembagian(String nil1, String nil2) { //Jawaban nomor 6 bagian a
        try {
            double angka1 = Double.parseDouble(nil1);
            double angka2 = Double.parseDouble(nil2);
            if (angka2 == 0) {
                throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
            }
            return angka1 / angka2;
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Harap masukkan angka yang benar.");
            return 0; // Mengembalikan 0 jika terjadi kesalahan
        }
    }

}