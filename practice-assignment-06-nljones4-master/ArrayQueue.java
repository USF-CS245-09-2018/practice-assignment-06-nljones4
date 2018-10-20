public class ArrayQueue implements Queue {

	protected Object[] arr = new Object[10];
	protected int head = 0;
	protected int tail = 0;
	protected int size = 0;
	
	public Object dequeue(){
		if(empty()){
			throw new IllegalArgumentException("empty");
		}
		Object obj = arr[head];
		//++head;
		//arr[head] = null; //Removingg?
		head = (head+1) % arr.length;
		size--;
		return obj;
	}
	public void enqueue(Object item){
		if ((tail+1) % arr.length == head){// when number of elements is the size of array
			grow_array();
		}
		arr[tail++] = item;
		if(tail>= arr.length){
			tail = 0;
		}
		
	}
	
	public boolean empty(){
		if (head ==tail){
			return true;
		}
		return false;
	}

	public void grow_array(){
		Object [] newArray = new Object[arr.length*2];
		tail = 0;
		for (int i = head; i < arr.length+head;i++){
			newArray[tail++] = arr[i % arr.length];
		}
		head = 0;
		arr = newArray;
		
	}

}