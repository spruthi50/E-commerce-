

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * pg1.java
 *
 * Created on Nov 30, 2016, 9:16:47 AM
 */

/**
 *
 * @author system29
 */
public class pg2 extends javax.swing.JFrame {

    /** Creates new form pg1 */
    public pg2() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        p1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        p2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        p3 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ON_SHOP.COM");

        jPanel3.setLayout(null);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PicsArt_12-03-12.24.27.png"))); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 30, 420, 100);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12));
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Enter Phone No.");
        jLabel1.setOpaque(true);
        jPanel3.add(jLabel1);
        jLabel1.setBounds(20, 280, 100, 15);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12));
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Enter Password");
        jLabel2.setOpaque(true);
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 330, 100, 15);

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel3.add(t1);
        t1.setBounds(130, 280, 81, 20);
        jPanel3.add(p1);
        p1.setBounds(130, 320, 81, 20);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11));
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("LOG IN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(70, 440, 80, 23);
        jPanel3.add(t2);
        t2.setBounds(350, 280, 69, 20);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12));
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Create Password");
        jLabel5.setOpaque(true);
        jPanel3.add(jLabel5);
        jLabel5.setBounds(230, 360, 120, 15);
        jPanel3.add(t3);
        t3.setBounds(350, 320, 69, 20);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12));
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Enter Name");
        jLabel3.setOpaque(true);
        jPanel3.add(jLabel3);
        jLabel3.setBounds(230, 280, 90, 15);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12));
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Enter Phone No.");
        jLabel4.setOpaque(true);
        jPanel3.add(jLabel4);
        jLabel4.setBounds(230, 320, 120, 15);
        jPanel3.add(p2);
        p2.setBounds(350, 360, 69, 20);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11));
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("SIGN UP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(290, 440, 90, 23);
        jPanel3.add(p3);
        p3.setBounds(350, 400, 69, 20);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12));
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Re-Enter Password");
        jLabel6.setOpaque(true);
        jPanel3.add(jLabel6);
        jLabel6.setBounds(230, 400, 120, 15);

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18));
        jLabel10.setForeground(new java.awt.Color(0, 240, 240));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("New User");
        jLabel10.setOpaque(true);
        jPanel3.add(jLabel10);
        jLabel10.setBounds(260, 210, 120, 40);

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18));
        jLabel9.setForeground(new java.awt.Color(0, 240, 240));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Existing User");
        jLabel9.setOpaque(true);
        jPanel3.add(jLabel9);
        jLabel9.setBounds(50, 210, 130, 40);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(220, 190, 10, 310);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PicsArt_12-03-12.42.04bc.png"))); // NOI18N
        jPanel3.add(jLabel8);
        jLabel8.setBounds(0, 0, 440, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


try
{
    int c=0;
 Class.forName("java.sql.Driver");
 String uid="root";
 String  psd ="root";
 String db_url="jdbc:mysql://localhost:3306/system24";
 Connection con =(Connection)DriverManager.getConnection(db_url,uid,psd);
 Statement stmt=(Statement)con.createStatement();
 String phn=t1.getText();
 String ps=p1.getText();
 ResultSet rs=stmt.executeQuery("select * from login where phn_no="+phn);
 String n;double w;
 
 while(rs.next())
 {
     
     n=rs.getString("pswd");
     w=rs.getInt("wallet");

     if (n.equals(ps))
     {
     JOptionPane.showMessageDialog(null,"LOGIN SUCESSFULL");
     JOptionPane.showMessageDialog(null,"Your wallet balance is Rs."+w);
    
      c=1;
     this.setVisible(false);
     pg3 a=new pg3();
     a.setVisible(true);
     break;
     }
    if(c==0)
    { JOptionPane.showMessageDialog(null,"Wrong Phone Number or Password");
      break;
    }

 }
 rs.close();


}
 catch(Exception e)
 {
        JOptionPane.showMessageDialog(null, e.getMessage());
 

 }
// TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try
{
    Class.forName("java.sql.Driver");
    String uid="root";
    String pswd="root";
    String db_url="jdbc:mysql://localhost:3306/system24";
    Connection con=(Connection)DriverManager.getConnection(db_url,uid,pswd);
    Statement stmt=(Statement) con.createStatement();

    String name=t2.getText();
    String phn=t3.getText();
    String ps1=p2.getText();
    String ps2=p3.getText();
    double wallet=0.0;
    if(phn.length()==10)
    {
        if(ps1.equals(ps2))
           {
            stmt.executeUpdate("Insert into login values('"+phn+"','"+ps1+"',"+wallet+")");
            JOptionPane.showMessageDialog(null,"Sign Up Successful");
            this.setVisible(false);
            pg3 a=new pg3();
            a.setVisible(true);
           }
            else
                JOptionPane.showMessageDialog(null,"Password didn't match.");
    }
    else
            JOptionPane.showMessageDialog(null,"Invalid Phone Number.");

}

catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}
String name=t2.getText();
int phn=Integer.parseInt(t3.getText());
String ps1=p2.getText();
String ps2=p3.getText();



// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pg2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField p1;
    private javax.swing.JPasswordField p2;
    private javax.swing.JPasswordField p3;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    // End of variables declaration//GEN-END:variables

}
