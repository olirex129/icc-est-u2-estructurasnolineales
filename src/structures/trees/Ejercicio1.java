package structures.trees;

import structures.node.Node;

public class Ejercicio1 {
    
    public void insert(int[] numeros){
    // CREAR ARBOL ENTEROS
    // INSERTAR CADA NUMERO

    // IMPRIMIR EL ARBOL
    BinaryTree<Integer> arbolBinario = new BinaryTree<>();
    for (int i : numeros) {
        arbolBinario.add(i);
    }
    preOrderRecursivo(arbolBinario.getRoot(), 0);
}
    private void preOrderRecursivo(Node<Integer> actual,int nivel) {
        if(actual == null){
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


