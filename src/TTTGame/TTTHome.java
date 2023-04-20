package TTTGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.GREEN;

public class TTTHome extends JFrame implements ActionListener {

    JLabel lbBack,lb1;
    JButton bt1,bt2;
    TTTHome() {
        setSize(1365,700);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        lbBack = new JLabel();
        lb1 = new JLabel("TIC TAC TOE");
        bt1 = new JButton("With Friend");
        bt2 = new JButton("With Computer");

        lbBack.setBounds(0, 0, 1365, 700);
        lb1.setBounds(450, 10, 600, 100);
        bt1.setBounds(510, 280, 220, 40);
        bt2.setBounds(510, 350, 220, 40);


        lb1.setForeground(GREEN);
        lb1.setFont(new Font("Serif",Font.PLAIN, 50));

        ImageIcon i1 = new ImageIcon("src/pictures/img1.jpeg");
        Image img = i1.getImage().getScaledInstance(lbBack.getWidth(), lbBack.getHeight(), Image.SCALE_SMOOTH);
        i1 = new ImageIcon(img);
        lbBack.setIcon(i1);

        add(lbBack);
        lbBack.add(lb1);
        lbBack.add(bt1);
        lbBack.add(bt2);

        bt1.addActionListener(this);
        bt2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==bt1) {
            TTTvsPlayer obj = new TTTvsPlayer();
            dispose();
            obj.setVisible(true);
        }
        else {
            TTTvsComp obj = new TTTvsComp();
            dispose();
            obj.setVisible(true);
        }
    }

    public static void main(String[] args) {
        TTTHome obj = new TTTHome();
        obj.setVisible(true);
    }
}
