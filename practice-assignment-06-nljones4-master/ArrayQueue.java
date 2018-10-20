public class ArrayQueue implements Queue {

	private Object[] arr;
	private int head;
	private int tail;
	private int size;
	
	public ArrayQueue(){
		arr = new Object[10];
		head = 0;
		tail = -1;
		size = 0;
	}
	public Object dequeue(){
		if(empty()){
			throw new IllegalArgumentException("empty");
		}
		Object obj = arr[head % arr.length];
		++head;
		size--;
		return obj;
	}

	public void enqueue(Object item){
		if (tail >= arr.length){// when number of elements is the size of array
			grow_array();
		}
		++tail;
		arr[tail % arr.length] = item;
		size++;
	}
	
	public boolean empty(){
		return size == 0;
	}

	public void grow_array(){
		Object [] newArray = new Object[arr.length*2];
		for (int i = head; i <=tail;i++){
			newArray[i] = arr[i % arr.length];
		}
		arr = newArray;
		head = 0;
		tail = size-1;
		
	}
}