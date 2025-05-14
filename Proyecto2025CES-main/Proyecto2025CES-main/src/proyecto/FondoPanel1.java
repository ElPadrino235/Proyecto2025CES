package proyecto;

import java.awt.*;
import javax.swing.*;

public class FondoPanel1 extends JPanel {
    private Image imagen;

    public FondoPanel1() {
        
        imagen = new ImageIcon(getClass().getResource("/imagenes/18.jpg")).getImage();
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    }
    
    
}