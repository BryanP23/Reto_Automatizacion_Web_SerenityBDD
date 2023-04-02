package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionCompra extends PageObject  {
    public static Target MENSAJE_COMPRA_EXITOSA = Target.the("Imprimir")
            .located(By.xpath("//div[contains(text(),'Imprimir')]"));
}
