# INFORME
## - Ejerciocio1: 

La funcionalidad de esta clase es retornal un arbol con el parametro que le damos, una lista de numeros, ahora en el metodo instanceamos un arbol binario con un for e imprimirlo de forma horizontal con un nuevo metodo de imprecion que es una variacion del metodo preOrder (Mejor dicho del codigo del InOrder) hacemos un metodo recursivo el cual va sumando un nivel cada vez que llegue mas bajo, llamamos este metodo por primera vez en el mismo metodo pero en este le sumamos al nivel 1, antes de imprimir el valor del nodo nececitamos un for para imprimir los espacion necesario dependiendo del nivel (por eso esta el for) en el que se encuentre, despues imprimir los valores y finalmente llamar de nuevo al metodo recursivo.

![alt text](<accests/Captura de pantalla 2026-06-22 173628.png>)

- Ejercicio2:

En este ejercicio tenemos como parametro el nodo root/raiz y debemos de invertir los nodos del arbol, podemos hacer esto gracias a una variacion de los metodos order que nos sirven para imprimir, en vez de imprimir al entrar al nodo debemos de cambiar este nodo con el cotrario (el del otro extremo), gracias al metodo postOrder que con este envez de un "sout" le ponemos un return. Algo extra es coger el metodo de ejercicio 1 para poder imprimirlo y visualizarlo.

![alt text](<accests/Captura de pantalla 2026-06-22 174151.png>)

- Ejercicio3:

En este ejercicio debemos de poder obtener una lista de listas las cuales tengan los nodos separados en listas, una mejor forma de verlo es en niveles, la lista tiene posisciones y la lista principal tiene listitas que serian los niveles del arbol que en ellas tienen los nodos de ese nivel, para poder hcaer esto debemos de hacer un metodo el cual su base recursiva no de nada, tenga un if para validar en que si se puede añadir otro nivel extra o no, porque dependiendo de que valor salga no va a ser igual el nivel y el tamaño de la listota, despues lo agregamos a su respectivo nivel y finalmente usamos este metodo recursivo para poder llegar a todos los nodos, este metodo recursivo necesita 3 parametros, el Nodo actual, int que seria el nivel y la listota donde vamos a agregar los niveles y nodos.
![alt text](<accests/Captura de pantalla 2026-06-22 174926.png>)

- Ejercicio4

Este ejercicio nos pide ver la profundidad maxima de un arbol con el nodo raiz, este metodo solamente necesita el nodo raiz y con este hacemos el metodo recursivo el cual simplemente hacemos una variacion del metodo postOrder en el cual creamos variables int de la profundidad izquierda y derecha, las cuales nos ayudaran a llegar al fondo del estas (cuando lleguen a null) y al final un "return 1 + el mayor entre ambos" el 1 es para que cada vez que bajen mas en los nodos consideren cada bajada que hacen, porque cada vez que bajan 1 vez seria uno de profundidad extra.
![alt text](<accests/Captura de pantalla 2026-06-22 175710.png>)

## Imprecion De Los Ejerciocios
### Ejercicio1
![alt text](<accests/Captura de pantalla 2026-06-22 180305.png>)

### Ejercicio2
![alt text](accests/image.png)

### Ejercicio3
![alt text](accests/image1.png)

### Ejercicio4
![alt text](accests/image2.png)