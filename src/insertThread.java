
public class insertThread extends Thread {
	
	int value;
	BinaryTree btree;
	
	public insertThread(){
	}
	
	public insertThread(int value, BinaryTree btree){
		
		this.value = value;
		this.btree = btree;
	}
	
	public void run(){
		btree.insert(value);
	}
}
