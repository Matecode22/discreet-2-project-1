**I PROYECTO INTEGRADOR DE ESTRUCTURAS DISCRETA**



|**Usuario**|El usuario es cualquier individuo que utilice el sistema de gestión de tareas y recordatorios para organizar, administrar y recordar sus tareas y pendientes.|
| :-: | :- |
|**Cliente**|Usuarios del sistema de gestión de tareas y recordatorios.|
|**Requerimientos funcionales**|<p></p><p>**R1: Almacenar tareas y recordatorios**</p><p>**R2: Interfaz de Usuario**</p><p>**R3: Gestión de Tareas Prioritarias y No Prioritarias**</p><p>**R4: Método para Deshacer Acciones**</p><p>** </p>|
|**Contexto del problema**|<p>El problema a abordar es la necesidad de los usuarios de organizar y administrar eficientemente sus tareas pendientes y recordatorios en un entorno digital. Los usuarios desean contar con una herramienta que les permita agregar, priorizar y gestionar sus tareas de manera efectiva, además de tener la capacidad de deshacer acciones en caso de errores o cambios en sus actividades planificadas.</p><p>` `El sistema de gestión de tareas y recordatorios se propone como una solución para brindar a los usuarios un entorno organizado donde puedan llevar un registro de sus tareas, asignar prioridades, categorizarlas y recibir recordatorios oportunos. El objetivo es aumentar la productividad y la eficiencia de los usuarios al ayudarles a gestionar su carga de trabajo y sus compromisos diarios.</p><p> </p>|
|<p>**Requerimientos no funcionales**</p><p> </p>|<p></p><p> </p><p>**RNF1: Rendimiento del sistema:**</p><p>El sistema debe ser ágil y capaz de gestionar un gran volumen de tareas y recordatorios sin experimentar retrasos significativos en la respuesta a las acciones del usuario.</p><p></p><p>**RNF2: Usabilidad y accesibilidad:**</p><p>La interfaz de usuario debe ser intuitiva y fácil de usar, y el sistema debe ser accesible y debe garantizar que los usuarios puedan utilizarlo de manera conveniente y en diversos contextos</p><p>.</p><p>**RNF3: Seguridad de datos:**</p><p>Los datos de tareas y recordatorios deben estar protegidos y seguros. El sistema debe implementar medidas de seguridad para evitar el acceso no autorizado y garantizar la confidencialidad de la información de los usuarios.</p><p></p><p>**RNF4: Escalabilidad:**</p><p>El sistema debe ser escalable para acomodar un posible crecimiento en la cantidad de usuarios y datos. Debe ser capaz de mantener un rendimiento óptimo incluso cuando se agreguen más usuarios y tareas al sistema.</p><p></p><p>**RNF5: Compatibilidad y interoperabilidad:**</p><p>El sistema debe ser compatible con varios dispositivos y navegadores web comunes para garantizar una amplia disponibilidad. También debe ser capaz de interoperar con otras aplicaciones o servicios cuando sea necesario.</p>|





<table><tr><th colspan="1" valign="top"><b>Nombre o identificador</b></th><th colspan="3" valign="top"><p><b>R1:</b> Almacenar tareas y recordatorios</p><p></b> </p></th></tr>
<tr><td colspan="1" valign="top"><p><b>Resumen</b></p><p></p></td><td colspan="3" valign="top">El sistema debe ser capaz de almacenar tareas y recordatorios en una tabla hash. Cada entrada en la tabla debe incluir información como título, descripción, fecha límite y prioridad.</td></tr>
<tr><td colspan="1" rowspan="2" valign="top"><b>Entradas</b></td><td colspan="1" valign="top"><b>Nombre entrada</b></td><td colspan="1" valign="top"><b>Tipo de dato</b></td><td colspan="1" valign="top"><b>Condición valores válidos</b></td></tr>
<tr><td colspan="1" valign="top">Título </td><td colspan="1" valign="top">String</td><td colspan="1" valign="top"><p> </p><p> </p></td></tr>
<tr><td colspan="1" valign="top"><b>Entrada</b></td><td colspan="1" valign="top">Descripción</td><td colspan="1" valign="top">String</td><td colspan="1" valign="top"> </td></tr>
<tr><td colspan="1" valign="top"><b>Entrada</b></td><td colspan="1" valign="top">Fecha limite</td><td colspan="1" valign="top">Date</td><td colspan="1" valign="top"></td></tr>
<tr><td colspan="1" valign="top"><b>Entrada</b></td><td colspan="1" valign="top">Prioridad</td><td colspan="1" valign="top">String</td><td colspan="1" valign="top">Prioritaria" o "No prioritaria</td></tr>
<tr><td colspan="1" valign="top">` `<b>Condiciones</b></td><td colspan="3" valign="top">Los datos ingresados deben ser válidos.</td></tr>
<tr><td colspan="1" valign="top"><b>Resultado o Postcondición</b></td><td colspan="3" valign="top"><p>Las tareas y recordatorios se almacenan en la tabla hash.</p><p></p></td></tr>
<tr><td colspan="1" rowspan="2" valign="top"><b>Salidas</b></td><td colspan="1" valign="top"><b>Nombre salida</b></td><td colspan="1" valign="top"><b>Tipo de dato</b></td><td colspan="1" valign="top"> </td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td></tr>
</table>


<table><tr><th colspan="1" valign="top"><b>Nombre o identificador</b></th><th colspan="3" valign="top">`                                    `<b>R2: Interfaz de Usuario</b></th></tr>
<tr><td colspan="1" valign="top"><b>Resumen</b></td><td colspan="3" valign="top"><p>El sistema debe proporcionar una interfaz de usuario que permita a los usuarios agregar, modificar y eliminar tareas y recordatorios, así como ver una lista de todas las tareas y recordatorios ordenados por fecha límite o prioridad.</p><p></p></td></tr>
<tr><td colspan="1" rowspan="2" valign="top"><b>Entradas</b></td><td colspan="1" valign="top"><b>Nombre entrada</b></td><td colspan="1" valign="top"><b>Tipo de dato</b></td><td colspan="1" valign="top"><b>Condición valores válidos</b></td></tr>
<tr><td colspan="1" valign="top"><p>Agregar tarea o recordatorio </p><p></p></td><td colspan="1" valign="top">String</td><td colspan="1" valign="top"><p>.</p><p> </p></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"><p>Modificar tarea o recordatorio </p><p></p></td><td colspan="1" valign="top">String</td><td colspan="1" valign="top"></td></tr>
<tr><td colspan="1" valign="top"><b>Entrada</b></td><td colspan="1" valign="top">Eliminar tarea o recordatorio</td><td colspan="1" valign="top">String</td><td colspan="1" valign="top"></td></tr>
<tr><td colspan="1" valign="top">` `<b>Condiciones</b></td><td colspan="3" valign="top"><p>La interfaz de usuario debe ser intuitiva y fácil de usar.</p><p>Debe permitir al usuario realizar las acciones mencionadas de manera eficiente.</p></td></tr>
<tr><td colspan="1" valign="top"><b>Resultado o Postcondición</b></td><td colspan="3" valign="top">Los usuarios pueden agregar, modificar y eliminar tareas y recordatorios, y ver la lista ordenada.</td></tr>
<tr><td colspan="1" rowspan="2" valign="top"><b>Salidas</b></td><td colspan="1" valign="top"><b>Nombre salida</b></td><td colspan="1" valign="top"><b>Tipo de dato</b></td><td colspan="1" valign="top"> </td></tr>
<tr><td colspan="1" valign="top">interfaz de usuario para interactuar con el sistema.</td><td colspan="1" valign="top"></td><td colspan="1" valign="top"><p> </p><p> </p></td></tr>
</table>















<table><tr><th colspan="1" valign="top"><b>Nombre o identificador</b></th><th colspan="3" valign="top"><b>R3: Gestión de Tareas Prioritarias y No Prioritarias</b></th></tr>
<tr><td colspan="1" valign="top"><b>Resumen</b></td><td colspan="3" valign="top">El sistema debe permitir a los usuarios categorizar tareas como "Prioritarias" o "No prioritarias". Las tareas prioritarias se gestionan mediante una cola de prioridades, mientras que las tareas no prioritarias se gestionan según su orden de llegada (FIFO).</td></tr>
<tr><td colspan="1" rowspan="2" valign="top"><b>Entradas</b></td><td colspan="1" valign="top"><b>Nombre entrada</b></td><td colspan="1" valign="top"><b>Tipo de dato</b></td><td colspan="1" valign="top"><b>Condición valores válidos</b></td></tr>
<tr><td colspan="1" valign="top">Selección de categoría: prioritarias o no prioritarias</td><td colspan="1" valign="top">String</td><td colspan="1" valign="top"><p>"Prioritaria" o "No prioritaria".</p><p> </p></td></tr>
<tr><td colspan="1" valign="top"><b>Entrada</b></td><td colspan="1" valign="top">Tareas prioritarias</td><td colspan="1" valign="top">String</td><td colspan="1" valign="top">Prioritaria</td></tr>
<tr><td colspan="1" valign="top"><b>Entrada</b></td><td colspan="1" valign="top">Tareas no prioritarias</td><td colspan="1" valign="top">String</td><td colspan="1" valign="top">No prioritaria</td></tr>
<tr><td colspan="1" valign="top">` `<b>Condiciones</b></td><td colspan="3" valign="top"><p>La categorización debe ser válida.</p><p>Tareas marcadas como prioritarias o no prioritarias.</p></td></tr>
<tr><td colspan="1" valign="top"><b>Resultado o Postcondición</b></td><td colspan="3" valign="top">Las tareas se organizan en dos categorías: prioritarias y no prioritarias. Las tareas importantes se gestionan primero en la cola de prioridades, y las tareas no prioritarias se gestionan en función de su orden de llegada.</td></tr>
<tr><td colspan="1" rowspan="2" valign="top"><b>Salidas</b></td><td colspan="1" valign="top"><b>Nombre salida</b></td><td colspan="1" valign="top"><b>Tipo de dato</b></td><td colspan="1" valign="top"> </td></tr>
<tr><td colspan="1" valign="top">Orden de prioridad</td><td colspan="1" valign="top">String</td><td colspan="1" valign="top"> </td></tr>
</table>



<table><tr><th colspan="1" valign="top"><b>Nombre o identificador</b></th><th colspan="3" valign="top"><p><b>R4: Método para Deshacer</b></p><p></b> </p></th></tr>
<tr><td colspan="1" valign="top"><b>Resumen</b></td><td colspan="3" valign="top">El sistema debe implementar un método que permita a los usuarios deshacer las acciones realizadas en el sistema, utilizando una pila (LIFO) para llevar un registro de las acciones. </td></tr>
<tr><td colspan="1" rowspan="2" valign="top"><b>Entradas</b></td><td colspan="1" valign="top"><b>Nombre entrada</b></td><td colspan="1" valign="top"><b>Tipo de dato</b></td><td colspan="1" valign="top"><b>Condición valores válidos</b></td></tr>
<tr><td colspan="1" valign="top">Acciones realizadas</td><td colspan="1" valign="top">Int/String</td><td colspan="1" valign="top"><p>Agregar tarea, Modificar tarea, Eliminar tarea.</p><p> </p></td></tr>
<tr><td colspan="1" valign="top">` `<b>Condiciones</b></td><td colspan="3" valign="top">El sistema registra cada acción realizada por el usuario en una pila junto con los detalles de la acción y la tarea afectada.</td></tr>
<tr><td colspan="1" valign="top"><b>Resultado o Postcondición</b></td><td colspan="3" valign="top">Los usuarios pueden deshacer la última acción realizada en el sistema utilizando el método de deshacer.</td></tr>
<tr><td colspan="1" rowspan="3" valign="top"><b>Salidas</b></td><td colspan="1" valign="top"><b>Nombre salida</b></td><td colspan="1" valign="top"><b>Tipo de dato</b></td><td colspan="1" valign="top"> </td></tr>
<tr><td colspan="1" valign="top">La acción se ha deshecho con éxito</td><td colspan="1" valign="top">String</td><td colspan="1" valign="top"></td></tr>
<tr><td colspan="1" valign="top">Actualización de tareas y recordatorios después de deshacer la acción</td><td colspan="1" valign="top"></td><td colspan="1" valign="top"> </td></tr>
</table>


