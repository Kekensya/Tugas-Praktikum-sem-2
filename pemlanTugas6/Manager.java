import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departmen;

    public Manager(String departmen, String nama, String nik, boolean jenisKelamin, boolean menikah,
                   double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, nik, jenisKelamin, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departmen = departmen;
    }

    public void setDepartmen (String departmen){
        this.departmen = departmen;
    }

    public String getDepartmen(){
        return departmen;
    }

    public double tambahTunjangan(){
        return getGaji() * 0.10;
    }

    @Override
    public double getPendapatan(){
        return super.getPendapatan() + tambahTunjangan();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "departemen : " + departmen;
    }
}
