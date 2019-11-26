
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class pg6 extends javax.swing.JFrame {

    /** Creates new form pg6 */
    public pg6() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chk4 = new javax.swing.JCheckBox();
        q4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        q1 = new javax.swing.JTextField();
        chk1 = new javax.swing.JCheckBox();
        q2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        chk2 = new javax.swing.JCheckBox();
        q3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        chk3 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ON_SHOP.COM");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Vijaya", 3, 52)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Musical Instruments");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 20, 360, 54);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fender-dave-murray-stratocaster.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Price Rs.10000/-"));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 120, 158, 136);

        chk4.setBackground(java.awt.Color.white);
        chk4.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        chk4.setForeground(new java.awt.Color(102, 102, 255));
        chk4.setText("Flute");
        chk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk4ActionPerformed(evt);
            }
        });
        jPanel1.add(chk4);
        chk4.setBounds(260, 280, 53, 29);

        q4.setText("1");
        q4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        jPanel1.add(q4);
        q4.setBounds(460, 380, 30, 30);

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 11));
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flute_c_5.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Price Rs.1000/-"));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(260, 310, 194, 163);

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backk.jpg"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(50, 480, 61, 65);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 11));
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/keyboard.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Price Rs.15000/-"));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 120, 192, 134);

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 11));
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drum.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Price Rs.20000/-"));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 300, 185, 172);

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setText("Qty");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(460, 90, 30, 30);

        q1.setText("1");
        q1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        jPanel1.add(q1);
        q1.setBounds(210, 170, 30, 30);

        chk1.setBackground(java.awt.Color.white);
        chk1.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        chk1.setForeground(new java.awt.Color(102, 102, 255));
        chk1.setText("Guitar");
        jPanel1.add(chk1);
        chk1.setBounds(20, 90, 61, 29);

        q2.setText("1");
        q2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q2ActionPerformed(evt);
            }
        });
        jPanel1.add(q2);
        q2.setBounds(460, 160, 30, 30);

        jButton2.setBackground(java.awt.Color.white);
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-to-cart-dark.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(340, 500, 65, 49);

        chk2.setBackground(java.awt.Color.white);
        chk2.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        chk2.setForeground(new java.awt.Color(102, 102, 255));
        chk2.setText("Keyboard");
        jPanel1.add(chk2);
        chk2.setBounds(260, 90, 77, 29);

        q3.setText("1");
        q3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        jPanel1.add(q3);
        q3.setBounds(220, 380, 30, 30);

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setText("Qty");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(210, 90, 30, 30);

        chk3.setBackground(java.awt.Color.white);
        chk3.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        chk3.setForeground(new java.awt.Color(102, 102, 255));
        chk3.setText("Drum Set");
        chk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk3ActionPerformed(evt);
            }
        });
        jPanel1.add(chk3);
        chk3.setBounds(20, 270, 81, 29);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PicsArt_12-03-12.42.04bc.png"))); // NOI18N
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 10, 490, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk3ActionPerformed

    private void chk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk4ActionPerformed

    private void q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try
{
    Class.forName("java.sql.Driver");
    String uid="root";
    String pswd="tiger";
    String db_url="jdbc:mysql://localhost:3306/system24";
    Connection con=(Connection)DriverManager.getConnection(db_url,uid,pswd);
    Statement stmt=(Statement) con.createStatement();

   int price=0,qty=0,amount=0;
   String items="";
   int qt1=Integer.parseInt(q1.getText());
int qt2=Integer.parseInt(q2.getText());
int qt3=Integer.parseInt(q3.getText());
int qt4=Integer.parseInt(q4.getText());

if (chk1.isSelected())
{
      price=10000;
      qty=Integer.parseInt(q1.getText());
      amount=price*qty;
      items="Guitar";
      
}
if (chk2.isSelected())
{
      price=15000;
      qty=Integer.parseInt(q2.getText());
      amount=price*qty;
      items="Keyboard";
      
}
if (chk3.isSelected())
{
      price=20000;
      qty=Integer.parseInt(q3.getText());
      amount=price*qty;
      items="Drum Set";
      
}
if (chk4.isSelected())
{
      price=1000;
      qty=Integer.parseInt(q4.getText());
      amount=price*qty;
      items="Flute";
      
}

stmt.executeUpdate("Insert into cart values('"+items+"',"+qty+","+price+","+amount+")");
    JOptionPane.showMessageDialog(null,"Added to cart");
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
} 

    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.setVisible(false);
pg3 a=new pg3();
a.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pg6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JCheckBox chk3;
    private javax.swing.JCheckBox chk4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    // End of variables declaration//GEN-END:variables

}
