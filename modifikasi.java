import java.util.Scanner;

public class modifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Angka : ");
        int angka = sc.nextInt();
        String hasil;

       hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

       System.out.println("Angka " + angka + " termasuk bilangan " + hasil);
    }
    }
