public class JenisLaundry {

    private String jenisLaundry;
    private int harga;

    public int hitungTotal(int harga, int jumlah){
        this.harga = harga;
        int total = harga*jumlah;
        return total;
    }

    public void setJenisLaundry(String jenisLaundry){
        this.jenisLaundry = jenisLaundry;
    }

    public String getJenisLaundry(){
        return jenisLaundry;
    }

    
}