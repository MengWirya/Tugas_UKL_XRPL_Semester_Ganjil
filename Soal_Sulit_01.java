import java.util.Scanner;
public class Soal_Sulit_01 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Masukkan Total jumlah Siswa : ");
        int TotalSiswa = Input.nextInt();
        int[] NilaiSiswa = new int[TotalSiswa];

        int TotalNilaiSiswa = 0;
        for (int i = 0; i < NilaiSiswa.length; i++) {
            System.out.print("Masukkan Nilai Siswa ke-" + (i + 1) + " : ");
            NilaiSiswa[i] = Input.nextInt();
            TotalNilaiSiswa += NilaiSiswa[i];
        }

        Double RataRata = (double) TotalNilaiSiswa / NilaiSiswa.length;
        System.out.println("Rata-Rata Nilai siswa adalah : " + RataRata);
        
        Input.close();
    }
}