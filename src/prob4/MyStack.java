package prob4;

public class MyStack implements Stack {

	String[] buffer=null;
	int count=-1;

	
	public MyStack(int capacity){
		buffer = new String[capacity];
		
	}
	public void resizeBuffer(){
		String[] temp = new String[buffer.length*2];
		for(int i=0;i<=count;i++){
			temp[i]=buffer[i];
		}
		buffer = temp;
	}
		
	@Override
	public void push(String item) {
		// TODO Auto-generated method stub
		
		if(count+1==buffer.length){
			resizeBuffer();
		}
		count++;
		buffer[count]=item;

	}

	@Override
	public String pop() throws MyStackEmptyException {
		// TODO Auto-generated method stub
		if(count==-1){
			throw new  MyStackEmptyException();
		}
		count--;
		return buffer[count+1];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		
		return count ==-1;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		
		
		return count+1;
	}

}
