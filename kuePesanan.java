public class kuePesanan extends kue{
    private double berat;
    kuePesanan(double berat, String nama, double harga){
        super(nama, harga);
        this.berat = berat;
    }
    public double getBerat() {
        return berat;
    }
    public double hitungHarga(){
        return getHarga() * this.berat;
    }
    public String toString(){
        return super.toString() + System.out.printf("\nBerat\t\t: %s00 gram \nTotal Harga\t: Rp.%s\nJenis Kue\t: %s\t\n\n", berat, hitungHarga(),"Kue Pesanan");
    }
}
