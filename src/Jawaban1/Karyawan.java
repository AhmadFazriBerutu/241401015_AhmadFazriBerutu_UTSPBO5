package Jawaban1;

class Karyawan {
    private String id;
    private String nama;
    private String posisi;
    private double gaji;

    // Constructor
    public Karyawan(String id, String nama, String posisi, double gaji) {
        this.id = id;
        this.nama = nama;
        this.posisi = posisi;
        setGaji(gaji); // pakai setter biar ada validasi
    }

    // Getter
    public String getId() { return id; }
    public String getNama() { return nama; }
    public String getPosisi() { return posisi; }
    public double getGaji() { return gaji; }

    // Setter
    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public void setGaji(double gaji) {
        if (gaji >= 0) {
            this.gaji = gaji;
        } else {
            System.out.println("Gaji tidak boleh negatif!");
        }
    }

    // 🔥 Perbaikan di sini (format gaji)
    public void tampilkan() {
        String formatGaji = String.format("%,.0f", gaji);
        System.out.println(id + " | " + nama + " | " + posisi + " | Rp " + formatGaji);
    }
}