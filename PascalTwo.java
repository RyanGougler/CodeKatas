//import java.util.Scanner;

public class PascalTwo{
	
	public static void main(String[] args){
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("How many rows: ");
		int rows = 10;//scanner.nextInt();
		printTriangle(buildTriangle(rows));
//		scanner.close();
	}
	
	private static int[][] buildTriangle(int rows){
		int columns = rows+1;
		int[][] tree = new int[rows][columns];
		
		for(int row = 0; row < tree.length; row++){
			for(int column = 0; column <= row; column++){
				if(column==0 || column==row){//first or last in row
					tree[row][column] = 1;
					continue;
				}
				tree[row][column] = tree[row-1][column-1] + tree[row-1][column];
			}
		}
		
		return tree;
	}
	
	private static void printTriangle(int[][] tree){
		for(int i = 0; i < tree.length; i++){
			for(int j = 0 ; j<tree[i].length; j++){
				if(tree[i][j]!=0){
					System.out.print(tree[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}