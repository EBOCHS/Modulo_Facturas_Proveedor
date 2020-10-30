
package vista;

import com.sun.glass.events.KeyEvent;


public class OpAdministrador extends javax.swing.JFrame {

    public OpAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        grafica = new javax.swing.JButton();
        BTN_IN = new javax.swing.JButton();
        BTN_R = new javax.swing.JButton();
        BTN_PROV = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TBN_FAC = new javax.swing.JToggleButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        grafica.setText("Mostrar graficas ");
        grafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficaActionPerformed(evt);
            }
        });
        grafica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                graficaKeyPressed(evt);
            }
        });

        BTN_IN.setText("INICIO");
        BTN_IN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_INActionPerformed(evt);
            }
        });
        BTN_IN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BTN_INKeyPressed(evt);
            }
        });

        BTN_R.setText("REPORTES");
        BTN_R.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BTN_RKeyPressed(evt);
            }
        });

        BTN_PROV.setText("Proveedores");
        BTN_PROV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_PROVActionPerformed(evt);
            }
        });
        BTN_PROV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BTN_PROVKeyPressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("FACTURA PROVEEDOR ");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_3_3319636.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_Report_669954.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_Estate_home_house_building_property_real_1886940.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_property-agent-004_1851813.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconfinder_00-ELASTOFONT-STORE-READY_invoice_2703075.png"))); // NOI18N

        TBN_FAC.setText("NUEVA FACTURA");
        TBN_FAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBN_FACActionPerformed(evt);
            }
        });
        TBN_FAC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TBN_FACKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_IN)
                    .addComponent(jLabel5))
                .addGap(288, 288, 288))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(TBN_FAC)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(grafica)
                            .addGap(60, 60, 60)
                            .addComponent(BTN_PROV))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(72, 72, 72)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(204, 204, 204)
                                    .addComponent(jLabel4)
                                    .addGap(129, 129, 129)))
                            .addComponent(jLabel6)
                            .addGap(23, 23, 23)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_R)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(15, 15, 15)))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grafica)
                    .addComponent(BTN_PROV)
                    .addComponent(BTN_R)
                    .addComponent(TBN_FAC))
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_IN)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void graficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_graficaActionPerformed

    private void TBN_FACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBN_FACActionPerformed
        // TODO add your handling code here:
         Vista_Factura fac = new Vista_Factura();
        fac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TBN_FACActionPerformed

    private void BTN_INActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_INActionPerformed
        // TODO add your handling code here:
        login obj =new login();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_INActionPerformed

    private void TBN_FACKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TBN_FACKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            grafica.requestFocus();
            
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Vista_Factura fac = new Vista_Factura();
        fac.setVisible(true);
        this.dispose();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN ){
            BTN_IN.requestFocus();
        }
    }//GEN-LAST:event_TBN_FACKeyPressed

    private void graficaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_graficaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            BTN_PROV.requestFocus();
            
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            TBN_FAC.requestFocus();
            
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN ){
            BTN_IN.requestFocus();
        }
        
    }//GEN-LAST:event_graficaKeyPressed

    private void BTN_PROVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BTN_PROVKeyPressed
        // TODO add your handling code here:
        
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            BTN_R.requestFocus();
            
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            grafica.requestFocus();
            
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN ){
            BTN_IN.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER ){
            vista_crear_proveedor ini=new vista_crear_proveedor();
            ini.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BTN_PROVKeyPressed

    private void BTN_RKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BTN_RKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            BTN_PROV.requestFocus();
            
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN ){
            BTN_IN.requestFocus();
        }
    }//GEN-LAST:event_BTN_RKeyPressed

    private void BTN_INKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BTN_INKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_UP){
           TBN_FAC.requestFocus();
        }
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         login obj =new login();
         obj.setVisible(true);
         this.dispose();
        }
    }//GEN-LAST:event_BTN_INKeyPressed

    private void BTN_PROVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_PROVActionPerformed
        // TODO add your handling code here:
        vista_crear_proveedor ini= new  vista_crear_proveedor();
       ini.setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_BTN_PROVActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_IN;
    public static javax.swing.JButton BTN_PROV;
    public static javax.swing.JButton BTN_R;
    public static javax.swing.JToggleButton TBN_FAC;
    public static javax.swing.JButton grafica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
