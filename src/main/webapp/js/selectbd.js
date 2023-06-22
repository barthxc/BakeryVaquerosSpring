$(document).ready(function() {
  var productoSelect = $('#productoSelect');

  // Realizar solicitud AJAX para obtener los nombres de los productos desde el servidor
  $.ajax({
    url: '/obtener-nombres-productos',
    method: 'GET',
    dataType: 'json',
    success: function(response) {
      // Limpiar el select existente
      productoSelect.empty();

      // Generar las opciones del select con los nombres de los productos
      response.forEach(function(producto) {
        productoSelect.append('<option value="' + producto.valor + '">' + producto.nombre + '</option>');
      });
    },
    error: function() {
      console.log('Error al obtener los nombres de los productos desde el servidor.');
    }
  });
});