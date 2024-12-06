import java.util.Scanner;

public class tugasrekursif {
    //iteratif
    static int perhitunganIteratif(int angka[]) {
        int total = 0;
        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }
        return total;
    }
    //rekursif
    static int perhitunganRekursif(int angka[], int jumlahAngka) {
        if (jumlahAngka == 0) {
            return 0; 
        }
        else {
            return angka[jumlahAngka - 1] + perhitunganRekursif(angka,jumlahAngka - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input
        System.out.println("========= PROGRAM PENJUMLAHAN =========");
        System.out.print("Masukkan jumlah angka yang akan dihitung : ");
        int jumlahAngka = sc.nextInt();

        int [] angka = new int [jumlahAngka];

        for (int i = jumlahAngka; i >=1; i--){
            System.out.print("Masukkan angka ke - " + i + ": " );
            angka[i-1] = sc.nextInt();
        }
        
        //output
        System.out.println("Total iteratif : " + perhitunganIteratif(angka));
        System.out.println("Total rekursif : " + perhitunganRekursif(angka, jumlahAngka));
    }
}