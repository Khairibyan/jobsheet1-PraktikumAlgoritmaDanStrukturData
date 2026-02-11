import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Deklarasi variabel
        String nim;
        int n;
        
        // Input NIM
        System.out.print("Input NIM: ");
        nim = sc.nextLine();
        
        // Ambil 2 digit terakhir NIM
        String duaDigitTerakhir = nim.substring(nim.length() - 2);
        n = Integer.parseInt(duaDigitTerakhir);
        
        // Jika n < 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }
        
        System.out.println("Output: ");
        
        // Loop dari 1 sampai n
        for (int i = 1; i <= n; i++) {
            // Bilangan 10 dan 15 tidak dicetak
            if (i == 10 || i == 15) {
                continue;
            }
            
            // Cek kondisi untuk setiap bilangan
            if (i % 3 == 0) {
                // Kelipatan 3 dicetak dengan #
                System.out.print("# ");
            } else if (i % 2 == 0) {
                // Genap (bukan kelipatan 3) dicetak sesuai angkanya
                System.out.print(i + " ");
            } else {
                // Ganjil dicetak dengan *
                System.out.print("* ");
            }
        }
        
        System.out.println(); // Newline di akhir
    }
}
