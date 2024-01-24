import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App1 {
    // Fungsi untuk menghitung kata
    public static Map<String, Integer> hitungKata(String input) {
        Map<String, Integer> penghitunganKata = new HashMap<>();
    
        if (input == null || input.isEmpty()) {
            return penghitunganKata;
        }
    
        // Split kalimat menjadi kata
        String[] kalimat = input.split("\\s+"); // \\s+ berfungsi untuk mencari space sehingga kata dapat dipisah dalam kalimat
    
        // Menghitung perkata dalam kalimat
        for (String kata : kalimat) {
            // Mengabaikan simbol atau karakter lainnya dalam kalimat
            kata = kata.replaceAll("[^a-zA-Z]", "").toLowerCase(); 
            // Semua kata dalam kalimat diubah menjadi lower case (insensitive_case)
    
            penghitunganKata.put(kata, penghitunganKata.getOrDefault(kata, 0) + 1);
        }
    
        return penghitunganKata;
    }
    
    // Fungsi untuk menampilkan kata terbanyak
    public static void tampilkanKata_terbanyak(Map<String, Integer> penghitunganKata) {
        int maxFrekuensi = 0;
    
        // Mencari kata dengan frekuensi terbanyak
        for (int frequency : penghitunganKata.values()) {
            if (frequency > maxFrekuensi) {
                maxFrekuensi = frequency;
            }
        }
    
        // Menampilkan kata dengan frekuensi terbanyak
        for (Map.Entry<String, Integer> entry : penghitunganKata.entrySet()) {
            if (entry.getValue() == maxFrekuensi) {
                System.out.println("- " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Kalimat: ");
        // Masukan kalimat contoh dalam soal:
        // aku seorang bajak laut di tengah laut Somalia, sedang merompak kapal para penjajah Afrika. 
        // Namun aku takut dengan seorang penjajah dari Afrika keturunan India.
        
        String txt = input.nextLine();
        String inputString = txt;
        
        // Counting the frequency of each kata
        Map<String, Integer> penghitunganKata = hitungKata(inputString);

        // Menampilkan frekuensi tiap kata
        System.out.println();
        System.out.println("Frekuensi tiap kata:");
        for (Map.Entry<String, Integer> entry : penghitunganKata.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Menampilkan frekuensi kata terbanyak
        System.out.println("\nKata Terbanyak:");
        tampilkanKata_terbanyak(penghitunganKata);

        input.close();
    }

}
