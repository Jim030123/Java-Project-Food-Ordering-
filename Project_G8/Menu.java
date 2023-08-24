import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingConstants.*;

public class Menu extends JFrame {
    public Menu() {
        setVisible(true);
        initComponents();
    }
    public static void main(String args[]) {
        new  Menu();
    }
    CartPage cp = new CartPage();
    
    public void initComponents() {
        // JPanel
        PagePanel = new JPanel();
        MenuTabPanel = new JPanel();
        jPanel5 = new JPanel();
        jPanel6 = new JPanel();
        SelectPanel = new JPanel();
        jPanel7 = new JPanel();
        Header = new JPanel();
        Login = new JPanel();
        jPanel4 = new JPanel();

        // JLabel
        LogoLabel = new JLabel();
        HeaderLabel = new JLabel();
        FoodID = new JLabel();
        SizeLabel = new JLabel();
        LoginStatus = new JLabel();
        QuantityLabel = new JLabel();

        // JButton
        CartButton = new JButton();
        Logout = new JButton();
        Cart = new JButton();
       
        // JScrollPane 
        jScrollPane2 = new JScrollPane();
        jScrollPane3 = new JScrollPane();
        jScrollPane5 = new JScrollPane();
        jScrollPane4 = new JScrollPane();
        jScrollPane6 = new JScrollPane();
        jScrollPane7 = new JScrollPane();
        jScrollPane1 = new JScrollPane();
       
        // TablePane
        Table = new JTabbedPane();

        // JTextField
        FoodTF = new JTextField();
        Quantity = new JTextField();
        StatusLabel = new JTextField();

        // JComboBox
        Size = new JComboBox<>();
        Mealoption = new JComboBox<>();
        Beverage = new JComboBox<>();
       
        //JTable
        MealTable = new JTable();
        BeverageTable = new JTable();
        SnackTable = new JTable();
        
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
       
        
        
        // JFrame
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setTitle("MJ Fast Food");
        setSize(930,700);
        setResizable(false);
        setLayout(null);
        
        
        //PagePanel
        PagePanel.setBackground(new Color(204, 255, 204));
        PagePanel.setLayout(null);

        SelectPanel.setBackground(new Color(204, 255, 204));
        SelectPanel.setLayout(null);

        //Combo Box
        Mealoption.setModel(new DefaultComboBoxModel<>(new String[] { "Choose Your Meal", "Meals", "Beverage", "Snack" }));
        Mealoption.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MealoptionActionPerformed(evt);
            }
        });
        

        // Meal Option
        SelectPanel.add(Mealoption);
        Mealoption.setBounds(60, 10, 170, 29);

        // Beverage
        Beverage.setModel(new DefaultComboBoxModel<>(new String[] { }));
        Beverage.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                BeverageItemStateChanged(evt);
            }
        });
        SelectPanel.add(Beverage);
        Beverage.setBounds(60, 50, 170, 29);
        FoodID.setHorizontalAlignment(SwingConstants.CENTER);
        FoodID.setText("ID");
        
        // Food ID
        SelectPanel.add(FoodID);
        FoodID.setBounds(3, 54, 45, 25);

        // Size
        SelectPanel.add(Size);
        Size.setModel(new DefaultComboBoxModel<>(new String[] { "Choose Your Size","Small", "Medium", "Large" }));
        Size.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SizeActionPerformed(evt);
                }
            });
        Size.setBounds(60, 130, 170, 29);
        
        // SizeLabel
        SelectPanel.add(SizeLabel);
        SizeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        SizeLabel.setText("Size");
        SizeLabel.setBounds(0, 133, 45, 25);
        
        // FoodTF
        SelectPanel.add(FoodTF);
        FoodTF.setHorizontalAlignment(SwingConstants.CENTER);
        FoodTF.setText("Name");
        FoodTF.setBounds(0, 93, 45, 25);
        FoodTF.setEditable(false);
        FoodTF.setHorizontalAlignment(JTextField.CENTER);
        FoodTF.setBounds(60, 90, 170, 29);
        
        // QuantityLabel
        SelectPanel.add(QuantityLabel);
        QuantityLabel.setHorizontalAlignment(SwingConstants.CENTER);
        QuantityLabel.setText("Quantity");
        QuantityLabel.setBounds(0, 183, 55, 25);

        // Button
        SelectPanel.add(CartButton);
        CartButton.setBackground(new java.awt.Color(102, 255, 255));
        CartButton.setText("Add in Cart");
        CartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartButtonActionPerformed(evt);
            }
        });
        CartButton.setBounds(250, 180, 120, 30);  

        
        // Quantity
        Quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt){
                QuantityKeyTyped(evt);
            }
        });

        SelectPanel.add(Quantity);
        Quantity.setBounds(60, 180, 170, 29);
        
        SelectPanel.add(jPanel4);
        jPanel4.setBackground(new java.awt.Color(255, 204, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.lightGray, null, null));
        jPanel4.setLayout(null);

        jPanel4.add(jLabel8);
        jLabel8.setFont(new Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel8.setText("Size");
        jLabel8.setBounds(60, 10, 80, 40);
        
        jPanel4.add(jLabel9);
        jLabel9.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel9.setText("Medium +RM 1");
        jLabel9.setBounds(20, 60, 140, 20);
        
        jPanel4.add(jLabel10);
        jLabel10.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel10.setText("Large   +RM 2");
        jLabel10.setBounds(20, 90, 150, 30);

        jPanel4.setBounds(480, 30, 170, 170);

        PagePanel.add(SelectPanel);
        SelectPanel.setBounds(130, 240, 660, 230);
        
        // MenuTabPanel
        MenuTabPanel.setBackground(new java.awt.Color(240, 255, 255));
        MenuTabPanel.setLayout(null);
        MenuTabPanel.add(Table);
        
        PagePanel.add(MenuTabPanel);
        MenuTabPanel.setBounds(160, 10, 600, 220);

        // Pannel Table
        Table.setBackground(new java.awt.Color(204, 255, 255));
        Table.setForeground(new java.awt.Color(0, 102, 102));
        Table.addTab("Meal", jPanel5);
        Table.addTab("Beverage", jPanel6);
        Table.addTab("Snack", jPanel7);
        Table.setBounds(10, 10, 580, 200);

        // Meal Table
        MealTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"M01", "Chicken Burger",  new Integer(8)},
                {"M02", "Cheese Burger",  new Integer(8)},
                {"M03", "Beef Burger",  new Integer(8)},
                {"M04", "Pepperoni Pizza",  new Integer(8)},
                {"M05", "Fried Chicken",  new Integer(8)},
                {"M06", "Spaghetti",  new Integer(8)}
            },
            new String [] {
                "ID", "Name", "Price (RM)"
            }) 
            
            {
                Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        MealTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(MealTable);
        if (MealTable.getColumnModel().getColumnCount() > 0) {
            MealTable.getColumnModel().getColumn(0).setResizable(false);
            MealTable.getColumnModel().getColumn(1).setResizable(false);
            MealTable.getColumnModel().getColumn(2).setResizable(false);
        }
        
        jPanel5.setLayout(null);
        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(0, 0, 575, 170);
        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 600, 170);
        jPanel5.add(jScrollPane5);
        jScrollPane5.setBounds(340, 200, 600, 170);

        // Beverage Table
        BeverageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"B01", "Coca Cola",  new Integer(2)},
                {"B02", "Mountain Dew",  new Integer(2)},
                {"B03", "Sprite",  new Integer(2)}
            },
            new String [] 
            {"ID", "Name", "Price(RM)"}) 
            
            {  
                Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BeverageTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(BeverageTable);
        if (BeverageTable.getColumnModel().getColumnCount() > 0) {
            BeverageTable.getColumnModel().getColumn(0).setResizable(false);
            BeverageTable.getColumnModel().getColumn(1).setResizable(false);
            BeverageTable.getColumnModel().getColumn(2).setResizable(false);
        }
        
        jPanel6.setLayout(null);
        jPanel6.add(jScrollPane4);
        jScrollPane4.setBounds(0, 0, 575, 160);
        jPanel6.add(jScrollPane6);
        jScrollPane6.setBounds(400, 100, 2, 2);
        
        // Snack Table
        SnackTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"S01", "Chicken nuggets",  new Integer(5)},
                {"S02", "Cheese potato",  new Integer(5)},
                {"S03", "French Fries",  new Integer(5)}
            },
            new String [] {
                "ID", "Name", "Price (RM)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        SnackTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(SnackTable);
        if (SnackTable.getColumnModel().getColumnCount() > 0) {
            SnackTable.getColumnModel().getColumn(0).setResizable(false);
            SnackTable.getColumnModel().getColumn(1).setResizable(false);
            SnackTable.getColumnModel().getColumn(2).setResizable(false);
        }
       
        jPanel7.setLayout(null);
        jPanel7.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 575, 160);
        jPanel7.add(jScrollPane7);
        jScrollPane7.setBounds(290, 40, 2, 2);

        getContentPane().add(PagePanel);
        PagePanel.setBounds(0, 170, 915, 510);
        
        
        // Header
        Header.setBackground(new Color(255, 204, 204));
        Header.setLayout(null);
        Header.add(LogoLabel);
        
        // LogoLabel
        LogoLabel.setIcon(new ImageIcon("image/logo.png")); // NOI18N
        LogoLabel.setBounds(30, 0, 243, 171);

        HeaderLabel.setFont(new Font("Comic Sans MS", 3, 40)); // NOI18N
        HeaderLabel.setText("Menu");
        Header.add(HeaderLabel);
        HeaderLabel.setBounds(360, 45, 154, 88);

        // Login Status
        Login.add(Logout);
        Login.setBackground(new Color(255, 204, 204));
        Login.setLayout(null);
        Login.add(StatusLabel);
        Login.add(LoginStatus);

        LoginStatus.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        LoginStatus.setText("Login status:");
        LoginStatus.setBounds(0, 10, 140, 30);
        
        StatusLabel.setEditable(false);
        StatusLabel.setBackground(new Color(255, 255, 255));
        StatusLabel.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        StatusLabel.setText("Logged in");
        StatusLabel.setBounds(120, 5, 110, 40);

        //Back to Login Page
        Logout.setText("Log out");
        Logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BackLoginActionPerformed(evt);
            }
        }); 
        Logout.setBounds(110, 70, 94, 29);

        // Go to Cart Page
        Login.add(Cart);
        Cart.setText("Cart");
        Cart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               CartActionPerformed(evt);
            }
        });
        Cart.setBounds(10, 70, 70, 29);
        
        Header.add(Login);
        Login.setBounds(600, 40, 230, 100);

        getContentPane().add(Header);
        Header.setBounds(0, 0, 920, 170);
    }

    // MealOption
    private void MealoptionActionPerformed(ActionEvent evt) {

        if(Mealoption.getSelectedItem().equals("Beverage")){
                    Beverage.removeAllItems();
                    Beverage.addItem("B01");
                    Beverage.addItem("B02");
                    Beverage.addItem("B03");                                                    
        }

        else if(Mealoption.getSelectedItem().equals("Snack")){
                    Beverage.removeAllItems();
                    Beverage.addItem("S01");
                    Beverage.addItem("S02");
                    Beverage.addItem("S03");
        }

        else if(Mealoption.getSelectedItem().equals("Meals")){
                    Beverage.removeAllItems();
                    Beverage.addItem("M01");
                    Beverage.addItem("M02");
                    Beverage.addItem("M03");
                    Beverage.addItem("M04");
                    Beverage.addItem("M05");
                    Beverage.addItem("M06");      
        }
    }
    
    // Execute to login page
    private void BackLoginActionPerformed(ActionEvent evt) {
        new LoginPage();
        setVisible(false);     
    }

    private void CartActionPerformed(ActionEvent evt) {
            cp.setVisible(true);
            setVisible(false);
    }

   
    // Record the order to Cart Page
    private void CartButtonActionPerformed(ActionEvent evt) {
                
        if(Mealoption.getSelectedItem().equals("Choose Your Meal") || Size.getSelectedItem().equals("Choose Your Size") || Quantity.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Please Enter Order");      
        }
        
        else if(Mealoption.getSelectedItem().equals("Meals")){        
            quantity = Integer.parseInt(Quantity.getText());
            
            if(Size.getSelectedItem().equals("Medium")){
                     SubPrice = MeMprice1 * quantity;
                     AddinCart();
                     
            }else if(Size.getSelectedItem().equals("Large")){
                     SubPrice= MeLprice1 * quantity;
                     AddinCart();
                     

            }else if(Size.getSelectedItem().equals("Small")){
                     SubPrice = price1 * quantity;
                    AddinCart();
            }
               
        }else if(Mealoption.getSelectedItem().equals("Beverage")){

             quantity = Integer.parseInt(Quantity.getText());
             if(Size.getSelectedItem().equals("Medium")){
                    SubPrice = BeMprice2 * quantity;
                    AddinCart();
                  
             
             }else if (Size.getSelectedItem().equals("Large")){
                SubPrice = BeLprice2 * quantity;
                AddinCart();
                 
             }else if(Size.getSelectedItem().equals("Small")){
                     SubPrice = price2 * quantity;
                     AddinCart();
               
             }
 
        }else if(Mealoption.getSelectedItem().equals("Snack")){
            
             quantity = Integer.parseInt(Quantity.getText());
             
             if(Size.getSelectedItem().equals("Medium")){
                SubPrice = SnMprice3 * quantity;
                AddinCart();
             
             }else if(Size.getSelectedItem().equals("Large")){
                SubPrice = SnLprice3 * quantity;
                  AddinCart();
                
             }else if(Size.getSelectedItem().equals("Small")){
                SubPrice = price3 * quantity;
                 AddinCart();
                
             }
        }

        ClearOption();

    }

    // Size
    public void SizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassActionPerformed
        if(Mealoption.getSelectedItem().equals("Beverage")){
            if(Size.getSelectedItem().equals("Medium")){
                BeMprice2 = 3;
                    
                }else if (Size.getSelectedItem().equals("Large")){
                BeLprice2 = 4;
                    
                }else if(Size.getSelectedItem().equals("Small")){
                price2 = 2;
                 }
                
        }else if(Mealoption.getSelectedItem().equals("Meals")){
                  if(Size.getSelectedItem().equals("Medium")){
                      MeMprice1= 9;
                      
                 }else if (Size.getSelectedItem().equals("Large")){
                      MeLprice1 = 10;
                      
                 }else if(Size.getSelectedItem().equals("Small")){
                     price1 = 8;
                 }
                  
            }else if(Mealoption.getSelectedItem().equals("Snack")){
                  if(Size.getSelectedItem().equals("Medium")){
                      SnMprice3 = 6;
                      
                 }else if (Size.getSelectedItem().equals("Large")){
                      SnLprice3 = 7;
                      
                 }else if(Size.getSelectedItem().equals("Small")){
                     price3 = 5;
                 }
            }
        }

    // Add in Cart
    public void AddinCart(){
        cp.dtm.addRow(new Object[] {FoodTF.getText(),Size.getSelectedItem().toString(),Quantity.getText(),SubPrice});
        JOptionPane.showMessageDialog(null, "Add Success");   
    }

    // Clear the option when customer add success
    public void ClearOption() {
        Mealoption.setSelectedItem("Choose Your Meal");
        Beverage.removeAllItems();
        FoodTF.setText("Name");
        Size.setSelectedItem("Choose Your Size");
        Quantity.setText("");
    }

    // Combobox change
     private void BeverageItemStateChanged(ItemEvent evt) {    
      try{
        if(Mealoption.getSelectedItem().equals("Beverage")){
            if(Beverage.getSelectedItem().equals("B01")){
                FoodTF.setText("Coca Cola");

            }
            else if(Beverage.getSelectedItem().equals("B02")){
                FoodTF.setText("Mountain Dew");
            }
            else if(Beverage.getSelectedItem().equals("B03")){
                    FoodTF.setText("Sprite");
            }
}

        else if(Mealoption.getSelectedItem().equals("Meals")){
            if(Beverage.getSelectedItem().equals("M01")){
                FoodTF.setText("Chicken Burger");
            }
            else if(Beverage.getSelectedItem().equals("M02")){
                FoodTF.setText("Cheese Burger");
            }
            else if(Beverage.getSelectedItem().equals("M03")){
                FoodTF.setText("Beef Burger");
            }
            else if(Beverage.getSelectedItem().equals("M04")){
                FoodTF.setText("Pepperoni Pizza");
            }
            else if(Beverage.getSelectedItem().equals("M05")){
                FoodTF.setText("Fried Chicken");
            }
            else if(Beverage.getSelectedItem().equals("M06")){
                FoodTF.setText("Spaghetti");
            }
        }
            else  if(Mealoption.getSelectedItem().equals("Snack")){
                if(Beverage.getSelectedItem().equals("S01")){
                    FoodTF.setText("Chicken Nuggets");
                }
                else if(Beverage.getSelectedItem().equals("S02")){
                    FoodTF.setText("Cheese Potato");
                }
                else if(Beverage.getSelectedItem().equals("S03")){
                    FoodTF.setText("French Fries");
                }
                }
        }catch(Exception e){
        }
    }

       private void QuantityKeyTyped(java.awt.event.KeyEvent evt) {                              
            char c = evt.getKeyChar();
            if(!Character.isDigit(c)){
                evt.consume();
            }
        }                             

    // Declare
    private JPanel jPanel4;
    private JLabel jLabel8;
    private JLabel jLabel9; 
    private JLabel jLabel10;

    public JComboBox<String> Beverage;
    private JButton CartButton;
    public JComboBox<String> Size;
    public JTextField FoodTF;
    private JPanel Login;
    public JComboBox<String> Mealoption;
    private JTable MealTable;
    private JPanel SelectPanel;
    public JTextField Quantity;
    private JTabbedPane Table;
    private JButton Logout;
    private JButton Cart;
    private JLabel HeaderLabel;
    private JLabel FoodID;
    private javax.swing.JLabel LoginStatus;
    private JLabel SizeLabel;
    private JLabel LogoLabel;
    private JLabel QuantityLabel;
    private JPanel PagePanel;
    private JPanel MenuTabPanel;
    private JPanel Header;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JScrollPane jScrollPane5;
    private JScrollPane jScrollPane6;
    private JScrollPane jScrollPane7;
    private JTable SnackTable;
    private JTable BeverageTable;
    private JTextField StatusLabel;
   
    
    public int quantity;
    public int price1;
    public int price2;
    public int price3;
    public int BeMprice2;
    public int BeLprice2;
    public int MeMprice1;
    public int MeLprice1;
    public int SnMprice3;
    public int SnLprice3;
    public int SubPrice;
    public int TotalAmount = 0;
    
    public int MeMtotal ;
    public int MeLtotal ;
    public int MeStotal;
    
    public int BeMtotal;
    public int BeLtotal;
    public int BeStotal;
    
    public int SnMtotal ;
    public int SnLtotal ;
    public int SnStotal;
}
