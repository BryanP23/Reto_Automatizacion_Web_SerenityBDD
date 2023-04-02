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
    public static final Target CATEGORIA_BUSCAR = Target.the("barra para buscar dentro de categoria")
            .located(By.xpath("(//input[contains(@placeholder,'Buscar')])[1]"));
    public static final Target CATEGORIA_POLLO  = Target.the("Categoria Pollo")
            .located(By.id("category-2-pollo"));
    public static final Target BOTON_ORDENAR_POR = Target.the("ordenar por")
            .located(By.xpath("(//button[@class='vtex-search-result-3-x-orderByButton ph3 pv5 mv0 pointer flex items-center justify-end bg-base c-on-base t-action--small bt br bl bb-0 br2 br--top bw1 w-100 outline-0 b--transparent pl1'])[1]"));
    public static final Target MAYOR_PRECIO_PRIMERO = Target.the("Ordenar por mayor precio primero")
            .located(By.xpath("//button[normalize-space()='Mayor precio primero']"));
    public static final Target PRODUCTO_SELECCIONADO = Target.the("CHUZO POLLO DE 10 FRIKO HF 1900 gr")
            .located(By.xpath("//span[normalize-space()='CHUZO POLLO DE 10 FRIKO HF 1900 gr']"));
    public static final Target AGREGAR_PRODUCTO  = Target.the("Agregar producto al carrito")
            .located(By.cssSelector("div[class='exito-vtex-components-4-x-mainBuyButton'] span[class='exito-vtex-components-4-x-buttonText']"));
    public static final Target BOTON_VER_CARRITO = Target.the("Boton ir a ver el carrito de compras")
            .located(By.xpath("(//*[name()='svg'][@class='vtex-menu-2-x-header-link-icon '])[3]"));
    public static final Target BOTON_IR_A_PAGAR = Target.the("boton ir a pagar")
            .located(By.xpath("//a[@id='cart-to-orderform']"));
    public static final Target BOTON_CONTINUAR_BOLSA = Target.the("boton continuar comprar bolsa")
            .located(By.xpath("//button[@class='buttonBag']"));
    public static final Target BOTON_ELIGE_FECHA_ENTREGA = Target.the(" Boton elige una fecha de entrega")
            .located(By.id("scheduled-delivery-choose-Domicilio_Programado"));
    public static final Target FECHA_DE_ENTREGA = Target.the("ELEGIR FECHA DE ENTREGA")
            .located(By.xpath("//div[@aria-label='day-3']"));
    public static final Target BOTON_CONTINUAR_COMPRA = Target.the("continua con la compra")
            .located(By.xpath("//button[@id='btn-go-to-payment']"));
    public static final Target BOTON_METODO_PAGO = Target.the("metodo de pago tarjeta de credito")
            .located(By.xpath("//span[normalize-space()='Pago contra entrega']"));

    public static final Target BOTON_PAGAR = Target.the("boton pagar y hacer pedido ")
            .located(By.xpath("//button[3]"));
    public static final Target MENSAJE_ASERCION = Target.the("Pedido recibido")
            .located(By.xpath("//p[contains(text(),'El plazo de entrega comienza a correr cuando el pa')]"));
}
