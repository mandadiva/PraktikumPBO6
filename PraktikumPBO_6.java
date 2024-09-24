package praktikum6;

public class PraktikumPBO_6 {
    public static void main(String[] args) {
        Hewan hewan = new Kucing();
        hewan.bersuara(); // Output: Meong
        
        Kucing kucing = new Kucing();
        kucing.makan("ikan"); // Memanggil metode makan() dari kelas Hewan
        kucing.makan("ikan ", 2); // Memanggil metode makan() yang overload
        
        Anjing anjing = new Anjing();
        anjing.bersuara(); // Output gukgukguk
        anjing.makan("daging", 3); // Memanggil metode makan () yang overload pada kelas Hewan
    }
}
