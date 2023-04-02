package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.sofkau.ui.ConfirmacionCompra.MENSAJE_COMPRA_EXITOSA;
import static com.sofkau.ui.FlujoDeCompra.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class ComprarProductos implements Task {
    private String busquedaProducto;
    private String busquedaCategoria;
    private String cantidad;
    private String nombreTarjeta;
    private String numeroTarjeta;
    private String CVC;
    private String mesTarjeta;
    private String annoTarjeta;

    public ComprarProductos busquedaProducto(String busquedaProducto){
        this.busquedaProducto = busquedaProducto;
        return this;
    }
    public ComprarProductos busquedaCategoria(String busquedaCategoria){
        this.busquedaCategoria = busquedaCategoria;
        return this;
    }
    public ComprarProductos cantidad(String cantidad){
        this.cantidad = cantidad;
        return this;
    }
    public ComprarProductos nombreTarjeta(String nombreTarjeta){
        this.nombreTarjeta = nombreTarjeta;
        return this;
    }
    public ComprarProductos numeroTarjeta(String numeroTarjeta){
        this.numeroTarjeta = numeroTarjeta;
        return this;
    }
    public ComprarProductos CVC(String CVC){
        this.CVC = CVC;
        return this;
    }
    public ComprarProductos mesTarjeta(String mesTarjeta){
        this.mesTarjeta = mesTarjeta;
        return this;
    }
    public ComprarProductos annoTarjeta(String annoTarjeta){
        this.annoTarjeta = annoTarjeta;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_COMO_QUIERES_RECIBIR_PRODUCTOS),
                Click.on(SELECCIONAR_ENVIO_A_DOMICILIO),
                Click.on(BOTON_CONFIRMAR_DOMICILIO),
                WaitUntil.the(BOTON_CONFIRMAR_DOMICILIO, isNotVisible()),
                Click.on(CAMPO_BUSCAR),
                Enter.theValue(busquedaProducto).into(CAMPO_BUSCAR),
                Hit.the(Keys.ENTER).into(CAMPO_BUSCAR),
                Click.on(CATEGORIA_BUSCAR),
                Enter.theValue(busquedaCategoria).into(CATEGORIA_BUSCAR),
                Click.on(CATEGORIA_POLLO),
                WaitUntil.the(CATEGORIA_POLLO, isNotVisible()),
                WaitUntil.the(BOTON_ORDENAR_POR, isClickable()),
                Click.on(BOTON_ORDENAR_POR),
                Click.on(MAYOR_PRECIO_PRIMERO),
                WaitUntil.the(PRODUCTO_SELECCIONADO, isVisible()),
                Click.on(PRODUCTO_SELECCIONADO),
                WaitUntil.the(AGREGAR_PRODUCTO, isVisible()),
                WaitUntil.the(AGREGAR_PRODUCTO, isClickable()),
                Click.on(AGREGAR_PRODUCTO),
                WaitUntil.the(BOTON_VER_CARRITO, isClickable()),
                Click.on(BOTON_VER_CARRITO),
                WaitUntil.the(BOTON_IR_A_PAGAR, isVisible()),
                WaitUntil.the(BOTON_IR_A_PAGAR, isClickable()),
                Scroll.to(BOTON_IR_A_PAGAR),
                Click.on(BOTON_IR_A_PAGAR),
                WaitUntil.the(BOTON_CONTINUAR_BOLSA, isVisible()),
                WaitUntil.the(BOTON_CONTINUAR_BOLSA, isClickable()),
                Click.on(BOTON_CONTINUAR_BOLSA),
                WaitUntil.the(BOTON_CONTINUAR_BOLSA, isNotVisible()),
                WaitUntil.the(BOTON_ELIGE_FECHA_ENTREGA, isVisible()),
                Scroll.to(BOTON_ELIGE_FECHA_ENTREGA),
                Click.on(BOTON_ELIGE_FECHA_ENTREGA),
                WaitUntil.the(FECHA_DE_ENTREGA, isVisible()),
                WaitUntil.the(FECHA_DE_ENTREGA, isClickable()),
                Click.on(FECHA_DE_ENTREGA),
                WaitUntil.the(BOTON_CONTINUAR_COMPRA, isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(BOTON_CONTINUAR_COMPRA, isClickable()),
                Click.on(BOTON_CONTINUAR_COMPRA),
                Scroll.to(BOTON_METODO_PAGO),
                //WaitUntil.the(BOTON_METODO_PAGO, isVisible()),
                WaitUntil.the(BOTON_METODO_PAGO, isClickable()),
                Click.on(BOTON_METODO_PAGO),
                WaitUntil.the(BOTON_PAGAR, isEnabled()).forNoMoreThan(7).seconds(),
                Click.on(BOTON_PAGAR),
                WaitUntil.the(MENSAJE_COMPRA_EXITOSA, isVisible())

        );
    }
    public static ComprarProductos comprarProductos(){
        return new ComprarProductos();
    }
}