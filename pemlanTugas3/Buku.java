import java.io.*;

class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private static final String FILE_NAME = "dataBuku.txt"; //memberi nama file untuk menyimpan data buku

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    //Menata informasi buku pada file txt
    public String toString() {
        return judul + ", " + penulis + ", " + tahunTerbit;
    }

    //method untuk menampilkan semua informasi 
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
    
    //method overlod untuk menampilkan informasi judul buku sajaa
    public void tampilkanInfo(boolean ringkas) {
        if (ringkas) {
            System.out.println("Judul: " + judul);
        } else {
            tampilkanInfo();
        }
    }

    public void simpanKeFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(this.toString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data buku.");
        }
    }

    public static void tampilkanDaftarBuku(boolean ringkas) {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("Belum ada buku yang terdaftar.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("Daftar Buku:");
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(", ");
                if (data.length == 3) {
                    Buku buku = new Buku(data[0], data[1], Integer.parseInt(data[2]));
                    buku.tampilkanInfo(ringkas);
                    System.out.println("----------------------");
                }
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca data buku.");
        }
    }
}