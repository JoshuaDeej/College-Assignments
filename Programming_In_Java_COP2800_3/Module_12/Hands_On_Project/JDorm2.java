package Programming_In_Java_COP2800_3.Module_12.Hands_On_Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDorm2 extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JCheckBox privateRoom, internet, cableTV, microwave, fridge;

    public JDorm2() {
        setTitle("Dormitory Options");
        setLayout(new BorderLayout());

        textArea = new JTextArea("Options not yet selected:\nPrivate Room\nInternet\nCable TV\nMicrowave\nFridge\n");
        textArea.setEditable(false);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel panel = new JPanel();
        privateRoom = new JCheckBox("Private Room");
        internet = new JCheckBox("Internet");
        cableTV = new JCheckBox("Cable TV");
        microwave = new JCheckBox("Microwave");
        fridge = new JCheckBox("Fridge");

        panel.add(privateRoom);
        panel.add(internet);
        panel.add(cableTV);
        panel.add(microwave);
        panel.add(fridge);

        add(panel, BorderLayout.SOUTH);

        privateRoom.addActionListener(this);
        internet.addActionListener(this);
        cableTV.addActionListener(this);
        microwave.addActionListener(this);
        fridge.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        StringBuilder message = new StringBuilder();
        if (privateRoom.isSelected()) message.append("Private Room selected\n");
        if (internet.isSelected()) message.append("Internet selected\n");
        if (cableTV.isSelected()) message.append("Cable TV selected\n");
        if (microwave.isSelected()) message.append("Microwave selected\n");
        if (fridge.isSelected()) message.append("Fridge selected\n");
        textArea.setText(message.toString());
    }

    public static void main(String[] args) {
        new JDorm2();
    }
}
