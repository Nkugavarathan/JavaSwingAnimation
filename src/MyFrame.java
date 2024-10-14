import javax.swing.*;

public class MyFrame extends JFrame {
    MyPanel panel;

    MyFrame() {
        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel); // Add the panel to the frame (default layout)
        this.pack(); // Automatically size the frame to fit the panel
        this.setLocationRelativeTo(null); // Center the frame on the screen
        this.setVisible(true); // Make the frame visible
    }
}
