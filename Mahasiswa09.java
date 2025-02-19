public class Mahasiswa09 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    // Constructor untuk inisialisasi objek
    public Mahasiswa09(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanInformasi() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
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

    public static void main(String[] args) {
        Mahasiswa09 mahasiswa = new Mahasiswa09("244107060105", "Dina Mei Lestari", "SIB 1G", 3.8);
    
        mahasiswa.tampilkanInformasi();
        
        mahasiswa.ubahKelas("SIB 1F");
    
        mahasiswa.updateIpk(3.9);

        mahasiswa.tampilkanInformasi();
    
        System.out.println("Kinerja: " + mahasiswa.nilaiKinerja(mahasiswa.ipk));

        
    }
    
}
