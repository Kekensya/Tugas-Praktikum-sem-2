import java.util.Scanner;

public class MainAkun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        InfoAkun[] daftarPelanggan = new InfoAkun[3];
        daftarPelanggan[0] = new InfoAkun(1000000, "keken", "3812345678", 9876);
        daftarPelanggan[1] = new InfoAkun(4000000, "Renton", "5612345678", 2222);
        daftarPelanggan[2] = new InfoAkun(9000000, "andy", "7412345678", 1212);

        System.out.println("====Selamat Datang di Transaksi Tiny====");

        InfoAkun akun = null;
        int percobaanNoPel = 0; //jumlah percobaan input nomor pelanggan

        
        while (percobaanNoPel < 3) {
            System.out.println("Masukkan nomor pelanggan anda: ");
            String nomorPel = scan.nextLine();
            
            akun = InfoAkun.mencariPelanggan(daftarPelanggan, nomorPel);
            
            if (akun != null) {
                System.out.println("Pelanggan ditemuka");
                break; // Keluar dari loop jika pelanggan ditemukan
            } else {
                percobaanNoPel++;
                System.out.println("Pelanggan tidak ditemukan silakan coba lagi remaining attemps: " + (3 - percobaanNoPel));
            }
        }

        
        if (akun == null) {
            System.out.println("Anda telah 3 kali gagal memasukkan nomor pelanggan. Silakan coba lagi nanti.");
            return; // Hentikan program
        }

        // jika pelanggan ditemukan, lanjut ke verifikasi pin
        int percobaanPin = 0;
        while (percobaanPin < 3) {
            System.out.println("Masukkan PIN Anda: ");
            int inputPin = scan.nextInt();

            if (akun.cekPin(inputPin)) {
                System.out.println("Login sukses");
                break;
            } else {
                percobaanPin++;
                System.out.println("PIN Anda salah remaining attemps: " + (3 - percobaanPin));

                if (percobaanPin == 3) {
                    akun.block();
                    System.out.println("Akun Anda telah diblokir.");
                    return; // Hentikan program jika akun diblokir
                }
            }
        }

        // Jika lolos verifikasi PIN, tampilkan menu transaksi
        System.out.println("\nSelamat datang pelanggan " + akun.getnama());
        System.out.println("====Silahkan pilih====");
        System.out.println("1. <- Pembelian");
        System.out.println("2. <- Top up");
        System.out.print("Opsi: ");
        int pilihan = scan.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih pembelian");
                System.out.println("Masukkan nominal: ");
                double jumlahPembelian = scan.nextDouble();
                akun.Pembelian(jumlahPembelian);
                break;

            case 2:
                System.out.println("Anda memilih top up");
                System.out.println("Masukkan nominal top up: ");
                double jumlahTopUp = scan.nextDouble();
                akun.topUp(jumlahTopUp);
                break;
        }
    }
}
