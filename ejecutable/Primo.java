package ejecutable;

import javax.swing.JOptionPane;


public class Primo{

    public static void main(String[] args) {
       
        int numero;

        boolean confir = false;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Dijite un número entero positivo: "));
    
        if (numero == 0 || numero == 1 || numero == 4) {
    
            JOptionPane.showMessageDialog(null, "El número " + numero + " NO es primo" );
    
        }else{
        for (int x = 2; x < numero / 2; x++) {


            if (numero % x == 0){
                confir = true;
            }
            
        }    

        if (confir){
            JOptionPane.showMessageDialog(null, "El número " + numero + " NO es primo" ); 
            
        }else {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es primo" );
        }
        }    
        
    }
    
}

    
