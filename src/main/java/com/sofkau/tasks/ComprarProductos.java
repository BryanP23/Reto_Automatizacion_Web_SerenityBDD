package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.sofkau.ui.FlujoDeCompra.*;
import static com.sofkau.ui.FlujoDeCompra.BOTON_PAGAR;
import static com.tigervnc.rfb.Keysyms.Pause;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;


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
                Click.on(CERRAR_OPCIONES_ENVIO),
                WaitUntil.the(CAMPO_BUSCAR, isEnabled()).forNoMoreThan(6).seconds(),
                Click.on(CAMPO_BUSCAR),
                Enter.theValue(busquedaProducto).into(CAMPO_BUSCAR),
                Hit.the(Keys.ENTER).into(CAMPO_BUSCAR),
                Click.on(CATEGORIA_BUSCAR),
                Enter.theValue(busquedaCategoria).into(CATEGORIA_BUSCAR),
                Click.on(CATEGORIA_POLLO),
                Click.on(BOTON_ORDENAR_POR),
                Click.on(MAYOR_PRECIO_PRIMERO),
                Click.on(PRODUCTO_SELECCIONADO),
                Click.on(AGREGAR_PRODUCTO),
                WaitUntil.the(BOTON_VER_CARRITO, isEnabled()).forNoMoreThan(2).seconds(),
                Click.on(BOTON_IR_A_PAGAR),
                Click.on(BOTON_CONTINUAR_BOLSA),
                Click.on(BOTON_ELIGE_FECHA_ENTREGA),
                Click.on(FECHA_DE_ENTREGA),
                Scroll.to(BOTON_CONTINUAR_COMPRA),
                Click.on(BOTON_CONTINUAR_COMPRA),
                Click.on(BOTON_METODO_PAGO)
                //Click.on(BOTON_PAGAR)

        );
    }
    public static ComprarProductos comprarProductos(){
        return new ComprarProductos();
    }
}