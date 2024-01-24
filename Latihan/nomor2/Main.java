package tugas1.nomor2;

import java.util.Scanner;
public class Main {
    public static String getKategori(int opt){
        String kategori;
        switch (opt) {
            case 1:
                kategori = "Semua Umur";
                break;
            case 2:
                kategori = "Remaja";
                break;
            case 3:
                kategori = "Dewasa";
                break;
            case 4:
                kategori = "Anak-anak";
                break;
            default:
                System.out.println("Kategori Tidak Tersedia!");
                kategori = null;
                break;
        }

        return kategori;
    }

    public static void main(String[]args){
        Film film = new Film();
        System.out.println("================");
        System.out.println("Input Rental VCD");
        System.out.println("===============");

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        // Masukan Input dari User
        System.out.print("Masukan film      : ");
        film.judul = input.nextLine();
        System.out.print("Pemain            : ");
        film.pemain = input.nextLine();
        System.out.print("Sutradara         : ");
        film.sutradara = input.nextLine();
        System.out.print("Publisher         : ");
        film.publiser = input.nextLine();

        System.out.println("Kategori          : ");
        System.out.println("1. Semua Umur");
        System.out.println("2. Remaja");
        System.out.println("3. Dewasa");
        System.out.println("4. Anak-Anak");
        System.out.print("Masukan Pilihan  : ");

        int opt;
        opt = input1.nextInt();
        film.kategori = getKategori(opt);
        System.out.print("Stok            : ");
        film.stok = input.nextInt();

        System.out.println("=========================================");
        System.out.println("Judul Film      : "+film.judul);
        System.out.println("Pemain          : "+film.pemain);
        System.out.println("Sutradara       : "+film.sutradara);
        System.out.println("Publisher       : "+film.publiser);
        System.out.println("Kategori        : "+film.kategori);
        System.out.println("Stok            : "+film.stok);

        input.close();
        input1.close();
    }
}