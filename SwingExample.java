import javax.swing.*;
import java.awt.event.*;

public class SwingExample implements ActionListener {
    private JFrame frame;
    private JButton button;
    public SwingExample() {
     
        frame = new JFrame("Swing Example with ActionListener");


        button = new JButton("Click Me!");
        button.setBounds(100, 100, 120, 40);

        button.addActionListener(this);

        frame.add(button);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(frame, "Button Clicked!");
        }
    }

    public static void main(String[] args) {
        new SwingExample();
    }
}
