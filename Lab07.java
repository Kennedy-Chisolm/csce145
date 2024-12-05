//Kennedy Chisolm

import java.util.Scanner;

public class Lab07 {

	public static void main(String[] args) {
		
		
Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the rows of Matrix 1: ");
		
		int mat1_rows = key.nextInt();
		
		//checks to make sure first number for the matrix is valid
		if(mat1_rows<0)
		{
			System.out.println("Invalid number entered for rows!");
			System.exit(0);
		}
		
		System.out.println("Enter the number of columns in Matrix 1: ");
		
		int mat1_cols = key.nextInt();
		
		System.out.println("Enter the number of rows in Matrix 2: ");
		
		int mat2_rows = key.nextInt();
		
		//ensures the rows and columns match to the other rows/columns
		if(mat1_rows != mat2_rows)
		{
			System.out.println("Dimensions mismatch! Cannot add the matches");
			System.exit(0);
		}
		
		System.out.println("Enter the number of columns in Matrix 2: ");
		
		int mat2_cols = key.nextInt();
		
		if( mat1_cols != mat2_cols)
		{
			System.out.println("Dimensions mismatch! Cannot add the matches");
			System.exit(0);
		}
		//creates the 2 matrices
		
		int[][] matrix1 = new int[mat1_rows][mat1_cols];
		int[][] matrix2 = new int[mat2_rows][mat2_cols];
		
		for(int i = 0; i < mat1_rows; i++)
		{
			for(int j = 0; j < mat1_cols; j++)
			{
			System.out.println("Enter the value of the Matrix 1 at position ("+ i + "," + j + "):");
			
			matrix1[i][j] = key.nextInt();
			}
	     }
		
		//for the second matrix
		for(int i = 0; i < mat2_rows; i++)
		{
			for(int j = 0; j < mat2_cols; j++)
			{
			System.out.println("Enter the value of the Matrix 2 at position ("+ i + "," + j + "):");
			
			matrix2[i][j] = key.nextInt();
			}
	     }
		
		//matrix addition
		
		int[][] lastMatrix = new int[mat1_rows][mat2_cols];
		int sum = 0;
		
		for(int i =0; i <mat1_rows; i++)
		{
			for(int j = 0; j <mat2_cols; j++) 
			{
				
				sum = matrix1[i][j] + matrix2[i][j];
				
					lastMatrix[i][j] = sum;
			}
		
		}
		
		//prints the product matrix
		for(int i = 0; i< mat1_rows; i++)
		{
			for(int j = 0; j < mat2_cols; j++) 
			{
				System.out.print(lastMatrix[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
