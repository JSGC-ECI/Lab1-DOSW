# Lab1-DOSW
## Parte 1
### Integrantes
- Andres cardozo Martinez
- Juan Sebastian Guayazan Clavijo

### Preguntas
#### Parte ll
**Averigua para qué sirve y como se usan estos comandos** 
```bash
git add
```
Agrega archivos nuevos o modificados en su directorio de trabajo al área de almacenamiento temporal de Git.
```bash
git commit` -m “mensaje”
```
Registrar cambios en el repositorio
Se agrega un mensaje de confirmación

**¿Que sucedió?**       
Un integrante fue el unico que logro exitosamente subir los cambios mientras que el otro tuvo un error al tener cambios sin actualizar


#### PARTE III 
**¿Hay una mejor forma de trabajar con git para no tener conflictos?**     
Con el uso de ramas generando pull request y merge    
**¿Qué es y como funciona el Pull Request?**     
Una solicitud para generar cambios realizados en otras ramas a la rama principal

> [!NOTE]
> Este archivo solo contiene la solución a los cuestionamientos planteados     
> Para visualizar las evidencias de acciones a realizar por favor revisa el historial

---

## PARTE 2 -  Hackathon Express 2025-2
### Evidencias
#### RETO #1: La Bienvenida 
<img width="1868" height="193" alt="image" src="https://github.com/user-attachments/assets/70c6be8b-e5df-4a59-8444-43797e8069da" />
<img width="374" height="160" alt="image" src="https://github.com/user-attachments/assets/e5cc5db9-4c06-45a0-8def-15c981cec83b" />

#### RETO #2: Carrera en Paralelo
<img width="1239" height="917" alt="image" src="https://github.com/user-attachments/assets/e7945789-48b6-4c30-8e1f-6a14c611f864" />
<img width="1257" height="941" alt="image" src="https://github.com/user-attachments/assets/20476a7b-f703-4272-af1f-41e25b323f59" />

#### RETO #3: El eco misterioso 
<img width="1023" height="197" alt="image" src="https://github.com/user-attachments/assets/cdc604d7-36f3-4337-84cd-cda28d2bf12c" />

#### RETO #4: El tesoro de las Llaves duplicadas

<img width="289" height="139" alt="image" src="https://github.com/user-attachments/assets/e797607d-aada-48d4-8dc3-d32627500e5a" />

#### RETO #5: Batalla de Conjuntos

<img width="357" height="132" alt="image" src="https://github.com/user-attachments/assets/e6fdf045-d2c3-4001-8921-0d6693e50fe5" />


#### RETO #6: La máquina de decisiones

<img width="850" height="88" alt="image" src="https://github.com/user-attachments/assets/348b8b7a-56cb-4f50-b50a-0827a560bb47" />


## PARTE 3 – Cuestionario
1.	Cuál es la diferencia entre git merge y git rebase

git merge Une dos o más historiales de desarrollo

git rebase Reaplicar confirmaciones sobre otra base tip

2. Si dos ramas modifican la misma línea de un archivo ¿Qué sucede al hacer merge? 

Se produce un conflicto de merge. Git no sabe cuál cambio mantener y pedirá que resuelvas manualmente

3.	¿Cómo puedes ver gráficamente el historial de merges y ramas en consola? 

git log --oneline --graph --all

4.	Explica la diferencia entre un commit y un push? 

Commit Registra cambios en el repositorio

Push Actualizar referencias remotas junto con los objetos asociados

5.	Para que sirve git stash y git pop? 

git stash Guarda los cambios en un directorio de trabajo sucio

git pop elimina elementos del historial del stash

6.	Qué diferencia hay entre HashMap y HashTable? 

HashMap:
•	No es sincronizado
•	Permite null como clave y valores.

Hashtable:
•	Sincronizado → seguro en entornos multihilo, pero más lento.
•	No permite claves ni valores null.

7.	Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa? 

•  Código más conciso y declarativo con Streams.
•  Permite aplicar transformaciones directas (mapear claves/valores, evitar duplicados con un merge function).
•  Fácil integración con operaciones en paralelo (parallelStream()).

8.	Si usas List con objetos y luego aplicas stream().map() que tipo de operación estas haciendo? 

Es una operación de transformación

9.	Que hace el método stream().filter() y que retorna? 

•  stream(): Convierte una colección (como List, Set, etc.) en un flujo de elementos (Stream<T>).
•  filter(Predicate<T>): Recorre el flujo y aplica un predicado (una condición booleana).

10.	 Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva. 

11.	¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b? 

git Branch Listar, crear o eliminar ramas
git checkout -b crea la rama y te mueve a ella directamente.

12.	¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente? 

•  Mantienes main limpio y estable.
•  Permite desarrollar nuevas funcionalidades sin afectar el código en producción.
•  Facilita revisiones de código (pull requests).
•  Evita mezclar código experimental con código estable.


