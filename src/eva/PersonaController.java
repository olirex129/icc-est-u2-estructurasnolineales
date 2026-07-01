package eva;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
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

    public Map<String,Set<String>> agruparPorEdad(List<Persona> personas){
 
    // para sacar el primer nombre usamos el split
    // cuando encuentre un espacio va a divir la palabra en un arreglo de Strings
    // va a retornar, "Juan","Perez" y para quedarnos con el primer nombre sacamos la posicion 0.
    // String[] palabras = nombre.split(" ");
    // String primerNombre = palabras[0];
    // String pNombre = nombre.split("")[0];
    Map<String,Set<String>> mapa = new TreeMap<>();
    Set<String> joven = new LinkedHashSet<>();
    Set<String> adulto = new LinkedHashSet<>();
    Set<String> mayor = new LinkedHashSet<>();
    mapa.put("joven", joven);
    mapa.put("adulto", adulto);
    mapa.put("mayor", mayor);
    for (Persona persona : personas) {
        if(persona.getEdad()<30)
            joven.add(persona.getNombre().split(" ")[0].toLowerCase());
        else if(persona.getEdad()<60)
            adulto.add(persona.getNombre().split(" ")[0].toLowerCase());
        else{
            mayor.add(persona.getNombre().split(" ")[0].toLowerCase());
        }
    }
    return mapa;
    
    }
    
}
