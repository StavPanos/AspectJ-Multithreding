
public class BinaryTree {
    
	Node rootNode;

    public Node insertRecursive(Node current,int value){
        if (current==null){
           return new Node(value);
        }
        if (value < current.value){
            current.left = insertRecursive(current.left,value);
        }else if (value > current.value){
            current.right = insertRecursive(current.right,value);
        }else {
            return current;
        }
        return current;
    }

    public void insert(int value){
        rootNode = insertRecursive(rootNode, value);
    }

    private boolean lookUpRecursive(Node current, int value) {
        if (current == null) {
            return false;
        } 
        if (value == current.value) {
            return true;
        } 
        return value < current.value
          ? lookUpRecursive(current.left, value)
          : lookUpRecursive(current.right, value);
    }

    public void lookUp(int value){
    	boolean result = lookUpRecursive(rootNode, value);
    }

    public Node deleteRecursive(Node current, int value){
        if (current == null){
            return null;
        }
        if (current.value == value){
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, value);
            return current;
        }
        if (current.value < value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    public void delete(int value){
        rootNode = deleteRecursive(rootNode, value);
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }
}