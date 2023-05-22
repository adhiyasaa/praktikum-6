public class main {
    public static void main(String[] args) {
        kue[] Kue = new kue[20];
        Kue[0] = new kuePesanan(1.2, "Chocolate Tiramisu", 40000);
        Kue[1] = new kuePesanan(1, "Stawberry Cheesecake", 55000);
        Kue[2] = new kuePesanan(1, "Blueberry Cheesecake", 55000);
        Kue[3] = new kuePesanan(1, "Greentea Cheesecake", 55000);
        Kue[4] = new kuePesanan(0.8, "Strawberry Custard", 25000);
        Kue[5] = new kuePesanan(0.8, "Apple Pie", 20000);
        Kue[6] = new kuePesanan(0.8, "Choco Pie", 20000);
        Kue[7] = new kuePesanan(1, "Vanilla Bagel", 25000);
        Kue[8] = new kuePesanan(1, "Choco Bagel", 25000);
        Kue[9] = new kuePesanan(1, "Almond Bagel", 25000);
        Kue[10]  = new kueJadi(5, "Choco Puff", 8000);
        Kue[11] = new kueJadi(5, "Vanilla Puff", 8000);
        Kue[12] = new kueJadi(3, "Vanila Soes", 6000);
        Kue[13] = new kueJadi(4, "Choco Soes", 6000);
        Kue[14] = new kueJadi(3, "Croissant", 12000);
        Kue[15] = new kueJadi(7, "Banana Bread", 11000);
        Kue[16] = new kueJadi(6, "Garlic Bread", 12000);
        Kue[17] = new kueJadi(2, "Cinnamon Roll", 18000);
        Kue[18] = new kueJadi(9, "Doughnut", 4000);
        Kue[19] = new kueJadi(4, "Waffle", 5000);

        double totalHarga = 0,totalHargaKuePesanan = 0,totalBerat = 0,totalHargaKueJadi = 0,cekKueTermahal = 0 ;
        int totalJumlah = 0;
        String kueTermahal = "";
        for (kue value: Kue) {
            totalHarga += value.hitungHarga();
            if (value instanceof kuePesanan) {
                totalHargaKuePesanan += value.hitungHarga();
                totalBerat += ((kuePesanan) value).getBerat();
            }
            if (value instanceof kueJadi){
                totalHargaKueJadi += value.hitungHarga();
                totalJumlah += ((kueJadi) value).getJumlah();
            }
            if (cekKueTermahal == 0){
                cekKueTermahal += value.hitungHarga();
            } else if (value.hitungHarga() >= cekKueTermahal){
                cekKueTermahal = value.hitungHarga();
                kueTermahal = value.getNama();
            }
            value.toString();
        }
        System.out.println("Total harga semua jenis kue\t\t: Rp." + totalHarga);
        System.out.println("Total harga kue pesanan\t\t\t: Rp." + totalHargaKuePesanan);
        System.out.println("Total berat kue pesanan\t\t\t: " + totalBerat+" kg");
        System.out.println("Total Harga Kue Jadi\t\t\t: Rp." + totalHargaKueJadi);
        System.out.println("Total jumlah kue jadi\t\t\t: " + totalJumlah +"pcs");
        System.out.println("Kue dengan harga akhir termahal\t: " + kueTermahal);
    }
}