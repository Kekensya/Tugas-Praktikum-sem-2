import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortTim {
    public static void main(String [] args){
        
        //Data Tim A
        List<Anggota> timA = Arrays.asList(
            new Anggota( 168, 50),
            new Anggota( 170, 60),
            new Anggota( 165, 56),
            new Anggota( 168, 55),
            new Anggota( 172, 60),
            new Anggota( 170, 70),
            new Anggota( 169, 66),
            new Anggota( 165, 56),
            new Anggota( 171, 72),
            new Anggota( 166, 56)
        );

        //Menata tinggi tim A secara ascending dan decending
        timA.sort(Comparator.comparingInt(a -> a.getTinggi()));
        System.out.println(">==== Tabel Tim A tinggi badan secara ascending ====<");
        for (Anggota a : timA) {
            System.out.println(a);
        }

        System.out.println("");
        
        timA.sort(Comparator.comparingInt((Anggota a) -> a.getTinggi()).reversed());
        System.out.println(">==== Tabel Tim A tinggi badan secara decending ====<");
        for (Anggota a : timA) {
            System.out.println(a);


        }

        System.out.println("");

        //Menata berat tim A secara ascending dan decending
        timA.sort(Comparator.comparingInt(a -> a.getBerat()));
        System.out.println(">==== Tabel Tim A berat badan secara ascending ====<");
        for (Anggota a : timA){
            System.out.println(a);
        }

        System.out.println("");

        timA.sort(Comparator.comparingInt((Anggota a) -> a.getBerat()).reversed());
        System.out.println(">==== Tabel Tim A berat badan secara decending ====<");
        for (Anggota a : timA){
            System.out.println(a);
        }

        System.out.println("");

        //Data Tim B
        List<Anggota> timB = Arrays.asList(
            new Anggota(170, 66),
            new Anggota(167, 60),
            new Anggota(165, 59),
            new Anggota(166, 58),
            new Anggota(168, 58),
            new Anggota(175, 71),
            new Anggota(172, 68),
            new Anggota(171, 68),
            new Anggota(168, 65),
            new Anggota(169, 60)
        );

        //Menata tinggi tim B secara ascending dan decending
        timB.sort(Comparator.comparingInt(a -> a.getTinggi()));
        System.out.println(">==== Tabel Tim B tinggi badan secara ascending ====<");
        for (Anggota a : timB) {
            System.out.println(a);
        }

        System.out.println("");
        
        timB.sort(Comparator.comparingInt((Anggota a) -> a.getTinggi()).reversed());
        System.out.println(">==== Tabel Tim B tinggi badan secara descending ====<");
        for (Anggota a : timB) {
            System.out.println(a);
        }

        System.out.println("");

        //Menata berat   tim B secara ascending dan decending
        timB.sort(Comparator.comparingInt(a -> a.getBerat()));
        System.out.println(">==== Tabel Tim B berat badan secara ascending ====<");
        for (Anggota a : timB) {
            System.out.println(a);
        }

        System.out.println("");

        timB.sort(Comparator.comparingInt((Anggota a) -> a.getBerat()).reversed());
        System.out.println(">==== Tabel Tim B berat badan secara descending ====<");
        for (Anggota a : timB) {
            System.out.println(a);
        }

        //Mencari nilai maksimum dan minimum tinggi badan dan berat badan Tim A dan Tim B
        Anggota tinggiMaksA = Collections.max(timA, Comparator.comparingInt(Anggota::getTinggi));
        Anggota beratMaksA = Collections.max(timA, Comparator.comparingInt(Anggota::getBerat));
        Anggota tinggiMinA = Collections.min(timA, Comparator.comparingInt(Anggota::getTinggi));
        Anggota beratMinsA = Collections.min(timA, Comparator.comparingInt(Anggota::getBerat));  

        System.out.println("");

        System.out.println("--- Tim A Min/Max ---");
        System.out.println("Tinggi maksimum untuk tim A adalah " + tinggiMaksA.getTinggi() + " cm");
        System.out.println("Berat maksimum untuk tim A adalah " + beratMaksA.getBerat() + " kg");
        System.out.println("Tinggi minimum untuk tim A adalah " + tinggiMinA.getTinggi() + " cm");
        System.out.println("Berat minimum untuk tim A adalah " + beratMinsA.getBerat() + " kg");

        System.out.println("");

        Anggota tinggiMaksB = Collections.max(timB, Comparator.comparingInt(Anggota::getTinggi));
        Anggota beratMaksB = Collections.max(timB, Comparator.comparingInt(Anggota::getBerat));
        Anggota tinggiMinB = Collections.min(timB, Comparator.comparingInt(Anggota::getTinggi));
        Anggota beratMinsB = Collections.min(timB, Comparator.comparingInt(Anggota::getBerat));

        System.out.println("--- Tim B Min/Max ---");
        System.out.println("Tinggi maksimum untuk tim B adalah " + tinggiMaksB.getTinggi() + " cm");
        System.out.println("Berat maksimum untuk tim B adalah " + beratMaksB.getBerat() + " kg");
        System.out.println("Tinggi minimum untuk tim B adalah " + tinggiMinB.getTinggi() + " cm");
        System.out.println("Berat minimum untuk tim B adalah " + beratMinsB.getBerat() + " kg");

        //Menaruh seluruh anggota tim B ke tim C
        List<Anggota> timC = Arrays.asList(
            new Anggota(170, 66),
            new Anggota(167, 60),
            new Anggota(165, 59),
            new Anggota(166, 58),
            new Anggota(168, 58),
            new Anggota(175, 71),
            new Anggota(172, 68),
            new Anggota(171, 68),
            new Anggota(168, 65),
            new Anggota(169, 60)
            );

        System.out.println("");

        //Mencari tinggi badan spesifik di tim B
        long countTimBTinggi168 = timB.stream().filter(a -> a.getTinggi() == 168).count();
        long countTimBTinggi160 = timB.stream().filter(a -> a.getTinggi() == 160).count();
        System.out.println("\n--- Mencari tinggi Tim B ---");
        System.out.println("Jumlah pemain Tim B dengan tinggi 168 cm: " + countTimBTinggi168);
        System.out.println("Jumlah pemain Tim B dengan tinggi 160 cm: " + countTimBTinggi160);

        System.out.println("");

        //Mencari tinggi badan spesifik di tim A
        long countTimABerat56 = timA.stream().filter(a -> a.getBerat() == 56).count();
        long countTimABerat53 = timA.stream().filter(a -> a.getBerat() == 53).count();
        System.out.println("\n--- Mencari berat Tim A ---");
        System.out.println("Jumlah pemain Tim A dengan berat 56 kg: " + countTimABerat56);
        System.out.println("Jumlah pemain Tim A dengan berat 53 kg: " + countTimABerat53);

        Set<Integer> tinggiTimA = timA.stream().map(Anggota::getTinggi).collect(Collectors.toSet());
        Set<Integer> beratTimA = timA.stream().map(Anggota::getBerat).collect(Collectors.toSet());

        boolean commonHeightFound = false;
        boolean commonWeightFound = false;

        for (Anggota anggotaB : timB) {
            if (tinggiTimA.contains(anggotaB.getTinggi())) {
                commonHeightFound = true;
                break; 
            }
        }

        for (Anggota anggotaB : timB) {
            if (beratTimA.contains(anggotaB.getBerat())) {
                commonWeightFound = true;
                break; 
            }
        }

        System.out.println("\n--- Perbandingan Tim A dan Tim B ---");
        if (commonHeightFound) {
            System.out.println("Ya, ada pemain di Tim A yang memiliki tinggi badan yang sama dengan pemain di Tim B.");
        } else {
            System.out.println("Tidak ada pemain di Tim A yang memiliki tinggi badan yang sama dengan pemain di Tim B.");
        }

        if (commonWeightFound) {
            System.out.println("Ya, ada pemain di Tim A yang memiliki berat badan yang sama dengan pemain di Tim B.");
        } else {
            System.out.println("Tidak ada pemain di Tim A yang memiliki berat badan yang sama dengan pemain di Tim B.");
        }
        
    }
    
}
