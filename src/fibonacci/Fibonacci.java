package fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	
	private static Long op0 = (long) 1;
	private static Long op1 = (long) 1;
	private static List<List<Long>> result = new ArrayList();
	
	public static void main(String[] args) {	
		init(50);	
	}
	/**
	 * 
	 * @param param numero di righe della sequenza da mostrare
	 */
	private static void init(int param){
		System.out.println(op0);
		List<Long> tempA = new ArrayList<>();
		tempA.add(op0);
		tempA.add(op1);
		result.add(tempA);
		int i = 1;
		while(i < param) {
			List<Long> nextRow = new ArrayList<>();
			nextRow.add((long) 1);
			int k = 0;
			while(k < result.get(i-1).size()-1) {
				Long res = result.get(i-1).get(k) + result.get(i-1).get(k+1);
				nextRow.add(res);
				k++;
			}
			nextRow.add((long) 1);
			result.add(nextRow);
			i++;
		}
		for (List<Long> row : result) {
			for (Long item : row) {
				System.out.print(item + " ");
			}
			System.out.println();
			
		}
	}
	

}
