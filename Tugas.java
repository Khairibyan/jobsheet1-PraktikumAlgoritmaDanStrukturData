import java.util.Scanner;

public class Tugas {
    
    static String[][] jadwal;
    static int jumlahJadwal;
    
    static void inputJadwal() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        jumlahJadwal = sc.nextInt();
        sc.nextLine();
        
        jadwal = new String[jumlahJadwal][4];
        
        for (int i = 0; i < jumlahJadwal; i++) {
            System.out.println("\nJadwal ke-" + (i+1));
            System.out.print("Masukkan nama mata kuliah: ");
            jadwal[i][0] = sc.nextLine();
            
            System.out.print("Masukkan ruang: ");
            jadwal[i][1] = sc.nextLine();
            
            System.out.print("Masukkan hari kuliah: ");
            jadwal[i][2] = sc.nextLine();
            
            System.out.print("Masukkan jam kuliah: ");
            jadwal[i][3] = sc.nextLine();
        }
    }
    
    static void tampilkanSemuaJadwal() {
        System.out.println("\n===== JADWAL KULIAH =====");
        System.out.printf("%-30s %-10s %-15s %-15s%n", "Nama MK", "Ruang", "Hari", "Jam");
        System.out.println("=======================================================");
        
        for (int i = 0; i < jumlahJadwal; i++) {
            System.out.printf("%-30s %-10s %-15s %-15s%n", 
                jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }
    
    static void tampilkanJadwalBerdasarkanHari(String hari) {
        System.out.println("\n===== JADWAL HARI " + hari.toUpperCase() + " =====");
        System.out.printf("%-30s %-10s %-15s%n", "Nama MK", "Ruang", "Jam");
        System.out.println("==================================================");
        
        boolean ditemukan = false;
        for (int i = 0; i < jumlahJadwal; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-30s %-10s %-15s%n", 
                    jadwal[i][0], jadwal[i][1], jadwal[i][3]);
                ditemukan = true;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari " + hari);
        }
    }
    
    static void tampilkanJadwalBerdasarkanMK(String namaMK) {
        System.out.println("\n===== JADWAL MK: " + namaMK.toUpperCase() + " =====");
        System.out.printf("%-10s %-15s %-15s%n", "Ruang", "Hari", "Jam");
        System.out.println("===========================================");
        
        boolean ditemukan = false;
        for (int i = 0; i < jumlahJadwal; i++) {
            if (jadwal[i][0].equalsIgnoreCase(namaMK)) {
                System.out.printf("%-10s %-15s %-15s%n", 
                    jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ditemukan = true;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah dengan nama " + namaMK);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        inputJadwal();
        
        int pilihan;
        do {
            System.out.println("\n===== MENU JADWAL KULIAH =====");
            System.out.println("1. Tampilkan semua jadwal");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan mata kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            
            switch(pilihan) {
                case 1:
                    tampilkanSemuaJadwal();
                    break;
                case 2:
                    System.out.print("Masukkan hari (Senin/Selasa/Rabu/Kamis/Jumat): ");
                    String hari = sc.nextLine();
                    tampilkanJadwalBerdasarkanHari(hari);
                    break;
                case 3:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String mk = sc.nextLine();
                    tampilkanJadwalBerdasarkanMK(mk);
                    break;
                case 4:
                    System.out.println("Program selesai!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while(pilihan != 4);
        
        sc.close();
    }
}
