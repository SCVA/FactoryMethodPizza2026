/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package udmodelos20261.factorymethodpizza2026;

import java.util.Scanner;

/**
 *
 * @author SCVA9
 */
public class FactoryMethodPizza2026 {

    public static void main(String[] args) {
        Chef chefsito; 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Seleccione tipo de pizza: (1) Queso, (2) Vegetariana");
        int opcion = input.nextInt();
        
        chefsito = switch (opcion) {
            case 1 -> new CheeseChef();
            case 2 -> new VeggieChef();
            default -> new CheeseChef();
        };
        chefsito.orderPizza();
    }
}
