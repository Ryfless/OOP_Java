package tugas1.nomor2;

class Film extends Vcd {
    public String pemain;
    public String sutradara;
    public String kategori;
public Film(String pemain, String sutradara, String kategori, String judul, String publiser, int stok, String judul1) {
    super(judul, publiser, stok, judul1);
    this.pemain = pemain;
    this.sutradara = sutradara;
    this.kategori = kategori;
}
Film() {
}
}   