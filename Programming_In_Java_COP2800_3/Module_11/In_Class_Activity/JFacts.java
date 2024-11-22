package Programming_In_Java_COP2800_3.Module_11.In_Class_Activity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JFacts {
    private static int index = 0;
    private static String[] facts = {
            "The sun is over 300,000 times larger than Earth.",
            "There are more stars in the universe than grains of sand on Earth.",
            "A day on Venus is longer than a year on Venus.",
            "Neutron stars can spin at a rate of 600 rotations per second.",
            "A single teaspoon of a neutron star would weigh about a billion tons.",
            "Jupiter's Great Red Spot is a giant storm that has been raging for at least 400 years."
    };

    public static void main(String[] args) {
        JFrame frame = new JFrame("Space Facts");
        JButton button = new JButton("Next Fact");
        ArrayList<JLabel> labels = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            labels.add(new JLabel(facts[i]));
        }

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                JLabel newLabel = new JLabel(facts[index % facts.length]);
                index++;
                labels.set(index % labels.size(), newLabel);
                for (JLabel label : labels) {
                    frame.add(label);
                }
                frame.add(button);
                frame.revalidate();
                frame.repaint();
            }
        });

        frame.setLayout(new java.awt.FlowLayout());
        for (JLabel label : labels) {
            frame.add(label);
        }
        frame.add(button);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
