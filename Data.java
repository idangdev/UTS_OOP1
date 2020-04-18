
public class Data {

    private String nim;
    private String nama;
    private String kelas;
    private String jurusan;

    public Data() {
        nim = "";
        nama = "";
        kelas = "";
        jurusan = "";
    }

    public Data(String nim, String nama, String kelas, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.jurusan = jurusan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNim() { return nim; }

    public String getNama() { return nama; }

    public String getKelas() { return kelas; }

    public String getJurusan() { return jurusan; }

}