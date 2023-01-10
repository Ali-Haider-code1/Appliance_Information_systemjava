package applianceprojectjava;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    public Menu() {
        initComponents();
    }
            Mainwindow main = new Mainwindow();

    
     public ArrayList<Product> getProductList() throws IOException
    {
        
         File file = new File("d:\\Report.txt");
         file.createNewFile();
         FileWriter writer = new FileWriter(file);                
            Connection con = main.getConnection();
            String query = "SELECT * FROM products";
            Statement st;
            ResultSet rs;
            int num=1;
            
        try {
            st = con.createStatement();
            rs = st.executeQuery(query); 
              
            while(rs.next())
            {
                writer.write("Product :" +num);
                writer.write("\nId: "+rs.getInt("id"));
                writer.write("\nName: "+rs.getString("name"));
                writer.write("\nPrice: "+rs.getString("price"));
                writer.write("\nDate: "+rs.getString("add_date"));
                writer.write("\nQuantity: "+rs.getString("quantity"));
                writer.write("\n");
                writer.write("\n");
                num++;
            }
          writer.close();
         JOptionPane.showMessageDialog(null, "Report Generated to D Drive..");

            
        } catch (SQLException ex) {
            Logger.getLogger(Mainwindow.class.getName()).log(Level.SEVERE, null, ex);
        }                
        return null;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Insert_data = new javax.swing.JButton();
        Deletion = new javax.swing.JButton();
        Updatng = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        generate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 204));
        jPanel1.setForeground(new java.awt.Color(153, 255, 153));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        Insert_data.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Insert_data.setIcon(new javax.swing.ImageIcon("E:\\DATA\\Fifth Semester\\MPL\\Appliance\\icons8-add-30.png")); // NOI18N
        Insert_data.setText("Insert Data");
        Insert_data.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Insert_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_dataActionPerformed(evt);
            }
        });

        Deletion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Deletion.setIcon(new javax.swing.ImageIcon("E:\\DATA\\Fifth Semester\\MPL\\Appliance\\icons8-trash-24.png")); // NOI18N
        Deletion.setText("Delete Data");
        Deletion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Deletion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletionActionPerformed(evt);
            }
        });

        Updatng.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Updatng.setText("Update Data");
        Updatng.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Updatng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatngActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("View Data");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        generate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        generate.setText("Generate Report");
        generate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(204, 204, 255)));
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 0, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 102));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("Welcome to Appliance Information System ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(Insert_data, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(Deletion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(Updatng, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(generate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Updatng, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deletion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insert_data, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(351, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Insert_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_dataActionPerformed

        
        choice ch=new choice();
        ch.label.setText("Insert");
        ch.show();
        dispose();
    }//GEN-LAST:event_Insert_dataActionPerformed

    private void UpdatngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatngActionPerformed

        choice ch=new choice();
        ch.label.setText("Update");
        ch.show();
        dispose();
    }//GEN-LAST:event_UpdatngActionPerformed

    private void DeletionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletionActionPerformed
        // TODO add your handling code here:
        Deletedata delete=new Deletedata();
        delete.show();
        dispose();
    }//GEN-LAST:event_DeletionActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Mainwindow view=new Mainwindow();
        view.show();
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        try {
            getProductList();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_generateActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deletion;
    private javax.swing.JButton Insert_data;
    private javax.swing.JButton Updatng;
    private javax.swing.JButton generate;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
