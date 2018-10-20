
public class ArrayStack implements Stack {
	
	protected Object [] arr = new Object [10];
	protected int top;
	public ArrayStack(){
		top = -1;
		arr = new Object [100000];
	}
	
	public void push(Object item){
		arr[++top] = item;
	}
	public Object pop(){
		if(!empty()){
			throw new IllegalArgumentException("List is empty");
		}
		return arr[top--];
	}
	public Object peek(){
		if(!empty()){
			return arr[top];
		}
		throw new IllegalArgumentException("List is empty");
	}
	
	public boolean empty(){
		return true;
	}







}