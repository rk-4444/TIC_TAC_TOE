package TTTGame;
import static java.awt.Color.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TTTvsComp extends javax.swing.JFrame implements ActionListener {

    JButton btBack;
    int num=1,over=0;
    JLabel lbBack;

    void setBackGround() {
        lb1.setForeground(GREEN);
        bt1.setBackground(black);
        bt2.setBackground(black);
        bt3.setBackground(black);
        bt4.setBackground(black);
        bt5.setBackground(black);
        bt6.setBackground(black);
        bt7.setBackground(black);
        bt8.setBackground(black);
        bt9.setBackground(black);
    }
    public TTTvsComp() {
        initComponents();
        setSize(1365,700);
        btBack = new JButton("Back");
        lbBack = new JLabel();

        lbBack.setBounds(0,0,1365,700);
        lb1.setBounds(400,10,650,100);
        lb1.setText("Play with Computer");
        lb1.setFont(new Font("Serif",Font.PLAIN, 55));
        bt1.setBounds(500,200,80,60);
        bt2.setBounds(580,200,80,60);
        bt3.setBounds(660,200,80,60);
        bt4.setBounds(500,260,80,60);
        bt5.setBounds(580,260,80,60);
        bt6.setBounds(660,260,80,60);
        bt7.setBounds(500,320,80,60);
        bt8.setBounds(580,320,80,60);
        bt9.setBounds(660,320,80,60);
        btBack.setBounds(0,0,70,30);
        setLocationRelativeTo(null);
        setBackGround();

        add(lbBack);
        ImageIcon i =new ImageIcon("src/pictures/img1.jpeg");
        Image img = i.getImage().getScaledInstance(lbBack.getWidth(),lbBack.getHeight(), Image.SCALE_SMOOTH);
        i=new ImageIcon(img);
        lbBack.setIcon(i);

        lbBack.add(btBack);

        btBack.addActionListener(this);
    }

    boolean checkWin() {

        if(num%2==0) {
            if(bt1.getText()=="X" && bt2.getText()=="X" && bt3.getText()=="X") return true;
            if(bt1.getText()=="X" && bt5.getText()=="X" && bt9.getText()=="X") return true;
            if(bt1.getText()=="X" && bt4.getText()=="X" && bt7.getText()=="X") return true;
            if(bt2.getText()=="X" && bt5.getText()=="X" && bt8.getText()=="X") return true;
            if(bt3.getText()=="X" && bt5.getText()=="X" && bt7.getText()=="X") return true;
            if(bt3.getText()=="X" && bt6.getText()=="X" && bt9.getText()=="X") return true;
            if(bt4.getText()=="X" && bt5.getText()=="X" && bt6.getText()=="X") return true;
            if(bt7.getText()=="X" && bt8.getText()=="X" && bt9.getText()=="X") return true;
        }
        else {
            if(bt1.getText()=="O" && bt2.getText()=="O" && bt3.getText()=="O") return true;
            if(bt1.getText()=="O" && bt5.getText()=="O" && bt9.getText()=="O") return true;
            if(bt1.getText()=="O" && bt4.getText()=="O" && bt7.getText()=="O") return true;
            if(bt2.getText()=="O" && bt5.getText()=="O" && bt8.getText()=="O") return true;
            if(bt3.getText()=="O" && bt5.getText()=="O" && bt7.getText()=="O") return true;
            if(bt3.getText()=="O" && bt6.getText()=="O" && bt9.getText()=="O") return true;
            if(bt4.getText()=="O" && bt5.getText()=="O" && bt6.getText()=="O") return true;
            if(bt7.getText()=="O" && bt8.getText()=="O" && bt9.getText()=="O") return true;
        }
        return false;
    }

    boolean Attack(JButton bt) {

        if(bt1.getText()=="X" && bt2.getText()=="X" && bt3.isEnabled()) {
            bt3.setText("X");
            bt3.setEnabled(false);
            return true;
        }
        else if(bt1.getText()=="X" && bt3.getText()=="X" && bt2.isEnabled()) {
            bt2.setText("X");
            bt2.setEnabled(false);
            return true;
        }
        else if(bt2.getText()=="X" && bt3.getText()=="X" && bt1.isEnabled()) {
            bt1.setText("X");
            bt1.setEnabled(false);
            return true;
        }
        else if(bt1.getText()=="X" && bt5.getText()=="X" && bt9.isEnabled()) {
            bt9.setText("X");
            bt9.setEnabled(false);
            return true;
        }
        else if(bt1.getText()=="X" && bt9.getText()=="X" && bt5.isEnabled()) {
            bt5.setText("X");
            bt5.setEnabled(false);
            return true;
        }
        else if(bt5.getText()=="X" && bt9.getText()=="X" && bt1.isEnabled()) {
            bt1.setText("X");
            bt1.setEnabled(false);
            return true;
        }
        else if(bt1.getText()=="X" && bt4.getText()=="X" && bt7.isEnabled()) {
            bt7.setText("X");
            bt7.setEnabled(false);
            return true;
        }
        else if(bt1.getText()=="X" && bt7.getText()=="X" && bt4.isEnabled()) {
            bt4.setText("X");
            bt4.setEnabled(false);
            return true;
        }
        else if(bt4.getText()=="X" && bt7.getText()=="X" && bt1.isEnabled()) {
            bt1.setText("X");
            bt1.setEnabled(false);
            return true;
        }
        else if(bt2.getText()=="X" && bt5.getText()=="X" && bt8.isEnabled()) {
            bt8.setText("X");
            bt8.setEnabled(false);
            return true;
        }
        else if(bt2.getText()=="X" && bt8.getText()=="X" && bt5.isEnabled()) {
            bt5.setText("X");
            bt5.setEnabled(false);
            return true;
        }
        else if(bt5.getText()=="X" && bt8.getText()=="X" && bt2.isEnabled()) {
            bt2.setText("X");
            bt2.setEnabled(false);
            return true;
        }
        else if(bt3.getText()=="X" && bt5.getText()=="X" && bt7.isEnabled()) {
            bt7.setText("X");
            bt7.setEnabled(false);
            return true;
        }
        else if(bt3.getText()=="X" && bt7.getText()=="X" && bt5.isEnabled()) {
            bt5.setText("X");
            bt5.setEnabled(false);
            return true;
        }
        else if(bt5.getText()=="X" && bt7.getText()=="X" && bt3.isEnabled()) {
            bt3.setText("X");
            bt3.setEnabled(false);
            return true;
        }
        else if(bt3.getText()=="X" && bt6.getText()=="X" && bt9.isEnabled()) {
            bt9.setText("X");
            bt9.setEnabled(false);
            return true;
        }
        else if(bt3.getText()=="X" && bt9.getText()=="X" && bt6.isEnabled()) {
            bt6.setText("X");
            bt6.setEnabled(false);
            return true;
        }
        else if(bt6.getText()=="X" && bt9.getText()=="X" && bt3.isEnabled()) {
            bt3.setText("X");
            bt3.setEnabled(false);
            return true;
        }
        else if(bt4.getText()=="X" && bt5.getText()=="X" && bt6.isEnabled()) {
            bt6.setText("X");
            bt6.setEnabled(false);
            return true;
        }
        else if(bt4.getText()=="X" && bt6.getText()=="X" && bt5.isEnabled()) {
            bt5.setText("X");
            bt5.setEnabled(false);
            return true;
        }
        else if(bt5.getText()=="X" && bt6.getText()=="X" && bt4.isEnabled()) {
            bt4.setText("X");
            bt4.setEnabled(false);
            return true;
        }
        else if(bt7.getText()=="X" && bt8.getText()=="X" && bt9.isEnabled()) {
            bt9.setText("X");
            bt9.setEnabled(false);
            return true;
        }
        else if(bt7.getText()=="X" && bt9.getText()=="X" && bt8.isEnabled()) {
            bt8.setText("X");
            bt8.setEnabled(false);
            return true;
        }
        else if(bt8.getText()=="X" && bt9.getText()=="X" && bt7.isEnabled()) {
            bt7.setText("X");
            bt7.setEnabled(false);
            return true;
        }
        return false;
    }

    void Defence (JButton bt) {
        if(bt==bt1) {
            if(bt2.getText()=="O" && bt3.isEnabled()) {
                bt3.setText("X");
                bt3.setEnabled(false);
            }
            else if(bt3.getText()=="O" && bt2.isEnabled()) {
                bt2.setText("X");
                bt2.setEnabled(false);
            }
            else if(bt5.getText()=="O" && bt9.isEnabled()) {
                bt9.setText("X");
                bt9.setEnabled(false);
            }
            else if(bt9.getText()=="O" && bt5.isEnabled()) {
                bt5.setText("X");
                bt5.setEnabled(false);
            }
            else if(bt4.getText()=="O" && bt7.isEnabled()) {
                bt7.setText("X");
                bt7.setEnabled(false);
            }
            else if(bt7.getText()=="O" && bt4.isEnabled()) {
                bt4.setText("X");
                bt4.setEnabled(false);
            }
            else {
                if(bt6.isEnabled()) {
                    bt6.setText("X");
                    bt6.setEnabled(false);
                }
                else if(bt8.isEnabled()) {
                    bt8.setText("X");
                    bt8.setEnabled(false);
                }
            }
        }

        else if(bt==bt2) {
            if(bt1.getText()=="O" && bt3.isEnabled()) {
                bt3.setText("X");
                bt3.setEnabled(false);
            }
            else if(bt3.getText()=="O" && bt1.isEnabled()) {
                bt1.setText("X");
                bt1.setEnabled(false);
            }
            else if(bt5.getText()=="O" && bt8.isEnabled()) {
                bt8.setText("X");
                bt8.setEnabled(false);
            }
            else if(bt8.getText()=="O" && bt5.isEnabled()) {
                bt5.setText("X");
                bt5.setEnabled(false);
            }
            else {
                if(bt4.isEnabled()) {
                    bt4.setText("X");
                    bt4.setEnabled(false);
                }
                else if(bt6.isEnabled()) {
                    bt6.setText("X");
                    bt6.setEnabled(false);
                }
                else if(bt7.isEnabled()) {
                    bt7.setText("X");
                    bt7.setEnabled(false);
                }
                else if(bt9.isEnabled()) {
                    bt9.setText("X");
                    bt9.setEnabled(false);
                }
            }
        }

        else if(bt==bt3) {
            if(bt1.getText()=="O" && bt2.isEnabled()) {
                bt2.setText("X");
                bt2.setEnabled(false);
            }
            else if(bt2.getText()=="O" && bt1.isEnabled()) {
                bt1.setText("X");
                bt1.setEnabled(false);
            }
            else if(bt5.getText()=="O" && bt7.isEnabled()) {
                bt7.setText("X");
                bt7.setEnabled(false);
            }
            else if(bt7.getText()=="O" && bt5.isEnabled()) {
                bt5.setText("X");
                bt5.setEnabled(false);
            }
            else if(bt6.getText()=="O"&& bt9.isEnabled()) {
                bt9.setText("X");
                bt9.setEnabled(false);
            }
            else if(bt9.getText()=="O" && bt6.isEnabled()) {
                bt6.setText("X");
                bt6.setEnabled(false);
            }
            else {
                if(bt4.isEnabled()) {
                    bt4.setText("X");
                    bt4.setEnabled(false);
                }
                else if(bt8.isEnabled()) {
                    bt8.setText("X");
                    bt8.setEnabled(false);
                }
            }
        }

        else if(bt==bt4) {
            if(bt1.getText()=="O" && bt7.isEnabled()) {
                bt7.setText("X");
                bt7.setEnabled(false);
            }
            else if(bt7.getText()=="O" && bt1.isEnabled()) {
                bt1.setText("X");
                bt1.setEnabled(false);
            }
            else if(bt5.getText()=="O" && bt6.isEnabled()) {
                bt6.setText("X");
                bt6.setEnabled(false);
            }
            else if(bt6.getText()=="O" && bt5.isEnabled()) {
                bt5.setText("X");
                bt5.setEnabled(false);
            }
            else {
                if(bt2.isEnabled()) {
                    bt2.setText("X");
                    bt2.setEnabled(false);
                }
                else if(bt3.isEnabled()) {
                    bt3.setText("X");
                    bt3.setEnabled(false);
                }
                else if(bt8.isEnabled()) {
                    bt8.setText("X");
                    bt8.setEnabled(false);
                }
                else if(bt9.isEnabled()) {
                    bt9.setText("X");
                    bt9.setEnabled(false);
                }
            }
        }

        else if(bt==bt5) {
            if(bt2.getText()=="O" && bt8.isEnabled()) {
                bt8.setText("X");
                bt8.setEnabled(false);
            }
            else if(bt8.getText()=="O" && bt2.isEnabled()) {
                bt2.setText("X");
                bt2.setEnabled(false);
            }
            else if(bt4.getText()=="O" && bt6.isEnabled()) {
                bt6.setText("X");
                bt6.setEnabled(false);
            }
            else if(bt6.getText()=="O" && bt4.isEnabled()) {
                bt4.setText("X");
                bt4.setEnabled(false);
            }
            else {
                if(bt1.isEnabled()) {
                    bt1.setText("X");
                    bt1.setEnabled(false);
                }
                else if(bt3.isEnabled()) {
                    bt3.setText("X");
                    bt3.setEnabled(false);
                }
                else if(bt7.isEnabled()) {
                    bt7.setText("X");
                    bt7.setEnabled(false);
                }
                else if(bt9.isEnabled()) {
                    bt9.setText("X");
                    bt9.setEnabled(false);
                }
            }
        }

        else if(bt==bt6) {
            if(bt9.getText()=="O" && bt3.isEnabled()) {
                bt3.setText("X");
                bt3.setEnabled(false);
            }
            else if(bt3.getText()=="O" && bt9.isEnabled()) {
                bt9.setText("X");
                bt9.setEnabled(false);
            }
            else if(bt5.getText()=="O" && bt4.isEnabled()) {
                bt4.setText("X");
                bt4.setEnabled(false);
            }
            else if(bt4.getText()=="O" && bt5.isEnabled()) {
                bt5.setText("X");
                bt5.setEnabled(false);
            }
            else {
                if(bt1.isEnabled()) {
                    bt1.setText("X");
                    bt1.setEnabled(false);
                }
                else if(bt2.isEnabled()) {
                    bt2.setText("X");
                    bt2.setEnabled(false);
                }
                else if(bt7.isEnabled()) {
                    bt7.setText("X");
                    bt7.setEnabled(false);
                }
                else if(bt8.isEnabled()) {
                    bt8.setText("X");
                    bt8.setEnabled(false);
                }
            }
        }

        else if(bt==bt7) {
            if(bt1.getText()=="O" && bt4.isEnabled()) {
                bt4.setText("X");
                bt4.setEnabled(false);
            }
            else if(bt4.getText()=="O" && bt1.isEnabled()) {
                bt1.setText("X");
                bt1.setEnabled(false);
            }
            else if(bt5.getText()=="O" && bt3.isEnabled()) {
                bt3.setText("X");
                bt3.setEnabled(false);
            }
            else if(bt3.getText()=="O" && bt5.isEnabled()) {
                bt5.setText("X");
                bt5.setEnabled(false);
            }
            else if(bt8.getText()=="O" && bt9.isEnabled()) {
                bt9.setText("X");
                bt9.setEnabled(false);
            }
            else if(bt9.getText()=="O" && bt8.isEnabled()) {
                bt8.setText("X");
                bt8.setEnabled(false);
            }
            else {
                if(bt2.isEnabled()) {
                    bt2.setText("X");
                    bt2.setEnabled(false);
                }
                else if(bt6.isEnabled()) {
                    bt6.setText("X");
                    bt6.setEnabled(false);
                }
            }
        }

        else if(bt==bt8) {
            if(bt9.getText()=="O" && bt7.isEnabled()) {
                bt7.setText("X");
                bt7.setEnabled(false);
            }
            else if(bt7.getText()=="O" && bt9.isEnabled()) {
                bt9.setText("X");
                bt9.setEnabled(false);
            }
            else if(bt5.getText()=="O" && bt2.isEnabled()) {
                bt2.setText("X");
                bt2.setEnabled(false);
            }
            else if(bt2.getText()=="O" && bt5.isEnabled()) {
                bt5.setText("X");
                bt5.setEnabled(false);
            }
            else {
                if(bt1.isEnabled()) {
                    bt1.setText("X");
                    bt1.setEnabled(false);
                }
                else if(bt3.isEnabled()) {
                    bt3.setText("X");
                    bt3.setEnabled(false);
                }
                else if(bt4.isEnabled()) {
                    bt4.setText("X");
                    bt4.setEnabled(false);
                }
                else if(bt6.isEnabled()) {
                    bt6.setText("X");
                    bt6.setEnabled(false);
                }
            }
        }

        else if(bt==bt9) {
            if(bt1.getText()=="O" && bt5.isEnabled()) {
                bt5.setText("X");
                bt5.setEnabled(false);
            }
            else if(bt5.getText()=="O" && bt1.isEnabled()) {
                bt1.setText("X");
                bt1.setEnabled(false);
            }
            else if(bt6.getText()=="O" && bt3.isEnabled()) {
                bt3.setText("X");
                bt3.setEnabled(false);
            }
            else if(bt3.getText()=="O" && bt6.isEnabled()) {
                bt6.setText("X");
                bt6.setEnabled(false);
            }
            else if(bt8.getText()=="O" && bt7.isEnabled()) {
                bt7.setText("X");
                bt7.setEnabled(false);
            }
            else if(bt7.getText()=="O" && bt8.isEnabled()) {
                bt8.setText("X");
                bt8.setEnabled(false);
            }
            else {
                if(bt3.isEnabled()) {
                    bt3.setText("X");
                    bt3.setEnabled(false);
                }
                else if(bt2.isEnabled()) {
                    bt2.setText("X");
                    bt2.setEnabled(false);
                }
                else if(bt4.isEnabled()) {
                    bt4.setText("X");
                    bt4.setEnabled(false);
                }
            }
        }
    }

    void checkPlace(JButton bt) {

        if(Attack(bt)==false) {
            Defence(bt);
        }
    }

    void fun(JButton bt) {

        if(bt.isEnabled()) {
            bt.setForeground(green);
            if(num==1) {
                bt.setText("O");
                bt.setEnabled(false);
                thread();
                if(bt5.getText()=="") {
                    bt5.setText("X");
                    bt5.setEnabled(false);
                }
                else {
                    bt1.setText("X");
                    bt1.setEnabled(false);
                }
                num+=2;
            }
            else if(num<=9) {
                bt.setForeground(GREEN);
                bt.setText("O");
                bt.setEnabled(false);

                if(checkWin()) {
                    JOptionPane.showMessageDialog(this,"You Win","Result",JOptionPane.INFORMATION_MESSAGE);
                    ++over;
                }
                thread();
                ++num;
                boolean bts[] = new boolean[9];
                bts[0]=bt1.isEnabled();
                bts[1]=bt2.isEnabled();
                bts[2]=bt3.isEnabled();
                bts[3]=bt4.isEnabled();
                bts[4]=bt5.isEnabled();
                bts[5]=bt6.isEnabled();
                bts[6]=bt7.isEnabled();
                bts[7]=bt8.isEnabled();
                bts[8]=bt9.isEnabled();
                checkPlace(bt);
                if(over==0) {
                    if(bt1.isEnabled()!=bts[0]) {
                        bt1.setEnabled(true);
                        bt1.setForeground(red);
                        bt1.setEnabled(false);
                    }

                    if(bt2.isEnabled()!=bts[1]) {
                        bt2.setEnabled(true);
                        bt2.setForeground(red);
                        bt2.setEnabled(false);
                    }
                    if(bt3.isEnabled()!=bts[2])  {
                        bt3.setEnabled(true);
                        bt3.setForeground(red);
                        bt3.setEnabled(false);
                    }
                    if(bt4.isEnabled()!=bts[3]) {
                        bt4.setEnabled(true);
                        bt4.setForeground(red);
                        bt4.setEnabled(false);
                    }
                    if(bt5.isEnabled()!=bts[4]) {
                        bt5.setEnabled(true);
                        bt5.setForeground(red);
                        bt5.setEnabled(false);
                    }
                    if(bt6.isEnabled()!=bts[5]) {
                        bt6.setEnabled(true);
                        bt6.setForeground(red);
                        bt6.setEnabled(false);
                    }
                    if(bt7.isEnabled()!=bts[6]) {
                        bt7.setEnabled(true);
                        bt7.setForeground(red);
                        bt7.setEnabled(false);
                    }
                    if(bt8.isEnabled()!=bts[7]) {
                        bt8.setEnabled(true);
                        bt8.setForeground(red);
                        bt8.setEnabled(false);
                    }
                    if(bt9.isEnabled()!=bts[8]) {
                        bt9.setEnabled(true);
                        bt9.setForeground(red);
                        bt9.setEnabled(false);
                    }
                }
                if(over==0 && checkWin()) {
                    JOptionPane.showMessageDialog(this,"You Lose","Result",JOptionPane.INFORMATION_MESSAGE);
                    ++over;
                }
                ++num;
            }
            if(num>9) {
                if(over==0) JOptionPane.showMessageDialog(this,"Match Drawn","Result",JOptionPane.INFORMATION_MESSAGE);
                ++over;
            }
        }
        if(over>0) {
            bt1.setEnabled(true);
            bt2.setEnabled(true);
            bt3.setEnabled(true);
            bt4.setEnabled(true);
            bt5.setEnabled(true);
            bt6.setEnabled(true);
            bt7.setEnabled(true);
            bt8.setEnabled(true);
            bt9.setEnabled(true);

            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");

            setBackGround();
            over=0;
            num=1;
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        bt9 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setText("TIC TAC TOE");
        getContentPane().add(lb1);
        lb1.setBounds(200, 10, 150, 50);

        bt9.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        bt9.setForeground(new java.awt.Color(255, 0, 51));
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });
        getContentPane().add(bt9);
        bt9.setBounds(280, 180, 60, 40);

        bt1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        bt1.setForeground(new java.awt.Color(255, 0, 51));
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(160, 100, 60, 40);

        bt2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        bt2.setForeground(new java.awt.Color(255, 0, 51));
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(220, 100, 60, 40);

        bt3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        bt3.setForeground(new java.awt.Color(255, 0, 51));
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3);
        bt3.setBounds(280, 100, 60, 40);

        bt6.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        bt6.setForeground(new java.awt.Color(255, 0, 51));
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        getContentPane().add(bt6);
        bt6.setBounds(280, 140, 60, 40);

        bt4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        bt4.setForeground(new java.awt.Color(255, 0, 51));
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        getContentPane().add(bt4);
        bt4.setBounds(160, 140, 60, 40);

        bt8.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        bt8.setForeground(new java.awt.Color(255, 0, 51));
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        getContentPane().add(bt8);
        bt8.setBounds(220, 180, 60, 40);

        bt7.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        bt7.setForeground(new java.awt.Color(255, 0, 51));
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        getContentPane().add(bt7);
        bt7.setBounds(160, 180, 60, 40);

        bt5.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        bt5.setForeground(new java.awt.Color(255, 0, 51));
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        getContentPane().add(bt5);
        bt5.setBounds(220, 140, 60, 40);

        pack();
    }// </editor-fold>
    void thread () {
        try {
            Thread.sleep(1000);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {
        fun(bt1);
    }

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {
        fun(bt2);
    }

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {
        fun(bt3);
    }

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {
        fun(bt4);
    }

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {
        fun(bt5);
    }

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {
        fun(bt6);
    }

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {
        fun(bt7);
    }

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {
        fun(bt8);
    }

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {
        fun(bt9);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TTTvsComp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JLabel lb1;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btBack) {
            TTTHome obj = new TTTHome();
            dispose();
            obj.setVisible(true);
        }
    }
    // End of variables declaration
}
