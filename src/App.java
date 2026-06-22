import structures.Models.Persona;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        // runIntTree();
        runEjercicios();
    }
    public static void runIntTree(){

        /* 
        IntTree arbolNumeros = new IntTree();
        // aun no estan asociados
        Node<Integer> nodo1 = new Node<>(50);
        // ahora si estan asociados
        arbolNumeros.setRoot(nodo1);
        // instanceo los nodos que apuntaran hacia otros nodos
        Node<Integer> nodo2 = new Node<>(10);
        Node<Integer> nodo3 = new Node<>(30);
        // coloco hacia que nodo apuntara a que nodo
        nodo1.setRight(nodo2);
        nodo2.setLeft(nodo3);
        System.out.println(arbolNumeros.getRoot().getRight().getLeft());
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
       System.out.println("El peso/nodos que tiene el arbos es:" + arbolNumeros.getWeight() + " y " + arbolNumeros.getPeso());
       System.out.println("");

    }

    public static void runBinaryTree(){

        BinaryTree<String> arbolDeString = new BinaryTree<>();
        BinaryTree<Persona> arbolDePersona = new BinaryTree<>();

        arbolDePersona.add(new Persona("Pablo",30));
        arbolDePersona.add(new Persona("Ana",25));
        arbolDePersona.add(new Persona("Luis",35));
        arbolDePersona.add(new Persona("Maria",28));

    }

    public static void runEjercicios(){
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = new int[] {5,3,7,2,4,6,8};
        ejercicio1.insert(numeros);
        Ejercicio2 ejercicio2 = new Ejercicio2();
        BinaryTree<Integer> arbol2 = new BinaryTree<>();
        for (int num : numeros) {
        arbol2.add(num);
    } 
        BinaryTree<Integer> arbolInvertido = ejercicio2.invertirArbol(arbol2.getRoot());
    }
    
}
