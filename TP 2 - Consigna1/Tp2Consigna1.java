/** 
 * ********************************************************
 * ** Trabajo Practico Nº2 - CONSIGNA 1 - US21           **
 * ** Alumnos:                                           **
 * ** -Rodolfo Vizcay Legajo Nº                          **
 * ** -Nicolas Zabala Legajo Nº                          **
 * ** -Juan Marcelo Vila Legajo Nº                       **
 * ** -Franco Gatti Legajo Nº                            **
 * ** -Juan Carlos Daniel Giordano Legajo Nº VINF011535  **
 * ********************************************************
 */

import java.util.Scanner;

/**
 * Tp1Consigna1
 */
public class Tp2Consigna1 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String exit = "s";
        String option = null;
        Stack stack = new Stack(4);

        viewMenu();

        option = keyboard.next();
    
            while (!exit.equals(option)) {
                try {

                    switch (option) {
                        case "a":
                            if (stack.isFull()) {
                                System.out.println("---------------------------------------APILAR-------------------------------------------");
                                System.out.println("                                 LA PILA ESTA LLENA                                     ");
                                System.out.println("----------------------------------------------------------------------------------------");
                            } else {
                                System.out.println("------------------------------ESCRIBA LA PALABRA A APILAR-------------------------------");
                                String data = keyboard.next();
                                stack.push(data);
                                System.out.println("-----------------------------------------APILAR-----------------------------------------");
                                System.out.println("----Usted apilo la palabra: " + data);
                                System.out.println("----------------------------------------------------------------------------------------");
                            }
                            break;

                        case "d":
                            if (stack.isEmpty()){
                                System.out.println("---------------------------------------DESAPILAR----------------------------------------");
                                System.out.println("                                   LA PILA ESTA VACIA                                   ");
                                System.out.println("----------------------------------------------------------------------------------------");
                            }else {
                                String word = stack.pop();
                                
                                System.out.println("----------------------------------------DESAPILAR---------------------------------------");
                                System.out.println("----Usted desapilo la palabra: " + word);
                                System.out.println("----------------------------------------------------------------------------------------");
                            }
                            break;
                        case "e":
                            
                            System.out.println("-------------------------------------------ESTADO------------------------------------------");

                            if (stack.isEmpty()) 
                                System.out.println("                                   LA PILA ESTA VACIA                                      ");
                            else 
                                System.out.println("                                 LA PILA NO ESTA VACIA                                     ");

                            System.out.println("-------------------------------------------------------------------------------------------");

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
        System.out.println("---------------------SISTEMA PARA APILAR UN MAXIMO DE 4 PALABRAS-------------------------");
        System.out.println("-------------------------------------------MENU------------------------------------------");
        System.out.println("---Las operacions posible del sistema son:                                            ---");        
        System.out.println("--- m - Menu - Muestra el menu                                                        ---");
        System.out.println("--- a - Apilar dato - Selecione de enter y coloce el dato a apilar                    ---");
        System.out.println("--- d - Desapilar dato - Selecione de enter y d1esapilar el ultimo dato colocado (TOP)---");
        System.out.println("--- e - Devuelve estado de la pila                                                    ---");
        System.out.println("--- s - Salir                                                                         ---");
        System.out.println("----------------------------------------FIN DEL MENU-------------------------------------");
    }

}

