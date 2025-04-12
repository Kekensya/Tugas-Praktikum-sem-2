public class Manusia{
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia (String nama,  String nik, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    // Setter dan Getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean getMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan(){
        if(menikah){
            return jenisKelamin ? 25.0 : 20.0;
        }
        else{
            return 15;
        }
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    @Override
    public String toString() {
        return "nama: " + nama + "\n" +
           "nik: " + nik + "\n" +
           "jenisKelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan") + "\n" +
           "pendapatan: " + getPendapatan();
    }

    

    
}