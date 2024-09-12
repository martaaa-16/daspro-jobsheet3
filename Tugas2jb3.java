import java.util.Scanner;

public class Tugas2jb3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bonusPercentase = 0.10, pajakPersentase = 0.05;
        System.out.print("Masukkan jumlah jam kerja dalam sebulan: ");
        double jamKerja = input.nextDouble();
        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = input.nextDouble();

        double gajiSebelumBonus = jamKerja * upahPerJam;
        double bonus = gajiSebelumBonus * bonusPercentase;
        double totalSebelumPajak = gajiSebelumBonus + bonus;
        double pajak = totalSebelumPajak * pajakPersentase;
        double totalGajiSetelahPajak = totalSebelumPajak - pajak;

        System.out.println("Gaji sebelum bonus dan pajak: Rp" + gajiSebelumBonus);
        System.out.println("Bonus: Rp " + bonus);
        System.out.println("Pajak: Rp " + pajak);
        System.out.println("Total gaji setelah pajak: Rp " + totalGajiSetelahPajak);

    }
}
