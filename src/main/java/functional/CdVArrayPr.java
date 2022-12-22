package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CdVArrayPr {

	public static void main(String[] args) {

		int arr1[] = {2,3,1,3,2,4,6,7,9,2,19};
		
		int arr2[] = {2,1,4,3,9,6};
		
		List<Integer> list = toList(arr1);
		
		List<Integer> l1 = toList(arr2);
		
		List<Integer>  it = list.stream()
								.filter(e->!l1.contains(e)).collect(Collectors.toList());
		
		System.out.println(it);
	}

	private static List<Integer> toList(int[] arr1) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i : arr1)
			list.add(i);
		
		return list;
	}

}
