public class BST {
    public BST(){

    }
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;
        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return this.value;
        }
    }
    private Node root;
    public int Height(Node node){
        if (node == null) {
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public void display(){
        display(root,"Root node : ");
    }
    private void display(Node node, String details){
        if (node == null) {
            return; 
        }
        System.out.println(details + node.value);
        display(node.left , "The left chid of " + node.value + ":");
        display(node.right , "The right chid of " + node.value + ":") ;
    }
    // insertion in binary search tree
    public void insert(int value){
        root = insert(root,value);
    }
    private Node insert(Node node,int value){
        if (node == null) {
            // if there is no node then this will create a node
            node = new Node(value);
            return node;
        }
        if (value<node.value) {
            // will add them here
            node.left = insert(node.left,value);
        }
        if (value > node.value) {
            // will addd them here
            node.right = insert(node.right,value);
        }
        node.height = Math.max(Height(node.left),Height(node.right)) +1 ;
        // if node is already present then we dont want to change it so reutrn node;
        return node;
    }
    // balancing 
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if (node == null) {
            return true;
        }
        return (Math.abs(Height(node.left) - Height(node.right)) <=1 && balanced(node.left) && balanced(node.right));

    }
    // populate function 
    public void populate(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
        // traversals
    public void preOrder(){
        preorder(root);
    }
    private void preorder(Node node){
        System.out.println(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
    public void PostOrder(){
        postorder(root);
    }
    private void postorder(Node node){
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.value + " ");

    }
    public void InOrder(){
        inorder(root);
    }
    private void inorder(Node node){
        inorder(node.left);
        System.out.println(node.value + " ");
        inorder(node.right);

    }


}

