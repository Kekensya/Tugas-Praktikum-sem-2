import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); //Jawaban untuk nomor 4 

        System.out.println("Masukkan Jumlah siswa");
        int jumlahStudent = scan.nextInt();
        scan.nextLine();

        Student[] students = new Student[jumlahStudent];

        System.out.println("========== Memasukkan data siswa ==========");
        for(int i =0 ; i < jumlahStudent ; i++){

            System.out.println("Data siswa ke-" + (i + 1));
            System.out.println("Masukkan nama siswa ke-" + (i + 1));
            String nama = scan.nextLine();

            System.out.println("Masukkan alamat siswa ke-" + (i + 1));
            String alamat = scan.nextLine();

            System.out.println("Masukkan umur siswa ke-" + (i + 1));
            int umur = scan.nextInt();

            System.out.println("Masukkan nilai math siswa ke-" + (i + 1));
            int nilaiMath = scan.nextInt();

            System.out.println("Masukkan nilai english siswa ke-" + (i + 1));
            int nilaiEnglish = scan.nextInt();

            System.out.println("Masukkan nilai science siswa ke-" + (i + 1));
            int nilaiScience = scan.nextInt();
            scan.nextLine();

            students[i] = new Student(nama, alamat, umur);
            students[i].setMath(nilaiMath);
            students[i].setEnglish(nilaiEnglish);
            students[i].setScience(nilaiScience);
            students[i].displayMessage();

            System.out.println("==============================");

            
        }

        System.out.println("");
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();

        // Menggunakan constructor lain
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();

        // Siswa dengan nama Anna dirubah informasi alamat dan umurnya melalui constructor
        System.out.println("===================");
        anna = new Student("Anna", "Batu", 18);
        anna.displayMessage();

        // Siswa dengan nama Chris dirubah informasi alamat dan umurnya melalui method
        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();

        //Jawaban untuk nomor 2 untuk membuat objek dengan constructor lain
        System.out.println("===================");
        Student Andy = new Student(80,90,70);
        Andy.setName("Andy");
        Andy.setAddress("Jakarta");
        Andy.setAge(20);
        Andy.displayMessage();

        System.out.println("=================== menghitung jumlah object ===============");
        Student.jumlahObject(); //Jawaban untuk nomor 5

    }
}

