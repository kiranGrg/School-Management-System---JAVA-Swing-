

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewStudentF.java
 *
 * Created on Jan 22, 2012, 9:06:54 PM
 */
/**
 *
 * @author kiranroma
 */
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.io.*;
import java.text.*;
import java.net.URL;
import java.util.regex.Pattern;
import java.util.Calendar;
import java.util.GregorianCalendar;
//import

public final class NewStudentF extends javax.swing.JFrame {

    private String photoPath = null;
    private String query = null;
    private Calendar cl = new GregorianCalendar();
    private int y;
    private String phoneNum = "^9+([87])+([014])(\\d{7})$";

    // private String words = "[a-bA-Z\\s]+$";
    //private String add = "[a-bA-Z\\,\\s]+$";
    /** Creates new form NewStudentF */
    public NewStudentF() {
        initComponents();
        y = cl.get(Calendar.YEAR);

        comboBoxYearValues(y);

    }

    protected void comboBoxYearValues(int y) {

        cbbdy.addItem("Select");
        cbady.addItem("Select");

        //for birth year

        for (int i = y - 50; i <= y - 18; i++) {
            cbbdy.addItem(String.valueOf(i));
        }

        //for addmission year
        for (int j = y; j >= y - 20; j--) {
            cbady.addItem(String.valueOf(j));
        }
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
        jPanel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox();
        lbl6 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        grade = new javax.swing.JComboBox();
        lbl10 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lblphoto = new javax.swing.JLabel();
        btnselect = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        rbcd = new javax.swing.JRadioButton();
        cbadm = new javax.swing.JComboBox();
        cbadd = new javax.swing.JComboBox();
        cbbdd = new javax.swing.JComboBox();
        cbady = new javax.swing.JComboBox();
        cbbdy = new javax.swing.JComboBox();
        cbbdm = new javax.swing.JComboBox();
        contact = new javax.swing.JFormattedTextField();
        mname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        gfname = new javax.swing.JTextField();
        gmname = new javax.swing.JTextField();
        glname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/STUDEADD.png"))); // NOI18N
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Please Fill Up the Form:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel1.setLayout(null);

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbl1.setText("First Name:");
        jPanel1.add(lbl1);
        lbl1.setBounds(10, 30, 70, 20);

        lbl2.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbl2.setText("Middle Name:");
        jPanel1.add(lbl2);
        lbl2.setBounds(240, 30, 90, 20);

        lbl3.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbl3.setText("Last Name:");
        jPanel1.add(lbl3);
        lbl3.setBounds(480, 30, 70, 20);

        lbl4.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbl4.setText("Date of Birth:");
        jPanel1.add(lbl4);
        lbl4.setBounds(10, 90, 90, 20);

        lbl5.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbl5.setText("Gender:");
        jPanel1.add(lbl5);
        lbl5.setBounds(340, 80, 60, 20);

        gender.setFont(new java.awt.Font("Tahoma", 0, 14));
        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Male", "Female" }));
        jPanel1.add(gender);
        gender.setBounds(420, 70, 110, 30);

        lbl6.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbl6.setText("Address:");
        jPanel1.add(lbl6);
        lbl6.setBounds(10, 130, 60, 20);
        jPanel1.add(address);
        address.setBounds(100, 120, 170, 30);

        lbl7.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbl7.setText("Contact No:");
        jPanel1.add(lbl7);
        lbl7.setBounds(340, 130, 80, 20);

        lbl8.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbl8.setText("Date of Admission:");
        jPanel1.add(lbl8);
        lbl8.setBounds(10, 190, 120, 20);

        lbl9.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbl9.setText("Grade:");
        jPanel1.add(lbl9);
        lbl9.setBounds(433, 190, 50, 20);

        grade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "X1", "X2", "X3", "X4", "X5", "X6", "X7", "X8", "X9", "X10" }));
        jPanel1.add(grade);
        grade.setBounds(485, 180, 100, 30);

        lbl10.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbl10.setText("Gardian's First Name:");
        jPanel1.add(lbl10);
        lbl10.setBounds(10, 240, 130, 20);

        lbl12.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbl12.setText("M. Name:");
        jPanel1.add(lbl12);
        lbl12.setBounds(290, 240, 60, 20);

        lbl11.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbl11.setText("L. Name:");
        jPanel1.add(lbl11);
        lbl11.setBounds(490, 240, 60, 20);

        lblphoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblphoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NO PHOTO.png"))); // NOI18N
        jPanel1.add(lblphoto);
        lblphoto.setBounds(585, 55, 110, 130);

        btnselect.setFont(new java.awt.Font("Tahoma", 1, 5));
        btnselect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/upload.png"))); // NOI18N
        btnselect.setText("Upload Image");
        btnselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselectActionPerformed(evt);
            }
        });
        jPanel1.add(btnselect);
        btnselect.setBounds(590, 190, 100, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("A.D.");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(290, 90, 30, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("YYYY");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(110, 60, 60, 14);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("MM");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(190, 60, 40, 14);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("DD");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(250, 60, 40, 14);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("MM");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(210, 160, 40, 14);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("YYYY");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(130, 160, 60, 14);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("DD");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(260, 160, 40, 14);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("A.D. / Current:");
        jLabel21.setEnabled(false);
        jPanel1.add(jLabel21);
        jLabel21.setBounds(318, 190, 90, 20);

        rbcd.setEnabled(false);
        jPanel1.add(rbcd);
        rbcd.setBounds(408, 190, 20, 21);

        cbadm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        cbadm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbadmActionPerformed(evt);
            }
        });
        jPanel1.add(cbadm);
        cbadm.setBounds(200, 180, 62, 30);

        jPanel1.add(cbadd);
        cbadd.setBounds(265, 180, 50, 30);

        jPanel1.add(cbbdd);
        cbbdd.setBounds(240, 80, 50, 30);

        jPanel1.add(cbady);
        cbady.setBounds(126, 180, 70, 30);

        jPanel1.add(cbbdy);
        cbbdy.setBounds(100, 80, 70, 30);

        cbbdm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        cbbdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbdmActionPerformed(evt);
            }
        });
        jPanel1.add(cbbdm);
        cbbdm.setBounds(175, 80, 62, 30);

        try {
            contact.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(contact);
        contact.setBounds(430, 120, 130, 30);
        jPanel1.add(mname);
        mname.setBounds(330, 20, 140, 30);
        jPanel1.add(lname);
        lname.setBounds(550, 20, 140, 30);
        jPanel1.add(gfname);
        gfname.setBounds(150, 230, 130, 30);
        jPanel1.add(gmname);
        gmname.setBounds(350, 230, 130, 30);
        jPanel1.add(glname);
        glname.setBounds(560, 230, 130, 30);
        jPanel1.add(fname);
        fname.setBounds(90, 20, 140, 30);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setMinimumSize(new java.awt.Dimension(50, 50));
        jPanel2.setPreferredSize(new java.awt.Dimension(10, 50));
        jPanel2.setLayout(null);

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(210, 10, 100, 30);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(400, 10, 100, 30);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-715)/2, (screenSize.height-436)/2, 715, 436);
    }// </editor-fold>//GEN-END:initComponents

    private void btnselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselectActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser("E:/Pic Memo/kiran pp photo");
        chooser.showOpenDialog(null);

        File file = chooser.getSelectedFile();

        //File file1 = new File("E:/Movies/dd.jpg");
        if (file != null) {
            photoPath = file.getPath();
            ImageIcon icon = new ImageIcon(photoPath);

            lblphoto.setIcon(icon);
        } else {
            JOptionPane.showMessageDialog(this, "NO Photo Selected");
        }

}//GEN-LAST:event_btnselectActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //int gender = Integer.parseInt(String.valueOf(gender.getSelectedIndex()));
        int gen = gender.getSelectedIndex();
        String[] name = null;

        if (contact.getText().trim().equals("") || cbbdy.getSelectedIndex() == 0
                || cbbdm.getSelectedIndex() == 0 || cbbdd.getSelectedIndex() == 0 || cbady.getSelectedIndex() == 0
                || cbadm.getSelectedIndex() == 0 || cbadd.getSelectedIndex() == 0 || grade.getSelectedIndex() == 0
                || address.getText().trim().equals("") || gen == 0 || lname.getText().trim().equals("")
                || lname.getText().trim().equals("") || gfname.getText().trim().equals("") || glname.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Please provide the full requirement", "Warning!!!!!!!", JOptionPane.PLAIN_MESSAGE);
        } else if (Pattern.matches(phoneNum, contact.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Not a Valid Number!!\nPlease try with 984******* or 980******* or 981*******");
        } else {
            name = nameFormat();
            String bm = String.valueOf(cbbdm.getSelectedIndex()), am = String.valueOf(cbadm.getSelectedIndex());
            if (bm.length() < 2) {
                bm = "0" + bm;
            }
            if (am.length() < 2) {
                am = "0" + am;
            }

            String[] values = {name[0],
                (cbbdy.getSelectedItem().toString() + "-" + am + "-" + cbbdd.getSelectedItem().toString()),
                ((String) gender.getSelectedItem()),
                name[1], address.getText(),
                contact.getText(),
                (cbady.getSelectedItem().toString() + "-" + am + "-" + cbadd.getSelectedItem().toString()),
                ((String) grade.getSelectedItem()),
                photoPath
            };
            insertValues(values);
        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_jButton2ActionPerformed

    private String[] nameFormat() {

        String Sname = null, Gname = null;

        if ((mname.getText().trim()).equalsIgnoreCase("")) {
            Sname = lname.getText().trim() + " " + lname.getText().trim();
        } else {
            Sname = lname.getText().trim() + " " + mname.getText().trim() + " " + lname.getText().trim();
        }
        if (gmname.getText() == null) {
            Gname = gfname.getText().trim() + " " + glname.getText().trim();
        } else {
            Gname = gfname.getText().trim() + " " + gmname.getText().trim() + " " + glname.getText().trim();
        }

        return new String[]{Sname, Gname};
    }

    private void cbbdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbdmActionPerformed
        // TODO add your handling code here:
        Object cb = evt.getSource();
        int i = ((JComboBox) evt.getSource()).getSelectedIndex();

        //JOptionPane.showMessageDialog(this, i);
        switch (i) {
            case 1:
                setDay(cb, 31);
                break;
            case 2:
                setDay(cb, 29);
                break;
            case 3:
                setDay(cb, 31);
                break;
            case 4:
                setDay(cb, 30);
                break;
            case 5:
                setDay(cb, 31);
                break;
            case 6:
                setDay(cb, 30);
                break;
            case 7:
                setDay(cb, 31);
                break;
            case 8:
                setDay(cb, 31);
                break;
            case 9:
                setDay(cb, 30);
                break;
            case 10:
                setDay(cb, 31);
                break;
            case 11:
                setDay(cb, 30);
                break;
            case 12:
                setDay(cb, 31);
                break;

        }
    }//GEN-LAST:event_cbbdmActionPerformed

    private void cbadmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbadmActionPerformed
        // TODO add your handling code here:
        Object cb = evt.getSource();
        int i = ((JComboBox) evt.getSource()).getSelectedIndex();
        //JOptionPane.showMessageDialog(this, i+1);
        switch (i) {
            case 1:
                setDay(cb, 31);
                break;
            case 2:
                setDay(cb, 29);
                break;
            case 3:
                setDay(cb, 31);
                break;
            case 4:
                setDay(cb, 30);
                break;
            case 5:
                setDay(cb, 31);
                break;
            case 6:
                setDay(cb, 30);
                break;
            case 7:
                setDay(cb, 31);
                break;
            case 8:
                setDay(cb, 31);
                break;
            case 9:
                setDay(cb, 30);
                break;
            case 10:
                setDay(cb, 31);
                break;
            case 11:
                setDay(cb, 30);
                break;
            case 12:
                setDay(cb, 31);
                break;

        }
    }//GEN-LAST:event_cbadmActionPerformed

    protected void setDay(Object obj, int d) {
        if (obj.equals(cbadm)) {
            for (int i = 0; i <= d; i++) {
                if (i == 0) {
                    cbadd.addItem("Sel");
                } else if (i < 10) {
                    cbadd.addItem(String.valueOf("0" + i));
                } else {
                    cbadd.addItem(String.valueOf(i));
                }
            }
        } else {
            for (int i = 0; i <= d; i++) {
                if (i == 0) {
                    cbbdd.addItem("Sel");
                } else if (i < 10) {
                    cbbdd.addItem(String.valueOf("0" + i));
                } else {
                    cbbdd.addItem(String.valueOf(i));
                }
            }
        }
    }

    private void insertValues(String[] values) {
        Student s = new Student();
        //s.Connect();
        query = "INSERT INTO student_info (id,studentId,name,dob,gender,gardianName,address,contact,enrolled,grade,fee,roll,photo,year)"
                + "VALUES (null,?,?,?,?,?,?,?,?,?,(SELECT amount FROM feeamount WHERE grade = '" + values[7] + "'),?,?,YEAR(now()))";
        boolean report = s.addNewStudent(query, values);
        s.Close();
        if (report) {
            JOptionPane.showMessageDialog(this, "Student Record Added Succesfully");
        } else {
            JOptionPane.showMessageDialog(this, "Please Try Again. Process Failed");
        }

    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        try {
//            javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
//        } catch (Exception e) {
//        }
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
//                new NewStudentF().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton btnselect;
    private javax.swing.JComboBox cbadd;
    private javax.swing.JComboBox cbadm;
    private javax.swing.JComboBox cbady;
    private javax.swing.JComboBox cbbdd;
    private javax.swing.JComboBox cbbdm;
    private javax.swing.JComboBox cbbdy;
    private javax.swing.JFormattedTextField contact;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox gender;
    private javax.swing.JTextField gfname;
    private javax.swing.JTextField glname;
    private javax.swing.JTextField gmname;
    private javax.swing.JComboBox grade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mname;
    private javax.swing.JRadioButton rbcd;
    // End of variables declaration//GEN-END:variables
}