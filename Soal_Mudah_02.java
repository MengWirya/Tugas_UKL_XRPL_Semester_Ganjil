import java.util.Scanner;

public class Soal_Mudah_02 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Masukkan Sebuah Bilangan : ");
        int Bilangan = Input.nextInt();

        if (Bilangan % 2 == 0) {
            System.out.println(Bilangan + " adalah Bilangan Genap");
        } else {
            System.out.println(Bilangan + " adalah Bilangan Ganjil");  
        }
        
        Input.close();
    }
}
