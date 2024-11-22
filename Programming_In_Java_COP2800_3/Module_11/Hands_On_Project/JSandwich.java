package Programming_In_Java_COP2800_3.Module_11.Hands_On_Project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JSandwich extends JFrame implements ActionListener {
    private JList<String> mainIngredientList;
    private JList<String> breadTypeList;
    private JLabel priceLabel;

    private String[] mainIngredients = {"Chicken ($5)", "Beef ($7)", "Vegetarian ($4)"};
    private String[] breadTypes = {"White", "Rye", "Whole Grain"};
    private double[] mainIngredientPrices = {5.0, 7.0, 4.0};

    public JSandwich() {
        setTitle("Sublime Sandwich Shop");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        mainIngredientList = new JList<>(mainIngredients);
        mainIngredientList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(mainIngredientList));

        breadTypeList = new JList<>(breadTypes);
        breadTypeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(breadTypeList));

        JButton calculateButton = new JButton("Calculate Price");
        calculateButton.addActionListener(this);
        add(calculateButton);

        priceLabel = new JLabel("Total Price: $0.00");
        add(priceLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int mainIngredientIndex = mainIngredientList.getSelectedIndex();
        double price = 0.0;

        if (mainIngredientIndex >= 0) {
            price = mainIngredientPrices[mainIngredientIndex];
        }

        priceLabel.setText("Total Price: $" + String.format("%.2f", price));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JSandwich().setVisible(true);
            }
        });
    }
}
