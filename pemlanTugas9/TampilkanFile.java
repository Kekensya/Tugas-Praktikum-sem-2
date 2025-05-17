import java.io.File;

public class TampilkanFile {
    public static void main(String[] args) {
        
        String directoryPath = "D:\\UBEH\\FILKOM\\Semester 2\\Pemrograman Lanjut\\PraktikumLaB\\Tugas bab 10";
        
        File directory = new File(directoryPath);
        
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            
            System.out.println("Daftar file dalam direktori " + directoryPath + ":");
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("Direktori tidak ditemukan atau bukan direktori!");
        }
    }
}