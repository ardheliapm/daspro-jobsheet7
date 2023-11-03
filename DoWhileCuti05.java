import java.util.Scanner;

/**
 * DoWhileCuti05
 */
public class DoWhileCuti05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jatahCuti,jumlahHari;
        String konfirmasi;

        System.out.println("Jatah Cuti : ");
        jatahCuti = sc.nextInt();

        do{
            System.out.print("Apakah Anda ingin mengambil cuti  (y/t) ? : ");
            konfirmasi = sc.next();
                if (konfirmasi.equalsIgnoreCase("y")) {
                    System.out.println("Jumlah Hari : ");
                    jumlahHari= sc.nextInt();

                        if (jumlahHari <= jatahCuti) {
                            jatahCuti -= jumlahHari;
                            System.out.println("Sisa jatah cuti : " + jatahCuti);
                        } else {
                            System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                            System.out.print("Maaf Salah, Silahkan Masukkan Jatah Cuti Anda Lagi: ");
                            konfirmasi = sc.next();

                            if (konfirmasi.equalsIgnoreCase("y")) {
                                continue;
                            } else {
                                System.out.println("Terimakasih");
                                break;
                            }
                            
                           
                        }

}
else if (konfirmasi.equalsIgnoreCase("t")) {
    System.out.println("Terimakasih Telah Mengisi, Semangat Bekerja!");
    break;
                        }
        } while (jatahCuti > 0);

    }
}