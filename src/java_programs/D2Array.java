package java_programs;
import java.util.*;

public class D2Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int rows=sc.nextInt();
		System.out.print("Enter the number of columns:");
		int col=sc.nextInt();
		
		int arr[][]=new int[rows][col];
		System.out.print("Enter the elements:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The array is: ");
		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < col; j++) {
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
		
		int[][] mirrorArray=new int[rows][col];
		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < col; j++) {
		        mirrorArray[i][j]=arr[i][col-1-j];
		    }
		}
		
		System.out.println("The mirrired array is: ");
		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < col; j++) {
		        System.out.print(mirrorArray[i][j] + " ");
		    }
		    System.out.println();
		}
		sc.close();
	}

}
