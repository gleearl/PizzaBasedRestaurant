
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gleea
 */
public class MenuUI extends javax.swing.JFrame {

    /**
     * Creates new form MenuUI
     */
    public MenuUI() {
        //tsum.setText(Integer.toString(getSum()));
        initComponents();
        
    }
     public static int getSum(){
        int rowsCount = menutable.getRowCount();
        int sum = 0;
        for(int i = 0; i < rowsCount; i++){
            sum = sum+Integer.parseInt(menutable.getValueAt(i, 2).toString());
        }
        return sum;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelbbq = new javax.swing.JLabel();
        jLabelhaw = new javax.swing.JLabel();
        jLabelham = new javax.swing.JLabel();
        jLabelbbqmeat = new javax.swing.JLabel();
        jLabelPep = new javax.swing.JLabel();
        jLabelpepp = new javax.swing.JLabel();
        addpeplovers = new javax.swing.JButton();
        hawaaian = new javax.swing.JLabel();
        peplovers = new javax.swing.JLabel();
        addhawaiian = new javax.swing.JButton();
        hamlovers = new javax.swing.JLabel();
        addhamlovers = new javax.swing.JButton();
        bbqmeat = new javax.swing.JLabel();
        addbbqmeat = new javax.swing.JButton();
        bbqbeef = new javax.swing.JLabel();
        addLemon = new javax.swing.JButton();
        loadpep = new javax.swing.JLabel();
        addloadpep = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        addCreate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        addCola = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        confirmOrder = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        addBbqbeef = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tsum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        menutable = new javax.swing.JTable();
        jLabelBackground1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1208, 800));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diy12.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 150, 30));

        jLabelbbq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bbq.png"))); // NOI18N
        jLabelbbq.setText("jLabel3");
        jPanel1.add(jLabelbbq, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 140, 140));

        jLabelhaw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/haw.png"))); // NOI18N
        jLabelhaw.setText("jLabel3");
        jPanel1.add(jLabelhaw, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 140, 150));

        jLabelham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ham.png"))); // NOI18N
        jLabelham.setText("jLabel3");
        jPanel1.add(jLabelham, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 140, 150));

        jLabelbbqmeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bbqmeat.png"))); // NOI18N
        jLabelbbqmeat.setText("jLabel3");
        jPanel1.add(jLabelbbqmeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 140, 130));

        jLabelPep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pep.png"))); // NOI18N
        jLabelPep.setText("jLabel1");
        jPanel1.add(jLabelPep, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 140, 140));

        jLabelpepp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pepp.png"))); // NOI18N
        jLabelpepp.setText("jLabel1");
        jPanel1.add(jLabelpepp, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 140, 140));

        addpeplovers.setBackground(new java.awt.Color(204, 51, 0));
        addpeplovers.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        addpeplovers.setForeground(new java.awt.Color(255, 255, 255));
        addpeplovers.setText("Add to cart");
        addpeplovers.setToolTipText("");
        addpeplovers.setBorder(null);
        addpeplovers.setBorderPainted(false);
        addpeplovers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addpeplovers.setOpaque(false);
        addpeplovers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addpeploversActionPerformed(evt);
            }
        });
        jPanel1.add(addpeplovers, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 60, 20));

        hawaaian.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hawaaian.setForeground(new java.awt.Color(255, 255, 255));
        hawaaian.setText("HAWAIIAN");
        hawaaian.setToolTipText("");
        hawaaian.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(hawaaian, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 100, 20));

        peplovers.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        peplovers.setForeground(new java.awt.Color(255, 255, 255));
        peplovers.setText("Pepperoni Lovers");
        jPanel1.add(peplovers, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, 20));

        addhawaiian.setBackground(new java.awt.Color(204, 51, 0));
        addhawaiian.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        addhawaiian.setForeground(new java.awt.Color(255, 255, 255));
        addhawaiian.setText("Add to cart");
        addhawaiian.setToolTipText("");
        addhawaiian.setBorder(null);
        addhawaiian.setBorderPainted(false);
        addhawaiian.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addhawaiian.setOpaque(false);
        addhawaiian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addhawaiianActionPerformed(evt);
            }
        });
        jPanel1.add(addhawaiian, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 60, 20));

        hamlovers.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hamlovers.setForeground(new java.awt.Color(255, 255, 255));
        hamlovers.setText("Ham Lovers");
        jPanel1.add(hamlovers, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, 20));

        addhamlovers.setBackground(new java.awt.Color(204, 51, 0));
        addhamlovers.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        addhamlovers.setForeground(new java.awt.Color(255, 255, 255));
        addhamlovers.setText("Add to cart");
        addhamlovers.setToolTipText("");
        addhamlovers.setBorder(null);
        addhamlovers.setBorderPainted(false);
        addhamlovers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addhamlovers.setOpaque(false);
        addhamlovers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addhamloversActionPerformed(evt);
            }
        });
        jPanel1.add(addhamlovers, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 60, 20));

        bbqmeat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bbqmeat.setForeground(new java.awt.Color(255, 255, 255));
        bbqmeat.setText("BBQ Meatlovers");
        jPanel1.add(bbqmeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 140, 20));

        addbbqmeat.setBackground(new java.awt.Color(204, 51, 0));
        addbbqmeat.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        addbbqmeat.setForeground(new java.awt.Color(255, 255, 255));
        addbbqmeat.setText("Add to cart");
        addbbqmeat.setToolTipText("");
        addbbqmeat.setBorder(null);
        addbbqmeat.setBorderPainted(false);
        addbbqmeat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addbbqmeat.setOpaque(false);
        addbbqmeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbbqmeatActionPerformed(evt);
            }
        });
        jPanel1.add(addbbqmeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 60, 20));

        bbqbeef.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bbqbeef.setForeground(new java.awt.Color(255, 255, 255));
        bbqbeef.setText("BBQ Beef");
        jPanel1.add(bbqbeef, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 90, 20));

        addLemon.setBackground(new java.awt.Color(204, 51, 0));
        addLemon.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        addLemon.setForeground(new java.awt.Color(255, 255, 255));
        addLemon.setText("Add to cart");
        addLemon.setToolTipText("");
        addLemon.setBorder(null);
        addLemon.setBorderPainted(false);
        addLemon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addLemon.setOpaque(false);
        addLemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLemonActionPerformed(evt);
            }
        });
        jPanel1.add(addLemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 60, 20));

        loadpep.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loadpep.setForeground(new java.awt.Color(255, 255, 255));
        loadpep.setText("Loaded Pepperoni");
        jPanel1.add(loadpep, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 160, 20));

        addloadpep.setBackground(new java.awt.Color(204, 51, 0));
        addloadpep.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        addloadpep.setForeground(new java.awt.Color(255, 255, 255));
        addloadpep.setText("Add to cart");
        addloadpep.setToolTipText("");
        addloadpep.setBorder(null);
        addloadpep.setBorderPainted(false);
        addloadpep.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addloadpep.setOpaque(false);
        addloadpep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addloadpepActionPerformed(evt);
            }
        });
        jPanel1.add(addloadpep, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 60, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/30-minute-pizza-dough_edited-1.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 540, 820, 220));

        jLabel13.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prefabb.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 80, 30));

        addCreate.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        addCreate.setForeground(new java.awt.Color(51, 51, 51));
        addCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CREATE.png"))); // NOI18N
        addCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCreateActionPerformed(evt);
            }
        });
        jPanel1.add(addCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 90, -1));

        jLabel8.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DRNKSS.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1372714855290-dumpfm-Rob-glass-lemonade-2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 100, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/02-cola-kraut-big.png"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 100, -1));

        addCola.setBackground(new java.awt.Color(204, 51, 0));
        addCola.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        addCola.setForeground(new java.awt.Color(255, 255, 255));
        addCola.setText("Add to cart");
        addCola.setToolTipText("");
        addCola.setBorder(null);
        addCola.setBorderPainted(false);
        addCola.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addCola.setOpaque(false);
        addCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addColaActionPerformed(evt);
            }
        });
        jPanel1.add(addCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 60, 20));

        jLabel10.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CART.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, -1, 30));

        confirmOrder.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        confirmOrder.setText("SUBMIT ORDER");
        confirmOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmOrderActionPerformed(evt);
            }
        });
        jPanel1.add(confirmOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 490, -1, 40));

        cancel.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 550, -1, 40));

        addBbqbeef.setBackground(new java.awt.Color(204, 51, 0));
        addBbqbeef.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        addBbqbeef.setForeground(new java.awt.Color(255, 255, 255));
        addBbqbeef.setText("Add to cart");
        addBbqbeef.setToolTipText("");
        addBbqbeef.setBorder(null);
        addBbqbeef.setBorderPainted(false);
        addBbqbeef.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addBbqbeef.setOpaque(false);
        addBbqbeef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBbqbeefActionPerformed(evt);
            }
        });
        jPanel1.add(addBbqbeef, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 60, 20));

        jButton2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, -1, 30));

        tsum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsumActionPerformed(evt);
            }
        });
        jPanel1.add(tsum, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 410, 90, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 410, 30, 20));

        menutable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Qty", "Description", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(menutable);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 330, 340));

        jLabelBackground1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pageBackground1.jpg"))); // NOI18N
        jLabelBackground1.setText("jLabel1");
        jPanel1.add(jLabelBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 890));

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void addLemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLemonActionPerformed
        new DrinksUIlemon().setVisible(true);//new PizzaSelectUI().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_addLemonActionPerformed

    private void addCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCreateActionPerformed
        new PizzaDecoratorUI().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_addCreateActionPerformed

    private void addBbqbeefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBbqbeefActionPerformed
        new PizzaSelectUIbbq().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_addBbqbeefActionPerformed

    private void addColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addColaActionPerformed
        new DrinksUIcola().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_addColaActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
        new PizzaBaseUI().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void addhawaiianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addhawaiianActionPerformed
         new PizzaSelectUIhawaian().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_addhawaiianActionPerformed

    private void addhamloversActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addhamloversActionPerformed
         new PizzaSelectUIhamlovers().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_addhamloversActionPerformed

    private void addpeploversActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addpeploversActionPerformed
         new PizzaSelectUIplovers().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_addpeploversActionPerformed

    private void addbbqmeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbbqmeatActionPerformed
         new PizzaSelectUIbbqm().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_addbbqmeatActionPerformed

    private void addloadpepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addloadpepActionPerformed
         new PizzaSelectUIppr().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_addloadpepActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      int viewIndex = menutable.getSelectedRow();
    if(viewIndex != -1) {
        int modelIndex = menutable.convertRowIndexToModel(viewIndex); // converts the row index in the view to the appropriate index in the model
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel)menutable.getModel();
        model.removeRow(modelIndex); tsum.setText(Integer.toString(getSum()));  }// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void confirmOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmOrderActionPerformed
      //  int summ = (Int) MenuUI.tsum.getText();
       // 
        MenuUI.tsum.setText(Integer.toString(MenuUI.getSum()));
       int summ = Integer.parseInt(tsum.getText());
       if(summ>=1){
        new OrderSubmit().setVisible(true);
       this.dispose();
       OrderSubmit.t.start();    
       }
       else {
       JOptionPane.showMessageDialog(null,"Empty cart!","Info",JOptionPane.INFORMATION_MESSAGE);
       
       }// TODO add your handling code here:
    }//GEN-LAST:event_confirmOrderActionPerformed

    private void tsumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsumActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
     
            public void run() {
                new MenuUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBbqbeef;
    private javax.swing.JButton addCola;
    private javax.swing.JButton addCreate;
    private javax.swing.JButton addLemon;
    private javax.swing.JButton addbbqmeat;
    private javax.swing.JButton addhamlovers;
    private javax.swing.JButton addhawaiian;
    private javax.swing.JButton addloadpep;
    private javax.swing.JButton addpeplovers;
    private javax.swing.JLabel bbqbeef;
    private javax.swing.JLabel bbqmeat;
    private javax.swing.JButton cancel;
    private javax.swing.JButton confirmOrder;
    private javax.swing.JLabel hamlovers;
    private javax.swing.JLabel hawaaian;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelBackground1;
    private javax.swing.JLabel jLabelPep;
    private javax.swing.JLabel jLabelbbq;
    private javax.swing.JLabel jLabelbbqmeat;
    private javax.swing.JLabel jLabelham;
    private javax.swing.JLabel jLabelhaw;
    private javax.swing.JLabel jLabelpepp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel loadpep;
    public static javax.swing.JTable menutable;
    private javax.swing.JLabel peplovers;
    public static javax.swing.JTextField tsum;
    // End of variables declaration//GEN-END:variables

}
