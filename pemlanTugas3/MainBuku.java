import java.util.Scanner;

public class MainBuku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Daftar Buku Lengkap");
            System.out.println("3. Tampilkan Daftar Buku Ringkas");
            System.out.println("4. Keluar");
            System.out.print("Opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                 System.out.println("Masukkan 0 untuk balik ke menu");
                 System.out.print("Masukkan judul buku: ");
                 String judul = scanner.nextLine();
                 if (judul.equals("0")) break;
                 
                 System.out.print("Masukkan penulis: ");
                 String penulis = scanner.nextLine();
                 if (penulis.equals("0")) break;
                 
                 System.out.print("Masukkan tahun terbit: ");
                 if (!scanner.hasNextInt()) {
                    System.out.println("Input tidak valid.");
                    scanner.nextLine(); 
                    break;
                }
                
                int tahunTerbit = scanner.nextInt();
                scanner.nextLine();
                if (tahunTerbit == 0) break;
                
                Buku buku = new Buku(judul, penulis, tahunTerbit);
                buku.simpanKeFile();
                System.out.println("Buku berhasil ditambahkan!");
                break;

                case 2:
                    System.out.println("Daftar buku lengkap");
                    Buku.tampilkanDaftarBuku(false);
                    break;

                case 3:
                    System.out.println("Daftar buku ringkas");
                    Buku.tampilkanDaftarBuku(true);
                    break;

                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 4);

        scanner.close();
    }
}
