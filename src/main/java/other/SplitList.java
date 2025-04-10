package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitList {
	
	public static void main(String[] args) {
		List<Integer> List1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int Split_Value = 3;
		
		List<List<Integer>> result = new ArrayList<>();
		
		for (int i = 0; i < List1.size(); i += Split_Value) {
			int end = Math.min(i + Split_Value, List1.size());
			result.add(new ArrayList<>(List1.subList(i, end)));
		}
		
		System.out.println(result);
	}

}
