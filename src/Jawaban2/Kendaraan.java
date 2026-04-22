package Jawaban2;

class Kendaraan {
    private String jenis;
    private int durasi;

    public Kendaraan(String jenis) {
        this.jenis = jenis.toLowerCase();
    }

    // Overloading (input durasi langsung)
    public double hitungBiaya(int jam) {
        this.durasi = jam;
        return hitung();
    }

    // Overloading (jam masuk keluar)
    public double hitungBiaya(int masuk, int keluar) {
        this.durasi = keluar - masuk;
        return hitung();
    }

    private double hitung() {
        double tarif = 0;

        switch (jenis) {
            case "motor": tarif = 2000; break;
            case "mobil": tarif = 5000; break;
            case "truk": tarif = 8000; break;
        }

        double total = tarif * durasi;

        if (durasi > 5) {
            total *= 0.9; // diskon 10%
        }

        return total;
    }

    public void tampilkan(double total) {
        System.out.println("Jenis: " + jenis);
        System.out.println("Durasi: " + durasi + " jam");
        System.out.println("Total: " + total);
    }
}