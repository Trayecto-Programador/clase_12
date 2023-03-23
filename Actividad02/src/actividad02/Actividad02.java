/**
 * Una compañía de paquetería internacional tiene servicio en algunos
países de América del Norte, América Central, América del Sur, Europa y
Asia. El costo por el servicio de paquetería se basa en el peso del paquete
y la zona a la que va dirigido. Lo anterior se muestra en la tabla
Zona Ubicación Costo/gramo
1 América del Norte $11.00
2 América Central $10.00
3 América del Sur $12.00
4 Europa $24.00
5 Asia $27.00
Parte de su política implica que los paquetes con un peso superior a 5 kg
no son transportados, esto por cuestiones de logística y de seguridad.
Realice un algoritmo para determinar el cobro por la entrega de un
paquete o, en su caso, el rechazo de la entrega; represéntelo mediante
un programa
 */
package actividad02;

import javax.swing.JOptionPane;

public class Actividad02 {

    public static void main(String[] args) {
        int codigoZona, peso;
        double  pesoMaximo;
        
        pesoMaximo = 5;
        peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso del envio expresado en KG"));
        if(peso > pesoMaximo){
            System.out.println("Paquete con exceso de peso, no se realizará el envio");
        }else{
            do {
                codigoZona = Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo de zona"));
                
                if(codigoZona < 0 || codigoZona >5){
                    System.out.println("Zona inexiste");
                }
            } while (codigoZona < 0 || codigoZona > 5);
            
            switch (codigoZona) {
                case 1:
                    System.out.println("Destino: America del Norte");
                    System.out.println("Importe de envio: $11");
                    break;
                    
               case 2:
                    System.out.println("Destino: America Central");
                    System.out.println("Importe de envio: $10");
                    break;
                    
               case 3:
                    System.out.println("Destino: America del Sur");
                    System.out.println("Importe de envio: $12");
                    break;
                    
               case 4:
                    System.out.println("Destino: Europa");
                    System.out.println("Importe de envio: $24");
                    break;
                    
                case 5:
                    System.out.println("Destino: Asia");
                    System.out.println("Importe de envio: $27");
                    break;
               
            }
        }
        
        
    }
    
}
