package Jawaban3;

import java.util.Random;

class LotreBoard {
    private char[][] board = new char[4][5];
    private boolean[][] revealed = new boolean[4][5];
    private int[][] data = new int[4][5]; // 0 = aman, 1 = bom

    public void generateBoard() {
        Random rand = new Random();

        // isi awal
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = '*';
                data[i][j] = 0;
            }
        }

        // tanam 2 bom
        int bomb = 0;
        while (bomb < 2) {
            int r = rand.nextInt(4);
            int c = rand.nextInt(5);

            if (data[r][c] == 0) {
                data[r][c] = 1;
                bomb++;
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean guess(int r, int c) {
        if (revealed[r][c]) {
            System.out.println("Kotak telah dibuka sebelumnya!");
            return true;
        }

        revealed[r][c] = true;

        if (data[r][c] == 1) {
            board[r][c] = 'X';
            return false; // bom
        } else {
            board[r][c] = 'O'; // 🔥 sesuai soal (bukan 0)
            System.out.println("Kotak Aman");
            return true;
        }
    }

    public void bukaSemua() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (data[i][j] == 1) {
                    board[i][j] = 'X';
                } else if (!revealed[i][j]) {
                    board[i][j] = 'O';
                }
            }
        }
    }
}