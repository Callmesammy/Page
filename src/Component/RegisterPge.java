/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Component;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;

/**
 *
 * @author HP
 */
public class RegisterPge extends javax.swing.JPanel {

    private boolean selected;
    private float minate;
    
    public RegisterPge() {
        initComponents();
        setOpaque(false);
        
    }

    public void select(boolean selected, float minate){
        this.selected = selected;
        this.minate = minate;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hello Techies ");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addContainerGap(341, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
  @Override
    public void paint(Graphics g) {
        super.paint(g); 
          Graphics2D g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        int width = getWidth();
        int height= getHeight();
        int x =0;
        int y = 0;
           if (selected) {
       int CenterX = height/2;
        Path2D.Float t = new Path2D.Float();
        t.moveTo(x, y);
        t.lineTo(width, y);
        t.lineTo(width, height);
//        t.lineTo(x, y);
        t.lineTo(x, height);
        t.curveTo(x, height, easeOutBounce(minate)*width, CenterX, x, y);
        g2.fill(t);   
            }else{
               g2.fillRect(x, y, width, height);
            }
        g2.dispose();
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
               return (float) (1f -v);

        }else{
                return (float)v;

        }
    }

        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
