import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Kue daftarKue[] = new Kue[20];
        Random rands =  new Random();

        for (int i = 0 ; i < daftarKue.length ; i ++){
            String nama = "Kue " + (i+1);
            double harga = 10000 + rands.nextInt(90000);

            if(rands.nextBoolean()) { //mengacak jenis kue yang ada di array
                double berat = 0.5 + rands.nextDouble() * 4.5; // Berat antara 0.5 - 5 kg
                daftarKue[i] = new KuePesanan(nama, harga, berat);
            }else{
                int jumlah = 1 + rands.nextInt(20); // Jumlah antara 1 - 20 buah
                daftarKue[i] = new KueJadi(nama, harga, jumlah);

            }
        }

        //menampilkan semua jenis kue 
        System.out.println("============== DAFTAR SEMUA KUE ==============");
        for(Kue kue : daftarKue){
            System.out.println(kue);
            System.out.println("-------------------------------------------");
        }

        //menghitung total harga semua jenis kue
        double totalSemua = 0;
        for (Kue kue : daftarKue){
            totalSemua += kue.hitungHarga();
        }

        //menghitung total harga dan total berat dari KuePesanan
        double totalPesan = 0;
        double totalBerat = 0;
        for (Kue kue : daftarKue){
            if(kue instanceof KuePesanan) {
                totalPesan += kue.hitungHarga();
                totalBerat += ((KuePesanan)kue).getBerat();
            }

        }

        //menghitung total harga dan total berat dari KueJadi
        double totalJadi = 0;
        double totalJumlah = 0;
        for(Kue kue : daftarKue) {
            if(kue instanceof KueJadi) {
                totalJadi += kue.hitungHarga();
                totalJumlah += ((KueJadi)kue).getJumlah();
            }
        }

        //menampilkan kue yang termahal
        Kue termahal = daftarKue[0];
        for(Kue kue : daftarKue) {
            if(kue.hitungHarga() > termahal.hitungHarga()) {
                termahal = kue;
            }
        }

         // Menampilkan hasil
         System.out.println("\n============== HASIL YANG LAIN =============");
         System.out.printf("Total Harga Semua Kue: Rp%,.2f%n", totalSemua);
         System.out.println("\n---- Kue Pesanan ----");
         System.out.printf("Total Harga: Rp%,.2f%n", totalPesan);
         System.out.printf("Total Berat: %.2f kg%n", totalBerat);
         System.out.println("\n---- Kue Jadi ---- ");
         System.out.printf("Total Harga: Rp%,.2f%n", totalJadi);
         System.out.printf("Total Jumlah: %.0f buah%n", totalJumlah);
         System.out.println("\n----  Kue Termahal ---- ");
         System.out.println(termahal);
         System.out.printf("Harga Akhir: Rp%,.2f%n", termahal.hitungHarga());



    }
}
