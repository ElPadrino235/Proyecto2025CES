package proyecto;

import java.awt.*;
import javax.swing.*;

public class FondoPanel extends JPanel {
    private Image imagen;
    private Image imagen1;

    public FondoPanel() {
        
        imagen = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg")).getImage();
    }
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    }
    
    
}

