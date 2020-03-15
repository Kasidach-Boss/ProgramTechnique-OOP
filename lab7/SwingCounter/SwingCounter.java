import javax.swing.*;
import java.awt.*;
class SwingCounter extends JFrame{
    private JLabel _Label = new JLabel("count");
    private JButton _Button = new JButton("count");
    private JTextField _Field = new JTextField("0",30);
    SwingCounter(){
        setTitle("SwingCounter");
        setSize(600,300);
        setLayout(new FlowLayout());
        add(_Label);
        add(_Field);
        add(_Button);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}