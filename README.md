# prueba-tecnica-java-avanzado
Lista de vuelos
Se requiere desarrollar un programa en Java que permita filtrar una lista de vuelos según distintos criterios de búsqueda basados en fechas y que se puedan ver en la terminal.

Requisitos

Definir constantes de fecha en Main:

Se deben definir dos constantes de fecha en la Clase Principal. Te serviran para declarar la fecha de inicio y la fecha fin, ten en cuenta que podrian ser nulas tambien.

Estructura del objetoVuelo :

id(int) - No importa el orden de la secuencia
nombreVuelo(Cadena) - Nombres que tu quieras. Ej. (H001-V)
empresa(Cadena) - Aerolíneas Reales que tu quieras. Ej. (Iberia, Turco)
lugarSalida(Cadena) - Ciudades más importantes Ej. (Madrid, Barcelona)
lugarLlegada(Cadena) - Ciudades más importantes Ej. (Buenos Aires, Nueva York)
fechaInicio(LocalDate) - Año-Mes-Día. : 2025-05-20 Ej. Fecha local.de (2025, 5, 20)
fechaFinal(LocalDate) - Año-Mes-Día. : 2025-05-20 Ej. Fecha local.de (2025, 5, 20)

Función de filtrado (trabaja solo sobre la fechaInicio):

Si no se envía la fechaDesde, el filtro debe devolver todos los vuelos hasta la fecha fechaHasta.
Si no se envía la fechaHasta, el filtro debe devolver todos los vuelos desde la fecha fechaDesdeen adelante.
Si se envían ambas fechas , debe devolver los vuelos que se encuentren dentro de ese rango de fechas.
Si no se envía ninguna fecha , debe devolver todos los vuelos.
Los vuelos se imprimen en la terminal ordenados por fecha de inicio.

Crear en Main una lista de 10 vuelos de prueba.

Recomendaciones:

Crea un paquete llamado entitiespara que crees tu entidad Vuelo.
Cree un paquete llamado utilspara que cree su clase utilitaria para la función de filtro.
