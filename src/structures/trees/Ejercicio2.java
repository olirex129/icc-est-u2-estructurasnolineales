package structures.trees;

import structures.node.Node;

public class Ejercicio2 {
    public BinaryTree<Integer> invertirArbol(Node<Integer> root){

        BinaryTree<Integer> arbol1 = new BinaryTree<>();
        
        Node<Integer> nuevaRaiz = invertirArbolRecursivo(root);
        
        arbol1.setRoot(nuevaRaiz); 

        preOrderRecursivo(arbol1.getRoot(), 0);

        return arbol1;

    }

    public Node<Integer> invertirArbolRecursivo(Node<Integer> actual){
        if (actual == null) {
            return null;
        }

        Node<Integer> nuevoNodo = new Node<>(actual.getValue());

        nuevoNodo.setLeft(invertirArbolRecursivo(actual.getRight()));
        nuevoNodo.setRight(invertirArbolRecursivo(actual.getLeft()));

        return nuevoNodo;
    }

    private void preOrderRecursivo(Node<Integer> actual,int nivel) {
        if (actual == null) {
            return;
        }

    
        preOrderRecursivo(actual.getRight(), nivel + 1);


        for (int i = 0; i < nivel; i++) {
            System.out.print("   "); 
        }
        
        
        System.out.println(actual.getValue());

        
        preOrderRecursivo(actual.getLeft(), nivel + 1);
    }
}

