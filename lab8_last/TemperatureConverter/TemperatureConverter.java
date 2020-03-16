import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class TemperatureConverter extends JFrame implements ActionListener{
    private JLabel Label1 = new JLabel("Celsius:");
    private JTextField CField = new JTextField("0",25);
    private JLabel Label2 = new JLabel("Fahrenheit:");
    private JTextField FField = new JTextField("0",25);
    private JPanel panel = new JPanel();
     
    TemperatureConverter(){
        setTitle("TemperatureConverter");
        setSize(300,80);
        setLayout(new GridLayout(2,2));
        add(Label1);
        add(CField);
        add(Label2);
        add(FField);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        CField.addActionListener(this);
        FField.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        double c= Double.parseDouble(CField.getText());
        double f= Double.parseDouble(FField.getText());
        if (e.getSource() == CField){
            double C = (f-32.0)/1.8;
            String TC = String.valueOf(C);
            CField.setText(TC);
            System.out.println(TC);
            
        }
       if(e.getSource() == FField){
            double F = (c+32.0)*1.8;
            String TF = String.valueOf(F);
            FField.setText(TF);
            System.out.println(TF);
            
            
        }

    }   
}