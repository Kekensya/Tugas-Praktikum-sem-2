public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private static double jumlahObject;
    
    public Student() {
        name = "";
        address = "";
        age = 0;
        jumlahObject++;
    }
    
    public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
        jumlahObject++;
    }
    
    //Jawaban untuk nomor 2 constructor lain dengan nilai mapel masing masing sebagai parameter
    public Student(double mathGrade, double englishGrade, double scienceGrade) {
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
        jumlahObject++;

    }
    
    public void setName(String n) {
        name = n;
    }
    
    public void setAddress(String a) {
        address = a;
    }
    
    public void setAge(int ag) {
        age = ag;
    }
    
    public void setMath(double math) {
        mathGrade = math;
    }
    
    public void setEnglish(double english) {
        englishGrade = english;
    }
    
    public void setScience(double science) {
        scienceGrade = science;
    }
    
    private double getAverage() {
        return (mathGrade + scienceGrade + englishGrade) / 3;
    }

    //Jawaban untuk nomor 3 method statusAkhir
    public boolean statusAkhir() {
        double average = getAverage();
        return average >= 61; //lolos jika true dan remidi jika false
    }
    
    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beramalat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata-rata " + getAverage());
        boolean status = statusAkhir();
        if (status) {
            System.out.println("Status: Lolos");
        } else {
            System.out.println("Status: Remidi");
        }
        
    }

    //Jawaban untuk nomor 5 untuk membuat dan display jumlah object yang dibuat
    public static void jumlahObject(){
        System.out.println("Jumlah objek yang student adalah " + jumlahObject);
    }
}
