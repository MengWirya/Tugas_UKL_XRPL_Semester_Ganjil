import java.util.Scanner;
public class Soal_Sedang_01 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Masukkan Sebuah Bilangan Positif : ");
        int Bilangan = Input.nextInt();
        int Hasil = 1;
        for (int i = Bilangan; i >= 1; i--) {
            Hasil *= i;
        } 
        
        System.out.println("Hasil Faktorial : " + Hasil);
        Input.close();
    }    
}