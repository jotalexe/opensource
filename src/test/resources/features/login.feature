#language: es

Característica: Login en OrangeHRM

Escenario: Iniciar sesión correctamente en OrangeHRM
  Dado El usuario está en la página de login
  Cuando El usuario ingresa el nombre de usuario "Admin" y la contraseña "admin123"
  Y El usuario hace clic en el botón de login
  Entonces El usuario debería ser redirigido al dashboard

