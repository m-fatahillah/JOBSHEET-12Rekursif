import java.util.Scanner;
public class Percobaan2absen13 {

    static int hitungPangkat (int x, int y){
        if ( y == 0) {
            return (1);
        } else {
            return ( x* hitungPangkat (x, y - 1));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));

        for ( int i = 0; i < pangkat ; i++ ){
            System.out.print(bilangan );
            if ( i < pangkat - 1){
                System.out.print( "x");
            }   
        }
        System.out.print(" = " + hitungPangkat(bilangan, pangkat));
    }
}
