package pert5;

/**
 *
 * @author iwana
 */
import java.util.Scanner;
public class PenilaianAkhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Buat Memasukkan Data Mahasiswa
        System.out.print("NPM: ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        double nilaiAkhir = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);  // Menghitung Nilai Rata-rata Akhir
        String grade, keterangan; // Menentukan Grade dan Keterangan
        
        if (nilaiAkhir >= 75 && nilaiAkhir <= 100) {
            grade = "A";
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "BAIK";
        } else if (nilaiAkhir > 55 && nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir > 45 && nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "KURANG";
        } else {
            grade = "E";
            keterangan = "KURANG SEKALI";
        }
        

        // Tampilan Output (-13.s itu format untuk memastikan semua kolom memiliki ruang yang sama biar keliatan rapih layout output nya)
        System.out.println("\n----- Hasil Akhir ---------------");
        System.out.println("| NPM Mahasiswa  : "+ npm);
        System.out.println("| Nama Mahasiswa : "+ nama);
        System.out.println("| Nilai Akhir    : "+ nilaiAkhir);
        System.out.println("| Grade          : "+ grade);
        System.out.println("| Keterangan     : "+ keterangan);
        System.out.println("---------------------------------");
    }
}
