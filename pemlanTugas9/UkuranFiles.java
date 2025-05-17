import java.io.File;

public class UkuranFiles {
    public static void main(String[] args) {
        File direktori = new File("."); 
        
        if (direktori.exists() && direktori.isDirectory()) {
            File[] files = direktori.listFiles();
            
            if (files != null) {
                System.out.println("Daftar file dan ukurannya:");
                for (File file : files) {
                    if (file.isFile()) {
                        long ukuranBytes = file.length();
                        String ukuranFormat = formatUkuran(ukuranBytes);
                        System.out.println("- " + file.getName() + ": " + ukuranFormat);
                    }
                }
            }
        } else {
            System.out.println("Direktori tidak ditemukan atau bukan direktori.");
        }
    }

    public static String formatUkuran(long bytes) {
        double ukuranKB = bytes / 1024.0;
        double ukuranMB = ukuranKB / 1024.0;
        
        if (ukuranMB >= 1.0) {
            return String.format("%.2f MB", ukuranMB);
        } else {
            return String.format("%.2f KB", ukuranKB);
        }
    }
}