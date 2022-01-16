package KalkulatorStatistika;

import java.util.Scanner;

public class KalkulatorStatistika {
        public static String kalkulator () {
            Scanner userInput = new Scanner(System.in);
            int x,y,kv;
            String lagi = "y";
            System.out.println("Selamat datang Di kalkulator Statistika ");
            System.out.println("Tekan tombol");
            System.out.println("1. Kofisiensi Variasi");
            System.out.println("2. Rata rata ");
            System.out.println("3. Median ");
            System.out.println("4. Modus");
            System.out.println("5. Keluar");
            System.out.print("Masukan Pilihan Anda = ");
            int pilihan = userInput.nextInt();
            Scanner input = new Scanner(System.in);
            if (pilihan == 1) {
                System.out.print("Masukan nilai simpanan baku :");
                x = input.nextInt();
                System.out.print("Masukan nilai rata rata :");
                y = input.nextInt();
                System.out.println(x * 100 / y);
                System.out.println("hasil = ");
                kv = x * 100 / y;
            }

            else if (pilihan == 2){
                float bil1, bil2, bil3,bil4, jumlah, rata;
                System.out.println("input bilangan");
                System.out.println("Masukan bilangan 1 :");
                bil1 = userInput.nextFloat();
                System.out.println("Masukan bilangan 2 :");
                bil2 = userInput.nextFloat();
                System.out.println("Masukan bilangan 3 :");
                bil3= userInput.nextFloat();
                System.out.println("Masukan bilangan 4 :");
                bil4= userInput.nextFloat();
                jumlah = bil1+bil2+bil3+bil4;
                rata = jumlah/4;
                System.out.println("Output bilangan mencari rata-rata");
                System.out.println(bil1+"+"+bil2+"+"+bil3+"+"+bil4+"="+jumlah);
                System.out.println(jumlah+"/4 ="+rata);
            }
            else if (pilihan == 3){
                double[] angka = new double[10];
                for (int i = 0; i < 10; i=i+1) {
                    System.out.print("angka ke " + (i+1) + " : ");
                    angka[i] = new Scanner(System.in).nextDouble();}
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9 - i; j++) {
                        if (angka[j] > angka[j + 1]) {
                            double n = angka[j];
                            angka[j] = angka[j + 1];
                            angka[j + 1] = n;}}}
                double median = (angka[4]+angka[5])/2;
                System.out.println("Median : " + median);

            }

            else if (pilihan == 4) {
                float a,P,n,F,f, Median;
                System.out.println("Menghitung Median");
                System.out.println("Masukkan nilai 1 ");
                a = userInput.nextFloat();
                System.out.println("masukan niali 2");
                P = userInput.nextFloat();
                System.out.println("masukan nilai 3");
                n = userInput.nextFloat();
                System.out.println("masukan niai 4");
                F = userInput.nextInt();
                System.out.println("masukan nilai 5");
                f = userInput.nextInt();

                Median = a+P*(n/2-F)/f;

                System.out.println("Hasil Modus adalah : " + Median);

            }

            else {
                System.out.println("Nomor yang dipilih tidak ada di menu.");
            }
            return "Program selesai";
        }
}
