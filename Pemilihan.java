import java.util.Scanner; 

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        double nilaiAkhir;
        String nilaiHuruf, kualifikasi, status;
        
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        
        System.out.println("===============================");
        
        if (nilaiTugas < 0 || nilaiTugas > 100 ||
            nilaiKuis < 0 || nilaiKuis > 100 ||
            nilaiUTS < 0 || nilaiUTS > 100 ||
            nilaiUAS < 0 || nilaiUAS > 100) {
            
            System.out.println("nilai tidak valid");
        } else {
            nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + 
                        (0.3 * nilaiUTS) + (0.3 * nilaiUAS);
            
            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
                kualifikasi = "Sangat Baik";
                status = "LULUS";
            } else if (nilaiAkhir >= 73) {
                nilaiHuruf = "B+";
                kualifikasi = "Lebih dari Baik";
                status = "LULUS";
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "B";
                kualifikasi = "Baik";
                status = "LULUS";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C+";
                kualifikasi = "Lebih dari Cukup";
                status = "LULUS";
            } else if (nilaiAkhir >= 50) {
                nilaiHuruf = "C";
                kualifikasi = "Cukup";
                status = "LULUS";
            } else if (nilaiAkhir >= 39) {
                nilaiHuruf = "D";
                kualifikasi = "Kurang";
                status = "TIDAK LULUS";
            } else {
                nilaiHuruf = "E";
                kualifikasi = "Gagal";
                status = "TIDAK LULUS";
            }
            
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("Kualifikasi: " + kualifikasi);
            System.out.println("===============================");
            if (status.equals("LULUS")) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("MAAF ANDA TIDAK LULUS");
            }
        }
    }
}