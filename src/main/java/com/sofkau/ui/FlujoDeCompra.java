package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class FlujoDeCompra extends PageObject {
    public static final Target BOTON_COMO_QUIERES_RECIBIR_PRODUCTOS = Target.the("Boton confirmar domicilio")
            .located(By.xpath("(//span[@class='exito-geolocation-3-x-addressResult'])[1]"));
    public static final Target CAMPO_BUSCAR= Target.the("barra de busqueda de producto")
            .located(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/input[1]"));

    public static final Target SELECCIONAR_ENVIO_A_DOMICILIO = Target.the("seleccionar envio a domicilio")
            .located(By.cssSelector("button[class='exito-geolocation-3-x-inactive'] div[class='b exito-geolocation-3-x-title']"));
    public static final Target BOTON_CONFIRMAR_DOMICILIO = Target.the("Boton confirmar domicilio")
            .located(By.xpath("//button[@class='exito-geolocation-3-x-primaryButtonEnable']"));
    public static final Target CERRAR_OPCIONES_ENVIO = Target.the("Boton cerrar opciones de envio")
            .located(By.xpath("(//*[name()='svg'])[83]"));

    public static final Target CATEGORIA_BUSCAR = Target.the("barra para buscar dentro de categoria")
            .located(By.xpath("(//input[contains(@placeholder,'Buscar')])[1]"));
    public static final Target CATEGORIA_POLLO  = Target.the("Categoria Pollo")
            .located(By.id("category-2-pollo"));
    public static final Target BOTON_ORDENAR_POR = Target.the("ordenar por")
            .located(By.className("vtex-search-result-3-x-filterPopupTitle c-on-base t-action--small ml-auto-ns"));
    public static final Target MAYOR_PRECIO_PRIMERO = Target.the("Ordenar por mayor precio primero")
            .located(By.xpath("//button[normalize-space()='Mayor precio primero']"));
    public static final Target PRODUCTO_SELECCIONADO = Target.the("CHUZO POLLO DE 10 FRIKO HF 1900 gr")
            .located(By.xpath("//img[contains(@alt,'CHUZO POLLO DE 10 FRIKO HF 1900 gr')]"));
    public static final Target AGREGAR_PRODUCTO  = Target.the("Agregar producto al carrito")
            .located(By.className("(//*[@class='exito-vtex-components-4-x-buttonText'])[1]"));
    public static final Target BOTON_VER_CARRITO = Target.the("Boton ir a ver el carrito de compras")
            .located(By.xpath("(//*[name()='svg'][@class='vtex-menu-2-x-header-link-icon '])[3]"));
    public static final Target BOTON_IR_A_PAGAR = Target.the("boton ir a pagar")
            .located(By.id("cart-to-orderform"));
    public static final Target BOTON_CONTINUAR_BOLSA = Target.the("boton continuar comprar bolsa")
            .located(By.xpath("(//button[@class='buttonBag'])[1]"));
    public static final Target BOTON_ELIGE_FECHA_ENTREGA = Target.the(" Boton elige una fecha de entrega")
            .located(By.id("scheduled-delivery-choose-Domicilio_Programado"));
    public static final Target FECHA_DE_ENTREGA = Target.the("ELEGIR FECHA DE ENTREGA")
            .located(By.xpath("(//div[@class='react-datepicker__day react-datepicker__day--001 react-datepicker__day--weekend react-datepicker__day--outside-month'])[1]"));
    public static final Target BOTON_CONTINUAR_COMPRA = Target.the("continua con la compra")
            .located(By.id("btn-go-to-payment"));
    public static final Target BOTON_METODO_PAGO = Target.the("metodo de pago tarjeta de credito")
            .located(By.xpath("//span[normalize-space()='Pago contra entrega']"));

    public static final Target BOTON_PAGAR = Target.the("boton pagar y hacer pedido ")
            .located(By.xpath("//div[@class='payment-confirmation-wrap']//button[1]"));
}
