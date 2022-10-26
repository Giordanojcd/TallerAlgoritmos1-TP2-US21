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

class Stack {

    private int lenght = 0;
    private int max;
    private String data[];

    public Stack(int max){
        this.max = max; 
        this.data = new String[max];
    }

    public void push(String word) {
        data[lenght] = word;
        lenght++;
    }

    public String pop() {
        String value = data[lenght - 1];
        data[lenght - 1] = null;
        lenght--;
        return value;
    }


    public boolean isEmpty() {
        
        if (data[0] == null)
            return true;
        else
            return false;

    }
    public boolean isFull() {
        if (max == lenght)
            return true;
        else
            return false;

    }
}