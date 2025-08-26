# RETO #3: El eco misterioso 
Tú y tu pareja han encontrado una misteriosa cueva que devuelve un eco especial según la forma en la que pronuncien su mensaje. 
Pero la cueva es caprichosa: 
* A uno le gusta la velocidad **(StringBuilder).** 
* A otro le gusta la seguridad en hilos **(StringBuffer).** 
## Misión: 
* Parten desde la misma rama feature del reto. 
* **Estudiante A:** crea en su subrama feature/reto3_builder un método usando **StringBuilder** que: 
  - Reciba un mensaje (String) y lo repita 3 veces concatenado con un espacio. 
* **Estudiante B:** crea en su subrama feature/reto3_buffer un método usando **StringBuffer** que: 
  - Reciba un mensaje (String) y lo invierta (reverse). 
* **Primer Choque:** Ambos deben crear una función con el mismo nombre que combine ambas transformaciones: repetir 3 veces y luego invertir. Resolver el conflicto en el merge. 
## Requisitos: 
* Uso de **lambda** para invocar la función. 
* Uso de **stream()** para procesar las repeticiones. 
