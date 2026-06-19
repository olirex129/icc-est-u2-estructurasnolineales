package structures.trees;

import structures.node.Node;

public class BinaryTree<T extends Comparable<T>> {
    // como nesecitamos el metodo comparebleTo se debe 
    // de poder hacerlo generico, que funcione con todo, tambien
    // con la persona 
    private Node<T> root;
    private int peso;

    public BinaryTree(){
        this.root = null;
        peso = 0;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    // este metodo sirve para que no se puedan crear grafos

    public void setRoot(T value){
        Node<T> node = new Node<>(value);
        this.root = node;
    }

    public void add(T value){
        Node<T> nodo = new Node<>(value);
        root = addRecursivo(root,nodo);
        peso += 1;
        
    }

    public Node<T> addRecursivo(Node<T> actual, Node<T> nodoInsertar){
        
        if(actual == null)
            return nodoInsertar;
        if(actual.getValue().compareTo(nodoInsertar.getValue()) > 0){
            // izquierda
            actual.setLeft(addRecursivo(actual.getLeft(), nodoInsertar));
            actual.setWeight(1);
        }
        else{
            actual.setRight(addRecursivo(actual.getRight(), nodoInsertar));
            actual.setWeight(1);
            
        }
       
        return actual;
        

    }

    public void preOrder(){
        preOrderRecursivo(root); 
    }

    private void preOrderRecursivo(Node<T> actual) {
        if(actual == null){
            return;
        }
        else{
        System.out.println(actual);
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
        }
    }

    public void postOrder(){
        postOrderRecursivo(root);
    }

    private void postOrderRecursivo(Node<T> actual){
        if(actual == null){
            return;
        }
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
        System.out.println(actual);

    }

    public void inOrder(){
        inOrderRecursivo(root);
    }

    private void inOrderRecursivo(Node<T> actual){
        if(actual == null)
            return;
        inOrderRecursivo(actual.getLeft());
        System.out.println(actual);
        inOrderRecursivo(actual.getRight());
    }

    public int getHeight(){
        return getHeightRecursivo(root);
    }

    private int getHeightRecursivo(Node<T> actual) {

        return actual != null ? 
        Math.max(getHeightRecursivo(actual.getLeft()), 
        getHeightRecursivo(actual.getRight())) + 1 : null;       
        
        
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    
}
