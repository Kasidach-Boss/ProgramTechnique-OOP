import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SwingCounter extends JFrame {
    private JLabel _Label = new JLabel("count");
    private JButton _Button = new JButton("count");
    private JTextField _Field = new JTextField("-",30);
    private int count = 0;
    SwingCounter(){
        setTitle("SwingCounter");
        setSize(600,300);
        setLayout(new FlowLayout());
        add(_Label);
        add(_Field);
        add(_Button);
        _Button.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==_Button){
                    _Field.setText(String.valueOf(count));
                    System.out.println(count++);
                }  
            }
        });
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}