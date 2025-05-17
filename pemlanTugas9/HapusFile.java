import java.io.File;
import java.util.Scanner;

public class HapusFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String directoryPath = "D:\\UBEH\\FILKOM\\Semester 2\\Pemrograman Lanjut\\PraktikumLaB\\Tugas bab 10";
        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Direktori tidak ditemukan atau bukan direktori!");
            return;
        }

        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("Direktori kosong!");
            return;
        }

        // Menampilkan daftar file
        System.out.println("\nDaftar File:");
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                System.out.println((i + 1) + ". " + files[i].getName());
            }
        }

        // Menu opsi
        System.out.println("\nPilihan:");
        System.out.println("1. Hapus salah satu file");
        System.out.println("2. Hapus semua file");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan (1-3): ");
        
        int choice;
        try {
            choice = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid!");
            return;
        }

        switch (choice) {
            case 1:
                // Hapus satu file
                System.out.print("Masukkan nomor file yang akan dihapus: ");
                try {
                    int fileNumber = Integer.parseInt(scan.nextLine());
                    if (fileNumber < 1 || fileNumber > files.length) {
                        System.out.println("Nomor file tidak valid!");
                        return;
                    }
                    
                    File selectedFile = files[fileNumber - 1];
                    if (selectedFile.delete()) {
                        System.out.println("File " + selectedFile.getName() + " berhasil dihapus!");
                    } else {
                        System.out.println("Gagal menghapus file " + selectedFile.getName());
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid!");
                }
                break;
                
            case 2:
                // Hapus semua file
                boolean allDeleted = true;
                for (File file : files) {
                    if (file.isFile()) {
                        if (!file.delete()) {
                            System.out.println("Gagal menghapus file " + file.getName());
                            allDeleted = false;
                        }
                    }
                }
                if (allDeleted) {
                    System.out.println("Semua file berhasil dihapus!");
                }
                break;
                
            case 3:
                System.out.println("Program selesai.");
                break;
                
            default:
                System.out.println("Pilihan tidak valid!");
        }
        
        scan.close();
    }
}