import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("====Kelas Manusia====");
        Manusia m1 = new Manusia("Yuito", "112", true, true);
        System.out.println(m1.toString());
        System.out.println("");

        Manusia m2 = new Manusia("Kasane", "132", false, true);
        System.out.println(m2.toString());
        System.out.println("");

        Manusia m3 = new Manusia("Shen", "122", false, false);
        System.out.println(m3.toString());
        System.out.println("");

        System.out.println("====Kelas MahasiswaFilkom====");
        MahasiswaFilkom mf1 = new MahasiswaFilkom("Sakura", "2022344", false, false, "2012344", 2.9);
        System.out.println(mf1.toString());
        System.out.println("");

        MahasiswaFilkom mf2 = new MahasiswaFilkom("Andy", "2032344", true, false, "2112347", 3.4);
        System.out.println(mf2.toString());
        System.out.println("");

        MahasiswaFilkom mf3 = new MahasiswaFilkom("Linus", "2012344", true, false, "2412342", 3.8);
        System.out.println(mf3.toString());
        System.out.println("");

        System.out.println("====Kelas Pekerja====");
        Pekerja pe1 = new Pekerja("Allen", "1223445", true, true, 1000.0, LocalDate.of(2023, 3, 2), 2);
        System.out.println(pe1.toString());
        System.out.println("");

        Pekerja pe2 = new Pekerja("Barry", "2223445", true, true, 1000.0, LocalDate.of(2016, 1, 3), 1);
        System.out.println(pe2.toString());
        System.out.println("");

        Pekerja pe3 = new Pekerja("Savitar", "3223445", true, true, 1000.0, LocalDate.of(2005, 1, 3), 10);
        System.out.println(pe3.toString());
        System.out.println("");

        System.out.println("====Kelas Manager====");
        Manager ma = new Manager("IT", "Rain", "3456", true, true, 7500, LocalDate.of(2010, 4, 3), 2);
        System.out.println(ma);
        System.out.println("");
        


    }
}
