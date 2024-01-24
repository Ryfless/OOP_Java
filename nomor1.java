package tugas1;

class Alat_tulis {
    private String jenis;
    private int stok, hargaSatuan, hargaTotal;
    
    public void setter(String jenis, int stok, int hargaSatuan) {
        this.jenis = jenis;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
    }
    
    public String getJenis() {
        return jenis;
    }
    public int getStock() {
        return stok;
    }
    public int getSatuan() {
        return hargaSatuan;
    }
    public int getTotal() {
        hargaTotal = stok * hargaSatuan;
        return hargaTotal;
    }
    
    public int pembayaran(int a, int b) {
        return a = a + b;
    }
    public void tampil(String a){
        System.out.println(a);
    }
}

public class nomor1 {
    public static void main(String[] args) {
        Alat_tulis at = new Alat_tulis();
        String a, b, c;
        int hargaA, hargaB, hargaC, stok, total;
        
        a = "Bolpoint";
        hargaA = 2000;
        b = "Pensil";
        hargaB = 1000;
        c = "Penghapus";
        hargaC = 500;
        stok = 10;

        at.setter(a, stok, hargaA);
        total = at.pembayaran(0, at.getTotal());
        at.tampil("Nama Alat Tulis: " + at.getJenis() + 
                    "\nStok: " + at.getStock() + 
                    "\nHarga Satuan: " + at.getSatuan() + 
                    "\nHarga " + a + ": " + at.getTotal() + 
                    "\n");

        at.setter(b, stok, hargaB);
        total = at.pembayaran(total, at.getTotal());
        at.tampil("Nama Alat Tulis: " + at.getJenis() + 
                    "\nStok: " + at.getStock() + 
                    "\nHarga Satuan: " + at.getSatuan() + 
                    "\nHarga " + b + ": " + at.getTotal() + 
                    "\n");

        at.setter(c, stok, hargaC);
        total = at.pembayaran(total, at.getTotal());
        at.tampil("Nama Alat Tulis: " + at.getJenis() + 
                    "\nStok: " + at.getStock() + 
                    "\nHarga Satuan: " + at.getSatuan() + 
                    "\nHarga " + c + ": " + at.getTotal() + 
                    "\n");

        at.tampil("\nTotal Harga: " + total);
    }
}
