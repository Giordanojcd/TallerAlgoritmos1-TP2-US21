/** 
 * ********************************************************
 * ** Trabajo Practico Nº2 - CONSIGNA 2 - US21           **
 * ** Alumnos:                                           **
 * ** -Rodolfo Vizcay Legajo Nº                          **
 * ** -Nicolas Zabala Legajo Nº                          **
 * ** -Juan Marcelo Vila Legajo Nº                       **
 * ** -Franco Gatti Legajo Nº                            **
 * ** -Juan Carlos Daniel Giordano Legajo Nº VINF011535  **
 * ********************************************************
 */

import java.util.LinkedList;
import java.util.Scanner;


/**
 * Tp1Consigna2
 */
public class Tp2Consigna2 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String exit = "s";
        String option = null;
        Queue queue = new Queue();
        int count = 0;
        
        viewMenu();

        option = keyboard.next();
    
            while (!exit.equals(option)) {
                try {

                    switch (option) {
                        case "e":
                            System.out.println("---                                CARGAR NUEVA ORDEN                                   ---");
                           
                            
                            System.out.println("---  NOMBRE DEL CLIENTE");
                            String name = keyboard.next();
                            System.out.println("---  CANTIDAD DE LADRILLOS");
                            int quantity = Integer.parseInt(keyboard.next());
                            count++;
                            int number = count;
                            Order order = new Order(number, name, quantity);
                            queue.enqueue(order);
                            System.out.println("---------------------------------------ORDEN CARGADA---------------------------------------");
                            System.out.println("--- NRO.: "+order.number()+" | Señor/a: "+order.name()+" | Cantidad de ladrillos: "+order.quantity()+"");
                            System.out.println("-------------------------------------------------------------------------------------------");
                            break;

                        case "d": 
                            if (queue.isEmpty()) {
                                System.out.println("----------------------------------------ADVERTNCIA-----------------------------------------");
                                System.out.println("--- No hay ordenes para despachar");
                                System.out.println("-------------------------------------------------------------------------------------------");
                            } else {
                                System.out.println("-------------------------------------DESPACHO DE ORDEN-------------------------------------");
                        
                                System.out.println("--- ORDEN NUMERO "+queue.head.order.number());
                                System.out.println("--- Se despacho la orden para el señor/a "+queue.head.order.name()+" de "+queue.head.order.quantity()+" ladrillos");
                                System.out.println("-------------------------------------------------------------------------------------------");
                                
                                queue.dequeue();
                            }
                           
                            break;
                        case "m": 
                            viewMenu();
                    
                            break;           

                        default:
                            System.out.println("-------------------------------------------ERROR-------------------------------------------");
                            System.out.println("--- La opción elegida no esta entre las permitidas                                         ");
                            System.out.println("-------------------------------------------------------------------------------------------");
                    
                            break;
                    }
                } catch (Exception e) {
                    System.out.println(
                            "------------------------------------------ERROR-----------------------------------------");
                    System.out.println(
                            "----A ocurrido un error                                                              ---");
                    System.out.println(
                            "----------------------------------------------------------------------------------------");
                }
            
               
                option = keyboard.next();
            }

      

        System.out.println("----------------------------------SALISTE DEL SISTEMA--------------------------------------");
        keyboard.close();

    }

    public static void viewMenu() {
        System.out.println("------------------------SISTEMA PARA ORDEN Y DESPACHO DE PEDIDOS-------------------------");
        System.out.println("-------------------------------------------MENU------------------------------------------");
        System.out.println("---Las operacions posible del sistema son:                                            ---");
        System.out.println("--- m - Menu - Muestra el menu                                                        ---");
        System.out.println("--- e - Encolar - cargar la orden al sistema                                          ---");
        System.out.println("--- d - desencolar - descargar orden del sistema                                      ---");
        System.out.println("--- s - Salir                                                                         ---");
        System.out.println("----------------------------------------FIN DEL MENU-------------------------------------");
    }

}

