import java.util.Scanner;

public class Soal_Sulit_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris : ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        int kolom = input.nextInt();

        int[][] Matriks1 = new int[baris][kolom];
        int[][] Matriks2 = new int[baris][kolom];
        int[][] HasilPenjumlahanMatriks = new int[baris][kolom];

        System.out.println("Pengisian nilai pada Matriks pertama");
        for (int i = 0; i < baris; i++) {  
            for (int j = 0; j < kolom; j++) {
                System.out.print("Nilai di baris ke-" + (i + 1) + " di kolom ke-" + (j + 1) + " adalah : ");
                Matriks1[i][j] = input.nextInt();
            }
        }

        System.out.println("Pengisian nilai pada Matriks kedua");
        for (int i = 0; i < baris; i++) {       
            for (int j = 0; j < kolom; j++) {
                System.out.print("Nilai di baris ke-" + (i + 1) + " di kolom ke-" + (j + 1) + " adalah : ");
                Matriks2[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < baris; i++) {       
            for (int j = 0; j < kolom; j++) {
                HasilPenjumlahanMatriks[i][j] = Matriks1[i][j] + Matriks2[i][j];
            }
        }

        System.out.println("Hasil penjumlahan dari kedua matriks adalah : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(HasilPenjumlahanMatriks[i][j] + " ");
            }
            System.out.println("\n");
        
        input.close();
        }
    }
}
