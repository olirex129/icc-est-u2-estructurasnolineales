package structures.node;

public class Node<T> {

    private T value;
    private Node<T> left;
    private Node<T> right;
    private int weight;

    // crear un nodo
    // intancear el nodo
    // tiene que crearse con el valor

    public Node(T value){
        this.value = value;
        this.right = null;
        this.left = null;
        this.weight = 0;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node [" + value + "]";
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    
    
    
}
