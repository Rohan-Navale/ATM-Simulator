import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;

public class FastCash extends JFrame implements ActionListener {
    JButton withdraw,mini,balance,exit,dep,cash,change;
    JButton one,four,seven,star,two,five,eight,zero,three,six,nine,hashtag,cancel,clear,enter,back;
    String pin;
    FastCash(String pinNumber){
        pin = pinNumber;
        setLayout(null);
        setLayout(null);
        setUndecorated(false);
        setVisible(true);
        setSize(900,850);
        setLocation(300,0);
        setTitle("ATM Interface");
        getContentPane().setBackground(new Color(12,19,79));

        ImageIcon originalIcon = new ImageIcon(ClassLoader.getSystemResource("icons/EASE Bank LOGO.png"));
        Image originalImage = originalIcon.getImage();
        int width = 162;
        int height = 44;
        Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel label = new JLabel(scaledIcon);
        label.setBounds(352, 12, width, height);
        add(label);

        JLabel Text2 = new JLabel("Select Withdrawal Amount");
        Text2.setBounds(280,100,500,33);
        Text2.setFont(new Font("Raleway", Font.BOLD,28));
        Text2.setForeground(Color.WHITE);
        add(Text2);

        withdraw = new JButton("100");
        withdraw.setBounds(554,169,300,60);
        withdraw.setBackground(new Color(19,105,245));
        withdraw.setFont(new Font("Raleway",Font.BOLD,22));
        withdraw.setForeground(Color.WHITE);
        withdraw.addActionListener(this);
        add(withdraw);

        mini = new JButton("500");
        mini.setBounds(554,249,300,60);
        mini.setBackground(new Color(19,105,245));
        mini.setFont(new Font("Raleway",Font.BOLD,22));
        mini.setForeground(Color.WHITE);
        mini.addActionListener(this);
        add(mini);

        balance = new JButton("1000");
        balance.setBounds(554,329,300,60);
        balance.setBackground(new Color(19,105,245));
        balance.setFont(new Font("Raleway",Font.BOLD,22));
        balance.setForeground(Color.WHITE);
        balance.addActionListener(this);
        add(balance);

        exit = new JButton("Back");
        exit.setBounds(554,409,300,60);
        exit.setBackground(new Color(19,105,245));
        exit.setFont(new Font("Raleway",Font.BOLD,22));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);

        dep = new JButton("2000");
        dep.setBounds(30,169,300,60);
        dep.setBackground(new Color(19,105,245));
        dep.setFont(new Font("Raleway",Font.BOLD,22));
        dep.setForeground(Color.WHITE);
        dep.addActionListener(this);
        add(dep);

        cash = new JButton("5000");
        cash.setBounds(30,249,300,60);
        cash.setBackground(new Color(19,105,245));
        cash.setFont(new Font("Raleway",Font.BOLD,22));
        cash.setForeground(Color.WHITE);
        cash.addActionListener(this);
        add(cash);

        change = new JButton("10000");
        change.setBounds(30,329,300,60);
        change.setBackground(new Color(19,105,245));
        change.setFont(new Font("Raleway",Font.BOLD,22));
        change.setForeground(Color.WHITE);
        change.addActionListener(this);
        add(change);

        one = new JButton("1");
        one.setForeground(Color.BLACK);
        one.setFont(new Font("Raleway", Font.BOLD,20));
        one.setBackground(Color.white);
        one.setBounds(242,505,88,60);
        one.addActionListener(this);
        add(one);

        four = new JButton("4");
        four.setForeground(Color.BLACK);
        four.setFont(new Font("Raleway", Font.BOLD,20));
        four.setBackground(Color.white);
        four.setBounds(242,575,88,60);
        four.addActionListener(this);
        add(four);

        seven = new JButton("7");
        seven.setForeground(Color.BLACK);
        seven.setFont(new Font("Raleway", Font.BOLD,20));
        seven.setBackground(Color.white);
        seven.setBounds(242,645,88,60);
        seven.addActionListener(this);
        add(seven);

        two = new JButton("2");
        two.setForeground(Color.BLACK);
        two.setFont(new Font("Raleway", Font.BOLD,20));
        two.setBackground(Color.white);
        two.setBounds(340,505,88,60);
        two.addActionListener(this);
        add(two);

        five = new JButton("5");
        five.setForeground(Color.BLACK);
        five.setFont(new Font("Raleway", Font.BOLD,20));
        five.setBackground(Color.white);
        five.setBounds(340,575,88,60);
        five.addActionListener(this);
        add(five);

        eight = new JButton("8");
        eight.setForeground(Color.BLACK);
        eight.setFont(new Font("Raleway", Font.BOLD,20));
        eight.setBackground(Color.white);
        eight.setBounds(340,645,88,60);
        eight.addActionListener(this);
        add(eight);

        zero = new JButton("0");
        zero.setForeground(Color.BLACK);
        zero.setFont(new Font("Raleway", Font.BOLD,20));
        zero.setBackground(Color.white);
        zero.setBounds(340,715,88,60);
        zero.addActionListener(this);
        add(zero);

        three = new JButton("3");
        three.setForeground(Color.BLACK);
        three.setFont(new Font("Raleway", Font.BOLD,20));
        three.setBackground(Color.white);
        three.setBounds(440,505,88,60);
        three.addActionListener(this);
        add(three);

        six = new JButton("6");
        six.setForeground(Color.BLACK);
        six.setFont(new Font("Raleway", Font.BOLD,20));
        six.setBackground(Color.white);
        six.setBounds(440,575,88,60);
        six.addActionListener(this);
        add(six);

        nine = new JButton("9");
        nine.setForeground(Color.BLACK);
        nine.setFont(new Font("Raleway", Font.BOLD,20));
        nine.setBackground(Color.white);
        nine.setBounds(440,645,88,60);
        nine.addActionListener(this);
        add(nine);

        cancel = new JButton("Cancel");
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(new Color(255,87,0));
        cancel.setFont(new Font("Raleway", Font.BOLD,20));
        cancel.addActionListener(this);
        cancel.setBounds(540,505,120,60);
        add(cancel);

        clear = new JButton("Clear");
        clear.setForeground(Color.WHITE);
        clear.setFont(new Font("Raleway", Font.BOLD,20));
        clear.setBackground(new Color(151,71,255));
        clear.addActionListener(this);
        clear.setBounds(540,575,120,60);
        add(clear);

        enter = new JButton("Enter");
        enter.setForeground(Color.WHITE);
        enter.setFont(new Font("Raleway", Font.BOLD,20));
        enter.setBackground(new Color(133,193,13));
        enter.setBounds(540,645,120,60);
        enter.addActionListener(this);
        add(enter);

        JPanel rectangle = new JPanel();
        rectangle.setBounds(10,10,867,483);
        rectangle.setBackground(new Color(11,58,151));
        add(rectangle);

    }
    public static void main(String[] args){
        new FastCash("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==exit){
            setVisible(false);
            new Trans(pin).setVisible(true);
        }
        if(ae.getSource()==cancel){
            JOptionPane.showMessageDialog(null,"You have been logged out successfully");
            System.exit(0);
        }
        String buttonText = ((JButton)ae.getSource()).getText();
        String amount = buttonText.replaceAll("\\D", ""); // Remove all non-digit character
        Conn conn =new Conn();
        try{
            ResultSet rs = conn.s.executeQuery("SELECT * FROM bank WHERE pin='"+pin+"'");
            int balance = 0 ;
            while (rs.next()){
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }

            if (balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null,"Insufficient Balance");
                setVisible(false);
                new Trans(pin).setVisible(true);
                return;
            }

            Date date = new Date();
            String query="insert into bank values('"+pin+"','"+date+"','Withdrawl','"+amount+"')";
            conn.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Rs."+amount+" Debited Successfully");

            setVisible(false);
            new Trans(pin).setVisible(true);
        }  catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}






