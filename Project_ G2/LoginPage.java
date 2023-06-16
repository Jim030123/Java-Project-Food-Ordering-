import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


//GUI with actionListener
public class LoginPage extends JFrame implements ActionListener {
  
    
    // Frame
    JFrame frame = new JFrame();
    JPanel panel1 = new JPanel();
    ImageIcon bg = new ImageIcon("image/bg.jpg");
    ImageIcon logoIcon = new ImageIcon("image/icon.png");

    // Username 
    JLabel BG = new JLabel("",bg,JLabel.CENTER);
    JLabel logo= new JLabel(new ImageIcon("Image/logo.png"));
    JLabel loginlabel = new JLabel();
    JLabel userName = new JLabel();
    JTextField nameText = new JTextField();
    
    // Password
    JLabel password = new JLabel();
    JPasswordField passwordText = new JPasswordField();
    ImageIcon eye = new ImageIcon("image/view.png");
    JLabel eyeopen = new JLabel();
    ImageIcon eyeclose = new ImageIcon("image/hide.png");
    JLabel eyeClose = new JLabel();

    // If user no enter any usename and password will come out the label
    JLabel EmptyName = new JLabel();
    JLabel EmptyPass = new JLabel();

    // Button go to another page
    JButton Login = new JButton();
    JButton MainMenu = new JButton();
   
    // Main method
    public static void main(String[] args) {
        new LoginPage();
    }
    
    public LoginPage() {
       
        //Set frame
        frame.setTitle("Login Page");
        frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        frame.setSize(1200, 800);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setIconImage(logoIcon.getImage());
        frame.setResizable(false);
        frame.add(logo);
        frame.add(EmptyName);
        frame.add(EmptyPass);
        frame.add(panel1);
        frame.add(BG);
        BG.setIcon(bg);
        BG.setSize(1200, 800);
        
        // Panel1
        panel1.setLayout(null);
        panel1.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
        panel1.setBounds(60, 85, 600, 600);
        
        panel1.add(logo);
        logo.setBounds(180,60, 250, 200);
        
        panel1.add(userName);
        userName.setBounds(132, 235, 95, 45);
        userName.setText("Username");
        userName.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        userName.setForeground(Color.black);
        
        panel1.add(nameText);
        nameText.setBounds(238, 250, 200, 25);
        nameText.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
       
        panel1.add(password);
        password.setBounds(132, 310, 95, 45);
        password.setText("Password");
        password.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        password.setForeground(Color.black);
        passwordText.setBounds(238, 318, 200, 25);
        passwordText.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        
        panel1.add(passwordText);
        passwordText.add(eyeopen);
        eyeopen.setBounds(170, -2, 30, 30);
        eyeopen.setIcon(eye);
        passwordText.add(eyeClose);
        eyeClose.setBounds(170, -2, 30, 30);
        
        eyeClose.setIcon(eyeclose);
        eyeClose.setVisible(false);

        Login.setBounds(132, 406, 140, 30);
        panel1.add(Login);
        Login.setText("Login");
        Login.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        Login.setBorder(UIManager.getBorder("CheckBox.border"));
        Login.setFocusable(false);
        Login.addActionListener(this);
        
        panel1.add(MainMenu);
        MainMenu.setBounds(298, 406, 140, 30);
        MainMenu.setText("Main Page");
        MainMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        MainMenu.setBorder(UIManager.getBorder("CheckBox.border"));
        MainMenu.setFocusable(false);
        MainMenu.addActionListener(this);
        EmptyName.setBounds(300, 355, 200, 25);
        EmptyPass.setBounds(300, 425, 200, 25);

        // Hide the label under the name textfield
        nameText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                EmptyName.setText("");
            }
        });
        // Hide the label under the password textfield
        passwordText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				EmptyPass.setText("");
			}
		});

        // Password visible 
        eyeopen.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                eyeopen.setVisible(false);
                eyeClose.setVisible(true);
                passwordText.setEchoChar((char) 0);
                
            }
        });

        // Password unvisible
        eyeClose.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                eyeopen.setVisible(true);
                eyeClose.setVisible(false);
                passwordText.setEchoChar('•');
            }
        });  
        
        // Login Button
        Login.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Login.setForeground(new Color(155, 171, 171));
                Login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                 Login.setForeground(Color.black);
            }
        });

        // Main Menu Button
        MainMenu.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                MainMenu.setForeground(new Color(155, 171, 171));
                MainMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                MainMenu.setForeground(Color.black);
            }
        });
    }
    
    // ActionEvent
    public void actionPerformed(ActionEvent e) {
        
        // Check username and password
        if (e.getSource() == Login) {
            if (nameText.getText().trim().isEmpty() && passwordText.getText().trim().isEmpty()) {
                EmptyName.setText("Username is Empty");
                EmptyPass.setText("Password is Empty");
            }
            
            else if (nameText.getText().trim().isEmpty()) {
                EmptyName.setText("Username is Empty");
            } 
            
            else if (passwordText.getText().trim().isEmpty()) {
                EmptyPass.setText("Password is Empty");
            }  

            // Profile Customer
            else if (nameText.getText().equals("customer") && passwordText.getText().equals("5678")) {
                int dialog=JOptionPane.showOptionDialog(null, "Log In Now ?","Login Successful", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                if( dialog  == JOptionPane.OK_OPTION)
                    {  
                        Menu menupage = new Menu();
                        menupage.setVisible(true);
                        frame.setVisible(false);
                    } 
                        
                    } 
                   
            // Profile Admin (uncomplete)
            else if (nameText.getText().equals("admin") && passwordText.getText().equals ("1234")) {
                int dialog=JOptionPane.showOptionDialog(null, "Log In Now ?","Login Successful", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                if( dialog  == JOptionPane.OK_OPTION)
                    {
                        new AdminPage();
                        frame.setVisible(false);
                    }    
            }
            
            // Error on Username and Password 
            else if (nameText.getText() != "customer" && passwordText.getText() != "5678") {
                JOptionPane.showMessageDialog(null, "Username error or Password error");
            }
        }

        if (e.getSource() == MainMenu) {
            new MainPage();
            frame.setVisible(false);  
        }

    }

}
