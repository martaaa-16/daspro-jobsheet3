import java.util.Scanner;
public class Kafe16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 13000.0, hargaTeh = 5000.0, hargaRoti = 15000.0;
        float diskon = 10 / 100f;

        System.out.println("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.println("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.println("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.println("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
        System.out.println("Nominal bayar Rp " + nominalBayar);

    }
}