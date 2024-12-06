package Programming_In_Java_COP2800_3.Module_12.In_Class_Activity;

import javax.swing.*;
import java.awt.event.*;

public class JInsurance extends JFrame implements ItemListener {
    private JRadioButton hmoButton, ppoButton;
    private JCheckBox dentalBox, visionBox;
    private JTextField outputField;
    private ButtonGroup insuranceGroup;

    public JInsurance() {
        setLayout(null);

        hmoButton = new JRadioButton("HMO ($200)");
        hmoButton.setBounds(50, 50, 150, 30);
        hmoButton.addItemListener(this);

        ppoButton = new JRadioButton("PPO ($600)");
        ppoButton.setBounds(50, 100, 150, 30);
        ppoButton.addItemListener(this);

        dentalBox = new JCheckBox("Dental ($75)");
        dentalBox.setBounds(50, 150, 150, 30);
        dentalBox.addItemListener(this);

        visionBox = new JCheckBox("Vision ($20)");
        visionBox.setBounds(50, 200, 150, 30);
        visionBox.addItemListener(this);

        insuranceGroup = new ButtonGroup();
        insuranceGroup.add(hmoButton);
        insuranceGroup.add(ppoButton);

        add(hmoButton);
        add(ppoButton);
        add(dentalBox);
        add(visionBox);

        outputField = new JTextField();
        outputField.setBounds(50, 250, 200, 30);
        outputField.setEditable(false);
        add(outputField);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String output = "";

        if (hmoButton.isSelected()) {
            output = "HMO: $200";
        } else if (ppoButton.isSelected()) {
            output = "PPO: $600";
        }

        if (dentalBox.isSelected()) {
            output += ", Dental: $75";
        }
        if (visionBox.isSelected()) {
            output += ", Vision: $20";
        }

        outputField.setText(output);
        if (e.getStateChange() == ItemEvent.DESELECTED && e.getSource() instanceof JCheckBox) {
            outputField.setText("");
        }
    }

    public static void main(String[] args) {
        JInsurance frame = new JInsurance();
        frame.setTitle("Insurance Options");
        frame.setSize(300, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
