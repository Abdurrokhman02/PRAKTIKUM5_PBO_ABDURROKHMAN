package pert5;

/**
 *
 * @author iwana
 */
import java.util.Scanner;
public class PembelianDiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Total Pembelian
        System.out.print("Total pembelian Rp. = ");
        double totalPembelian = input.nextDouble();

        // Menentukan Besar Potongan
        double potongan;
        if (totalPembelian < 50000) {
            potongan = 0.05 * totalPembelian;
        } else {
            potongan = 0.20 * totalPembelian;
        }

        double totalBayar = totalPembelian - potongan; // Menghitung Jumlah yang Harus Dibayar

        // Tampilan Output
        System.out.println("\n------- Rincian Pembayaran -----------------");
        System.out.println("Total pembelian Rp. = "+ totalPembelian);
        System.out.println("Besarnya potongan Rp. = "+ potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. = "+ totalBayar);
        System.out.println("--------------------------------------------");
    }
}
