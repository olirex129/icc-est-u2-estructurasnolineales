package eva;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PersonaController {

    public Set<Persona> filtrarPersona(List<Persona> personas, int umbral) {

    Set<Persona> personasUmbral = new TreeSet<>(
        (p1, p2) -> {
            int compE = Integer.compare(p2.getEdad(), p1.getEdad());
            if (compE != 0) {
                return compE;
            }
            return p1.getNombre().compareToIgnoreCase(p2.getNombre());
        }
    );

    for (Persona p : personas) {
        if (p.getEdad() >= umbral) {
            personasUmbral.add(p);
        }
    }

    return personasUmbral;
}

    // public Map<String,Set<String>> agruparPorEdad(List<Persona> personas){

    // String nombre = "Juan Perez"; // para sacar el primer nombre usamos el split
    // // cuando encuentre un espacio va a divir la palabra en un arreglo de Strings
    // // va a retornar, "Juan","Perez" y para quedarnos con el primer nombre sacamos la posicion 0.
    // String[] palabras = nombre.split(" ");
    // String primerNombre = palabras[0];
    // String pNombre = nombre.split("")[0];
    // Map<String,Set<String>> mapa = new TreeMap<>();
    // mapa.put(OVEN,new LinkedHashSet);
    // }
    
}
