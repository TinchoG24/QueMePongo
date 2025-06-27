# Qué Me Pongo

## **Tercera Iteración**

En esta iteración comenzaremos a trabajar sobre las sugerencias de atuendos:

| *Como usuarie de QuéMePongo, quiero recibir sugerencias de atuendos para vestirme ajustándome a las condiciones climáticas con ropa de mi agrado* |
| :---- |

Inicialmente, comenzaremos atacando solamente los siguientes requerimientos específicos:

* Como usuarie de QuéMePongo, quiero recibir una sugerencia de prendas que me vista completamente (torso, piernas, pies), cubriendo cada parte del cuerpo con no más de una prenda (es decir, evitando superposiciones por ahora).  
    
* Como usuarie de QuéMePongo, quiero recibir varias sugerencias que combinen todas las prendas de mi guardarropas   
    
  ---

Luego, nos comentan que durante la investigación de producto notaron algunos comportamientos diferenciados entre ciertos grupos de usuaries al validar qué tan aptas eran las sugerencias que el sistema debe generar. Descubrieron que, aparentemente, hay grupos específicos que prefieren la ropa formal sobre la informal, o viceversa, y otros que prefieren una mezcla. 

Como la investigación no fue concluyente, antes de ir con una apuesta definitiva, quieren probar durante un tiempo qué configuración se adapta mejor a su universo de usuarios. Para lograr ello, nos dejan los siguientes requerimientos.

* Como usuarie de QuéMePongo, quiero poder indicar si una prenda es formal, informal, o neutra.  
    
* Como administradore de QuéMePongo, quiero que, si así está configurado,  al generarse las sugerencias, se filtre la ropa informal para les usuaries mayores de 55 años.  
    
* Como administradore de QuéMePongo, quiero que, si así esta configurado, al generarse las sugerencias, no se ejecute ningún tipo de lógica adicional.  
    
* Como administradore de QuéMePongo, quiero poder cambiar el motor de sugerencias periódicamente entre los existentes (o nuevos) para evaluar cuál genera un mejor efecto sobre los usuarios.