import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.PrintWriter;



import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jim Ng Ying Gee
 */
public class PaymentPage extends javax.swing.JFrame {

    DefaultTableModel dtm;
    
    public PaymentPage(){
        initComponents();
        tableHeader();
    }

    public void tableHeader(){
        
        dtm = (DefaultTableModel) tbl.getModel();
        dtm.setColumnIdentifiers(new Object[]{"Name","Size","Quantity","Price"});
        
    }
    

    private void initComponents() {
        
        LogOutButton = new javax.swing.JButton();
        
        PayNowButton = new javax.swing.JButton();
        cal = new javax.swing.JButton();
        
        tbl = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        
        jTextField1 = new javax.swing.JTextField();
        Subtotal = new javax.swing.JTextField();     
        sst = new javax.swing.JTextField();
        total = new javax.swing.JTextField();

        Login = new java.awt.Panel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();       
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        PaymentOption = new javax.swing.JComboBox<>();
         
        OrderType = new javax.swing.ButtonGroup();
        DineInButton = new javax.swing.JRadioButton();
        TakeAwayButton = new javax.swing.JRadioButton();
        DeliveryButton = new javax.swing.JRadioButton();
        ImageIcon logoIcon = new ImageIcon("image/icon.png");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MJ Fast Food");
        setSize(930,700);
        setResizable(false);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        setIconImage(logoIcon.getImage());

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon("image/logo.png")); 
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 0, 243, 171);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); 
        jLabel1.setText("Payment");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(380, 50, 160, 88);

        Login.setBackground(new java.awt.Color(255, 204, 204));
        Login.setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); 
        jTextField1.setText("Logged in");
        Login.add(jTextField1);
        jTextField1.setBounds(120, 10, 110, 30);

        LogOutButton.setText("Log out");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Login.add(LogOutButton);
        LogOutButton.setBounds(125, 70, 94, 29);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); 
        jLabel3.setText("Login status:");
        Login.add(jLabel3);
        jLabel3.setBounds(0, 10, 140, 30);

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
        jScrollPane1.setViewportView(tbl);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 510, 420);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(70, 40, 500, 400);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Subtotal (RM):");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(20, 30, 130, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); 
        jLabel5.setText("SST 6% (RM):");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(20, 80, 125, 21);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); 
        jLabel7.setText("Total (RM):");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(20, 120, 120, 26);

        Subtotal.setEditable(false);
        Subtotal.setText("");
        jPanel4.add(Subtotal);
        Subtotal.setBounds(170, 30, 100, 29);

        total.setEditable(false);
        total.setText("");
        jPanel4.add(total);
        total.setBounds(170, 120, 100, 29);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("------------------------------------------------------------------");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(0, 100, 300, 21);

        sst.setEditable(false);
        sst.setText("");
        jPanel4.add(sst);
        sst.setBounds(170, 70, 100, 29);

        PaymentOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose you payment Option", "Cash", "E-Wallet", "Online Banking" }));
        jPanel4.add(PaymentOption);
        PaymentOption.setBounds(10, 170, 250, 29);

        PayNowButton.setText("Pay Now");
        PayNowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        PayNowButton.setEnabled(false);
        jPanel4.add(PayNowButton);
        PayNowButton.setBounds(70, 250, 130, 29);
        
        cal.setText("Cal Total");
        cal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                  calActionPerformed(evt);
            }
        });
         jPanel4.add(cal);
         cal.setBounds(70, 210, 130, 29);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(600, 100, 270, 340);

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        DeliveryButton.setText("Delivery");
        jPanel5.add(DeliveryButton);

        DineInButton.setText("Dine in");
        jPanel5.add(DineInButton);

        TakeAwayButton.setText("Take away");
        jPanel5.add(TakeAwayButton);
        
        OrderType.add(DineInButton);
        OrderType.add(TakeAwayButton);
        OrderType.add(DeliveryButton);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(600, 60, 280, 60);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 3, 15)); 
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Order Type");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(600, 40, 90, 21);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 170, 930, 490);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
            dispose();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        
        int count = 1;
        String cash;
        String total1 = total.getText();
        String SubtotalPrice1 = Subtotal.getText();
        String sst1 = sst.getText();
        String nametxt = Double.toString(Math.random());
        qrcode = new javax.swing.ImageIcon("image/QRCode.jpg");

        if(PaymentOption.getSelectedItem().equals("Choose you payment Option") || OrderType.getSelection()==null){
            JOptionPane.showMessageDialog(null, "Please choose your payment option and order type");
        }else{

        DineInButton.setActionCommand("Dine in");
        TakeAwayButton.setActionCommand("Take Away");
        DeliveryButton.setActionCommand("Delivery");
        String chooseOrderType = OrderType.getSelection().getActionCommand(); 

         if(PaymentOption.getSelectedItem().equals("Cash")){
                
           cash = JOptionPane.showInputDialog(null, "Please Enter Your Amount");
            
             if(cash.equals(total1)){
                JOptionPane.showMessageDialog(null, "Pay Success");
            }
            
        }else if(PaymentOption.getSelectedItem().equals("E-Wallet")){
            JOptionPane.showMessageDialog(null, "","QR Code",JOptionPane.INFORMATION_MESSAGE,qrcode);
            JOptionPane.showMessageDialog(null, "Pay Success");
            
          
        }else if(PaymentOption.getSelectedItem().equals("Online Banking")){
           JOptionPane.showInputDialog(null, "Please Enter Your Account No");
           JOptionPane.showInputDialog(null, "Please Enter Your Pin");
           JOptionPane.showMessageDialog(null, "Pay Success"); 
        }
       
        
        // Recipt
        try {
            String Move = nametxt + ".txt";
            File file = new File("receipt",Move);
            
            PrintWriter output = new PrintWriter(new FileWriter(file));
            BufferedWriter bw = new BufferedWriter(output);
            
            bw.write("-----------------Your Order-----------------");
            bw.write("\n");
            
            for(int i = 0; i < tbl.getRowCount(); i++){
                bw.write(count + ") ");
                for(int j = 0; j < tbl.getColumnCount(); j++){
                bw.write((String)tbl.getModel().getValueAt(i, j) + "      ");
                }
                bw.write("\n_______________________\n");
                count++;
            }
                bw.write("You want : " + chooseOrderType);
                bw.write("\n");
                bw.write("Subtotal (RM) : " + SubtotalPrice1);
                bw.write("\n");
                bw.write("SST 6% (RM) : " +sst1);
                bw.write("\n");
                bw.write("Total Amount (RM) : " + total1);
                bw.write("\n");
                bw.write("Thanks You For Your Support!!!");
            
            bw.close();
            output.close();
            
            JOptionPane.showMessageDialog(null, "Receipt have print");
            
        } catch (IOException ex) {
            Logger.getLogger(PaymentPage.class.getName()).log(Level.SEVERE, null, ex);
        }  
        }
        dispose();
    }
    
    // Calculate
    private void calActionPerformed(java.awt.event.ActionEvent evt) {
        rowCount = tbl.getRowCount();
        int SubtotalPrice = 0;
        double sstPrice;
        double totalPrice = 0;
        
        for(int i = 0; i < rowCount; i++ ){
            
             int value = Integer.valueOf(dtm.getValueAt(i, 3).toString());
             SubtotalPrice += value;

        }
        String.format("%.2f", totalPrice);
        sstPrice = SubtotalPrice * 0.06;
        totalPrice = SubtotalPrice + sstPrice;
        String.format("%.2f", sstPrice);
        

        Subtotal.setText(Integer.toString(SubtotalPrice));
        sst.setText(Double.toString(sstPrice));
        total.setText(Double.toString(totalPrice));

        if(evt .getSource()==cal){
            PayNowButton.setEnabled(true);
        }
    }

    public static void main(String args[]) {
        new PaymentPage();
    }

    // Declare
    private java.awt.Panel Login;
    private javax.swing.JComboBox<String> PaymentOption;
    private javax.swing.JTextField Subtotal;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton PayNowButton;
    private javax.swing.JButton cal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.ImageIcon qrcode;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton DineInButton;
    private javax.swing.JRadioButton TakeAwayButton;
    private javax.swing.JRadioButton DeliveryButton;
    private javax.swing.ButtonGroup OrderType;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbl;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField sst;
    private javax.swing.JTextField total;  
    public int rowCount;
}
