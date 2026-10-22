/**RETO 2-Lista doble: Reproductor con anterior y siguiente. 
 * Permite insertar al final, insertar despues de una cancion y recorrer al reves.
 *Lluvia Estefania Villanueva Lazo 
 *Vale Molina Rosas
*/

public class Reto2 {

    //Nodo que contiene una cancion y enlaces//
    static class NodoDoble {
        String cancion;
        NodoDoble siguiente;
        NodoDoble anterior;

        NodoDoble(String cancion) {
            this.cancion = cancion;
        }
    }

    //Lista doblemente enlazada (conserva cabeza y cola)//
    static class ListaDoble {
        private NodoDoble cabeza;
        private NodoDoble cola;

        /** Agrega una cancion al final de la lista. */
        public void insertarFinal(String cancion) {
            NodoDoble nuevo = new NodoDoble(cancion);

            if (cola == null) {
                // En una lista vacia, cabeza y cola son el mismo nodo.
                cabeza = nuevo;
                cola = nuevo;
            } else {
                cola.siguiente = nuevo;
                nuevo.anterior = cola;
                cola = nuevo;
            }
        }

        //Inserta una cancion despues de la indicada. Devuelve false si no existe//
        public boolean insertarDespuesDe(String existente, String nueva) {
            NodoDoble actual = cabeza;

            while (actual != null && !actual.cancion.equals(existente)) {
                actual = actual.siguiente;
            }

            if (actual == null) {
                return false;
            }

            NodoDoble nuevo = new NodoDoble(nueva);

            // Enlaza el nuevo nodo hacia atras y hacia adelante.
            nuevo.anterior = actual;
            nuevo.siguiente = actual.siguiente;

            // Si habia un nodo despues de actual, ahora apunta al nuevo.
            if (actual.siguiente != null) {
                actual.siguiente.anterior = nuevo;
            } else {
                // Si actual era la cola, el nuevo nodo sera la cola.
                cola = nuevo;
            }

            actual.siguiente = nuevo;
            return true;
        }

        //Muestra la lista desde la cabeza hasta la cola//
        public void mostrarAdelante() {
            NodoDoble actual = cabeza;
            while (actual != null) {
                System.out.print(actual.cancion + " <-> ");
                actual = actual.siguiente;
            }
            System.out.println("null");
        }

        //Muestra la lista desde la cola hasta la cabeza//
        public void mostrarInverso() {
            NodoDoble actual = cola;
            while (actual != null) {
                System.out.print(actual.cancion + " <-> ");
                actual = actual.anterior;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        ListaDoble playlist = new ListaDoble();

        System.out.println("RETO 2: REPRODUCTOR DOBLEMENTE ENLAZADO");
        System.out.println("Lista vacia:");
        playlist.mostrarAdelante();

        playlist.insertarFinal("Eres");
        playlist.insertarFinal("Rayando el sol");
        playlist.insertarFinal("Hasta la raiz");
        playlist.insertarFinal("Limón y sal");

        System.out.println("\nPlaylist inicial:");
        playlist.mostrarAdelante();
        System.out.println("Recorrido inverso:");
        playlist.mostrarInverso();

        System.out.println("\nInsertar 'Andar conmigo' despues de 'Hasta la raiz': "
                + playlist.insertarDespuesDe("Hasta la raiz", "Andar conmigo"));
        playlist.mostrarAdelante();
        System.out.println("Recorrido inverso actualizado:");
        playlist.mostrarInverso();

        // Insercion despues de la cola para comprobar su actualizacion
        System.out.println("\nInsertar 'Me voy' despues de 'Limón y sal': "
                + playlist.insertarDespuesDe("Limón y sal", "Me voy"));
        playlist.mostrarAdelante();

        System.out.println("Intentar insertar despues de una cancion inexistente: "
                + playlist.insertarDespuesDe("No existe", "Nueva cancion"));

        // Caso de lista vacia y de un solo nodo
        ListaDoble unaCancion = new ListaDoble();
        unaCancion.insertarFinal("Solo una");
        System.out.println("\nLista de un solo nodo:");
        unaCancion.mostrarAdelante();
        unaCancion.mostrarInverso();
    }
}
