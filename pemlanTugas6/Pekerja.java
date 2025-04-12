import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, String nik, boolean jenisKelamin, boolean menikah,
                   double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    // Setter
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    // Getter
    public double getGaji() {
        return gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public double getBonus() {
        int tahunKerja = Period.between(tahunMasuk, LocalDate.now()).getYears();
        if (tahunKerja <= 5) {
            return gaji * 0.05;
        } else if (tahunKerja <= 10) {
            return gaji * 0.10;
        } else {
            return gaji * 0.15;
        }
    }

    @Override
    public double getPendapatan() {
        return gaji + getBonus() + super.getTunjangan() + (jumlahAnak * 20.0);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "tahun masuk : " + tahunMasuk.getDayOfMonth() + " " + tahunMasuk.getMonthValue() + " " + tahunMasuk.getYear() + "\n" +
               "jumlah anak : " + jumlahAnak + "\n" +
               "gaji : " + gaji;
    }
}