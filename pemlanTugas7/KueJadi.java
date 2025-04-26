public class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * jumlah * 2;  // Harga = harga per buah × jumlah × 2
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nJenis: Kue Jadi" + 
               "\nJumlah: " + jumlah + " buah";
    }

    public double getJumlah(){
        return jumlah;
    }

}
