package other;

import java.util.Stack;

public class ArrayRowFind {
	
	public static Stack rowWithMaxOnes(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		Stack<Integer> s = new Stack<>();
		int j = cols - 1;
		
		for(int i=0;i<rows;i++) {
			while(j>=0 && matrix[i][j]==1) {
				j--;
				s.push(i);
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
		int[][] matrix = {
				{1,1,1,1},
				{0,0,1,1},
				{1,1,1,1},
				{0,0,0,0}
		};
		
		Stack result = rowWithMaxOnes(matrix);
		
		System.out.println(result);
	}
}
