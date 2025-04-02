import javax.swing.*;
// import javax.swing.JFrame;

public class button {
    public static void main(String[] args) {
        JFrame jf = new JFrame("My frame");
        JButton jb = new JButton("click");
        jb.setBounds(100, 120,100,50 );
        jf.add(jb);
        jf.setSize(500,500);

jf.setLayout(null);
jf.setVisible(true);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
