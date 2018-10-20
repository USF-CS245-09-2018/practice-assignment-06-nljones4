
public class ArrayStack implements Stack {
	
	private Object [] arr;
	private int top;
	
	public ArrayStack(){
		top = -1;
		arr = new Object[10];
	}
	
	public void push(Object item){
		if (top == arr.length-1){// when number of elements is the size of array
			grow_array();
		}
		arr[++top] = item;
	}
	public Object pop(){
		if(empty()){
			throw new IllegalArgumentException("List is empty");
		}
		return arr[top--];
	}
	public Object peek(){
		if(empty()){
			throw new IllegalArgumentException("List is empty");
		}
		return arr[top];
		
	}
	
	public boolean empty(){
		return top == -1;
	}

	public void grow_array(){
		Object [] newArray = new Object[arr.length*2];
		for (int i = 0; i < arr.length;i++){
			newArray[i] = arr[i];
		}
		arr = newArray;
		
	}





}