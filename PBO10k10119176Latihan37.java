import java.util.Scanner;

/**
 * Latihan37
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Program Rata-rata Nilai
 */
public class PBO10k10119176Latihan37 {
    public static void main(String[] args) {
        int jumlahMhs;
        Scanner scanner = new Scanner(System.in);
        RatarataNilai Ratarata = new RatarataNilai();
        
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        jumlahMhs = scanner.nextInt();
        
        Ratarata.hitungNilai(jumlahMhs);
        double jumlahNilai;
        System.out.println("\n" + "Rata Rata Nilainya adalah : " + 
        Ratarata.hitungRatarataNilai(Ratarata.jumlahNilai,jumlahMhs));
    } 
}
