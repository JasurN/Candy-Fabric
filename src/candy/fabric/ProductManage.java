/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candy.fabric;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author Moni
 */
public class ProductManage extends javax.swing.JFrame {

    /**
     * Creates new form BookFrame
     */
    public ProductManage() {
        initComponents();
         getContentPane().setBackground(new Color( 59 , 63 , 66));
    }

      javax.swing.table.DefaultTableModel tableModel = new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Name", "CurAmount", "Cost", "ID"
            }
        );
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        addProductButton = new javax.swing.JButton();
        costLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        CurAmountField = new javax.swing.JTextField();
        costField = new javax.swing.JTextField();
        soldField = new javax.swing.JTextField();
        searchProductButton = new javax.swing.JButton();
        deleteProductButton = new javax.swing.JButton();
        searchAllProductButton = new javax.swing.JButton();
        updateProductButton = new javax.swing.JButton();
        buttonForBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoTable = new javax.swing.JTable();
        labelForDefinition = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nameLabel.setForeground(new java.awt.Color(204, 204, 204));
        nameLabel.setText("Name  ");

        addProductButton.setBackground(new java.awt.Color(73, 77, 78));
        addProductButton.setForeground(new java.awt.Color(204, 204, 204));
        addProductButton.setText("Add Product");
        addProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductButtonActionPerformed(evt);
            }
        });

        costLabel.setForeground(new java.awt.Color(204, 204, 204));
        costLabel.setText("Cost  ");

        idLabel.setForeground(new java.awt.Color(204, 204, 204));
        idLabel.setText("ID");

        amountLabel.setForeground(new java.awt.Color(204, 204, 204));
        amountLabel.setText("Amount");

        NameField.setBackground(new java.awt.Color(204, 204, 204));
        NameField.setForeground(new java.awt.Color(0, 153, 153));

        CurAmountField.setBackground(new java.awt.Color(204, 204, 204));
        CurAmountField.setForeground(new java.awt.Color(0, 153, 153));

        costField.setBackground(new java.awt.Color(204, 204, 204));
        costField.setForeground(new java.awt.Color(0, 153, 153));

        soldField.setBackground(new java.awt.Color(204, 204, 204));
        soldField.setForeground(new java.awt.Color(0, 153, 153));

        searchProductButton.setBackground(new java.awt.Color(73, 77, 78));
        searchProductButton.setForeground(new java.awt.Color(204, 204, 204));
        searchProductButton.setText("Search Product");
        searchProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductButtonActionPerformed(evt);
            }
        });

        deleteProductButton.setBackground(new java.awt.Color(73, 77, 78));
        deleteProductButton.setForeground(new java.awt.Color(204, 204, 204));
        deleteProductButton.setText("Delete Product");
        deleteProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProductButtonActionPerformed(evt);
            }
        });

        searchAllProductButton.setBackground(new java.awt.Color(73, 77, 78));
        searchAllProductButton.setForeground(new java.awt.Color(204, 204, 204));
        searchAllProductButton.setText("Search all Product");
        searchAllProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAllProductButtonActionPerformed(evt);
            }
        });

        updateProductButton.setBackground(new java.awt.Color(73, 77, 78));
        updateProductButton.setForeground(new java.awt.Color(204, 204, 204));
        updateProductButton.setText("Update Product");
        updateProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProductButtonActionPerformed(evt);
            }
        });

        buttonForBack.setBackground(new java.awt.Color(73, 77, 78));
        buttonForBack.setForeground(new java.awt.Color(204, 204, 204));
        buttonForBack.setText("Back");
        buttonForBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonForBackActionPerformed(evt);
            }
        });

        displayArea.setBackground(new java.awt.Color(204, 204, 204));
        displayArea.setColumns(20);
        displayArea.setForeground(new java.awt.Color(0, 153, 153));
        displayArea.setRows(5);
        jScrollPane1.setViewportView(displayArea);

        infoTable.setBackground(new java.awt.Color(73, 77, 78));
        infoTable.setForeground(new java.awt.Color(204, 204, 204));
        infoTable.setModel(tableModel);
        jScrollPane2.setViewportView(infoTable);

        labelForDefinition.setForeground(new java.awt.Color(204, 204, 204));
        labelForDefinition.setText("Extra Definition");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(costLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(costField, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(CurAmountField)
                            .addComponent(NameField)
                            .addComponent(soldField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelForDefinition)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(searchAllProductButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchProductButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonForBack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(addProductButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateProductButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteProductButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelForDefinition))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CurAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costLabel))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(costField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLabel)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soldField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountLabel))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addProductButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchProductButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateProductButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteProductButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchAllProductButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonForBack))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductButtonActionPerformed
        // TODO add your handling code here:
   
        Product product=new Product(NameField.getText(),CurAmountField.getText(),costField.getText(),soldField.getText());   
      product.addProduct();
        /*DatabaseConnection dbc = new DatabaseConnection();
        String query = "INSERT INTO Product ( Name, CurAmount, Cost, ID) VALUES ( '"+NameField.getText()+"', '"+CurAmountField.getText()+"', '"+costField.getText()+"', '"+soldField.getText()+"')";
        dbc.storeData(query);
        
        
        makeFormEmpty();
      */  
        
    }//GEN-LAST:event_addProductButtonActionPerformed
 
    private void updateProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProductButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = infoTable.getSelectedRow();
        String selectedID = String.valueOf(infoTable.getValueAt(selectedRow, 0));
        
        DatabaseConnection dbc = new DatabaseConnection();
        String query = "UPDATE ProductTable SET ID= '"+"',Name='"+NameField.getText()+"',CurAmount='"+CurAmountField.getText()+"', Cost='"+costField.getText()+"' WHERE ID ='"+selectedID+"'";
        ResultSet resultSet = dbc.getData(query);
                infoTable.repaint();
 
//

//        System.out.println(infoTable.getRowCount());
//        for(int i=0; i<infoTable.getRowCount();i++)
//        {
//            tableModel.removeRow(i);
//        }
                
        try
        {
            System.out.println("Name\tCurAmount\tCost\tID");
            int rowIndex=0;
            
                while (resultSet.next()) 
                {
//                    
                    displayArea.append(resultSet.getString(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3)+"\t"+resultSet.getString(4)+"\n");
                    
                    Object[] row = { null, null, null, null};
                    tableModel.addRow(row);
                    infoTable.setValueAt(resultSet.getString(1), rowIndex, 0);
                    infoTable.setValueAt(resultSet.getString(2), rowIndex, 1);
                    infoTable.setValueAt(resultSet.getString(3), rowIndex, 2);
                    infoTable.setValueAt(resultSet.getString(4), rowIndex, 3);

                    rowIndex++;
//System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3));
                }
                    
        }
        catch(SQLException e)
        {
                System.out.println(e);
        }
        
    }//GEN-LAST:event_updateProductButtonActionPerformed

    private void deleteProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProductButtonActionPerformed
        // TODO add your handling code here:
         int selectedRow = infoTable.getSelectedRow();
        String selectedID = String.valueOf(infoTable.getValueAt(selectedRow, 0));
        
        System.out.println("Row Selection: "+selectedRow);
        System.out.println("Product ID: "+selectedID);
        
        String query="Delete * from Product WHERE ID='"+selectedID+"'";
	new DatabaseConnection().deleteData(query);
        
        tableModel.removeRow(selectedRow);
        infoTable.repaint();
        
        
        
    }//GEN-LAST:event_deleteProductButtonActionPerformed

    private void buttonForBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonForBackActionPerformed
        // TODO add your handling code here:
        MainFrame mainFrame = new MainFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       mainFrame.pack();
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setVisible(true);
    super.dispose(); 
        
    }//GEN-LAST:event_buttonForBackActionPerformed

    private void searchAllProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAllProductButtonActionPerformed
        // TODO add your handling code here:
        tableModel.setRowCount(0);
     DatabaseConnection databaseObj = new DatabaseConnection();
        String query = "SELECT ID, Name, CurAmount, Cost FROM Product";
        ResultSet resultSet = databaseObj.getData(query);
        
        infoTable.repaint();

       
       // System.out.println(infoTable.getRowCount());
        for(int i=0; i<infoTable.getRowCount();i++)
        {
            tableModel.removeRow(i);
        }
                
        try
        {
         //   System.out.println("ID\t Name\tCurAmount\tCost");
            int i=0;
            
                while (resultSet.next()) 
                {
                    Object[] row = { null, null, null,null};
                    tableModel.addRow(row);
                    infoTable.setValueAt(resultSet.getString(1), i, 0);
                    infoTable.setValueAt(resultSet.getString(2), i, 1);
                    infoTable.setValueAt(resultSet.getString(3), i, 2);
                    infoTable.setValueAt(resultSet.getString(4), i, 3);
                    i++;
//System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3));
                }
                    
        }
        catch(SQLException e)
        {
                System.out.println(e);
        }   
                                                         
   
        
        
    }//GEN-LAST:event_searchAllProductButtonActionPerformed

    private void searchProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchProductButtonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ProductManage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CurAmountField;
    private javax.swing.JTextField NameField;
    private javax.swing.JButton addProductButton;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JButton buttonForBack;
    private javax.swing.JTextField costField;
    private javax.swing.JLabel costLabel;
    private javax.swing.JButton deleteProductButton;
    private javax.swing.JTextArea displayArea;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTable infoTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelForDefinition;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton searchAllProductButton;
    private javax.swing.JButton searchProductButton;
    private javax.swing.JTextField soldField;
    private javax.swing.JButton updateProductButton;
    // End of variables declaration//GEN-END:variables

 private void makeFormEmpty() {
        NameField.setText("");
        CurAmountField.setText("");
        costField.setText("");
        soldField.setText("");
       
    }



}

