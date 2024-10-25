#language: es

Característica: Proceso de contratación

Escenario: Agregar un nuevo candidato en Recruitment
  Dado El usuario ha iniciado sesión en OrangeHRM
  Cuando El usuario navega a la sección "Recruitment"
  Y El usuario hace clic en el botón "Add"
  Y El usuario ingresa los detalles del candidato
  Entonces El usuario debería ver un mensaje de confirmación de que el candidato fue agregado exitosamente
