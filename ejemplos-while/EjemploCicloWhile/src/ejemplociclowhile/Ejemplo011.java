/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

/**
 *
 * @author reroes
 */
public class Ejemplo011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        int limit = 13;

        while (contador <= limit){
             System.out.printf("%d\n", contador);
             contador = contador + 1;

        }
        System.out.printf("contador fuera del while: %d\n", contador);
        
        
    }
    
}
