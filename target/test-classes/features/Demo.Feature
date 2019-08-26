# language: es
Característica: Gestionar registro cuenta demo en XM


  @registrarDemo
  Escenario: Realizar el Registro de una cuenta demo de XM
    Dado que el usuario entra a la pagina de registro de XM
    Cuando se realiza el registro de la cuenta demo en XM
    Entonces el verifica que se presente en pantalla el mensaje Datos guardados correctamentep

  @ErrorNombre
  Escenario: Realizar el Registro de una cuenta demo de XM
    Dado que el usuario ingresa a la pagina de registro de XM
    Cuando se realiza el registro ingresando de manera incorrecta el nombre
    Entonces el verifica que se presente en pantalla el mensajede error


  @ErrorPassword
  Escenario: Realizar el Registro de una cuenta demo de XM
    Dado que el usuario logra ingresar a la pagina de registro de XM
    Cuando se realiza el registro ingresando dos password diferente
    Entonces el verifica que se presente en pantalla el mensaje de que no coinciden


