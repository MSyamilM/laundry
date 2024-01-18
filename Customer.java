public class Customer {
    private String nama, alamat;
    private int telp;

    public Customer(String nama){
        this.nama = nama;
    }

    public void setTelp(int telp){
        this.telp = telp;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }

    public int getTelp(){
        return telp;
    }

    public String getAlamat(){
        return alamat;
    }
}