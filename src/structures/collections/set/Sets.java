package structures.collections.set;
import java.util.Set;
import java.util.TreeSet;

import structures.Models.Contacto;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Sets {
    
    public Sets(){
    }

    public Set<String> construirHashSet(){
        // Si no te interesa el orden usa este
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");
        return hashSet;
    }

    public Set<String> construirLinkedHashSet(){
        Set<String> lSet =  new LinkedHashSet<>();// cambia la implementacion 
        lSet.add("A");
        lSet.add("B");
        lSet.add("C");
        lSet.add("A");
        lSet.add("D");
        lSet.add("E");
        lSet.add("F");
        lSet.add("1Ggggggeegeg");
        lSet.add("2G2gggggeegeg");
        lSet.add("3Gggggeegeg");
        lSet.add("4Ggggggeegeg");
        lSet.add("5Ggggggeegeg");
        lSet.add("5Ggggggeegeg");
        lSet.add("6Ggggggeegeg");
        lSet.add("G7gggggeegeg");
        return lSet;
    }

    public Set<String> construirTreeSet(){
        Set<String> TreeSet =  new TreeSet<>(); // ordena solo con el primer caracter, si son iguales coge el siguiente.
        TreeSet.add("A"); // el numero en codigo hasky = 65
        TreeSet.add("B");
        TreeSet.add("C");
        TreeSet.add("A");
        TreeSet.add("D");
        TreeSet.add("E");
        TreeSet.add("F");
        TreeSet.add("1Ggggggeegeg"); // el numero en codigo hasky = 1
        TreeSet.add("2G2gggggeegeg");
        TreeSet.add("3Gggggeegeg");
        TreeSet.add("4Ggggggeegeg");
        TreeSet.add("5Ggggggeegeg");
        TreeSet.add("5Ggggggeegeg");
        TreeSet.add("6Ggggggeegeg");
        TreeSet.add("G7gggggeegeg");
        return TreeSet;
    }

    public Set<Contacto> contruirHashSetContacto(){
        Set<Contacto> hCSet = new HashSet<>();
        Contacto c1 = new Contacto("Juan", "Perez", "123456789");
        Contacto c2 = new Contacto("Ana", "Gomez", "987654321");
        Contacto c3 = new Contacto("Pedro", "Lopez", "456789123");
        Contacto c4 = new Contacto("Maria", "Rodriguez", "789123456");
        Contacto c5 = new Contacto("Juan", "Perez", "123456789"); // Duplicado, no se agregará
        Contacto c6 = new Contacto("Juan", "Lopez", "123456789");
        hCSet.add(c1);
        hCSet.add(c2);
        hCSet.add(c3);
        hCSet.add(c4);
        hCSet.add(c5);
        hCSet.add(c6);
        return hCSet;
    }
    
    public int compareContracto(Contacto c1, Contacto c2){
        return c1.getNombre().compareTo(c2.getNombre()); // es lo mismo que poner
        //Set<Contacto> tCSet = new TreeSet<>((c1,c2) -> { return c1.getNombre().compareTo(c2.getNombre());});
    }

    public Set<Contacto> construirTreeSetConComparador(){
        // primera forma, la segunda forma seria hacerlo directamente en la clase 
        Set<Contacto> tCSet = new TreeSet<>((c1,c2) -> { 
            int comparacionNombre = c1.getNombre().compareTo(c2.getNombre());
            if(comparacionNombre != 0)
                return comparacionNombre;
            int compA = c1.getApellido().compareTo(c2.getApellido());
            return compA;
        });
        Contacto c1 = new Contacto("Juan", "Perez", "123456789");
        Contacto c2 = new Contacto("Ana", "Gomez", "987654321");
        Contacto c3 = new Contacto("Pedro", "Lopez", "456789123");
        Contacto c4 = new Contacto("Maria", "Rodriguez", "789123456");
        Contacto c5 = new Contacto("Juan", "Perez", "123456789"); // Duplicado, no se agregará
        Contacto c6 = new Contacto("Juan", "Lopez", "123456789");
        tCSet.add(c1);
        tCSet.add(c2);
        tCSet.add(c3);
        tCSet.add(c4);
        tCSet.add(c5);
        tCSet.add(c6);
        return tCSet;
    }

}
