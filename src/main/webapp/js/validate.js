$(document).ready(function() {
  $('#formulario').submit(function(event) {
    event.preventDefault(); // Prevenir el envío del formulario por defecto

    var cantidad = parseInt($('#cantidadproducto').val());
    var email = $('#email').val();
    var telefono = $('#telefono').val();
    var productoSeleccionado = $('#nombreproducto').val();
    var opcionPedido = $('input[name="opcionPedido"]:checked').val();

    if (cantidad === 0) {
      alert('Selecciona una cantidad');
      return;
    }

    if (cantidad > 10) {
      alert('Demasiada cantidad');
      return;
    }

    if ($('#nombre').val() === '' || $('#direccion').val() === '') {
      alert('Debe completar al menos el campo Nombre y Dirección');
      return;
    }

    var emailRegExp = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegExp.test(email)) {
      alert('El correo electrónico no es válido');
      return;
    }

    if (productoSeleccionado === '0') {
      alert('Debe elegir al menos un producto');
      return;
    }

    if (!opcionPedido) {
      alert('Debe seleccionar la opción de "Llevar" o "Recoger"');
      return;
    }

    if (telefono === '') {
      alert('Debe ingresar un número de teléfono');
      return;
    }

    var telefonoRegExp = /^\d{9,}$/;
    if (!telefonoRegExp.test(telefono)) {
      alert('Teléfono incorrecto');
      return;
    }

    // Mostrar mensaje de carga
    $('#loader').show();

    // Si todas las validaciones pasaron, enviar el formulario a través de Ajax
    $.ajax({
      url: '/guardarMostrar',
      type: 'POST',
      data: $('#formulario').serialize(),
      timeout: 2000, // Tiempo de espera de 5 segundos (puedes ajustar este valor según tus necesidades)
      success: function(response) {
        if (opcionPedido === 'llevar') {
          enviarFormulario('/llevar');
        } else if (opcionPedido === 'recoger') {
          enviarFormulario('/recoger');
        } else {
          // Manejar otras opciones o errores si es necesario
        }
      },
      error: function(xhr, status, error) {
        alert('Error al enviar el formulario. Por favor, inténtalo de nuevo.');
      },
      complete: function() {
        // Ocultar mensaje de carga
        $('#loader').hide();
      }
    });
  });
});

function enviarFormulario(url) {
  var form = document.createElement('form');
  form.method = 'POST';
  form.action = url;
  document.body.appendChild(form);
  form.submit();
}

