package Jawaban1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perusahaan p = new Perusahaan();

        while (true) {
            // MENU PER BARIS
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Hapus Karyawan");
            System.out.println("3. Ubah Posisi Karyawan");
            System.out.println("4. Ubah Gaji Karyawan");
            System.out.println("5. Tampilkan Semua Karyawan");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            int pilih = sc.nextInt();
            sc.nextLine(); // buang newline

            if (pilih == 1) {
                System.out.print("ID: ");
                String id = sc.nextLine();

                System.out.print("Nama: ");
                String nama = sc.nextLine();

                System.out.print("Posisi: ");
                String posisi = sc.nextLine();

                System.out.print("Gaji: ");
                double gaji = sc.nextDouble();
                sc.nextLine();

                p.tambahKaryawan(new Karyawan(id, nama, posisi, gaji));
            }
            else if (pilih == 2) {
                System.out.print("ID: ");
                String id = sc.nextLine();
                p.hapus(id);
            }
            else if (pilih == 3) {
                System.out.print("ID: ");
                String id = sc.nextLine();

                System.out.print("Posisi baru: ");
                String posisiBaru = sc.nextLine();

                p.ubahPosisi(id, posisiBaru);
            }
            else if (pilih == 4) {
                System.out.print("ID: ");
                String id = sc.nextLine();

                System.out.print("Gaji baru: ");
                double gajiBaru = sc.nextDouble();
                sc.nextLine();

                p.ubahGaji(id, gajiBaru);
            }
            else if (pilih == 5) {
                p.tampilkanSemua();
            }
            else if (pilih == 6) {
                System.out.println("Program selesai.");
                break;
            }
            else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        sc.close();
    }
}