import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RemoveDuplicates {
	
	public <E> void removeDuplicates(ArrayList<E> list){
		System.out.println("Before: " + list);
		E currItem;  
		for(int index1 = 0; index1 < (list.size() -1); index1++){
			currItem = list.get(index1);
			for(int index2 = (index1 + 1); index2 < list.size(); index2++){
				if(currItem.equals(list.get(index2))){
					list.remove(index2);
					index2--;
					
				}
			}
		}
		System.out.println("After: " + list);
	}
	
	public static void main(String[] args) {
		RemoveDuplicates dialt = new RemoveDuplicates();
		ArrayList<Integer> testList = new ArrayList<>();
		
		
		testList.addAll(Arrays.asList(1, 2, 3, 4, 5));
		dialt.removeDuplicates(testList);
		testList.clear();
		
		testList.addAll(Arrays.asList(1, 2, 3, 4, 5, 1));
		dialt.removeDuplicates(testList);
		testList.clear();
		
		testList.addAll(Arrays.asList(1, 2, 8, 4, 5));
		dialt.removeDuplicates(testList);
		testList.clear();
		
		testList.addAll(Arrays.asList(1, 2, 5, 4, 5));
		dialt.removeDuplicates(testList);
		testList.clear();
		
		testList.addAll(Arrays.asList(100, 2000, 89, 43, 51));
		dialt.removeDuplicates(testList);
		testList.clear();
		
		Random rdm = new Random();
		
		for(int counter = 0; counter < 30; counter++){
			testList.add(rdm.nextInt(5) + 1);
		}
		
		dialt.removeDuplicates(testList);
		testList.clear();
		
		for(int counter = 0; counter < 25; counter++){
			testList.add(4);
		}
		dialt.removeDuplicates(testList);
		testList.clear();
	}
}
