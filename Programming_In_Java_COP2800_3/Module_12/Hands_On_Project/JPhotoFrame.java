package Programming_In_Java_COP2800_3.Module_12.Hands_On_Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPhotoFrame extends JFrame implements ActionListener {
    private JRadioButton onePerson, twoOrMore, pet;
    private JCheckBox onLocation;
    private JTextArea result;
    private JButton calculate;

    public JPhotoFrame() {
        setTitle("Paula's Portraits Price Calculator");
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(0, 1));

        onePerson = new JRadioButton("One Person ($40)");
        twoOrMore = new JRadioButton("Two or More People ($75)");
        pet = new JRadioButton("Pet ($95)");

        ButtonGroup group = new ButtonGroup();
        group.add(onePerson);
        group.add(twoOrMore);
        group.add(pet);

        panel.add(onePerson);
        panel.add(twoOrMore);
        panel.add(pet);

        onLocation = new JCheckBox("On Location (+$90)");
        panel.add(onLocation);

        add(panel, BorderLayout.CENTER);

        calculate = new JButton("Calculate Price");
        calculate.addActionListener(this);
        add(calculate, BorderLayout.SOUTH);

        result = new JTextArea();
        result.setEditable(false);
        add(new JScrollPane(result), BorderLayout.NORTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int basePrice = 0;
        if (onePerson.isSelected()) basePrice = 40;
        else if (twoOrMore.isSelected()) basePrice = 75;
        else if (pet.isSelected()) basePrice = 95;

        if (onLocation.isSelected()) basePrice += 90;

        result.setText("Total Price: $" + basePrice);
    }

    public static void main(String[] args) {
        new JPhotoFrame();
    }
}
