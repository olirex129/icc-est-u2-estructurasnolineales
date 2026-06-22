import java.util.List;

import structures.Models.Persona;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;
import structures.trees.Ejercicio3;
import structures.trees.Ejercicio4;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        // runIntTree();
        runEjercicios();
    }

    public static void runIntTree() {

        /*
         * IntTree arbolNumeros = new IntTree();
         * // aun no estan asociados
         * Node<Integer> nodo1 = new Node<>(50);
         * // ahora si estan asociados
         * arbolNumeros.setRoot(nodo1);
         * // instanceo los nodos que apuntaran hacia otros nodos
         * Node<Integer> nodo2 = new Node<>(10);
         * Node<Integer> nodo3 = new Node<>(30);
         * // coloco hacia que nodo apuntara a que nodo
         * nodo1.setRight(nodo2);
         * nodo2.setLeft(nodo3);
         * System.out.println(arbolNumeros.getRoot().getRight().getLeft());
         */

        IntTree arbolNumeros = new IntTree();

        arbolNumeros.add(50);
        arbolNumeros.add(10);
        arbolNumeros.add(30);
        arbolNumeros.add(60);
        arbolNumeros.add(75);
        arbolNumeros.add(55);

        System.out.println("PreOrder");
        arbolNumeros.preOrder();
        System.out.println("");
        System.out.println("PostOrder");
        arbolNumeros.postOrder();
        System.out.println("");
        System.out.println("InOrder");
        arbolNumeros.inOrder();
        System.out.println("");
        System.out.println();
        System.out.println("");
        System.out.println(
                "El peso/nodos que tiene el arbos es:" + arbolNumeros.getWeight() + " y " + arbolNumeros.getPeso());
        System.out.println("");

    }

    public static void runBinaryTree() {

        BinaryTree<Persona> arbolDePersona = new BinaryTree<>();

        arbolDePersona.add(new Persona("Pablo", 30));
        arbolDePersona.add(new Persona("Ana", 25));
        arbolDePersona.add(new Persona("Luis", 35));
        arbolDePersona.add(new Persona("Maria", 28));

    }

    public static void runEjercicios() {
        ///////////////////////////////////////
        // CREACION DE ARBOLES
        int[] numeros = new int[] {};
        int[] numeros1 = new int[] { 5 };
        int[] numeros2 = new int[] { 5, 3, 7, 2, 4, 6, 8 };
        int[] numeros3 = new int[] { 8, 7, 6, 5, 4, 3, 2, 1 };
        BinaryTree<Integer> arbolParaInvertir = new BinaryTree<>();
        for (int num : numeros) {
            arbolParaInvertir.add(num);
        }
        BinaryTree<Integer> arbolParaInvertir1 = new BinaryTree<>();
        for (int num : numeros1) {
            arbolParaInvertir1.add(num);
        }
        BinaryTree<Integer> arbolParaInvertir2 = new BinaryTree<>();
        for (int num : numeros2) {
            arbolParaInvertir2.add(num);
        }
        BinaryTree<Integer> arbolParaInvertir3 = new BinaryTree<>();
        for (int num : numeros3) {
            arbolParaInvertir3.add(num);
        }
        BinaryTree<Integer> arbol3 = new BinaryTree<>();
        for (int num : numeros) {
            arbol3.add(num);
        }
        BinaryTree<Integer> arbol34Vacio = new BinaryTree<>();
        for (int num : numeros) {
            arbol34Vacio.add(num);
        }
        BinaryTree<Integer> arbol34UnNodo = new BinaryTree<>();
        for (int num : numeros1) {
            arbol34UnNodo.add(num);
        }
        BinaryTree<Integer> arbol34Niveles = new BinaryTree<>();
        for (int num : numeros2) {
            arbol34Niveles.add(num);
        }
        BinaryTree<Integer> arbol34Derecha = new BinaryTree<>();
        for (int num : numeros3) {
            arbol34Derecha.add(num);

        ////////////////////////////////////////////////
        System.out.println("ARBOL HORIZONTAL");
        Ejercicio1 ejercicio1 = new Ejercicio1();
        System.out.println("vacio");
        ejercicio1.insert(numeros);
        System.out.println("Uno");
        ejercicio1.insert(numeros1);
        System.out.println("Niveles");
        ejercicio1.insert(numeros2);
        System.out.println("Derecha");
        ejercicio1.insert(numeros3);
        //////////////////////////////////////////////
        System.out.println("ARBOL INVERTIDO");
        Ejercicio2 ejercicio2 = new Ejercicio2();
        System.out.println("Vacio");
        BinaryTree<Integer> arbolInvertido = ejercicio2.invertirArbol(arbolParaInvertir.getRoot());
        System.out.println("Uno");
        BinaryTree<Integer> arbolInvertido1 = ejercicio2.invertirArbol(arbolParaInvertir1.getRoot());
        System.out.println("Niveles");
        BinaryTree<Integer> arbolInvertido2 = ejercicio2.invertirArbol(arbolParaInvertir2.getRoot());
        System.out.println("Derecha");
        BinaryTree<Integer> arbolInvertido3 = ejercicio2.invertirArbol(arbolParaInvertir3.getRoot());
        //////////////////////////////////////////////
        Ejercicio3 ejercicio3 = new Ejercicio3();
        List<List<Node>> niveles = ejercicio3.listLevels(arbol34Vacio.getRoot());
        List<List<Node>> niveles1 = ejercicio3.listLevels(arbol34UnNodo.getRoot());
        List<List<Node>> niveles2 = ejercicio3.listLevels(arbol34Niveles.getRoot());
        List<List<Node>> niveles3 = ejercicio3.listLevels(arbol34Derecha.getRoot());
        System.out.println("vacio");
        imprimirListotas(niveles);
        System.out.println("Uno");
        imprimirListotas(niveles1);
        System.out.println("Niveles");
        imprimirListotas(niveles2);
        System.out.println("Derecha");
        imprimirListotas(niveles3);
        
        ////////////////////////////////////////////////////
        System.out.println("Profundidad");
        Ejercicio4 ejercicio4 = new Ejercicio4();
        System.out.println(ejercicio4.maxDepth(arbol34Vacio.getRoot()));
        System.out.println(ejercicio4.maxDepth(arbol34UnNodo.getRoot()));
        System.out.println(ejercicio4.maxDepth(arbol34Niveles.getRoot()));
        System.out.println(ejercicio4.maxDepth(arbol34Derecha.getRoot()));
    }

}
public static void imprimirListotas(List<List<Node>> niveles){
    for (List<Node> list : niveles) {
            for (Node nivel : list) {

                if (nivel != list.get(list.size() - 1)) {
                    System.out.print(nivel.getValue() + "->");
                } else
                    System.out.print(nivel.getValue());
            }
            System.out.println();
        }
}
}
