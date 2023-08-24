import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FoodOrderingSystemGUI extends JFrame  {

  

   
  
    public static Object foodCollection;
    private JTable foodTable;
    private DefaultTableModel tableModel;
    private JButton orderButton;

    public FoodOrderingSystemGUI() {
        setTitle("Food Ordering System");
        setSize(600, 500); // Increased the height to accommodate the button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Item ID");
        tableModel.addColumn("Item Name");
        tableModel.addColumn("Price");

        foodTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(foodTable);

        orderButton = new JButton("Place Order"); 
         
        orderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             
                JOptionPane.showMessageDialog(FoodOrderingSystemGUI.this, "Order placed!");
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(orderButton);

        // Use BorderLayout to position the table at the center and the button at the bottom
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        populateTable();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void populateTable() {
      
        
           String[] type = { "Meal", "Beverage", "Snack" };


    // Add other food items to the collection

    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_ordering_system", "root", "")) {
        String query = "SELECT * FROM food"; // Modify this query based on your database schema

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String id = resultSet.getString("id"); // Replace with your column name
                String name = resultSet.getString("name"); // Replace with your column name
                double price = resultSet.getDouble("price"); // Replace with your column name
                String foodType = resultSet.getString("food_type"); // Replace with your column name
//   ArrayList<Food> foodCollection = new ArrayList<Food>();
//                 // Create appropriate Food objects based on the foodType and add them to foodCollection
//                 if (foodType.equals(type[0])) {
//                     foodCollection.add(new Meal(id, name, price, foodType));
//                 } else if (foodType.equals(type[1])) {
//                     foodCollection.add(new Beverage(id, name, price, foodType));
//                 } else if (foodType.equals(type[2])) {
//                     foodCollection.add(new Snack(id, name, price, foodType));
//                 }

                // You can also directly add the row to the table model here if needed
                tableModel.addRow(new Object[]{id, name, price});
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
        
    }



    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }
        SwingUtilities.invokeLater(() -> {
            new FoodOrderingSystemGUI();
        });
    }

    
    
   
}


