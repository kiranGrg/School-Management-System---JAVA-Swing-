

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewStaffF.java
 *
 * Created on Jan 22, 2012, 9:49:46 PM
 */
/**
 *
 * @author kiranroma
 */
import javax.swing.*;
import java.sql.*;
import java.text.*;
import java.util.Arrays.*;
import java.util.regex.Pattern;

public class NewStaffF extends javax.swing.JFrame {

    private String query = "";
    private String phoneNum = "^9+([87])+([014])(\\d{7})$";

    ;
    private String words = "[a-bA-Z\\s]+$";

    /** Creates new form NewStaffF */
    public NewStaffF() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lbl2 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        lbl3 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        lbl4 = new javax.swing.JLabel();
        post = new javax.swing.JComboBox();
        lbl5 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox();
        lbladd = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        lblcon = new javax.swing.JLabel();
        txtempd = new javax.swing.JTextField();
        lblcon1 = new javax.swing.JLabel();
        btndate = new javax.swing.JButton();
        contact = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        cancel = new javax.swing.JButton();
        add = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TADD.png"))); // NOI18N
        getContentPane().add(jLabel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Fill Up The Form:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 102, 102))); // NOI18N
        jPanel2.setLayout(null);

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbl1.setForeground(new java.awt.Color(51, 51, 255));
        lbl1.setText("First Name:");
        jPanel2.add(lbl1);
        lbl1.setBounds(10, 40, 70, 20);
        jPanel2.add(fname);
        fname.setBounds(100, 30, 130, 30);

        lbl2.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbl2.setForeground(new java.awt.Color(51, 51, 255));
        lbl2.setText("Middle Name:");
        jPanel2.add(lbl2);
        lbl2.setBounds(240, 40, 90, 20);
        jPanel2.add(mname);
        mname.setBounds(340, 30, 130, 30);

        lbl3.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbl3.setForeground(new java.awt.Color(51, 51, 255));
        lbl3.setText("Last Name:");
        jPanel2.add(lbl3);
        lbl3.setBounds(480, 40, 70, 20);
        jPanel2.add(lname);
        lname.setBounds(560, 30, 130, 30);

        lbl4.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbl4.setForeground(new java.awt.Color(51, 51, 255));
        lbl4.setText("Post:");
        jPanel2.add(lbl4);
        lbl4.setBounds(10, 90, 40, 20);

        post.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "PRINCIPLE", "VICE-PRINCIPLE", "ACCOUNTANT", "ADMINISTRATIVE", "DI", "GUARD", "COUNSELLER", "CLERK", "CLEANER", "GARDENDER", "COOK" }));
        jPanel2.add(post);
        post.setBounds(100, 80, 130, 30);

        lbl5.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbl5.setForeground(new java.awt.Color(51, 51, 255));
        lbl5.setText("Gender:");
        jPanel2.add(lbl5);
        lbl5.setBounds(260, 90, 60, 20);

        gender.setFont(new java.awt.Font("Tahoma", 0, 14));
        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Male", "Female" }));
        jPanel2.add(gender);
        gender.setBounds(340, 80, 120, 30);

        lbladd.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbladd.setForeground(new java.awt.Color(51, 51, 255));
        lbladd.setText("Address:");
        jPanel2.add(lbladd);
        lbladd.setBounds(10, 140, 60, 20);
        jPanel2.add(address);
        address.setBounds(100, 130, 130, 30);

        lblcon.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblcon.setForeground(new java.awt.Color(51, 51, 255));
        lblcon.setText("Contact No:");
        jPanel2.add(lblcon);
        lblcon.setBounds(260, 140, 75, 20);
        jPanel2.add(txtempd);
        txtempd.setBounds(510, 130, 120, 30);

        lblcon1.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblcon1.setForeground(new java.awt.Color(51, 51, 255));
        lblcon1.setText("Employed Date:");
        jPanel2.add(lblcon1);
        lblcon1.setBounds(530, 90, 130, 30);

        btndate.setText("D");
        btndate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndateActionPerformed(evt);
            }
        });
        jPanel2.add(btndate);
        btndate.setBounds(640, 130, 45, 30);

        try {
            contact.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(contact);
        contact.setBounds(340, 130, 130, 30);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setPreferredSize(new java.awt.Dimension(699, 45));
        jPanel3.setLayout(null);

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel3.add(cancel);
        cancel.setBounds(390, 10, 80, 30);

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel3.add(add);
        add.setBounds(210, 10, 80, 30);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-715)/2, (screenSize.height-327)/2, 715, 327);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_cancelActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        int gen = gender.getSelectedIndex();
        String Sname = "";

        if (fname.getText().trim().equals("") || lname.getText().trim().equals("")
                || contact.getText().trim().equals("") || post.getSelectedIndex() == 0
                || address.getText().trim().equals("") || gen == 0 || txtempd.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Please provide the full requirement", "Warning!!!!!!!", JOptionPane.PLAIN_MESSAGE);
        } else if (Pattern.matches(phoneNum, contact.getText().trim()) == false) {
            JOptionPane.showMessageDialog(this, "Given contact is not a cell number");
        } else {
            Sname = nameFormat();
            String[] values = {Sname, gender.getSelectedItem().toString(), address.getText().toString(),
                contact.getText().toString(), post.getSelectedItem().toString(), txtempd.getText()};
            query = "INSERT INTO staff_info (id,staffId,name,gender,address,contact,post,salary,empd)"
                    + "VALUES (null,?,?,?,?,?,?,(SELECT salary FROM salaryamount WHERE post = '" + values[4] + "'),?)";

            Staff st = new Staff();
            int report = st.addNewStaff(values, query);
            st.Close();
            if(report > 0){
                JOptionPane.showMessageDialog(this, "Inserted Successfully. Thank You");
            }
            else{
                JOptionPane.showMessageDialog(this, "Failed in Adding new Data. Sorry");
            }
        }
}//GEN-LAST:event_addActionPerformed

    private void btndateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btndateActionPerformed
    {//GEN-HEADEREND:event_btndateActionPerformed
        // TODO add your handling code here:
        txtempd.setText(new DatePicker().setPickedDate());
    }//GEN-LAST:event_btndateActionPerformed

    private String nameFormat() {

        String Sname = "";

        if ((mname.getText().trim()).equalsIgnoreCase("")) {
            Sname = fname.getText().trim() + " " + lname.getText().trim();
        } else {
            Sname = fname.getText().trim() + " " + mname.getText().trim() + " " + lname.getText().trim();
        }
        return Sname;
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
//                new NewStaffF().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JButton btndate;
    private javax.swing.JButton cancel;
    private javax.swing.JFormattedTextField contact;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbladd;
    private javax.swing.JLabel lblcon;
    private javax.swing.JLabel lblcon1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mname;
    private javax.swing.JComboBox post;
    private javax.swing.JTextField txtempd;
    // End of variables declaration//GEN-END:variables
}