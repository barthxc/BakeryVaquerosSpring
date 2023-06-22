# BakeryVaquerosSpring

Este es un proyecto en desarrollo que utiliza Spring para implementar un CRUD (Crear, Leer, Actualizar, Eliminar) en un entorno de panadería llamado BakeryVaqueros. Actualmente, el proyecto está aproximadamente un 60% completo.

## Descripción del Proyecto

En este proyecto, se ha realizado una validación con el front-end utilizando jQuery y llamando a la anotación `@PostMapping` de Spring para realizar la operación de guardado de datos. Dependiendo de la opción seleccionada, los datos son guardados correctamente, pero aún no se logra mostrarlos en la plantilla a pesar de que los pedidos con sus respectivos productos están siendo guardados en el modelo.

Los datos se guardan correctamente en la base de datos, lo que indica que la funcionalidad de guardado está en funcionamiento.

## Problemas a Resolver

A continuación, se enumeran los problemas que necesitan ser abordados en el proyecto:

- Lograr el retorno correcto de las plantillas con la información de los pedidos y productos para que se muestren adecuadamente en la interfaz de usuario.
- Cambiar la fuente utilizada en el diseño de la web, ya que la tipografía actual no incluye números y dificulta su visualización.

## Funcionalidades Pendientes

Además de solucionar los problemas mencionados, hay varias funcionalidades pendientes que se planea agregar al proyecto:

- Implementar un sistema de inicio de sesión con un usuario administrador para tener un control total sobre el CRUD.
- Crear un inicio de sesión adicional para un usuario jefe que permita ver los productos en stock de la panadería.
- Habilitar la capacidad de realizar operaciones CRUD en los productos en stock de la panadería.
- Permitir la visualización de los pedidos y productos de los clientes sin permitir su modificación.
- Implementar la carga dinámica de opciones en un elemento `select` a través de los productos disponibles en stock.
- Cambiar el efecto de carga previa de la página web para mejorar la experiencia del usuario.

## Estado del Proyecto

Dado que este es mi primer encuentro con Spring y aún no se ha podido identificar exactamente dónde se encuentran los errores, considero que el proyecto se encuentra en un estado funcional medio. A pesar de los desafíos encontrados, estoy satisfecho con los resultados obtenidos hasta ahora.

Espero que este proyecto sea útil o agradable para quienes lo revisen. También planeo subir el front-end de forma independiente para que pueda ser disfrutado por separado.

¡Gracias por tu interés en el proyecto BakeryVaquerosSpring!

