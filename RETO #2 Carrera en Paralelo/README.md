# RETO #2: Carrera en Paralelo 
Para este reto tu pareja y tu están a punto de participar en la carrera más caótica de commits jamás vista, los dos parten desde la misma línea de salida (su rama feature del reto), pero cada uno va a tomar su propio carril (subramas llamadas feature/reto_carril_uno y feature/reto_carril_dos) , y el repositorio es la pista. 
La misión es simple: 
* Estudiante A: Arranca cambiando el nombre del archivo de Reto 2 a CarreraParalela.java dejando listo el punto de partida (tiene que hacer commit inicial con la estructura base de la clase al feature del reto) 
* Ambos: crean sus subramas desde esa rama feature. 
* Estudiante B (Carril 1) : Arranca actualizando su carril (rama carril 1) con los cambios subidos en el feature del reto, una vez realizado el estudiante debe utilizando expresión lambda  generar una función que le permita calcular el numero más grande de un listado de números ingresado (tiene que subir los cambios al feature del reto sin borrar su rama carril) 
* Estudiante A: (Carril 2): Arranca actualizando su carril (rama carril 1) con los cambios subidos por el estudiante A, una vez realizado el estudiante debe utilizando expresión lambda  generar una función que le permita calcular el número más pequeño de un listado de números ingresado y obtener tanto ese número como la cantidad de datos ingresados. (tiene que subir los cambios al feature del reto sin borrar su rama carril) 
* El primer choque: Ambos deben crear la misma función con el mismo nombre que reciba la lista y combine los resultados de las funciones de cada carril en un objeto que contenga el: máximo y mínimo del listado junto a la cantidad de datos. Esto generará un conflicto de merge al unir cambios donde deben resolver el conflicto correctamente y subir la versión final al feature. (pueden usar git stash y git stash pop dado el caso) 
* Segunda Vuelta: 
- Carril 1: añade a la función la verificación de si el umero mayor es múltiplo de 2 (use if ternario) 
- Carril 2: añade a la función la verificación de si el número mayor es divisor de 2 (use if ternario) 
* Tercer Choque: 
  - Carril 1: calcula si la cantidad de datos de la lista es par (use if ternario) 
  - Carril 2: calcula si la cantidad de datos es impar (use if ternario) 
  - Ambos unen cambios nuevamente y resuelven conflictos si aparecen. 
* La gran meta: 
  - Fusionar todas las funciones en una sola que permita dado dos listados de números que muestre en el objeto Resultados: número mayor por lista,  número menor por lista, cantidad de elementos por lista, si el mayor por lista es múltiplo de 2 o divisor de 2, si la cantidad de elementos por lista es par o impar. 
  - Hagan un commit final y merge de ambas ramas carril al feature del reto. 
* Muestren con git log --online la historia completa de la carrera como evidencia. 
