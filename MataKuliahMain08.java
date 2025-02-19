public class MataKuliahMain08 {
    public static void main(String[] args) {
        MataKuliah08 mk1 = new MataKuliah08();
        mk1.kodeMK = "IF101";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 4;

        MataKuliah08 mk2 = new MataKuliah08("IF202", "Pemrograman Java", 4, 6);

        mk1.tampilInformasi();
        mk2.tampilInformasi();
        mk1.ubahSKS(2);
        mk2.tambahJam(2);
        mk1.kurangiJam(2);
        mk1.tampilInformasi();
        mk2.tampilInformasi();
    }
}
