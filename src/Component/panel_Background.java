
package Component;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private RegisterPge registerPge;
    private boolean selected;
    
    public panel_Background() {
        initComponents();
      
        init();
    }

    private void init(){  
        setBackground(new Color( 32, 68, 180));
        setPreferredSize(new Dimension(296, 350));
        layout = new MigLayout("inset 0","[fill]", "[fill]");
        setLayout(layout);
        loginPge = new LoginPge();
//        loginPge.setVisible(true);
//        loginPge.setOpaque(false);
        registerPge = new RegisterPge();
        registerPge.setBackground(new Color( 32, 68, 180));
        registerPge.setVisible(false);
        
        TimingTarget target = new TimingTargetAdapter(){
            @Override
            public void begin() {
                if (selected) {
                    registerPge.setVisible(true);
                    
                }else{
                    loginPge.setVisible(true);
                }
            }
            
            
            @Override
            public void timingEvent(float fraction) {
                double width = getWidth();
                minate = fraction;
                float a = easeOutBounce(fraction);
                int x = (int) (a *width);
                registerPge.select(selected, fraction);
                layout.setComponentConstraints(registerPge, "pos " +x+ " 0 100% 100%");
                revalidate();
                repaint();
            }

            @Override
            public void end() {
                if (selected) {
                    loginPge.setVisible(false);
                }else{
                    registerPge.setVisible(false);
                }
              
            }
            
        };
        animate = new Animator(1500, target);
        animate.setResolution(0);
        add(registerPge, " pos 0 0 0 0, w 0!");
            add(loginPge);
            loginPge.addEventButt(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!animate.isRunning()) {
                     Start(true);
                }
            }
            });
            registerPge.EventStop(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!animate.isRunning()) {
                    Start(false);
                }
            }
            });

    }
    public void Start(boolean show){
        selected = show;
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
      super.paint(g); 
        if (selected == false) {
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
        g2.dispose();  
        }
        
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
            if (selected) {
                   return (float) (1f - v);
 
            }else{
                    return (float)v;

            }
    }

        private float easeInBounce(float x) {
            double v;
    v = 1 - easeOutBounce(1 - x);
            if (selected) {
                  return (float) (1f-v);
  
            }else{
                    return (float)v;

            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
