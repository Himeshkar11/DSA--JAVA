import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // BinaryTree tree = new BinaryTree();
        // Scanner sc = new Scanner(System.in);
        // tree.populate(sc);
        // tree.Display();
        // tree.prettyDisplay();
        BST bst = new BST();
        int [] nums = {1,2,3,4,5,6,7,8,9};
        bst.populate(nums);
        bst.display();

    }

}
