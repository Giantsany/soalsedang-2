import java.util.Scanner;
public class soalsedang2 {
    static double hitungVolume(double jari, double tinggi) {
        double phi = 3.14;
        double volume = phi * jari * jari * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari tabung: ");
        double jari = input.nextDouble();
        
        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = input.nextDouble();

        double hasil = hitungVolume(jari, tinggi);
        System.out.println("Volume tabung adalah: " + hasil);
    }
}
