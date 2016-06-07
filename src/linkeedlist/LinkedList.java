package linkeedlist;

public class LinkedList <T> {
	private Node<T> first;
	private Node<T> last;
	
	public void add(Node<T> node){
		if(first == null){
			first = node;
			last = node;
		} else {
			last.setNext(node);
			last = node;
		}
	}
	
	protected void delete(Node<T> node){
		if( first == null){
			//do nothing
			return;
		}else if(first == node){
			first = null;
			last = null;
		}else{
			Node<T> prev;
			Node<T> curr;
			boolean found = false;
			prev = first;
			curr = first.getNext();
			while(!found && curr != null){
				if(curr == node){
					prev.setNext(curr.getNext());
					if(curr == last){
						last = prev;
					}
					found = true;
				}else{
					prev = curr;
					curr = curr.getNext();
				}
			}
			
		}
	}
	
	public Node<T> getFirst(){
		return first;
	}
	
	
}
