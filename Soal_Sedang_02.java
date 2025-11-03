import java.util.Scanner;
public class Soal_Sedang_02 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan Jari-Jari dari tabung : ");
        Double r = Input.nextDouble();
        System.out.print("Masukkan Tinggi dari tabung : ");
        Double t = Input.nextDouble();
        
        System.out.println("Volume dari tabung adalah : " + FungsiVolumeTabung(r, t));
        
        Input.close();
    }

    static Double FungsiVolumeTabung(Double r, Double t) {
        Double Volume = (Double) (3.14 * r * r * t);
        return Volume;
    }   
}
