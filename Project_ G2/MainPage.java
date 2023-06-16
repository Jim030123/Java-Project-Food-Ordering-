import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class MainPage implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	ImageIcon bg = new ImageIcon("image/bg.jpg");
	JLabel BG = new JLabel();
	JLabel l2 = new JLabel("Welcome");
	JButton btn2 = new JButton("Login");
	ImageIcon logoIcon = new ImageIcon("image/icon.png");
	JLabel logo= new JLabel(new ImageIcon("Image/logo.png"));
	int Count = 0;
	
	public MainPage() {
		
		frame.setTitle("Main Page");
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(1200, 800);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setIconImage(logoIcon.getImage());
		frame.add(logo);
		frame.add(panel);
		
		frame.add(BG);
		
		panel.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
		panel.setBounds(100, 70, 500, 600);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 255), null, null, Color.YELLOW));
		panel.setLayout(null);


		panel.add(l2);
		l2.setBounds(100, 100, 330, 50);
		l2.setFont(new Font("Algerian", Font.BOLD, 60));

		
		panel.add(logo);
		logo.setBounds(120,150, 250, 200);

		panel.add(btn2);
		btn2.setBounds(160, 350, 180, 30);
		btn2.setFont(new Font("Segeo UI Semibold", Font.PLAIN, 20));
		btn2.setBorder(UIManager.getBorder("CheckBox.border"));
		btn2.setFocusable(false);
		btn2.addActionListener(this);

		BG.setIcon(bg);
		BG.setSize(1200, 800);

		btn2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {

				btn2.setForeground(new Color(155, 171, 171));
				btn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}

			public void mouseExited(MouseEvent e) {

				btn2.setForeground(Color.black);
			}
		});

	}

	public static void main(String[] args) {
		new MainPage();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btn2) {
			LoginPage lp =new LoginPage();
			frame.setVisible(false);
		}
		}
}