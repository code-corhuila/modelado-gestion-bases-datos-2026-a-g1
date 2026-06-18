

Tarea A:Identificación de problema.



|síntomas|problema principal|¿Cómo ayuda un SGBD?|
|-|-|-|
|Listas duplicadas de estudiantes|Redundancia de datos|se diseña una tabla única de Estudiantes con una clave primaria(ID). El SGBD impide que se cree otro registro con el mismo ID, centralizando la información.|
|Notas inconsistentes|Falta de integridad|Mediante Foreign Keys y restricciones (constraints), el sistema asegura que no existen notas de estudiantes que no existen o valores fuera del rango(ej. 0.0 a 5.0)|
|No hay historial consolidado|Consultas limitadas|Gracias al motor de SQL y los JOIN, podemos cruzar tablas de estudiantes, materias y notas milisegundos para generar un reporte completo|







 Tarea B: Discusión guiada.



¿Qué criterios usarías para decidir cuándo migrar de archivos planos a un SGBD?

El primer criterio es el volumen de datos y la concurrencia. Si ya tienes a 5 secretarias intentando editar el mismo archivo de texto al tiempo, se va a corromper. También la seguridad: en un archivo plano cualquiera borra una línea, en un SGBD puedes controlar quién ve qué. Si la relación entre los datos se vuelve compleja (muchos a muchos), el archivo plano deja de ser funcional.

¿Qué tipo de SGBD (relacional o NoSQL) parece más adecuado para este contexto y por qué?

Definitivamente un SGBD Relacional (SQL). Los sistemas académicos tienen una estructura muy rígida y definida; un estudiante siempre tendrá nombre, código y correo. Además, la consistencia es sagrada: no te puedes permitir que una nota "aparezca luego" (consistencia eventual de NoSQL). Aquí necesitamos integridad referencial pura para que los certificados de notas sean 100% fiables.



