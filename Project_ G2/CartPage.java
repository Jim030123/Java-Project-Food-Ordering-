import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CartPage extends javax.swing.JFrame implements actionListener {
    DefaultTableModel dtm;
    ImageIcon logoIcon = new ImageIcon("image/icon.png");
    public CartPage(){
        initComponents();
        tableHeader();
    }

    public void tableHeader(){
        dtm = (DefaultTableModel) tbl.getModel();
        dtm.setColumnIdentifiers(new Object[]{"Name","Size","Quantity","Price"});
    }
    
    PaymentPage pp = new PaymentPage(); 
    
    private void initComponents() {
        HeaderLabel = new JLabel();
        QuantityLabel = new JLabel();
        LoginStatus = new JLabel();
        jLabel4 = new JLabel();
        SubtotalLabel = new JLabel();
        LogoLabel = new JLabel();
        
        Login = new java.awt.Panel(); 
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();       
        jPanel3 = new JPanel();

        jScrollPane1 = new JScrollPane();
        tbl = new JTable();

        jButton1 = new JButton();
        
        CheckoutButton = new JButton();
        CalButton = new JButton();
        DeleteButton = new JButton();
        
        TotalQuantity = new JTextField();
        Subtotal = new JTextField();
        LoginTF = new JTextField();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("MJ Fast Food");
        setSize(930,700);
        setResizable(false);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        setIconImage(logoIcon.getImage());
        
        jPanel3.setBackground(new Color(255, 204, 204));
        jPanel3.setLayout(null);

        LogoLabel.setIcon(new ImageIcon("image/logo.png")); 
        jPanel3.add(LogoLabel);
        LogoLabel.setBounds(30, 0, 243, 171);

        HeaderLabel.setFont(new Font("Comic Sans MS", 3, 36));
        HeaderLabel.setHorizontalAlignment(SwingConstants.CENTER);
        HeaderLabel.setText("Cart");
        jPanel3.add(HeaderLabel);
        HeaderLabel.setBounds(370, 50, 160, 88);

        Login.setBackground(new Color(255, 204, 204));
        Login.setLayout(null);

        LoginTF.setEditable(false);
        LoginTF.setBackground(new Color(255, 255, 255));
        LoginTF.setFont(new Font("Comic Sans MS", 3, 18)); 
        LoginTF.setText("Logged in");
        Login.add(LoginTF);
        LoginTF.setBounds(120, 5, 110, 40);

        jButton1.setText("Log out");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Login.add(jButton1);
        jButton1.setBounds(125, 70, 94, 29);

        LoginStatus.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); 
        LoginStatus.setText("Login status:");
        Login.add(LoginStatus);
        LoginStatus.setBounds(0, 10, 140, 30);

        jPanel3.add(Login);
        Login.setBounds(600, 40, 230, 100);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 920, 170);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 520, 440);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 20, 520, 440);

        CheckoutButton.setText("Go to Checkout");
        CheckoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        CheckoutButton.setEnabled(false);
        jPanel1.add(CheckoutButton);
        CheckoutButton.setBounds(660, 310, 150, 40);

        TotalQuantity.setEditable(false);
        jPanel1.add(TotalQuantity);
        TotalQuantity.setBounds(770, 110, 100, 29);

        QuantityLabel.setFont(new Font("Comic Sans MS", 0, 18)); 
        QuantityLabel.setHorizontalAlignment(SwingConstants.CENTER);
        QuantityLabel.setText("Item Quantity:");
        jPanel1.add(QuantityLabel);
        QuantityLabel.setBounds(620, 110, 130, 30);

        CalButton.setText("Calulate");
        CalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(CalButton);
        CalButton.setBounds(660, 210, 150, 40);

        jLabel4.setText("----------------------------------------------------------------------");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(600, 180, 280, 21);
        
        // Delete Button
        jPanel1.add(DeleteButton);
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        DeleteButton.setBounds(660, 260, 150, 40);

        // Subtotal Label
        SubtotalLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        SubtotalLabel.setHorizontalAlignment(SwingConstants.CENTER);
        SubtotalLabel.setText("Subtotal (RM):");
        jPanel1.add(SubtotalLabel);
        SubtotalLabel.setBounds(620, 150, 130, 30);
        
        // Subtotal
        jPanel1.add(Subtotal);
        Subtotal.setEditable(false);
        Subtotal.setText("");
        Subtotal.setBounds(770, 150, 100, 29);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 170, 915, 510);
    }
    
    private void jButton1ActionPerformed(ActionEvent evt) {
        new LoginPage();
        setVisible(false);
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        rowCount = tbl.getRowCount();   
        for(int i = 0; i<rowCount; i++){
            String col1 = dtm.getValueAt(i, 0).toString();
            String col2 = dtm.getValueAt(i, 1).toString();
            String col3 = dtm.getValueAt(i, 2).toString();
            String col4 = dtm.getValueAt(i, 3).toString();
            
            pp.dtm.addRow(new Object[]{col1,col2,col3,col4});
        }
        dispose();
        pp.setVisible(true);
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        rowCount = tbl.getRowCount();
        int totalAmount = 0;
        int totalPrice = 0;
        
        for(int i = 0; i < rowCount; i++ ){
             int value = Integer.valueOf(dtm.getValueAt(i, 2).toString());
             totalAmount += value;
             int value2 = Integer.valueOf(dtm.getValueAt(i, 3).toString());
             totalPrice +=value2;
        }
       TotalQuantity.setText(Integer.toString(totalAmount));
       Subtotal.setText(Integer.toString(totalPrice));     

        if(evt.getSource()==CalButton){
           CheckoutButton.setEnabled(true);
       }
    }

    //Delete row
    private void jButton5ActionPerformed(ActionEvent evt) {
        {
            // check for selected row first
            if(tbl.getSelectedRow() != -1) {
               
                // remove selected row from the model
               dtm.removeRow(tbl.getSelectedRow());
               JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
            }
         }
    }

    public static void main(String args[]) {
        new CartPage();
    }

    // Declaration
    private java.awt.Panel Login;
    private javax.swing.JTextField TotalQuantity;
    private javax.swing.JTextField Subtotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton CheckoutButton;
    private javax.swing.JButton CalButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JLabel LoginStatus;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel SubtotalLabel;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbl;
    private javax.swing.JTextField LoginTF;
    public int rowCount;
}