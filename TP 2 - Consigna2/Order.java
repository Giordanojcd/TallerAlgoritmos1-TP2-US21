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


final class Order {
    
    private int number;
    private String name;
    private int quantity;

    public Order(int number, String name, int quantity){
        this.number = number;
        this.name = name;
        this.quantity = quantity;
    }

    public int number(){
        return this.number;
    }
    public String name(){
        return this.name;
    }
    public int quantity(){
        return this.quantity;
    }
  
}