/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import adt.LinkedList;
import adt.Node;
import data.Dish;
import data.Order;
import java.awt.Dimension;
import javax.swing.DefaultListModel;
import logic.ClientConnection;



/**
 *
 * @author carov
 */
public class OrderConfirmationGUI extends javax.swing.JFrame  {

    /**
     * Creates new form OrderConfirmation
     */
    

    public OrderConfirmationGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setPreferredSize(new Dimension(400,500));
        
        

    }
    
    
    //-------------------------------------------------------------------------
    //                  FUNCIONES AUXILIARES
    //-------------------------------------------------------------------------
    
    //Guarda la Orden
    private Order ord;
    
    public void loadOrder(Order ord){
        int subtotal = 0;
        DefaultListModel model = new DefaultListModel();
        Node temp = ord.getDishes().getHead();
        Dish tempdish;
        while(temp != null){
            tempdish = (Dish) temp.data;
            model.addElement(tempdish);
            subtotal += tempdish.getPrice();
            temp = temp.next;
        }
        this.ord = ord;
        list_order.setModel(model);
        label_idorden.setText(String.valueOf(ord.getId()));
        label_subtotal.setText("$" + String.valueOf(subtotal));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_order = new javax.swing.JList<>();
        button_confirmarpedido = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        label_subtotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        label_idorden = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 243, 224));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 490));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(109, 76, 65));
        jLabel1.setText("Food4U");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/imgindex64.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(109, 76, 65));
        jLabel3.setText("Detalles de tu pedido:");

        list_order.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        list_order.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(list_order);

        button_confirmarpedido.setBackground(new java.awt.Color(109, 76, 65));
        button_confirmarpedido.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        button_confirmarpedido.setForeground(new java.awt.Color(255, 243, 224));
        button_confirmarpedido.setText("Confirmar");
        button_confirmarpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_confirmarpedidoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(109, 76, 65));
        jLabel4.setText("Subtotal:");

        label_subtotal.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        label_subtotal.setForeground(new java.awt.Color(0, 0, 0));
        label_subtotal.setText("---precio---");

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(109, 76, 65));
        jLabel5.setText("ID Orden:");

        label_idorden.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        label_idorden.setForeground(new java.awt.Color(0, 0, 0));
        label_idorden.setText("--id--orden");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_idorden))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label_subtotal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_confirmarpedido))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 61, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(label_idorden))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(label_subtotal)
                    .addComponent(button_confirmarpedido))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_confirmarpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_confirmarpedidoActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        label_idorden.setText("");
        WaitingGUI wg = new WaitingGUI();
        wg.loadDetails(this.ord);
        wg.setVisible(true);
        
        ClientConnection cc = new ClientConnection(this.ord);
        Thread t = new Thread(cc);
        t.start();
  
        
    }//GEN-LAST:event_button_confirmarpedidoActionPerformed

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
            java.util.logging.Logger.getLogger(OrderConfirmationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderConfirmationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderConfirmationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderConfirmationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderConfirmationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_confirmarpedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_idorden;
    private javax.swing.JLabel label_subtotal;
    private javax.swing.JList<String> list_order;
    // End of variables declaration//GEN-END:variables


}
