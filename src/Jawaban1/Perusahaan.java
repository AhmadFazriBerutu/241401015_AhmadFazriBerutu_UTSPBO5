package Jawaban1;

import java.util.ArrayList;

class Perusahaan {
    private ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

    // Tambah karyawan (cek ID duplikat)
    public void tambahKaryawan(Karyawan k) {
        for (Karyawan x : daftarKaryawan) {
            if (x.getId().equals(k.getId())) {
                System.out.println("Karyawan dengan ID tersebut sudah ada!");
                return;
            }
        }
        daftarKaryawan.add(k);
        System.out.println("Karyawan berhasil ditambahkan.");
    }

    // Cari karyawan
    private Karyawan cari(String id) {
        for (Karyawan k : daftarKaryawan) {
            if (k.getId().equals(id)) return k;
        }
        return null;
    }

    // Hapus
    public void hapus(String id) {
        Karyawan k = cari(id);
        if (k != null) {
            daftarKaryawan.remove(k);
            System.out.println("Karyawan berhasil dihapus.");
        } else {
            System.out.println("Karyawan dengan ID tersebut tidak ditemukan!");
        }
    }

    // Ubah posisi
    public void ubahPosisi(String id, String posisi) {
        Karyawan k = cari(id);
        if (k != null) {
            k.setPosisi(posisi);
            System.out.println("Posisi berhasil diubah.");
        } else {
            System.out.println("Karyawan dengan ID tersebut tidak ditemukan!");
        }
    }

    // Ubah gaji
    public void ubahGaji(String id, double gaji) {
        Karyawan k = cari(id);
        if (k != null) {
            k.setGaji(gaji);
            System.out.println("Gaji berhasil diubah.");
        } else {
            System.out.println("Karyawan dengan ID tersebut tidak ditemukan!");
        }
    }

    // Tampilkan semua
    public void tampilkanSemua() {
        if (daftarKaryawan.isEmpty()) {
            System.out.println("Belum ada data karyawan.");
        } else {
            for (Karyawan k : daftarKaryawan) {
                k.tampilkan();
            }
        }
    }
}