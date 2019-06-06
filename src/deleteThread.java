
public class deleteThread extends Thread {

	int value;
	BinaryTree btree;
	
	public deleteThread(){
	}
	
	public deleteThread(int value, BinaryTree btree){
		
		this.value = value;
		this.btree = btree;
	}
	
	public void run(){
		btree.delete(value);
	}
}
