import java.util.HashSet;

import linkeedlist.LinkedList;
import linkeedlist.Node;

public class DetectCycle {

	public <T> boolean isCyclic(LinkedList<T> list){
		boolean hasCycle = false;
		HashSet<Node<T>> set = new HashSet<>();
		Node<T> curr = list.getFirst();
		while( curr != null){
			if(set.add(curr)){
				curr = curr.getNext();
			}else{
				//found duplicate
				hasCycle = true;
				break;
			}
		}
		return hasCycle;
	}
	public static void main(String[] args) {
		DetectCycle detective = new DetectCycle();
		LinkedList<Integer> list = new LinkedList<>();
		Node<Integer> node;
		for(int counter = 1; counter < 6; counter++){
			node = new Node<Integer>(counter);
			list.add(node);
		}
		System.out.println("Is the LinkedList Cyclic: " + detective.isCyclic(list));
		
		list.add(list.getFirst()); //should cause a cyclic state.
		node = list.getFirst();
		for(int counter = 0; counter < 20; counter++){
			System.out.println("Current Node value: " + node.getValue());
			node = node.getNext();
			if(node == null){
				break;
			}
		}
		System.out.println("Is the LinkedList Cyclic: " + detective.isCyclic(list));

	}

}
