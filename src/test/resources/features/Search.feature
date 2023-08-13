#language: es
  Característica: Agregar productos
    Yo como usuario quiero agregar un producto al carrito

    @busquedaExitosa
    Escenario: agregar producto al carrito
      Dado el usuario busca un producto en el campo busqueda
      Cuando el usuario selecciona un producto aleatoriamente y lo agrega al carrito
      Entonces el usurio vera un mensaje de que su producto esta en el carrito