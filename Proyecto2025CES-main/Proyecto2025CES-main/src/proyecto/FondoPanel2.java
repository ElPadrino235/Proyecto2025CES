package proyecto;

import java.awt.*;
import javax.swing.*;

public class FondoPanel2 extends JPanel {
    private Image imagen;

    public FondoPanel2() {
        
        imagen = new ImageIcon(getClass().getResource("/imagenes/mistico.jpg")).getImage();
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    }
    
    
}
