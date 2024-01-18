import java.util.Scanner;

public class Transaksi { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User user = new User();

        System.out.println("Anda login sebagai "+user.nama+" dengan jabatan sebagai "+user.jabatan);
        
        System.out.print("Masukkan nama client: ");
        String namaClient = in.nextLine();
        
        System.out.print("Masukkan alamat: ");
        String alamat = in.nextLine();

        System.out.print("Masukkan nomor telepon: ");
        int noTelp = in.nextInt();

        Customer client = new Customer(namaClient);
        client.setTelp(noTelp);
        client.setAlamat(alamat);

        JenisLaundry laundry = new JenisLaundry();

        System.out.print("Masukkan jenis laundry: ");
        String jlaundry = in.next();
        
        System.out.print("Masukkan harga laundry(per barang): ");
        int harga = in.nextInt();
        
        System.out.print("Masukkan jumlah barang: ");
        int jumlah = in.nextInt();
        
        laundry.setJenisLaundry(jlaundry);
        System.out.println("Transaksi oleh: "+client.getNama()+"\nnomor telepon: "+client.getTelp()+"\nalamat: "+client.getAlamat()+"\njenis laundry: "+laundry.getJenisLaundry()+"\njumlah barang: "+jumlah+"\ntotal harga: Rp "+String.format("%,d", laundry.hitungTotal(harga, jumlah)));

        in.close();
    }
}