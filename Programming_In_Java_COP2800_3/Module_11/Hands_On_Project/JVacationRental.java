package Programming_In_Java_COP2800_3.Module_11.Hands_On_Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JVacationRental extends JFrame implements ActionListener {
    private JRadioButton parkside, poolside, lakeside;
    private JRadioButton oneBedroom, twoBedrooms, threeBedrooms;
    private JCheckBox mealsIncluded;
    private JLabel priceLabel;
    private ButtonGroup locationGroup, bedroomGroup;

    public JVacationRental() {
        setTitle("Lambert’s Vacation Rentals");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 1));

        // Location selection
        JPanel locationPanel = new JPanel();
        locationPanel.setLayout(new GridLayout(1, 3));
        parkside = new JRadioButton("Parkside ($600)");
        poolside = new JRadioButton("Poolside ($750)");
        lakeside = new JRadioButton("Lakeside ($825)");
        locationGroup = new ButtonGroup();
        locationGroup.add(parkside);
        locationGroup.add(poolside);
        locationGroup.add(lakeside);
        locationPanel.add(parkside);
        locationPanel.add(poolside);
        locationPanel.add(lakeside);
        add(locationPanel);

        // Bedroom selection
        JPanel bedroomPanel = new JPanel();
        bedroomPanel.setLayout(new GridLayout(1, 3));
        oneBedroom = new JRadioButton("1 Bedroom");
        twoBedrooms = new JRadioButton("2 Bedrooms (+$75)");
        threeBedrooms = new JRadioButton("3 Bedrooms (+$150)");
        bedroomGroup = new ButtonGroup();
        bedroomGroup.add(oneBedroom);
        bedroomGroup.add(twoBedrooms);
        bedroomGroup.add(threeBedrooms);
        bedroomPanel.add(oneBedroom);
        bedroomPanel.add(twoBedrooms);
        bedroomPanel.add(threeBedrooms);
        add(bedroomPanel);

        // Meals inclusion
        mealsIncluded = new JCheckBox("Meals included (+$200)");
        add(mealsIncluded);

        // Calculate button
        JButton calculateButton = new JButton("Calculate Price");
        calculateButton.addActionListener(this);
        add(calculateButton);

        // Price display
        priceLabel = new JLabel("Total Price: $0");
        add(priceLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int basePrice = 0;

        if (parkside.isSelected()) basePrice = 600;
        else if (poolside.isSelected()) basePrice = 750;
        else if (lakeside.isSelected()) basePrice = 825;

        if (twoBedrooms.isSelected()) basePrice += 75;
        else if (threeBedrooms.isSelected()) basePrice += 150;

        if (mealsIncluded.isSelected()) basePrice += 200;

        priceLabel.setText("Total Price: $" + basePrice);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JVacationRental().setVisible(true);
            }
        });
    }
}
