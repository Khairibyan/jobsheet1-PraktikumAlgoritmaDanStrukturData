import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mk = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        int[] sks = {2, 2, 2, 3, 2, 3, 2, 2};
        int m = mk.length;

        double[] nilaiAngka = new double[m];
        String[] nilaiHuruf = new String[m];
        double[] nilaiSetara = new double[m];

        System.out.println("Program Menghitung IP Semester");
        for (int i = 0; i < m; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mk[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if (nilaiAngka[i] < 0 || nilaiAngka[i] > 100) {
                System.out.println("nilai tidak valid");
                sc.close();
                return;
            }

            double na = nilaiAngka[i];
            if (na >= 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (na >= 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (na >= 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (na >= 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (na >= 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (na >= 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }
        }

        System.out.println();
        System.out.println("hasil Konversi Nilai");
        System.out.printf("%-40s %-12s %-12s %-12s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double sumProduk = 0.0;
        int sumSKS = 0;
        for (int i = 0; i < m; i++) {
            System.out.printf("%-40s %10.2f %12s %12.2f%n", mk[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
            sumProduk += nilaiSetara[i] * sks[i];
            sumSKS += sks[i];
        }

        if (sumSKS == 0) {
            System.out.println("Total SKS = 0, tidak dapat menghitung IP.");
        } else {
            double ip = sumProduk / sumSKS;
            System.out.println("========================");
            System.out.printf("IP : %.2f%n", ip);
        }

        sc.close();
    }
}
