import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

import javax.swing.*;

public class AdminPage  extends JFrame implements actionListener {

    public AdminPage() {
        initComponents();
    }

    private void initComponents() {

        jPanel2 = new JPanel();
        jLabel2 = new JLabel();
        jLabel6 = new JLabel();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        OpenFileButton = new JButton();
        Logout = new JButton();
        ImageIcon logoIcon = new ImageIcon("image/icon.png");
        
        jPanel2.setBackground(new Color(255, 204, 204));
        jPanel2.setLayout(null);

        jLabel2.setFont(new Font("Comic Sans MS", 3, 36)); // NOI18N
        jLabel2.setText("Admin Management Page");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(280, 20, 460, 110);

        jLabel6.setIcon(new ImageIcon(getClass().getResource("image/logo.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 0, 250, 171);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 790, 170);

        jPanel1.setBackground(new Color(204, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new Font("Comic Sans MS", 3, 36)); // NOI18N
        jLabel1.setText("Customer Recipt File");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 20, 380, 110);

        OpenFileButton.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        OpenFileButton.setText("Open File");
        OpenFileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                OpenFileButtonActionPerformed(evt);
            }
        });
        jPanel1.add(OpenFileButton);
        OpenFileButton.setBounds(310, 120, 170, 34);

        Logout.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        Logout.setText("Log Out");
        Logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jPanel1.add(Logout);
        Logout.setBounds(310, 170, 170, 34);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 170, 790, 390);

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        setResizable(false);
        setIconImage(logoIcon.getImage());
        setSize(790, 557);
        setVisible(true);
    }

    private void OpenFileButtonActionPerformed(ActionEvent evt) {
      String path = "Receipt";
        File file = new File(path);
        try {
        if (file.exists()) {
        Process pro = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + path);
        pro.waitFor();
        } else {
        System.out.println("file does not exist");
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    }

    private void LogoutActionPerformed(ActionEvent evt) {
       new LoginPage();
        dispose();
    }

    public static void main(String args[]) {
       new AdminPage();
    }
    private JButton Logout;
    private JButton OpenFileButton;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JPanel jPanel2;
}
