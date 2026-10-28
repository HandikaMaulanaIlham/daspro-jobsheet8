import java.util.Scanner;
public class Tugas315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Toko = ");
        int jmlToko = sc.nextInt();

        if (jmlToko <= 0){
            System.out.println("Jumlah toko minimal 1");
        } else {
            int noToko = 1;
            int totalBarang = 0;
            int barangTerbanyak = -1;
            int tokoTerbanyak = -1;
            int jmlBarang = 0;

            while (noToko <= jmlToko) {
                System.out.println("Toko " + noToko);
                int pelanggan = 0;

                do {
                    System.out.print("Pelanggan = ");
                    pelanggan = sc.nextInt();
                        if (pelanggan < 0 ) {
                            System.out.println("Pelanggan Tidak Boleh Negatif");
                        }
                    } while (pelanggan < 0);
                
                for(int i = 1 ; i <= 1 ; i++){
                    totalBarang = 0;
                    do{
                        System.out.print("total barang = ");
                        totalBarang = sc.nextInt();
                        if(totalBarang < 0){
                            System.out.println("Total barang tidak boleh negatif ");
                        }
                    } while (totalBarang < 0);
                    jmlBarang += totalBarang;
                }

                if (totalBarang > barangTerbanyak) {
                    barangTerbanyak = totalBarang;
                    tokoTerbanyak = noToko;
                }
                System.out.println();
                noToko++;
            }
            System.out.println("Total barang seluruh toko = "+ jmlBarang);
            System.out.println("Toko dengan barang terbanyak = "+ tokoTerbanyak);
        }
        sc.close();
    }
}
