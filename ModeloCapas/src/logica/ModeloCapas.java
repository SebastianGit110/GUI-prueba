package logica;

import igu.Pantalla; //Se importa la clase Pantalla de la capa igu

public class ModeloCapas {

    public static void main(String[] args) {
        //Quitarle el metodo main a la clase de la interfaz grafica para quitarle el play verde
        
        Pantalla panta = new Pantalla(); //creacion de objeto de Pantalla
        panta.setVisible(true); //Hacer la pantalla visible
        panta.setLocationRelativeTo(null); //Poner como referencia nada (null)
        
    }
    
}
