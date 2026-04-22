package Jawaban3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LotreBoard game = new LotreBoard();

        System.out.println("Welcome to E-Lottery Gosok");

        game.generateBoard();
        game.displayBoard();

        while (true) {
            System.out.print("\nMasukkan tebakan anda (baris dan kolom) : ");
            int r = sc.nextInt();
            int c = sc.nextInt();

            boolean aman = game.guess(r, c);
            game.displayBoard();

            if (!aman) {
                System.out.println("\nBOOM! Anda menemukan bom! Permainan berakhir.");
                game.bukaSemua();
                game.displayBoard();
                break;
            }
        }

        sc.close();
    }
}