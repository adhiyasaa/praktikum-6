 public abstract class kue{
    public String nama;
    public double harga;
    public kue(String nama, double harga){
        this.nama=nama;
        this.harga=harga;
    }
        public String getNama() {
            return nama;
        }
        public double getHarga() {
            return harga;
        }
        public abstract double hitungHarga();
        public String toString() {
            return String.valueOf((System.out.printf("Nama\t\t: %s\nHarga\t\t: Rp.%s",nama,harga)));
        }
    }