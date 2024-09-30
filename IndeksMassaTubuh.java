package pert5;

/**
 *
 * @author iwana
 */
import java.util.Scanner;
public class IndeksMassaTubuh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Berat dan Tinggi Badan
        System.out.print("Masukkan Berat Badan (kg): ");
        double beratBadan = input.nextDouble();
        System.out.print("Masukkan Tinggi Badan (m): ");
        double tinggiBadan = input.nextDouble();

        double imt = beratBadan / (tinggiBadan * tinggiBadan);  // Menghitung IMT
        String kriteria;    // Menentukan Kriteria Berdasarkan IMT

        if (imt <= 18.4) {
            kriteria = "Berat Badan Kurang";
        } else if (imt <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (imt <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (imt <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }

        // Menampilkan Output yang Rapi
        System.out.println("\n---------- Hasil Pengukuran IMT ------------");
        System.out.println("Berat Badan (kg):"+ beratBadan);
        System.out.println("Tinggi Badan (m)"+ tinggiBadan);
        System.out.println("IMT (kg/m^2)"+ imt);
        System.out.println("Kriteria"+ kriteria);
        System.out.println("--------------------------------------------");
    }
}
