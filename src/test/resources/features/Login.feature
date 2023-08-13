#language: es
  Característica: Registro de usuario
    yo como usuario quiero registrarme en la pagina

    @registroExitoso
    Escenario: Registro exitoso de usuario
      Dado que el usuario ingresa alkomprar y da clic en mi cuenta
      Cuando  ingresa el correo y da clic en continuar
      Y llena los campos del formulario y da clic en el boton continuar
      Entonces el usuario vera un mensaje y la opcion para ver su perfil
