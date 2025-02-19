public class Mahasiswa09 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    public void ubahKelas(String kelasBaru) {
        this.kelas = kelasBaru;
    }

    public void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            this.ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0.");
        }
    }    

    public String nilaiKinerja(double ipk) {
        if (ipk >= 3.5) {
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.0) {
            return "Kinerja Cukup";
        } else {
            return "Kurang";
        }
    }    

    public Mahasiswa09 () {
    }
    
    public Mahasiswa09 (String nama, String nim, double ipk, String kelas) {
        this.nama = nama ;
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kelas;
    }

}
