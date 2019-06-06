
public class lookUpThread extends Thread {

	int value;
	BinaryTree btree;
	
	public lookUpThread(){
	}
	
	public lookUpThread(int value, BinaryTree btree){
		
		this.value = value;
		this.btree = btree;
	}
	
	public void run(){
		btree.lookUp(value);
	}
}
