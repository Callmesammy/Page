
package Component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.TexturePaint;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author samson
 */
public class ButtonBell extends JButton{

    private BufferedImage image;
    private Color clr = new Color(231,77,114);
    public ButtonBell() {
        setUI(new BasicBTN());
    }

    public void createImge(){
        if (getIcon() != null) {
            image = new BufferedImage(getIcon().getIconWidth(), getIcon().getIconHeight(),BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = image.createGraphics();
            g2.drawImage(((ImageIcon)getIcon()).getImage(), 0,0,null);
            g2.dispose();
        }else{
            image = null;
        }
    }
    @Override
    public void setIcon(Icon defaultIcon) {
        super.setIcon(defaultIcon); 
        createImge();
    }
    
    
    public class BasicBTN extends BasicButtonUI{

        @Override
        protected void paintIcon(Graphics g, JComponent c, Rectangle iconRect) {
            if (image != null && !getText().equals("")) {
                Graphics2D g2 = (Graphics2D)g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                double size = Math.max(iconRect.getWidth(), iconRect.getHeight()) +0.8f;
                double x = Math.min(iconRect.getX()+ iconRect.getWidth()/2, c.getWidth() -size);
                double y = Math.max(iconRect.getY() - size/2, 0);
                Area area = new Area(iconRect);
                area.subtract(new Area(new Ellipse2D.Double(x, y, size, size)));
                g2.setPaint(new TexturePaint(image, iconRect));
                g2.fill(area);
                
                // Test
                g2.setColor(clr);
               g2.draw(new Area(new Ellipse2D.Double(x, y, size, size)));
                
                g2.dispose();
                
            }else{
                 super.paintIcon(g, c, iconRect); 
            }
           
        }
        
    }

    /**
     * @return the clr
     */
    public Color getClr() {
        return clr;
    }

    /**
     * @param clr the clr to set
     */
    public void setClr(Color clr) {
        this.clr = clr;
    }
}
