import java.util.Scanner;

/**
 * ForKelipatan05
 */
public class WhilaKelipatan05 {

    public static void main(String[] args) {
        int kelipatan;
        int jumlah = 0;
        int counter = 0;
        double rata = 0;
        Scanner scan  = new Scanner(System.in);
        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

       
		/*for (int i = 1 ; i<= 50 ; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }rata = (double) jumlah / counter;
        }
        /* */

        int i = 1;
        while (i <= 50) 
        {
           if (i % kelipatan == 0) 
           {
            jumlah += i;
            counter++;

         
           }
             i++; 
            //rata = (double) jumlah / counter; 
        }
        
        

         rata = (double) jumlah / counter; 
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan,counter);
   
		System.out.printf("Total Bilangan kelipatan %d dari 1 sampai 50 adalah %d\n" , kelipatan, jumlah);
        

System.out.println("Rata- Rata dari seluruh Bilangan adalah : "+ rata);

    }
}