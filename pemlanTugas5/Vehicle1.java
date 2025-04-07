public class Vehicle1 {
    private double load;
    private final static double maxLoad = 10000.0; // Menambahkan titik desimal

    // Constructor default (dapat ditambahkan jika diperlukan)
    // public Vehicle1(double max) {
    //     this.maxLoad = max; // Ini akan menyebabkan error karena maxLoad final
    // }

    public double getLoad() {
        return this.load;
    }

    public double getMaxLoad() {
        return this.maxLoad;
    }

    public boolean addBox(double weight) {
        double temp = this.load + weight;
        if (temp <= maxLoad) {
            this.load = temp; // Memperbarui load dengan nilai temp
            return true;
        } else {
            return false;
        }
    }
}