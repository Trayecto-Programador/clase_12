/**
 * 1. El 14 de febrero una persona desea comprarle un regalo al ser querido
 * que más aprecia en ese momento, su dilema radica en qué regalo puede
 * hacerle, las alternativas que tiene son las siguientes:
 * Regalo Costo
 * Tarjeta $10.00 o menos
 * Chocolates $11.00 a $100.00
 * Flores $101.00 a $250.00
 * Anillo Más de $251.00
 * Se requiere un programa que ayude a determinar qué regalo se
 * le puede comprar a ese ser tan especial por el día del amor y la
 * amistad.
 */
package actividad01;

import javax.swing.JOptionPane;

public class Actividad01 {

    public static void main(String[] args) {
        int presupuesto;

        do {
            presupuesto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dinero disponible mayor a cero"));;
        } while (presupuesto <= 0);
        System.out.println("Regalos disponible segun el  presupuesto ingresado");
        if (presupuesto <= 10) {
            System.out.println("Tarjeta");
        } else {
            if (presupuesto > 11 && presupuesto <= 100) {
                System.out.println("Tarjeta");
                System.out.println("Chocolate");
            } else {
                if (presupuesto > 101 && presupuesto <= 250) {
                    System.out.println("Tarjeta");
                    System.out.println("Chocolate");
                    System.out.println("Flores");
                } else {
                    System.out.println("Tarjeta");
                    System.out.println("Chocolate");
                    System.out.println("Flores");
                    System.out.println("Anillo");
                }

            }
        }

    }

}
