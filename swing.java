import javax.swing.*;

class sw extends JFrame {
    sw(){
setTitle("this is main menu");
 setLayout(null);
 setVisible(true);
 setSize(100,100);
 add(b);

    }

}
class bu extends JButton{
    bu(){
        setActionCommand("click");
        setBounds(100,100,50,50);

    }
}
class swing{
public static void main(String[] args) {
    sw s = new sw();
   bu b = new bu();
}
}
