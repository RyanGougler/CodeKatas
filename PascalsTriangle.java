import java.util.Scanner;

public class PascalsTriangle {

   public static void print(int n) {
       for (int rows = 0; rows < n; rows++) {
           for (int columns = 0; columns <= rows; columns++) {
               System.out.print(pascal(rows, columns) + " ");
           }
           System.out.println();
       }
   }

   public static int pascal(int row, int column) {
       if (column == 0) {//first node
           return 1;
       } else if (column == row) {//last node
           return 1;
       } else {//return parents
           return pascal(row - 1, column - 1) + pascal(row - 1, column);
       }

   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("How many rows: ");
       int row = scanner.nextInt();
       print(row);
       scanner.close();
   }
}