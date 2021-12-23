En este proyecto se realizó persistencia de datos utilizando dos bases de datos diferentes:

+MySQL
+Redis

Cada una de ellas tiene sus propios mapeos pero funcionan de la misma forma.

Para utilizar este proyecto es importante utilizar los siguientes mapeos.

-/getAll

Este mapeo nos permite obtener todo lo que se encuentra en la base de datos de MySQL, no es necesario ingresar parametros.

Ejemplo:
http://localhost:8090/getAll

-/getAllR

Este mapeo nos permite obtener todo lo que se encuentra en la base de datos de Redis, no es necesario ingresar parametros.

Ejemplo:
http://localhost:8090/getAllR

-/getOne

Este mapeo nos permite obtener datos de un libro en la base de datos de MySQL, es necesario ingresar el parametro id.

Ejemplo:
http://localhost:8090/getOne?id=3 // Esto mostrará los datos del libro con el id 3 en la base de datos de MySQL.

-/getOneR

Este mapeo nos permite obtener datos de un libro en la base de datos de MySQL, es necesario ingresar el parametro id.

Ejemplo:
http://localhost:8090/getOneR?id=3 // Esto mostrará los datos del libro con el id 3 en la base de datos de Redis.

-/add

Este mapeo nos permite agregar un nuveo libro a la base de datos de MySQL, es necesario ingresar los parametros titulo, autor y descripción.

Ejemplo:
http://localhost:8090/add?titulo=Clementine&autor=Mario&descripcion=Un cuento sobre clementine

-/addR

Este mapeo nos permite agregar un nuveo libro a la base de datos de Redis, es necesario ingresar los parametros id, titulo, autor y descripción.

Ejemplo:
http://localhost:8090/addR?id=6&titulo=Clementine&autor=Mario&descripcion=Un cuento sobre clementine

-/delete

Este mapeo nos permite eliminar un libro de la base de datos de MySQL, es necesario ingresar el id del libro que se desea eliminar.

Ejemplo:
http://localhost:8090/delete?id=2 // Esto eliminará el libro con el id 2.

-/deleteR

Este mapeo nos permite eliminar un libro de la base de datos de Redis, es necesario ingresar el id del libro que se desea eliminar.

Ejemplo:
http://localhost:8090/deleteR?id=2 // Esto eliminará el libro con el id 2.

-/edit

Este mapeo nos permitirá editar los datos de un libro que se encuentre en la base de datos MySQL, es necesario ingresar los parametros id, titulo, autor y descripcion.

Ejemplo:
http://localhost:8090/edit?id=6&titulo=Clementine&autor=Fernando&descripcion=Un cuento sobre clementine // Esto eliminará el libro con el id 2.

-/editR

Este mapeo nos permitirá editar los datos de un libro que se encuentre en la base de datos Redis, es necesario ingresar los parametros id, titulo, autor y descripcion.

Ejemplo:
http://localhost:8090/editR?id=6&titulo=Clementine&autor=Fernando&descripcion=Un cuento sobre clementine // Esto eliminará el libro con el id 2.