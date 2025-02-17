#Base de datos
##SQL
**SELECT: Seleccionar información**
**Insert: Agregar información**
**UPDATE: Actualizar información**
**DELETE: Eliminar información**

#JDBC
**Java DataBase Conectivity**

#MySql
**AI: auto incrementable**
**Nul: significa ausencia de valor (nulo)**

**SELECT * FROM nombre_de_la_basedatos_db;**
** Asterisco para seleccionar todas las columnas que nos va a devolver toda la información, que contiene la tabla y luego desde (FROM) para buscar en el nombre de nuestra tabla y donde queremos recuperar información y se termina con punto y coma.**

#Crear comentarios en Sql
**-- CRUD - Create(INSERT)- Reade(SELECT)-Update(update)-Delete(DELETE)**
**Se utiliza 2 guiónes medios --**
**El ID se genera de manera automática.**
**La sentencia UPDATE y la tabla que vamos a modificar, con la palabra SET vamos a saber cual son los campos que se van a modificar, WHERE donde se van a cambiar para ello hay que proporcionar el ID.**

#Con MAVEN
**El archivo pom.xml es para poder agregar librerías como por ejemplo MySQL para conectarnos con una base de datos.**
#Carpeta Resources
**La carpeta resources la utilizamos para guardar archivos de imágenes, o cualquier otro recurso estático que necesitemos para nuestro proyecto.**
#Carpeta Test
**La carpeta test es para guardar las pruebas de nuestra aplicación.**

**Para actualizar todas las dependencias agregadas, tocamos el ícono M (maven) y luego en el botón que dice Reload All Maven Projects.**
**Para hacer un comentario en un archivo POM:**
 <!--Agregando la conexión a la base de datos MySql-->**
 **Carpeta External Libraries, desplegamos y vemos todas las librerías instaladas.**
#Clase de conexión a la base de datos (DB).Clase de conexión a la base de datos (DB). El paquete com. y la clase Driver nos comunica a nuestra base de datos de MySql.
**Class.forName("com.mysql.cj.jdbc.Driver");**

##Clase dominio
**La clase de dominio, Class Cliente, si tenemos una tabla de base de datos con ciertos atributos, entonces en Java vamos a tener también una clase que represente también el contenido de esa tabla, incluyendo sus columnas, en Java se conocen como atributos y en la base de datos como columnas.**

#Patrón de diseño
**Un patrón de diseño son soluciones ya conocidas a problemas que nos encontramos comúnmente al crear aplicaciones.**
**Patrón de diseño DAO (Data Access Object) este patrón se utiliza para acceder a la información de una entidad de nuestra aplicación.**
**En este caso con entidad nos referimos a nuestra base de datos.**
**DAO nos permite interactuar con las operaciones más comunes hacia nuestra base de datos.**
**Como puede ser por ejemplo: listarClientes, insertarCliente, actualizarCliente, eliminarCliente. Osea haciendo mapeo con nuestras clases de Java y nuestra Base de datos.**
#CRUD
**CRUD: C-Create (INSERT),R-Read (SELECT), U-Update(UPDATE), D-Delete(DELETE).**

#PreparedStatement
**PreparedStatement y la variable ps básicamente este objeto nos va a permitir preparar la sentencia de SQL que vamos a ejecutar hacia la base de datos.**

#ResultSet
**ResultSet y la variable con el mismo nombre para recordarla rs, esta interface nos permite recibir la información de la consulta que hemos realizado a la base de datos, o sea que este objeto rs contiene el resultado de la consulta.**

#Conexión 
**Un objeto de conexión llamada Connection con y llamamos el método getConexion() que se encuentra en la clase Conexion.**
**Connection con = Conexion.getConexion();.**
**También podemos escribirlo así**
** Connection con = getConexion();**
** He importando: import static zona_fit.conexion.Conexion.getConexion;**
**Con todo esto ya tenemos nuestro objeto de conexión.**














 
 