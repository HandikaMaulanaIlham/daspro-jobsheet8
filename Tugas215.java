import java.util.Scanner;

public class Tugas215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah = 0;

        System.out.print("Masukkan Nilai n = ");
        int n = sc.nextInt();

        if (n >= 3){
            for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                int angka = i * j ;
                System.out.printf("%4d", angka);
                jumlah += angka;
            }
            System.out.println();
        }
        System.out.println("Jumlah seluruh angka = " + jumlah);
        }else {
            System.out.println("Nilai n minimal 3");
        }
        sc.close();
    }
}