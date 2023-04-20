package TTTGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static java.awt.Color.GREEN;

public class TTTvsPlayer extends JFrame implements ActionListener{
    JLabel lb1,pl1,pl2,turn,currentPlayer,lbBack;
    JButton bt11,bt12,bt13,bt21,bt22,bt23,bt31,bt32,bt33,btBack;
    int turns=0,over=0;

    TTTvsPlayer() {
        setLayout(null);
        setSize(1365, 700);
        setLocationRelativeTo(null);
        setVisible(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        lbBack = new JLabel();
        lb1=new JLabel("Play with Friend");
        pl1=new JLabel("Player 1 : 'o'");
        pl2=new JLabel("Player 2 : 'x'");
        turn=new JLabel("Turn for : ");
        currentPlayer=new JLabel("o");
        bt11=new JButton();
        bt12=new JButton();
        bt13=new JButton();
        bt21=new JButton();
        bt22=new JButton();
        bt23=new JButton();
        bt31=new JButton();
        bt32=new JButton();
        bt33=new JButton();
        btBack = new JButton("Back");


        lbBack.setBounds(0, 0, 1365, 700);
        add(lbBack);
        ImageIcon i1 = new ImageIcon("src/pictures/img1.jpeg");
        Image img = i1.getImage().getScaledInstance(lbBack.getWidth(), lbBack.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        lbBack.setIcon(i2);


        lb1.setBounds(450, 50, 500, 50);
        pl1.setBounds(150, 110, 150, 40);
        pl2.setBounds(150, 155, 150, 40);

        bt11.setBounds(550,180,80,60);
        bt12.setBounds(630,180,80,60);
        bt13.setBounds(710,180,80,60);
        bt21.setBounds(550,240,80,60);
        bt22.setBounds(630,240,80,60);
        bt23.setBounds(710,240,80,60);
        bt31.setBounds(550,300,80,60);
        bt32.setBounds(630,300,80,60);
        bt33.setBounds(710,300,80,60);
        turn.setBounds(820, 240, 120, 60);
        currentPlayer.setBounds(970, 240, 80, 60);
        btBack.setBounds(0,0,70,30);

        lb1.setBackground(Color.black);
        bt11.setBackground(Color.black);
        bt12.setBackground(Color.black);
        bt13.setBackground(Color.black);
        bt21.setBackground(Color.black);
        bt22.setBackground(Color.black);
        bt23.setBackground(Color.black);
        bt31.setBackground(Color.black);
        bt32.setBackground(Color.black);
        bt33.setBackground(Color.black);
        turn.setForeground(Color.white);
        lb1.setForeground(Color.GREEN);
        pl1.setForeground(Color.GREEN);
        pl2.setForeground(Color.RED);
        currentPlayer.setForeground(GREEN);


        lb1.setFont(new Font("Serif",Font.PLAIN, 50));
        pl1.setFont(new Font("Serif",Font.PLAIN, 18));
        pl2.setFont(new Font("Serif",Font.PLAIN, 18));
        turn.setFont(new Font("Serif",Font.BOLD, 19));
        currentPlayer.setFont(new Font("Serif",Font.BOLD, 40));
        bt11.setFont(new Font("Serif",Font.PLAIN, 50));
        bt12.setFont(new Font("Serif",Font.PLAIN, 50));
        bt13.setFont(new Font("Serif",Font.PLAIN, 50));
        bt21.setFont(new Font("Serif",Font.PLAIN, 50));
        bt22.setFont(new Font("Serif",Font.PLAIN, 50));
        bt23.setFont(new Font("Serif",Font.PLAIN, 50));
        bt31.setFont(new Font("Serif",Font.PLAIN, 50));
        bt32.setFont(new Font("Serif",Font.PLAIN, 50));
        bt33.setFont(new Font("Serif",Font.PLAIN, 50));

        lbBack.add(lb1);
        lbBack.add(pl1);
        lbBack.add(pl2);
        lbBack.add(bt11);
        lbBack.add(bt12);
        lbBack.add(bt13);
        lbBack.add(bt21);
        lbBack.add(bt22);
        lbBack.add(bt23);
        lbBack.add(bt31);
        lbBack.add(bt32);
        lbBack.add(bt33);
        lbBack.add(turn);
        lbBack.add(currentPlayer);
        lbBack.add(btBack);



        bt11.addActionListener(this);
        bt12.addActionListener(this);
        bt13.addActionListener(this);
        bt21.addActionListener(this);
        bt22.addActionListener(this);
        bt23.addActionListener(this);
        bt31.addActionListener(this);
        bt32.addActionListener(this);
        bt33.addActionListener(this);
        btBack.addActionListener(this);

    }
    void fun(JButton b) {

        if(b.getText().equals("o") || b.getText().equals("x")) return;
        ++turns;
        if(turns%2==1) {
            b.setForeground(Color.green);
            b.setText("o");
            currentPlayer.setText("x");
            currentPlayer.setForeground(Color.RED);
        }
        else{
            b.setText("x");
            b.setForeground(Color.red);
            currentPlayer.setText("o");
            currentPlayer.setForeground(GREEN);
        }


        if( (!bt11.getText().equals("")) && bt11.getText().equals(bt12.getText()) && bt11.getText().equals(bt13.getText()) ) {

            if(bt11.getText().equals("o")) {
                JOptionPane.showMessageDialog(this,"Player 1 Won the match","Result",JOptionPane.INFORMATION_MESSAGE);
            }
            else JOptionPane.showMessageDialog(this,"Player 2 Won the match","Result",JOptionPane.INFORMATION_MESSAGE);
            ++over;
            return;
        }

        if( (!bt11.getText().equals("")) && bt11.getText().equals(bt21.getText()) && bt11.getText().equals(bt31.getText())) {
            if(bt11.getText().equals("o")) {
                JOptionPane.showMessageDialog(this,"Player 1 Won the match","Result",JOptionPane.INFORMATION_MESSAGE);
            }
            else JOptionPane.showMessageDialog(this,"Player 2 Won the match","Result",JOptionPane.INFORMATION_MESSAGE);
            ++over;
            return;
        }

        if( (!bt11.getText().equals("")) && bt11.getText().equals(bt22.getText()) && bt11.getText().equals(bt33.getText())) {

            if(bt11.getText().equals("o")) {
                JOptionPane.showMessageDialog(this,"Player 1 Won the match","Result",JOptionPane.INFORMATION_MESSAGE);
            }
            else JOptionPane.showMessageDialog(this,"Player 2 Won the match","Result",JOptionPane.INFORMATION_MESSAGE);
            ++over;
            return;
        }

        if( (!bt31.getText().equals("")) && bt31.getText().equals(bt22.getText()) && bt31.getText().equals(bt13.getText())) {

            if(bt31.getText().equals("o")) {
                JOptionPane.showMessageDialog(this,"Player 1 Won the match","Result",JOptionPane.INFORMATION_MESSAGE);
            }
            else JOptionPane.showMessageDialog(this,"Player 2 Won the match","Result",JOptionPane.INFORMATION_MESSAGE);
            ++over;
            return;
        }

        if( (!bt13.getText().equals("")) && bt13.getText().equals(bt23.getText()) && bt13.getText().equals(bt33.getText())) {

            if(bt13.getText().equals("o")) {
                JOptionPane.showMessageDialog(this,"Player 1 Won the match","Result",JOptionPane.INFORMATION_MESSAGE);
            }
            else JOptionPane.showMessageDialog(this,"Player 2 Won the match","Result",JOptionPane.INFORMATION_MESSAGE);
            ++over;
            return;
        }

        if( (!bt12.getText().equals("")) && bt12.getText().equals(bt22.getText()) && bt12.getText().equals(bt32.getText())) {

            if(bt12.getText().equals("o")) {
                JOptionPane.showMessageDialog(this,"Player 1 Won the match","Result",JOptionPane.INFORMATION_MESSAGE);
            }
            else JOptionPane.showMessageDialog(this,"Player 2 Won the match","Result",JOptionPane.INFORMATION_MESSAGE);
            ++over;
            return;
        }

        if( (!bt21.getText().equals("")) && bt21.getText().equals(bt22.getText()) && bt21.getText().equals(bt23.getText())) {

            if(bt21.getText().equals("o")) {
                JOptionPane.showMessageDialog(this,"Player 1 Won the match","Result",JOptionPane.INFORMATION_MESSAGE);
            }
            else JOptionPane.showMessageDialog(this,"Player 2 Won the match","Result",JOptionPane.INFORMATION_MESSAGE);
            ++over;
            return;
        }

        if( (!bt31.getText().equals("")) && bt31.getText().equals(bt32.getText()) && bt31.getText().equals(bt33.getText())) {

            if(bt31.getText().equals("o")) {
                JOptionPane.showMessageDialog(this,"Player 1 Won the match","Result",JOptionPane.INFORMATION_MESSAGE);
            }
            else JOptionPane.showMessageDialog(this,"Player 2 Won the match","Result",JOptionPane.INFORMATION_MESSAGE);
            ++over;
            return;
        }
        if(turns==9) {
            JOptionPane.showMessageDialog(this,"It's a tie!","Result",JOptionPane.INFORMATION_MESSAGE);
            ++over;
        }


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btBack) {
            TTTHome obj = new TTTHome();
            dispose();
            obj.setVisible(true);
        }
        if(e.getSource()==bt11) {
            fun(bt11);
        }
        if(e.getSource()==bt12) {
            fun(bt12);
        }
        if(e.getSource()==bt13) {
            fun(bt13);
        }
        if(e.getSource()==bt21) {
            fun(bt21);
        }
        if(e.getSource()==bt22) {
            fun(bt22);
        }
        if(e.getSource()==bt23) {
            fun(bt23);
        }
        if(e.getSource()==bt31) {
            fun(bt31);
        }
        if(e.getSource()==bt32) {
            fun(bt32);
        }
        if(e.getSource()==bt33) {
            fun(bt33);
        }

        if(over>0) {
            bt11.setText("");
            bt12.setText("");
            bt13.setText("");
            bt21.setText("");
            bt22.setText("");
            bt23.setText("");
            bt31.setText("");
            bt32.setText("");
            bt33.setText("");
            turns=0;
            over=0;
            currentPlayer.setText("o");
        }
    }



    public static void main(String []args) {

        TTTvsPlayer obj=new TTTvsPlayer();
    }


}
