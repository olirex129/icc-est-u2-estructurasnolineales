package structures.collections.maps;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import structures.Models.Contacto;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Maps {

    // Map<K,V>
    // Map<tipoClave,tipoValor>
    // Map<String,Integer>

    public Map<String,Integer> contruirMap(){
        Map<String,Integer> mapa = new HashMap<>();
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);

        System.out.println(mapa.size());
        System.out.println(mapa);

        // Imprimir Solamente los valores creando un arrayList temporal
        for(int i = 0;i<mapa.size();i++){
            System.out.print(mapa.values().toArray()[i]+",");
        }
        System.out.println("");

        // Imprimir solamente las llaves nos devuelve un set porque no se pueden repetir 
        // y debemos de respetar los tipos de valores 
        for (String key : mapa.keySet()) {
            System.out.print(key+",");
        }
        System.out.println("");

        System.out.print(mapa.get("A")+",");
        System.out.print(mapa.get("B")+",");
        System.out.println(mapa.get("F"));// si no existe la llave sera null

        mapa.putIfAbsent("F", 100); // evita sobreescribir una key que ya tenemos en el diccionario
        mapa.putIfAbsent("A", 200);
        System.out.println(mapa);

        return mapa;
    }

    public Map<String,Integer> cLinkedHashMap(){

        // la diferencia a los demas es que el orden que tenga va a ser de tipo 
        // del primero al que entre, guardando la informacion del siguiente nodo
        Map<String,Integer> mapa = new LinkedHashMap<>();
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);

        return mapa;
    }

    public Map<String,Integer> cTreeHashMap(){

        // Guarda el orden natural pero solamente de las claves
        // no de los valores
        // como lo ordena con el orden natural de los String 
        // que seria alfabeticamente y las MAYUSCULAS PRIMERO
        // solo ve la primera letra
        Map<String,Integer> mapa = new TreeMap<>();
        mapa.put("J", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);



        System.out.println(mapa);
        return mapa;
    }

    public Set<Contacto> ordenarUnicos(List<Contacto> contractos){
        // retornar los contactos unicos
        // solo por el nombre, no por el numero
        // ordene segun el apellido en de forma decendiente
        Set<Contacto> nuevo = new TreeSet<>(
            (c1,c2)->
            {
                if(c1.getNombre().equals(c2.getNombre())){
                return 0;
                }
                return c1.getApellido().compareTo(c2.getApellido());
                
                
            }
        );
        for (Contacto contacto : nuevo) {
            nuevo.add(contacto);
        }
        return nuevo;


    }

    
}
