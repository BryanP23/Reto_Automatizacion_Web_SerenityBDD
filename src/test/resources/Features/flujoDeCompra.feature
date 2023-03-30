#language:es
#encoding:UTF-8
#Author: BRAYAN DAVID POLO COHEN

Característica: Flujo de compra en la pagina web de carulla
  yo como usuario de la pagina web de carulla
  quiero seleccionar productos y agregarlos al carrito
  para poder comprar productos en la página

  @FlujoDeCompra
  Escenario: flujo de compra en la pagina web de carulla
    Dado que el usuario esta en la pagina de inicio de carulla
    Y el usuario inicia sesion
    Cuando agrega productos al carrito y los compra
    Entonces el usuario debe recibir el siguiente mensaje "Tu pedido está siendo procesado."