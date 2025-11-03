import java.util.Scanner;

public class Soal_Mudah_01 {    
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Masukkan Berat dari paket (KG) : ");
        Double Berat = Input.nextDouble();
        System.out.print("Masukkan Jarak (KM) : ");
        Double Jarak = Input.nextDouble();
        System.out.print("Masukkan Panjang dari paket : ");
        Double Panjang = Input.nextDouble();
        System.out.print("Masukkan Lebar dari paket : ");
        Double Lebar = Input.nextDouble();
        System.out.print("Masukkan Tinggi dari paket : ");
        Double Tinggi = Input.nextDouble();
        

        Double Volume = Panjang * Lebar * Tinggi;
        System.out.println("Volume dari paket adalah : " + Volume);
        // Double Biaya = 0.0;
        
        if (Jarak <= 10 && Jarak > 0) {
            Double Biaya = 4250.0 * Berat;
            if (Volume > 100) {
                Biaya += 50000.0;
            }
            System.out.println("Biaya Pengiriman : " + Biaya);
        } else if (Jarak > 10 && Jarak > 0) {
            Double Biaya = 6000.0 * Berat;
            if (Volume > 100) {
                Biaya += 50000.0;
            }
            System.out.println("Biaya Pengiriman : " + Biaya);
        } else {
            System.out.println("Nilai jarak tidak boleh dibawah atau sama dengan 0");    
        }
        
        Input.close();
    }

}    
