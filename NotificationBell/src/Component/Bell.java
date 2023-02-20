
package Component;

import java.awt.Color;
import java.awt.Graphics; 
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicButtonUI;


public class Bell extends JButton{

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    private BufferedImage image;
    private Color color; 
    
    public Bell() {
        setUI(new Basicbell()); 
        color = new Color(2,2,2,2);
    }
   

    public void createImage (){
        if (getIcon() != null) {
            image = new BufferedImage(getIcon().getIconWidth(), getIcon().getIconHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = image.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.drawImage(((ImageIcon)getIcon()).getImage(), 0, 0, null);
        }else{
            image = null;
        }
        
    }
    @Override
    public void setIcon(Icon defaultIcon) {
        super.setIcon(defaultIcon); 
        createImage();
        
    }
    
    
    
    
    public class Basicbell extends BasicButtonUI{

        @Override
        protected void paintIcon(Graphics g, JComponent c, Rectangle iconRect) {
            super.paintIcon(g, c, iconRect); 
        }
        
        
        
    }
}
