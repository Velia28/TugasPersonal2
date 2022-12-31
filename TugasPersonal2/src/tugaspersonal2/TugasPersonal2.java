/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspersonal2;
import java.util.Scanner;

/**
 *
 * @author helenravelia
 */
public class TugasPersonal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        char pilihan;
        
        do{
            System.out.println("Belajar Deret Aritmatika, Geometri dan menghitung Faktorial");
            System.out.print("Masukan banyak angka yang mau di cetak [2..10] : ");
            int banyakAngka = scanner.nextInt();
            System.out.print("Masukan beda masing-masing angka [2..9] :");
            int bedaAngka = scanner.nextInt();
            
            String deret1 = "Deret Aritmatika : ";
            String deret2 = "Deret Geometri : ";
            String deret3 = "Faktorial dari " + banyakAngka + " : ";
            
            // Deret Aritmatika
            System.out.print(deret1 + "\n");

            for (int i = 1; i <= banyakAngka * bedaAngka; i = i + bedaAngka) {
                System.out.print(i + " ");
            }
            
            // Deret Geometri
            System.out.print("\n" + deret2 + "\n");
            int a = 1, total = 0;
            for(int i = 1; i <= banyakAngka; i++){
                System.out.print(a + total);
                a = a * 2;
                if (i<banyakAngka){
                    System.out.print(" ");
                } else{
                    System.out.print("");
                }
            }
            
            // Deret Faktorial
            System.out.print("\n" + deret3 + "\n");

            for (int i = banyakAngka; i >= 1; i--) {
                System.out.print(i + " ");
            }

            System.out.println("= " + factorial(banyakAngka));

            // Bagian Penutupan
            System.out.println("Apakah anda mau ulang [Y/N] ? : ");
                pilihan = scanner.next().charAt(0);
        }
        
            while (pilihan == 'y' || pilihan == 'Y') ;
                scanner.close();
        }
    
        public static int factorial(int n){
            if (n==1){
                return 1;
            }else{
                return n * factorial(n - 1);
            }


    }
    
}
