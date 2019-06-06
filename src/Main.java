public class Main {
	
    public static void main(String[] args) {
    	
    	BinaryTree btree = new BinaryTree();

        insertThread t_in_7 = new insertThread(7, btree);
        insertThread t_in_8 = new insertThread(8, btree);
        insertThread t_in_5 = new insertThread(5, btree);
        insertThread t_in_3 = new insertThread(3, btree);
        insertThread t_in_2 = new insertThread(2, btree);
        insertThread t_in_9 = new insertThread(9, btree);
        insertThread t_in_1 = new insertThread(1, btree);

        lookUpThread tlook10 = new lookUpThread(10, btree);
        lookUpThread tlook3 = new lookUpThread(3, btree);
        lookUpThread tlook4 = new lookUpThread(4, btree);
        lookUpThread tlook5 = new lookUpThread(5, btree);
        lookUpThread tlook6 = new lookUpThread(13, btree);
        lookUpThread tlook7 = new lookUpThread(7, btree);
        lookUpThread tlook8 = new lookUpThread(8, btree);
        lookUpThread tlook9 = new lookUpThread(9, btree);
        lookUpThread tlook11 = new lookUpThread(11, btree);

        deleteThread del_3 = new deleteThread(3, btree);
        deleteThread del_9 = new deleteThread(9, btree);
        deleteThread del_8 = new deleteThread(8, btree);

        t_in_7.start();
        tlook9.start();
        t_in_8.start();
        t_in_5.start();
        tlook8.start();
        del_3.start();
        t_in_3.start();
        tlook3.start();
        tlook4.start();
        t_in_2.start();
        t_in_9.start();
        t_in_1.start(); 
        tlook10.start();
        del_8.start();
        del_9.start();
        tlook5.start();
        tlook6.start();
        tlook7.start();
        tlook11.start();      
    }
}
