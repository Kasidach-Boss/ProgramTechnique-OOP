import java.awt.*;
import javax.swing.*;


class TemperatureConverter extends JFrame{
    private JLabel Label1 = new JLabel("Celsius:");
    private JTextField Field1 = new JTextField("0",25);
    private JLabel Label2 = new JLabel("Fahrenheit:");
    private JTextField Field2 = new JTextField("0",25);
    private JPanel panel = new JPanel();
    TemperatureConverter(){
        setTitle("TemperatureConverter");
        setSize(300,80);
        setLayout(new GridLayout(2,2));
        add(Label1);
        add(Field1);
        add(Label2);
        add(Field2);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}