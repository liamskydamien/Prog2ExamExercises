package Uebungen;

public class BinaryTree<T extends Comparable<T>> {
    private class Node{

        private Node right = null;
        private Node left = null;
        private T value;

        public Node(T value){
            this.value = value;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public T getValue() {
            return value;
        }
    }

    Node root = null;

    public boolean isEmpty(){
        return root == null;
    }

    public void addValue(T e){
        if(isEmpty()){
            root = new Node(e);
        }
        else {
            rekAddValue(e, root);
        }
    }

    private void rekAddValue(T e, Node root){
            int i = root.getValue().compareTo(e);
            if(i == 0){
                throw new IllegalArgumentException();
            }
            else if(i < 0){
                if(root.getLeft() == null){
                    root.setLeft(new Node(e));
                }
                else {
                    rekAddValue(e, root.getLeft());
                }
            }
            else {
                if(root.getRight() == null){
                    root.setRight(new Node(e));
                }
                else {
                    rekAddValue(e, root.getRight());
                }
            }
        }

    public int size(){
        return count(root);
    }

    private int count(Node e){
        if(e != null){
            return 1 + count(e.getLeft()) + count(e.getRight());
        }
        else{
            return 0;
        }
    }

    public String preorder(){
        return rekPre(root);
    }

    private String rekPre(Node e){
        if(e != null){
        return e.getValue() + " " + rekPre(e.getLeft()) + " " + rekPre(e.getRight());
        }
        else{
            return "";
        }
    }

    private Node deleteRecursively(Node root, T value) {
        if (root == null)
            return null;
        if (value.compareTo(root.getValue()) > 0) {
            root.setLeft(deleteRecursively(root.left, value));
        } else if (value.compareTo(root.getValue()) < 0) {
            root.setRight(deleteRecursively(root.right, value));
        } else {

            if (root.left == null) {
                return root.right;
            } else if (root.right == null)
                return root.left;

            root.value = inOrderSuccessor(root.getRight());
            root.setRight(deleteRecursively(root.right, root.value));
        }

        return root;

    }

    public void delete(T e){
        deleteRecursively(root,e);
    }

    public T inOrderSuccessor(Node root) {
        T minimum = root.value;
        while (root.left != null) {
            minimum = root.left.value;
            root = root.left;
        }
        return minimum;
    }

}

