package Programming_In_Java_COP2800_3.Module_11.Hands_On_Project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote extends JFrame {
    private JLabel quoteLabel;
    private JButton showTitleButton;

    public JBookQuote() {
        setTitle("Book Quote");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        quoteLabel = new JLabel("<html>“It was the best of times, it was the worst of times...”</html>");
        add(quoteLabel);

        showTitleButton = new JButton("Show Book Title");
        add(showTitleButton);

        showTitleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JBookQuote.this, "A Tale of Two Cities by Charles Dickens");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JBookQuote().setVisible(true);
            }
        });
    }
}
