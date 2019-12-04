/*
-----------------------------------problem statement----------------------------
Minesweeper: Minesweeper is a 1960s era video game played on an m-by-n grid of cells.
The goal is to deduce which cells contain hidden mines using clues about the number of mines in neighboring cells.
Write a program Minesweeper.java that takes three integer command-line arguments m, n, and k and prints an m-by-n grid
of cells with k mines, using asterisks for mines and integers for the neighboring mine counts
(with two space characters between each cell). To do so,
   1. Generate an m-by-n grid of cells, with exactly k of the mn cells containing mines, uniformly at random.
   2. For each cell not containing a mine, count the number of neighboring mines (above, below, left, right, or diagonal).
 */



public class Minesweeper {

    public static void main(String[] args){
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        boolean[][] mines = new boolean[m+2][n+2]; // boolean array of m*n; true for having mines in the cell

            int count = 0;
            for(int i=1; i<m+1; i++){
                for(int j=1; j<n+1; j++){
                    mines[i][j] = true;
                    count++;
                    if(count==k) {break;}
                }
                //System.out.println("count =" +count);
                if(count == k) {break;}
            }

           /* for(int i=0; i<m+2; i++){
                for(int j=0; j<n+2; j++){
                    System.out.print(mines[i][j] + " ");
                }
                System.out.println();
            }*/

            for(int i=1; i<m+1; i++){
                for(int j=1; j<n+1; j++){
                    int r = i + (int) (Math.random() * (m+1-i));
                    int c = j + (int) (Math.random() * (n+1-j));
                    boolean t = mines[r][c];
                    mines[r][c] = mines[i][j];
                    mines[i][j] = t;
                }
            }

       /* System.out.println("---------------------");
        for(int i=0; i<m+2; i++){
            for(int j=0; j<n+2; j++){
                System.out.print(mines[i][j] + " ");
            }
            System.out.println();
        }*/




        int[][] num_board = new int[m][n];

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(mines[i][j] != true){
                    int count1 = 0;
                    /* nested loop for the nine neighbors of the cell*/
                    for(int r = i-1; r<= i+1; r++){
                        for(int c = j-1; c<= j+1; c++){
                            if(mines[r][c] == true) count1++;
                        }
                    }
                    num_board[i-1][j-1] = count1;
                }
                else{
                    num_board[i-1][j-1] = k+1;
                }

            }
        }



        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(num_board[i][j] == k+1){
                    if(j==n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print("*  ");
                    }

                }
                else{
                    if(j==n-1){
                        System.out.print(num_board[i][j]);
                    }
                    else{
                        System.out.print(num_board[i][j] + "  ");
                    }
                }
            }
            System.out.println();
        }

    }
}
