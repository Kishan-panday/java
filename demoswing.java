import java.awt.*;
import javax.swing.*;

class DemoSwing {
    public static void main(String[] args) {
        JFrame jf = new JFrame("MyFrame");
        JButton jb = new JButton("Click");
        jb.setBounds(100, 100, 50, 50);
        jf.add(jb);
        jf.setSize(500, 500);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}