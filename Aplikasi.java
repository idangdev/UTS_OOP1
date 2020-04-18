import java.util.*;

public class Aplikasi {

    public static void main(String args[]) {
        Aplikasi app = new Aplikasi();
        Scanner sc = new Scanner(System.in);
        while(true) {
            app.printMenu();
            int pilihan = sc.nextInt();
            switch(pilihan) {
                case 1:
                    System.out.println("Tambah Data Mahasiswa");
                    app.addData();
                    break;
                case 2:
                    System.out.println("Ubah Data Mahasiswa");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("Hapus Data Mahasiswa");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("List Data Mahasiswa");
                    app.listData();
                    break;
                case 5:
                    return;
            }
        }
    }

    public void hapusData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Hapus data ke-"); int idx = sc.nextInt();
        //  hapus data
        Operasi.removeData(idx-1);
    }

    public void ubahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Ubah data ke-"); int idx = Integer.parseInt(sc.nextLine());
        System.out.println("------------------------");
        System.out.print("NIM : "); String nim = sc.nextLine();
        System.out.print("Nama : "); String nama = sc.nextLine();
        System.out.print("Kelas : "); String kelas = sc.nextLine();
        System.out.print("Jurusan : "); String jurusan = sc.nextLine();
        //  simpan perubahan
        Operasi.editData(new Data(nim, nama, kelas, jurusan), idx-1);
    }

    public void listData() {
        //  tampilkan daftar data
        List<Data> result = Operasi.getListData();
        for(int i=0; i<result.size(); i++) {
            System.out.println();
            System.out.println("data ke-" + (i+1));
            System.out.println("  NIM : " + result.get(i).getNim());
            System.out.println("  Nama : " + result.get(i).getNama());
            System.out.println("  Kelas : " + result.get(i).getKelas());
            System.out.println("  Jurusan : " + result.get(i).getJurusan());
        }
    }

    public void addData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("NIM : "); String nim = sc.nextLine();
        System.out.print("Nama : "); String nama = sc.nextLine();
        System.out.print("Kelas : "); String kelas = sc.nextLine();
        System.out.print("Jurusan : "); String jurusan = sc.nextLine();
        //  simpan data
        Operasi.addData(new Data(nim, nama, kelas, jurusan));
    }

    public void printMenu() {
        System.out.println();
        System.out.println("---------------------------");
        System.out.println("APLIKASI INPUT DATA MAHASISWA");
        System.out.println("      Wildan 18090118");
        System.out.println("---------------------------");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Ubah Data Mahasiswa");
        System.out.println("3. Hapus Data Mahasiswa");
        System.out.println("4. Lihat Data Mahasiswa");
        System.out.println("5. Keluar");
        System.out.print("Pilihan : ");
    }

}