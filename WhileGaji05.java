import java.util.Scanner;

/**
 * WhileGaji05
 */
public class WhileGaji05 {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      int jumlahKaryawan, jumlahJamLembur;
      double gajiLembur = 0, totalGajiLembur = 0;
      String jabatan;  

      System.out.print("Masukkan Jumlah Karyawan : ");
      jumlahKaryawan = scan.nextInt();

      int i = 0;

      while (i < jumlahKaryawan) {
        System.out.print("Silahkan Pilih Jabatan Anda! (Direktur/Manajer/Karyawan)\n");
        System.out.print("Masukkan Jabatan Karyawan ke-" + (i+1) + ": ");
        jabatan =scan.next();
        System.out.print("Masukkan jumlah jam lembur anda : ");
        jumlahJamLembur = scan.nextInt();
        
        i++;

        if (jabatan.equalsIgnoreCase("direktur")) {
            continue;
        } else if (jabatan.equalsIgnoreCase("manajer")) {
            gajiLembur = jumlahJamLembur * 100000;        
        } else if (jabatan.equalsIgnoreCase("karyawan")) {
            gajiLembur = jumlahJamLembur * 75000;
        } else {
            System.out.println("Invalid");
            continue;
        }
        totalGajiLembur += gajiLembur;

        
      }
      System.out.print("Total Gaji Lembur : " +totalGajiLembur);
    }
}