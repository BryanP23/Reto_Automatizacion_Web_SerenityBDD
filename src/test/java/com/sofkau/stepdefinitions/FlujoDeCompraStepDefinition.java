package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import com.sofkau.tasks.IniciarSesion;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static com.sofkau.questions.MensajeCompra.mensajeCompra;
import static com.sofkau.tasks.ComprarProductos.comprarProductos;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class FlujoDeCompraStepDefinition extends Configuracion {
    @Dado("que el usuario esta en la pagina de inicio de carulla")
    public void queElUsuarioEstaEnLaPaginaDeInicioDeCarulla() {
        configurarNavegador();

        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial()
        );
    }

    @Dado("el usuario inicia sesion")
    public void elUsuarioIniciaSesion() {
        theActorInTheSpotlight().wasAbleTo(
        iniciarSesion()
                .Usuario("pablitojaramillo20@gmail.com")
                .Contrasenna("Pablito2023")
        );
    }

    @Cuando("agrega productos al carrito y los compra")
    public void agregaProductosAlCarritoYLosCompra() {
        theActorInTheSpotlight().attemptsTo(
                comprarProductos()
                        .busquedaProducto("chuzo pollo")
                        .busquedaCategoria("pollo")


        );

    }

    @Entonces("el usuario debe recibir el siguiente mensaje {string}")
    public void elUsuarioDebeRecibirElSiguienteMensaje(String string) {
        theActorInTheSpotlight().should(
                seeThat(mensajeCompra(),equalTo("Imprimir"))
        );
        quitarDriver();
    }

}
