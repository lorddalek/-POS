/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POS.Forms;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class AddItemMenu extends javax.swing.JFrame {
    /**
     * Creates new form AddItemMenu
     */
    
    POSFrame posFrame;
    public AddItemMenu(POSFrame posFrame)  {
        initComponents();
        this.posFrame = posFrame;
        this.getContentPane().setBackground(Color.DARK_GRAY);
    }
              String[] columnNames = {"Item", "Code"};
        
          DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
        String url;
    Connection con = null;
    Statement stmt = null;
    int numRecords;
    
    
            public void openDatabase () {
        url = "jdbc:ucanaccess://C:/Users/user/Desktop/POS/PosDatabase.accdb";
        try{
          con = DriverManager.getConnection(url);        
          stmt = con.createStatement();
            System.out.println("Connected");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void closeDatabase (){
        try{
            stmt.close();
            con.close();
            System.out.println("Closed");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnFruit = new javax.swing.JButton();
        btnVegetables = new javax.swing.JButton();
        btnBakery = new javax.swing.JButton();
        btnSeafood = new javax.swing.JButton();
        btnDeli = new javax.swing.JButton();
        btnHeavy = new javax.swing.JButton();
        btnBulk = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItems = new javax.swing.JTable();
        btnAddItemToTransaction = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Item Menu");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RETRIEVE ITEM BY:");

        btnFruit.setBackground(new java.awt.Color(255, 255, 255));
        btnFruit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFruit.setText("FRUIT");
        btnFruit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFruitActionPerformed(evt);
            }
        });

        btnVegetables.setBackground(new java.awt.Color(255, 255, 255));
        btnVegetables.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVegetables.setText("VEGETABLES");
        btnVegetables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVegetablesActionPerformed(evt);
            }
        });

        btnBakery.setBackground(new java.awt.Color(255, 255, 255));
        btnBakery.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBakery.setText("BAKERY");
        btnBakery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBakeryActionPerformed(evt);
            }
        });

        btnSeafood.setBackground(new java.awt.Color(255, 255, 255));
        btnSeafood.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSeafood.setText("SEAFOOD");
        btnSeafood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeafoodActionPerformed(evt);
            }
        });

        btnDeli.setBackground(new java.awt.Color(255, 255, 255));
        btnDeli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeli.setText("DELI");
        btnDeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliActionPerformed(evt);
            }
        });

        btnHeavy.setBackground(new java.awt.Color(255, 255, 255));
        btnHeavy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHeavy.setText("HEAVY");
        btnHeavy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeavyActionPerformed(evt);
            }
        });

        btnBulk.setBackground(new java.awt.Color(255, 255, 255));
        btnBulk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBulk.setText("BULK");
        btnBulk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBulkActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("ITEM MENU");

        tblItems.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tblItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblItems);

        btnAddItemToTransaction.setBackground(new java.awt.Color(51, 255, 51));
        btnAddItemToTransaction.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAddItemToTransaction.setText("ADD ITEM TO TRANSACTION");
        btnAddItemToTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemToTransactionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(227, 227, 227)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSeafood, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeli, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBakery, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVegetables, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFruit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHeavy, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBulk, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(129, 129, 129)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddItemToTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnFruit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVegetables, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBakery, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeli, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSeafood, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHeavy, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBulk, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddItemToTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFruitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFruitActionPerformed
        disableAllButtons();  
        openDatabase();
            String query = "SELECT * FROM Products WHERE ItemType = 'FRUIT'";
            try{
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                String[] itemData = { rs.getString(2), rs.getString(1)};
                dtm.addRow(itemData);
            }           
        }
        catch (Exception e){
            e.printStackTrace();
        } 
            tblItems.setModel(dtm);
        closeDatabase();
    }//GEN-LAST:event_btnFruitActionPerformed

    private void btnAddItemToTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemToTransactionActionPerformed
        try{
        int row = tblItems.getSelectedRow();
        int column = 1;
        Object codeObject = dtm.getValueAt(row, column);   
        String codeString = String.valueOf(codeObject);
        int code = Integer.parseInt(codeString);
        posFrame.addFromMenu(code);
        this.dispose();
    }
        catch(Exception e){
            this.dispose();
        }
    }//GEN-LAST:event_btnAddItemToTransactionActionPerformed

    private void btnVegetablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVegetablesActionPerformed
                disableAllButtons();  
        openDatabase();
            String query = "SELECT * FROM Products WHERE ItemType = 'VEGETABLE'";
            try{
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                String[] itemData = { rs.getString(2), rs.getString(1)};
                dtm.addRow(itemData);
            }           
        }
        catch (Exception e){
            e.printStackTrace();
        } 
            tblItems.setModel(dtm);
        closeDatabase();
    }//GEN-LAST:event_btnVegetablesActionPerformed

    private void btnBakeryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBakeryActionPerformed
        disableAllButtons();  
        openDatabase();
            String query = "SELECT * FROM Products WHERE ItemType = 'BAKERY'";
            try{
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                String[] itemData = { rs.getString(2), rs.getString(1)};
                dtm.addRow(itemData);
            }           
        }
        catch (Exception e){
            e.printStackTrace();
        } 
            tblItems.setModel(dtm);
        closeDatabase();
    }//GEN-LAST:event_btnBakeryActionPerformed

    private void btnDeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliActionPerformed
                disableAllButtons();  
        openDatabase();
            String query = "SELECT * FROM Products WHERE ItemType = 'DELI'";
            try{
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                String[] itemData = { rs.getString(2), rs.getString(1)};
                dtm.addRow(itemData);
            }           
        }
        catch (Exception e){
            e.printStackTrace();
        } 
            tblItems.setModel(dtm);
        closeDatabase();
    }//GEN-LAST:event_btnDeliActionPerformed

    private void btnSeafoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeafoodActionPerformed
                disableAllButtons();  
        openDatabase();
            String query = "SELECT * FROM Products WHERE ItemType = 'SEAFOOD'";
            try{
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                String[] itemData = { rs.getString(2), rs.getString(1)};
                dtm.addRow(itemData);
            }           
        }
        catch (Exception e){
            e.printStackTrace();
        } 
            tblItems.setModel(dtm);
        closeDatabase();
    }//GEN-LAST:event_btnSeafoodActionPerformed

    private void btnHeavyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeavyActionPerformed
        disableAllButtons();  
        openDatabase();
            String query = "SELECT * FROM Products WHERE ItemType = 'HEAVY'";
            try{
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                String[] itemData = { rs.getString(2), rs.getString(1)};
                dtm.addRow(itemData);
            }           
        }
        catch (Exception e){
            e.printStackTrace();
        } 
            tblItems.setModel(dtm);
        closeDatabase();        // TODO add your handling code here:
    }//GEN-LAST:event_btnHeavyActionPerformed

    private void btnBulkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBulkActionPerformed
                disableAllButtons();  
        openDatabase();
            String query = "SELECT * FROM Products WHERE ItemType = 'BULK'";
            try{
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                String[] itemData = { rs.getString(2), rs.getString(1)};
                dtm.addRow(itemData);
            }           
        }
        catch (Exception e){
            e.printStackTrace();
        } 
            tblItems.setModel(dtm);
        closeDatabase();
    }//GEN-LAST:event_btnBulkActionPerformed

    
    private void disableAllButtons(){
        btnFruit.setEnabled(false);
        btnVegetables.setEnabled(false);
        btnBakery.setEnabled(false);
        btnDeli.setEnabled(false);
        btnSeafood.setEnabled(false);
        btnHeavy.setEnabled(false);
        btnBulk.setEnabled(false);
    }
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
            java.util.logging.Logger.getLogger(AddItemMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddItemMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddItemMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddItemMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItemMenu(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItemToTransaction;
    private javax.swing.JButton btnBakery;
    private javax.swing.JButton btnBulk;
    private javax.swing.JButton btnDeli;
    private javax.swing.JButton btnFruit;
    private javax.swing.JButton btnHeavy;
    private javax.swing.JButton btnSeafood;
    private javax.swing.JButton btnVegetables;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblItems;
    // End of variables declaration//GEN-END:variables
}
