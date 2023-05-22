public class kueJadi extends kue {
    private double jumlah;
    kueJadi(double jumlah, String nama, double harga){
        super(nama, harga);
        this.jumlah = jumlah;
    }
    public double getJumlah() {
        return jumlah;
    }
    public double hitungHarga(){
        return super.getHarga() * this.jumlah * 2;
    }
    public String toString(){
        return super.toString() + System.out.printf("\nJumlah\t\t: %s pcs\nTotal Harga\t: Rp.%s\nJenis Kue\t: %s\n\n", jumlah, hitungHarga(),"Kue Jadi");
    }
}