import java.awt.*;
import javax.swing.*;
class demolab{
    public static void main(String[] args) {
        JFrame jf = new JFrame ("my frame");
        JButton jb = new JButton ("click");
        jb.setBounds (100,120,50,50);
        jf.add(jb);
        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
    

