package structures.trees;

import java.util.ArrayList;
import java.util.List;


import structures.node.Node;

public class Ejercicio3 {

    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> resultado = new ArrayList<>();
        
        LevelsRecursivo(root, 0, resultado);
        return resultado;
    }

    
    private void LevelsRecursivo(Node nodoActual, int level, List<List<Node>> resultado) {
        
        if (nodoActual == null) {
            return;
        }

    
        if (level == resultado.size()) { // esta cosita de aca sirve para poder
                                         // evitar que se creen y agregen niveles 
                                         // que no deberian de existir porque son 
                                         // del mismo nodo hermano
            resultado.add(new ArrayList<>());
        }

        
        resultado.get(level).add(nodoActual);

        LevelsRecursivo(nodoActual.getLeft(), level + 1, resultado);
        LevelsRecursivo(nodoActual.getRight(), level + 1, resultado);
    }

    
    
}
