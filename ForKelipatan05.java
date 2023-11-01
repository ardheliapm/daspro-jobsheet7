import java.util.Scanner;

/**
 * ForKelipatan05
 */
public class ForKelipatan05 {

    public static void main(String[] args) {
        int kelipatan;
        int jumlah = 0;
        int counter = 0;
        Scanner scan  = new Scanner(System.in);
        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

       
		for (int i = 1 ; i<= 50 ; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan,counter);
   
		System.out.printf("Total Bilangan kelipatan %d dari 1 sampai 50 adalah %d\n" , kelipatan, jumlah);
        


    }
}