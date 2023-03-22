/**
 * La secretaria de salud requiere un programa que le permita determinar 
 * qué tipo de vacuna (A, B o C) debe aplicar a una persona, 
 * considerando que si es mayor de 70 años, sin importar el sexo,
 * se le aplica la tipo C; si tiene entre 16 y 69 años, y es mujer,
 * se le aplica la B, y si es hombre, la A; si es menor de 16 años,
 * se le aplica la tipo A, sin importar el sexo.
 *  
 * /////////////////////////////////////////////////////////////////
 * Nota: El docente solicita que se realiza con la estructura condicional switch,
 * adapte la solucion a los requerimientos del docente
 * ///////////////////////////////////////////////////
 */
package practica01;

import javax.swing.JOptionPane;

public class Practica01 {

    public static void main(String[] args) {
        String tipoVacuna, sexo;
        int edad;
        
        tipoVacuna = "";
        sexo = JOptionPane.showInputDialog("Ingrese el sexo 'M' o 'H'");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingres su edad"));
        if(edad > 70){
            tipoVacuna = "C";
        } else {
            if(edad >= 16 && edad <= 69){
                
                switch (sexo) {
                    case "M":
                        tipoVacuna = "B";
                        break;
                    case "H":
                        tipoVacuna = "A";
                        break;
                    
                }
                
            }else{
                if( edad < 16){
                    tipoVacuna = "A";
                }
            }
        }
        switch (tipoVacuna) {
            case "A":
                System.out.println("Edad:" + edad);
                System.out.println("Sexo: " + sexo);
                System.out.println("Se aplica el tipo de Vacuna: " + tipoVacuna);
                break;
            case "B":
                System.out.println("Edad:" + edad);
                System.out.println("Sexo: " + sexo);
                System.out.println("Se aplica el tipo de Vacuna: " + tipoVacuna);
                break;
            case "C":
                System.out.println("Edad:" + edad);
                System.out.println("Sexo: " + sexo);
                System.out.println("Se aplica el tipo de Vacuna: " + tipoVacuna);
                break;
            default:
                System.out.println("No se aplica ninguna vacuna");
        }
    }
    
}
