import java.awt.*;
import javax.swing.*;

class TicTacToe extends JFrame{
    
    private JButton B0 = new JButton();
    private JButton B1 = new JButton();
    private JButton B2 = new JButton();
    private JButton B3 = new JButton();
    private JButton B4 = new JButton();
    private JButton B5 = new JButton();
    private JButton B6 = new JButton();
    private JButton B7 = new JButton();
    private JButton B8 = new JButton();
    
    public TicTacToe(){
        setTitle("TicTacToe-GAME");
        setSize(600,780);
        setLayout(new GridLayout(2,0));
        JPanel bp1 = new JPanel(new GridLayout(1,0));
        JLabel L1   = new JLabel("Let Play TicTacToe-GAME ");
        JPanel bp2 = new JPanel(new GridLayout(3,3,10,10));
        JPanel bp3 = new JPanel();
        JPanel bp4 = new JPanel(new GridLayout(3,2));
        JPanel bp5 = new JPanel(new GridLayout(1,0));
        JButton reset = new JButton("RESET");
        JLabel player1 = new JLabel("Player1(X):");
        JTextField Tpy1 = new JTextField(" ",30);
        JLabel player2 = new JLabel("Player2(O):");
        JTextField Tpy2 = new JTextField(" ",30);
       
        bp2.add(B0);
        bp2.add(B1);
        bp2.add(B2);
        bp2.add(B3);
        bp2.add(B4);
        bp2.add(B5);
        bp2.add(B6);
        bp2.add(B7);
        bp2.add(B8);
        bp2.setBackground(Color.blue);
        bp3.add(reset,BorderLayout.PAGE_START); 
        bp4.add(player1,BorderLayout.LINE_START);
        bp4.add(player2,BorderLayout.LINE_START);
        bp4.add(Tpy1,BorderLayout.CENTER);
        bp4.add(Tpy2,BorderLayout.LINE_END);
        bp4.add(bp1,BorderLayout.CENTER);
        bp1.add(L1,BorderLayout.PAGE_END);
        bp3.add(bp4);
        add(bp2);
        add(bp3);
        ImageIcon icon = new ImageIcon("GAME.png");
        JLabel label = new JLabel(icon);
        bp5.add(label,BorderLayout.CENTER);
        bp5.setBackground(Color.lightGray);
        bp4.setBackground(Color.lightGray);
        bp1.setBackground(Color.lightGray);
        bp3.setBackground(Color.lightGray);
        bp3.add(bp5);
        setResizable(false);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
   
}