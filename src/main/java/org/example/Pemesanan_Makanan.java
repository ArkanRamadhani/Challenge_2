package org.example;

import java.util.Scanner;

public class Pemesanan_Makanan {
    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose, quantity;
    public static double total, pay;

    public static void menu() {
        System.out.println("\t\t\t\t+=====================================+");
        System.out.println("\t\t\t\t            Menu Makanan           ");
        System.out.println("\t\t\t\t     1. Mie Ayam        Rp 12000");
        System.out.println("\t\t\t\t     2. Bakso Urat      Rp 13000");
        System.out.println("\t\t\t\t     3. Bakso Telor     Rp 15000");
        System.out.println("\t\t\t\t     4. Nasi Goreng     Rp 10000");
        System.out.println("\t\t\t\t 5. CANCEL                   ");
        System.out.println("\t\t\t\t+===========================+");
    }

    public static void order() {
        System.out.println("Tekan 1 untuk Mie Ayam, Tekan 2 untuk Bakso Urat, Tekan 3 untuk Bakso Telor, Tekan 4 untuk Nasi Goreng, Tekan 5 untuk Kembali");
        System.out.println("Pilih menu yang anda inginkan? :");
        choose = input.nextInt();

        if (choose == 1) {
            System.out.println("kamu pilih Mie Ayam");
            System.out.println("berapa banyak Mie Ayam yang anda inginkan");
            quantity = input.nextInt();
            total = total + (quantity * 12000);

            System.out.println("Apakah ada yang ingin dipesan lagi? ");
            System.out.println("Tekan Y untuk ya and N untuk no : ");
            again = input.next();
            if (again.equalsIgnoreCase("Y")) {
                order();
            } else {
                System.out.println("Jumlah uang yang akan dibayarkan");
                pay = input.nextDouble();
                if (pay <= total) {
                    System.out.println("Pembayaran tidak cukup");
                } else {
                    System.out.println("Total harga" + total);
                    total = pay - total;
                    System.out.println("Uang Kembalian" + total);
                }
            }
        } else if (choose == 2) {
            System.out.println("kamu pilih Bakso Urat");
            System.out.println("berapa banyak Bakso Urat yang anda inginkan");
            quantity = input.nextInt();
            total = total + (quantity * 13000);

            System.out.println("Apakah ada yang ingin dipesan lagi? ");
            System.out.println("Tekan Y untuk ya and N untuk no : ");
            again = input.next();
            if (again.equalsIgnoreCase("Y")) {
                order();
            } else {
                System.out.println("Jumlah uang yang akan dibayarkan");
                pay = input.nextDouble();
                if (pay <= total) {
                    System.out.println("Pembayaran tidak cukup");
                } else {
                    System.out.println("Total harga" + total);
                    total = pay - total;
                    System.out.println("Uang Kembalian" + total);
                }
            }
        } else if (choose == 3) {
            System.out.println("kamu pilih Bakso Telor");
            System.out.println("berapa banyak Bakso Telor yang anda inginkan");
            quantity = input.nextInt();
            total = total + (quantity * 15000);

            System.out.println("Apakah ada yang ingin dipesan lagi? ");
            System.out.println("Tekan Y untuk ya and N untuk no : ");
            again = input.next();
            if (again.equalsIgnoreCase("Y")) {
                order();
            } else {
                System.out.println("Jumlah uang yang akan dibayarkan");
                pay = input.nextDouble();
                if (pay <= total) {
                    System.out.println("Pembayaran tidak cukup");
                } else {
                    System.out.println("Total harga" + total);
                    total = pay - total;
                    System.out.println("Uang Kembalian" + total);
                }
            }
        } else if (choose == 4) {
            System.out.println("kamu pilih Nasi Goreng");
            System.out.println("berapa banyak Nasi Goreng yang anda inginkan");
            quantity = input.nextInt();
            total = total + (quantity * 10000);

            System.out.println("Apakah ada yang ingin dipesan lagi? ");
            System.out.println("Tekan Y untuk ya and N untuk no : ");
            again = input.next();
            if (again.equalsIgnoreCase("Y")) {
                order();
            } else {
                System.out.println("Jumlah uang yang akan dibayarkan");
                pay = input.nextDouble();
                if (pay <= total) {
                    System.out.println("Pembayaran tidak cukup");
                } else {
                    System.out.println("Total harga" + total);
                    total = pay - total;
                    System.out.println("Uang Kembalian" + total);
                }
            }
        } else if (choose == 5) {
            System.exit(0); // close program
        } else {
            System.out.println("Pilihan 1 sampai 5 saja!");
            order();
        }
    }

    public static void main(String[] args) {
        menu();
        order();
    }
}