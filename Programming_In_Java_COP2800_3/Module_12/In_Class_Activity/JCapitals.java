package Programming_In_Java_COP2800_3.Module_12.In_Class_Activity;

import javax.swing.*;
import java.awt.event.*;

public class JCapitals extends JFrame implements ActionListener {
    private JComboBox<String> countryBox;
    private JLabel capitalLabel;
    private String[] countries = {"USA", "Canada", "UK", "Germany", "France", "Italy", "Japan"};
    private String[] capitals = {"Washington, D.C.", "Ottawa", "London", "Berlin", "Paris", "Rome", "Tokyo"};

    public JCapitals() {
        setLayout(null);

        countryBox = new JComboBox<>(countries);
        countryBox.setBounds(50, 50, 150, 30);
        countryBox.addActionListener(this);
        add(countryBox);

        capitalLabel = new JLabel("Capital City");
        capitalLabel.setBounds(50, 100, 150, 30);
        add(capitalLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedIndex = countryBox.getSelectedIndex();
        capitalLabel.setText(capitals[selectedIndex]);
    }

    public static void main(String[] args) {
        JCapitals frame = new JCapitals();
        frame.setTitle("Country Capitals");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
