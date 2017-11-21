package ElementosDelJuego;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import riverraid.Ventana;


/**clase de tipo JPanel que es la que contiene los elementos que se muestran en pantalla cuando el jugador pierde las tres vidas*/
public class FinDelJuego extends JPanel{
    
    private JButton continuar;
   JLabel img;
    
    /**construcor por defecto que inicializa algunos componentes y los agrega*/
    public FinDelJuego() {
        setLayout(null);
        setOpaque(false);
        img = new JLabel(new ImageIcon("src/FondoMenuPause/Menu1.png"));
        img.setBounds(0,0,200,200);
        continuar = new JButton("Continuar");
        setBounds(Ventana.width/2 - 100, 250,200, 190);
        continuar.setBounds(50,90,100,20);
        continuar.setOpaque(false);
        add(continuar);
        add(img);
    }
    
    /**metodo que retorna el boton de continuar para darle funcionalidad en el gamestate*/
    public JButton getContinuar(){
        return continuar;
    }
    
    
    
}
