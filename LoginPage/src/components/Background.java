
package components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

/**
 *
 * @author samson
 */
public class Background extends javax.swing.JLayeredPane {

    // components 
    
    private Animator animate;
    private float minate = 1f;
    private boolean slide;
    
    
    public Background() {
        initComponents();
    init();
    Color ck = new Color(131,222,120);
        setBackground(ck);
    }
    
    private void init(){
        TimingTarget target = new TimingTargetAdapter(){
            @Override
            public void timingEvent(float fraction) {
                minate = fraction;
                repaint();
                }
            
        };
        animate = new Animator(1000, target);
        animate.setResolution(0);
    }

  
    public void start(){
        animate.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        int width = getWidth();
        int height = getHeight();
        float x = CVR(minate)*width;
        float y =0;
        int CenterX = height/2;
        Path2D.Float fl = new Path2D.Float();
        fl.moveTo(x, y);
        fl.lineTo(x, height);
        fl.curveTo(x, y, FX(minate)*width, CenterX, x, y);
        g2.fill(fl);
        g2.dispose();
        super.paint(g); 
    }


    private float CVR (float x){
    float c1 = 1.70158f;
    float  c3 = c1 + 1;

    double v;
    v = c3 * x * x * x - c1 * x * x;
    return (float)v;
}
    
    private float FX (float x ){
        double v;
        v = 1 - Math.pow(1 - x, 5);
        return (float)v;
         
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
