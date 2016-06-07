import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class DuplicatesInArrayListTest {
	
	
	public <E> boolean hasDuplicates(ArrayList<E> list){
		boolean hasDuplicates = false;
		int length = list.size();
		E currItem;  
		for(int index1 = 0; index1 < (length -1); index1++){
			currItem = list.get(index1);
			for(int index2 = (index1 + 1); index2 < length; index2++){
				if(currItem.equals(list.get(index2))){
					hasDuplicates = true;
					return hasDuplicates;
				}
			}
		}
		return hasDuplicates;
	}
	
	public static void main(String[] args) {
		DuplicatesInArrayListTest dialt = new DuplicatesInArrayListTest();
		ArrayList<Integer> testList = new ArrayList<>();
		testList.addAll(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(testList + " has Duplicates: " + dialt.hasDuplicates(testList));
		testList.clear();
		
		testList.addAll(Arrays.asList(1, 2, 3, 4, 5, 1));
		System.out.println(testList + " has Duplicates: " + dialt.hasDuplicates(testList));
		testList.clear();
		
		testList.addAll(Arrays.asList(1, 2, 8, 4, 5));
		System.out.println(testList + " has Duplicates: " + dialt.hasDuplicates(testList));
		testList.clear();
		
		testList.addAll(Arrays.asList(1, 2, 5, 4, 5));
		System.out.println(testList + " has Duplicates: " + dialt.hasDuplicates(testList));
		testList.clear();
		
		testList.addAll(Arrays.asList(100, 2000, 89, 43, 51));
		System.out.println(testList + " has Duplicates: " + dialt.hasDuplicates(testList));
		testList.clear();
		
		Random rdm = new Random();
		
		for(int counter = 0; counter < 25; counter++){
			testList.add(rdm.nextInt(20) + 1);
		}
		System.out.println(testList + " has Duplicates: " + dialt.hasDuplicates(testList));
		testList.clear();
	}

}
