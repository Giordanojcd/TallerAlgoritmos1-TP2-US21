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

class Queue {

    public Nodo top = null;
    public Nodo head = null;
    

   

    public void enqueue(Order o){
        Nodo newNodo = new Nodo(o);
        
        if(isEmpty()){
            this.head = newNodo;
            this.top = newNodo;
        }else{
            this.top.next = newNodo;
            this.top = newNodo;
        }

    }

    public Order dequeue(){
        if(!isEmpty()){
            if(this.head == this.top){
                this.head = null;
                this.top = null;
            }else{
                this.head = this.head.next;
            }
            
        }
        return null;
        
    };

    public boolean isEmpty(){
        return this.head == null;
    }
    

    public class Nodo {
        public Order order;
        public Nodo next = null;

        public Nodo(Order order){
            this.order = order;
        }
        
    }
  
}