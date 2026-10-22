# ListadeReproduccion
Actividad binas - vale

retos-listas-Molina Rosas-Villanueva Lazo/ 

# Reto 2: Lista doble — Reproductor de canciones

## Integrantes
- Molina Rosas Maria Valeria
-Villanueva Lazo Lluvia EStefania

## Datos de la actividad
- **Asignatura:** Estructuras de datos
- **Docente:**  Rodriguez Barron
- **Versión:** B — Lista de reproducción de canciones
- **Reto:** 2 — Reproductor con anterior y siguiente
- **Fecha:** 22/10/2026

## Objetivo
Implementar una lista doblemente enlazada para organizar una lista de canciones, permitiendo agregarlas al final, insertar una canción después de otra y recorrer la playlist en sentido inverso.

## Conceptos aprendidos

Una lista doblemente enlazada es una estructura de datos en la que cada nodo contiene un dato y dos referencias: una al siguiente nodo y otra al nodo anterior. Esto permite recorrer la lista en ambos sentidos.

Una de sus ventajas es que se puede avanzar y retroceder entre las canciones sin tener que comenzar desde el principio. Como desventaja, es necesario actualizar correctamente los dos enlaces al insertar elementos para evitar errores en la lista.

Un ejemplo de uso real es un reproductor de música, donde podemos pasar a la siguiente canción o regresar a la anterior.

## Reto 2: Reproductor con anterior y siguiente

### ¿Qué se pidió?
Completar el código de una lista doblemente enlazada para insertar canciones al final, insertar una canción después de otra canción indicada y mostrar la playlist en orden inverso.

### ¿Cómo se resolvió?

**1. Inserción al final**

Se creó un nuevo nodo para guardar la canción. Si la lista estaba vacía, el nodo se asignó tanto a la cabeza como a la cola. Si ya existían canciones, se enlazó el último nodo con el nuevo y se actualizó la cola.

**2. Inserción después de una canción**

Primero se recorrió la lista para encontrar la canción indicada. Si se encontró, se creó el nuevo nodo y se actualizaron las referencias `anterior` y `siguiente` para colocarlo después de la canción existente. Si la canción indicada era la última, también se actualizó la cola.

**3. Recorrido inverso**

Para mostrar las canciones en orden inverso, se comenzó desde la cola y se avanzó utilizando la referencia `anterior` hasta llegar a `null`.

### Pruebas realizadas

- Se agregaron canciones al final de la playlist.
- Se mostró la lista en orden normal.
- Se mostró la lista en orden inverso.
- Se insertó una canción después de otra existente.
- Se insertó una canción después de la última para comprobar la actualización de la cola.
- Se intentó insertar una canción después de una que no existe.
- Se comprobó el funcionamiento con

<img width="1917" height="1067" alt="Reto3-ejecucion" src="https://github.com/user-attachments/assets/a4169021-2a05-438a-a92b-c68aaa7908aa" />
<img width="1600" height="808" alt="Reto3-compilacion" src="https://github.com/user-attachments/assets/5a8d24a1-0347-4081-83d3-68d59bce5ed2" />
<img width="1896" height="1086" alt="Reto2- ejecucion" src="https://github.com/user-attachments/assets/c4a50212-12ff-49d3-ba6f-9003dd638cd6" />
<img width="1892" height="1022" alt="Reto2- compilacion" src="https://github.com/user-attachments/assets/85a262e0-b1a7-4158-96f1-f36566e59c20" />
<img width="1902" height="1085" alt="Reto1-ejecucion" src="https://github.com/user-attachments/assets/e473245f-1569-4239-9593-f3ac658eb67d" />
<img width="1920" height="1200" alt="Reto1-compilacion" src="https://github.com/user-attachments/assets/f0570624-0634-4177-9b41-bbb89ea32ab4" />









