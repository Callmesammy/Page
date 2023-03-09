/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

/**
 *
 * @author HP
 */
public class panel_Background extends javax.swing.JLayeredPane {

    private Animator animate; 
    private float minate = 1f;
    private LoginPge loginPge;
    private MigLayout layout;
    
    public panel_Background() {
        initComponents();
        setBackground(new Color(121,200,150));
        init();
    }

    private void init(){
        layout = new MigLayout("inset 0","[fill]", "[fill]");
        setLayout(layout);
        loginPge = new LoginPge();
        loginPge.setOpaque(false);
        TimingTarget target = new TimingTargetAdapter(){
            @Override
            public void timingEvent(float fraction) {
                minate = fraction;
                repaint();
            }
        };
        animate = new Animator(1500, target);
        animate.setResolution(0);
        add(loginPge);
    }
   
    public void Start(){
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
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        int width = getWidth();
        int height= getHeight();
        float x = easeOutBounce(minate)*width;
        float y = 0;
        int CenterX = height/2;
        Path2D.Float t = new Path2D.Float();
        t.moveTo(x, y);
        t.lineTo(x, height);
        t.curveTo(x, height, easeInBounce(minate)*width, CenterX, x, y);
        g2.fill(t);
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    private float easeOutBounce(float x) {
float n1 = 7.5625f;
float d1 = 2.75f;
   double v;
if (x < 1 / d1) {
     v = n1 * x * x;
} else if (x < 2 / d1) {
    v = n1 * (x -= 1.5 / d1) * x + 0.75;
} else if (x < 2.5 / d1) {
    v=  n1 * (x -= 2.25 / d1) * x + 0.9375;
} else {
    v = n1 * (x -= 2.625 / d1) * x + 0.984375;
}
return (float)v;
}
    
    private float easeInBounce(float x) {
        double v;
v = 1 - easeOutBounce(1 - x);
return (float)v;

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
