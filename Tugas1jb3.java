import java.util.Scanner;

public class Tugas1jb3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tarifPerKwh = 1500;
        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        double penggunaanListrik = input.nextDouble();
        double totalTagihan = penggunaanListrik * tarifPerKwh;
        boolean melebihiBatas = penggunaanListrik >= 500;
        
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println("Apakah npenggunaan listrik melebihi 500 kWh?: " + melebihiBatas);
    }
}