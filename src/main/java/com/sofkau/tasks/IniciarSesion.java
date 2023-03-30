package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.IniciarSesion.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class IniciarSesion implements Task {

    private String usuario;
    private String contrasenna;

    public IniciarSesion Usuario(String usuario){
        this.usuario=usuario;
        return this;
    }

    public IniciarSesion Contrasenna(String contrasenna){
        this.contrasenna=contrasenna;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_INGRESAR),
                Click.on(INGRESAR_CON_CAMPO_CONTRASENA),
                Click.on(CAMPO_EMAIL),
                Enter.theValue(usuario).into(CAMPO_EMAIL),
                Click.on(CAMPO_CONTRASENNA),
                Enter.theValue(contrasenna).into(CAMPO_CONTRASENNA),
                Click.on(BOTON_INICIAR_SESION)
        );
    }

    public static IniciarSesion iniciarSesion(){
        return new IniciarSesion();
    }
}