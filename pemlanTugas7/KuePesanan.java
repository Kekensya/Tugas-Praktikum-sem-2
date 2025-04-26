public class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String nama, double harga,double berat){
        super(nama, harga);
        this.berat = berat;
    }

    @Override
    public double hitungHarga(){
        return getHarga()*berat;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nJenis: Kue Pesanan" + 
               "\nBerat: " + berat + " kg";
    }

    //getters
    public double getBerat(){
        return berat;
    }
}
