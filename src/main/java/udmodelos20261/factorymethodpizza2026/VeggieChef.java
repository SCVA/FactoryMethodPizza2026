/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udmodelos20261.factorymethodpizza2026;

/**
 *
 * @author SCVA9
 */
public class VeggieChef extends Chef {

    @Override
    public Pizza createPizza() {
        return new VeggiePizza();
    }
}

