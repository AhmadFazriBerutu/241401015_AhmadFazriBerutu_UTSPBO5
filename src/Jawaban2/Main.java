package Jawaban2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalKendaraan = 0;
        double totalSemua = 0;

        System.out.println("======= Welcome to ParkingChan =======");

        while (true) {
            System.out.print("\nEnter vehicle type (Motor/Mobil/Truk) : ");
            String jenis = sc.next();

            Kendaraan k = new Kendaraan(jenis);

            System.out.print("Enter Duration (Manual/Time): ");
            String metode = sc.next();

            double total = 0;
            int durasi = 0;

            if (metode.equalsIgnoreCase("Manual")) {
                System.out.print("Enter Duration (in hour): ");
                durasi = sc.nextInt();
                total = k.hitungBiaya(durasi);
            } else {
                System.out.print("Enter entry time : ");
                int masuk = sc.nextInt();
                System.out.print("Enter exit time  : ");
                int keluar = sc.nextInt();

                durasi = keluar - masuk;
                total = k.hitungBiaya(masuk, keluar);
            }

            // 🔥 PARKING SUMMARY
            System.out.println("\n---- PARKING SUMMARY ----");
            System.out.println("Vehicle Type  : " + jenis);
            System.out.println("Parking Time  : " + durasi + " hour(s)");
            System.out.println("Total Fee     : Rp" + String.format("%.0f", total));

            totalKendaraan++;
            totalSemua += total;

            System.out.print("\nAdd another vehicle? (y/n): ");
            String lagi = sc.next();

            if (!lagi.equalsIgnoreCase("y")) break;
        }

        // 🔥 FINAL REPORT
        System.out.println("\n======= FINAL REPORT =======");
        System.out.println("Total Vehicle Final : " + totalKendaraan);
        System.out.println("Total Parking Fees Final : " + String.format("%.0f", totalSemua));
        System.out.println("Thank You.....");

        sc.close();
    }
}