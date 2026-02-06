/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udmodelos20261.factorymethodpizza2026;

/**
 *
 * @author SCVA9
 */
public abstract class Chef {

    // Factory Method
    public abstract Pizza createPizza();

    // Método plantilla (opcional pero típico)
    public Pizza orderPizza() {
        Pizza pizza = createPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

