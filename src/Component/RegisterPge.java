
package Component;

import ModeK.ModelUse;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.awt.geom.Path2D;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

/**
 *
 * @author HP
 */
public class RegisterPge extends javax.swing.JPanel {
 
    private boolean selected;
    private float minate;
    private Animator animate;
    private boolean iSselected; 
    public ModelUse data;
    
    public RegisterPge() {
        initComponents();
        setOpaque(false); 
        
        loading.setVisible(true);
        ProfileCom.setVisible(false);
        Message.setVisible(false);
        init();
    }
      public void addModel(ModelUse data){
        this.data = data;
        pic.setIcon(data.getPicture());
        Cmdd.setText("Entere text " + data.getText());
        animate.start();
        
    }
      
////      public void addModel(ModelUse data){
////          data.
////      }
    public void init(){
        TimingTarget target = new TimingTargetAdapter(){
            @Override
            public void begin() {
                if (iSselected) {
                    ProfileCom.setVisible(true);
                    
                }else{
                    Message.setVisible(true);
                }
            }

            @Override
            public void timingEvent(float fraction) {
                if (iSselected) {
                    ProfileCom.setAlpha(fraction);
                    loading.setAlpha(1f-fraction);
                    
                    
                }else{
                    Message.setAlpha(fraction);
                    loading.setAlpha(1f-fraction);
                }
                repaint();
            }
           
        };
        animate = new Animator(500, target);
        animate.setResolution(0);
    }

    public void select(boolean selected, float minate){
        this.selected = selected;
        this.minate = minate;     
    }
    
    public void EventStop(ActionListener event){
        Cmd.addActionListener(event);
        Cmd1.addActionListener(event);
        Cmd2.addActionListener(event);
        
    }
    
  
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProfileCom = new swing.panelTransparent();
        Cmdd = new swing.Button();
        pic = new swing.ImageAvatar();
        Cmd2 = new swing.Button();
        loading = new swing.panelTransparent();
        text = new javax.swing.JLabel();
        Cmd1 = new swing.Button();
        Message = new swing.panelTransparent();
        Cmd = new swing.Button();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        Cmdd.setBackground(new java.awt.Color(85, 120, 227));
        Cmdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        Cmdd.setForeground(new java.awt.Color(255, 255, 255));
        Cmdd.setText("Stop");
        Cmdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cmdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmddActionPerformed(evt);
            }
        });

        pic.setBackground(new java.awt.Color(51, 102, 255));
        pic.setForeground(new java.awt.Color(204, 204, 204));
        pic.setBorderSize(2);
        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pics/picture.jpg"))); // NOI18N

        Cmd2.setBackground(new java.awt.Color(85, 120, 227));
        Cmd2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        Cmd2.setForeground(new java.awt.Color(255, 255, 255));
        Cmd2.setText("Stop");
        Cmd2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout ProfileComLayout = new javax.swing.GroupLayout(ProfileCom);
        ProfileCom.setLayout(ProfileComLayout);
        ProfileComLayout.setHorizontalGroup(
            ProfileComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileComLayout.createSequentialGroup()
                .addGroup(ProfileComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfileComLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProfileComLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Cmdd, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfileComLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(Cmd2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(118, 118, 118))
        );
        ProfileComLayout.setVerticalGroup(
            ProfileComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileComLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Cmdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(Cmd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        add(ProfileCom, "card2");

        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pics/f.gif"))); // NOI18N

        Cmd1.setBackground(new java.awt.Color(85, 120, 227));
        Cmd1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        Cmd1.setForeground(new java.awt.Color(255, 255, 255));
        Cmd1.setText("Stop");
        Cmd1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cmd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmd1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loadingLayout = new javax.swing.GroupLayout(loading);
        loading.setLayout(loadingLayout);
        loadingLayout.setHorizontalGroup(
            loadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadingLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loadingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cmd1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        loadingLayout.setVerticalGroup(
            loadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadingLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(Cmd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        add(loading, "card2");

        Cmd.setBackground(new java.awt.Color(85, 120, 227));
        Cmd.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        Cmd.setForeground(new java.awt.Color(255, 255, 255));
        Cmd.setText("Stop");
        Cmd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Message");

        javax.swing.GroupLayout MessageLayout = new javax.swing.GroupLayout(Message);
        Message.setLayout(MessageLayout);
        MessageLayout.setHorizontalGroup(
            MessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MessageLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(MessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MessageLayout.createSequentialGroup()
                        .addComponent(Cmd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MessageLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addGap(14, 14, 14))))
        );
        MessageLayout.setVerticalGroup(
            MessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MessageLayout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(Cmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        add(Message, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void Cmd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cmd1ActionPerformed

    private void CmddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmddActionPerformed
  @Override
    public void paint(Graphics g) {
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
        g2.dispose();  super.paint(g); 
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
    private swing.Button Cmd;
    private swing.Button Cmd1;
    private swing.Button Cmd2;
    private swing.Button Cmdd;
    private swing.panelTransparent Message;
    private swing.panelTransparent ProfileCom;
    private javax.swing.JLabel jLabel1;
    private swing.panelTransparent loading;
    private swing.ImageAvatar pic;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
