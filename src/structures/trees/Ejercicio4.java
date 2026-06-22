package structures.trees;

import structures.node.Node;

public class Ejercicio4 {
    public int maxDepth(Node root){
        return maxDepthRecursivo(root);
    }

    private int maxDepthRecursivo(Node actual) {
        if(actual == null)
            return 0;

        int DepthLeft = maxDepthRecursivo(actual.getLeft());
        int DepthRight = maxDepthRecursivo(actual.getRight());
        return 1 + Math.max(DepthLeft, DepthRight);
    }
}
