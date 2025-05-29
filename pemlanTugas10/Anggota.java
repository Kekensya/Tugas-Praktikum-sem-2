public class Anggota{
    private int tinggi;
    private int berat; 

    public Anggota(int tinggi, int berat){
        this.tinggi = tinggi;
        this.berat = berat;
    }

    @Override
    public String toString(){
        return "Tinggi " + tinggi + " cm dan berat " + berat + " kg";
    }

    public int getTinggi(){
        return tinggi;
    }

    public int getBerat(){
        return berat;
    }
}
