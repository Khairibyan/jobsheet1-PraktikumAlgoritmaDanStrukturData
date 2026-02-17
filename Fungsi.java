public class Fungsi {
    
    static int[][] stock = {
        {10, 6, 2, 5},
        {5, 11, 10, 7},
        {15, 9, 10, 12},
        {7, 12, 5, 9}
    };
    
    static int[] harga = {75000, 50000, 60000, 10000};
    static String[] namaCabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
    static String[] namaBunga = {"Agnonema", "Keladi", "Alocasia", "Mawar"};
    
    public static int hitungPendapatan(int cabang) {
        int pendapatan = 0;
        for (int i = 0; i < 4; i++) {
            pendapatan += stock[i][cabang] * harga[i];
        }
        return pendapatan;
    }
    
    public static String statusCabang(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }
    
    public static void main(String[] args) {
        System.out.println("===== Toko Bunga RoyalGarden =====");
        System.out.println();
        
        System.out.println("Pendapatan Setiap Cabang (Jika Semua Bunga Habis):");
        System.out.println("================================================");
        
        for (int i = 0; i < 4; i++) {
            int pendapatan = hitungPendapatan(i);
            String status = statusCabang(pendapatan);
            System.out.println(namaCabang[i] + ": Rp" + String.format("%,d", pendapatan) + " (" + status + ")");
        }
    }
}
