package Programming_In_Java_COP2800_3.Module_11.In_Class_Activity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButtonExtended {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Disable Button After Eight Clicks");
        JButton button = new JButton("Click me!");
        JLabel label = new JLabel("");
        int[] clickCount = {0}; // Using an array to hold click count, so it can be accessed from ActionListener

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount[0]++;
                if (clickCount[0] >= 8) {
                    button.setEnabled(false);
                    label.setText("That's enough!");
                }
            }
        });

        frame.setLayout(new java.awt.FlowLayout()); // Setting layout manager
        frame.add(button);
        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
