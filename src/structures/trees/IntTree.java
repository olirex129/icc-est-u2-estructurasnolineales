package structures.trees;

import structures.node.Node;

// clase del arbol solo de enteros

public class IntTree {

    // contructor

    private Node<Integer> root;
    private int peso;

    public IntTree(){
        this.root = null;
        peso = 0;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }

    // este metodo sirve para que no se puedan crear grafos

    public void setRoot(int value){
        Node<Integer> node = new Node<>(value);
        this.root = node;
    }

    public void add(int value){
        Node<Integer> nodo = new Node<>(value);
        root = addRecursivo(root,nodo);
        peso += 1;
        
    }

    public Node<Integer> addRecursivo(Node<Integer> actual, Node<Integer> nodoInsertar){
        // como la raiz es null porque al crear el arbol es nulo
        // el primer valor que se coloque sera la raiz 
        // despues ya no se va a poder cambiar la raiz
        // IMPORTANTE ahora este if null se convierte 
        // en el metodo Base para terminar el metodo recursivo
        // haciendo que este ordene, cree una ruta y la añada
        // solamente si la ultima rama es null
        if(actual == null)
            return nodoInsertar;
        if(actual.getValue() > nodoInsertar.getValue()){
            // izquierda
            actual.setLeft(addRecursivo(actual.getLeft(), nodoInsertar));
            actual.setWeight(1);
        }
        else{
            actual.setRight(addRecursivo(actual.getRight(), nodoInsertar));
            actual.setWeight(1);
            
        }
        // si es null en vez de actual, se borraria todos 
        // los nodos asociados
        return actual;
        

    }

    public void preOrder(){
        preOrderRecursivo(root); 
    }

    private void preOrderRecursivo(Node<Integer> actual) {
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

    private void postOrderRecursivo(Node<Integer> actual){
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

    private void inOrderRecursivo(Node<Integer> actual){
        if(actual == null)
            return;
        inOrderRecursivo(actual.getLeft());
        System.out.println(actual);
        inOrderRecursivo(actual.getRight());
    }

    public int getHeight(){
        return getHeightRecursivo(root);
    }

    private int getHeightRecursivo(Node<Integer> actual) {

        return actual != null ? 
        Math.max(getHeightRecursivo(actual.getLeft()), 
        getHeightRecursivo(actual.getRight())) + 1 : null;       
        
        // lo de arriba es un metodo ternario
        
        /* if(actual == null)
            return 0;

        int heightLeft = getHeightRecursivo(actual.getLeft());
        int heightRight = getHeightRecursivo(actual.getRight());
        int masGrande = Math.max(heightLeft, heightRight);

        // Se puede unir todo esto en el return pero sera mas
        // Dificil de leer luego        

        return masGrande + 1;
        */
        
    }

    public int getWeight(){
        return weightRecursivo(root);
    }

    private int weightRecursivo(Node<Integer> actual) {
        if(actual == null)
            return 0;
        int weightLeft = weightRecursivo(actual.getLeft());
        int weightRight = weightRecursivo(actual.getRight());
        int masGrande = weightLeft + weightRight;
        return masGrande + 1;

    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    

    


    


    
}
