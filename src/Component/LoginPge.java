
package Component;

import java.awt.event.ActionListener;

/**
 *
 * @author HP
 */
public class LoginPge extends javax.swing.JPanel {

    /**
     * Creates new form LoginPge
     */
    public LoginPge() {
        initComponents();
        setOpaque(false);
        
    }

    
    public boolean checkUser(){
        return !(txtUser.getText().trim().equals("")|| String.valueOf(txtPwsd.getPassword()).trim().equals(""));
    }

    public String username(){
        return txtUser.getText().trim();
    }
    
    public String password(){
        return String.valueOf(txtPwsd.getPassword()).trim();
    }
    public void addEventButt(ActionListener event){
        CmdLog.addActionListener(event);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPwsd = new swing.PasswordField();
        CmdLog = new swing.Button();
        txtUser = new swing.TextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Login");

        txtPwsd.setLabelText("Password");

        CmdLog.setBackground(new java.awt.Color(56, 87, 245));
        CmdLog.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        CmdLog.setForeground(new java.awt.Color(255, 255, 255));
        CmdLog.setText("Login");
        CmdLog.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtUser.setLabelText("User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPwsd, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                        .addComponent(CmdLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtPwsd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(CmdLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button CmdLog;
    private javax.swing.JLabel jLabel1;
    private swing.PasswordField txtPwsd;
    private swing.TextField txtUser;
    // End of variables declaration//GEN-END:variables
}
