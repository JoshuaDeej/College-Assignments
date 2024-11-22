package Programming_In_Java_COP2800_3.Module_11.Hands_On_Project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTVDownload extends JFrame implements ActionListener {
    private JComboBox<String> showComboBox;
    private JLabel synopsisLabel;
    private String[] shows = {"Breaking Bad", "Game of Thrones", "Stranger Things", "The Office", "Friends"};
    private String[] synopses = {
            "A high school chemistry teacher turned methamphetamine producer.",
            "Nine noble families fight for control over the lands of Westeros.",
            "A group of kids in the 1980s uncover a dark secret in their small town.",
            "A mockumentary on a group of typical office workers.",
            "Follows the personal and professional lives of six twenty to thirty-something-year-old friends."
    };

    public JTVDownload() {
        setTitle("TV Show Downloader");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        showComboBox = new JComboBox<>(shows);
        showComboBox.setEditable(true);
        showComboBox.addActionListener(this);
        add(showComboBox);

        synopsisLabel = new JLabel("Select a show to see the synopsis.");
        add(synopsisLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedShow = (String) showComboBox.getSelectedItem();
        boolean found = false;

        for (int i = 0; i < shows.length; i++) {
            if (shows[i].equals(selectedShow)) {
                synopsisLabel.setText(synopses[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(this, "Show not available", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTVDownload().setVisible(true);
            }
        });
    }
}
