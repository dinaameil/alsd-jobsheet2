public class DosenMain08 {
    public static void main(String[] args) {
        Dosen08 dosen1 = new Dosen08("D1121987", "Dr. Budi", false, 2003, "");
        Dosen08 dosen2 = new Dosen08("D1123456", "Dr. Andi", true, 2015, "Machine Learning");

        dosen1.TampilInformasi();
        System.out.println();
        dosen2.TampilInformasi();

        dosen1.setStatusAktif(true);
        dosen1.ubahKeahlian("Data Science");

        System.out.println();
        dosen1.TampilInformasi();

        int masaKerjaDosen1 = dosen1.hitungMasaKerja(2025);
        int masaKerjaDosen2 = dosen2.hitungMasaKerja(2025);

        System.out.println("Masa kerja dosen1: " + masaKerjaDosen1 + " tahun");
        System.out.println("Masa kerja dosen2: " + masaKerjaDosen2 + " tahun");

    }
}
