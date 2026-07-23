import java.util.Scanner;

public class BinaryTree{
    public BinaryTree(){


    }
    private static class Node{
        int value;
        Node left;
        Node right;
        int height;
        public Node(int value){
            this.value = value;
        }
    }
        private Node root;
    
        // insertion 
        public void populate(Scanner scanner){
            System.out.println("Enter the root Node : ");
            int value = scanner.nextInt();
            root = new Node(value);
            populate(scanner,root);
        }
        private void populate(Scanner scanner,Node node){
            System.out.println("Do you want to insert at the left of " +  node.value);
            boolean left = scanner.nextBoolean();
            if(left){
                System.out.println("Enter the value of the left of " + node.value);
                int value = scanner.nextInt();
                node.left = new Node(value);
                populate(scanner,node.left);
            }
            System.out.println("Do you want o insert at the right of the node : " + node.value);
            boolean right = scanner.nextBoolean();
            if (right) {
                System.out.println("Enter the value of the right of " + node.value);
                int value = scanner.nextInt();
                node.right = new Node(value);
                populate(scanner,node.right);                
            }
        }
        //  displaying the elemets
        public void Display(){
            display(root," ");
        }
        private void display (Node node, String indent){
            if(node == null){
                return ;

            }
            System.out.println(indent + node.value);
            display(node.left, indent + "\t");
            display(node.right, indent + "\t");
        }
        // pretty display
        public void prettyDisplay(){
            prettyDisplay(root,0);
        }
        private void prettyDisplay(Node node, int level){
            if (node == null) {
                return;
            }
            prettyDisplay(node.right,level+1);
            if (level!=0) {
                for (int i = 0; i < level -1; i++) {
                    System.out.println("|\t\t");
                }
                System.out.println("|---->");
            }else{
                System.out.println(node.value);
            }
            prettyDisplay(node.right , level+1);
        }
    
    }

