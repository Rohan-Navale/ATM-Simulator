import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import static java.lang.System.exit;

public class Deposit extends JFrame implements ActionListener {
    JTextField textField;
    JButton one,two,three,four,five,six,seven,eight,nine,zero,star,hashtag, cancel, back,clear, enter,deposit,goback;
    String PIN;
    Deposit(String pinNumber){

        PIN=pinNumber;

        setLayout(null);
        setLayout(null);
        setVisible(true);
        setSize(900,850);
        setLocation(300,0);
        setTitle("ATM Interface");
        getContentPane().setBackground(new Color(12,19,79));

        ImageIcon originalIcon = new ImageIcon(ClassLoader.getSystemResource("icons/EASE Bank LOGO.png"));
        Image originalImage = originalIcon.getImage();
        int width = 200;
        int height = 50;
        Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel label = new JLabel(scaledIcon);
        label.setBounds(20, 20, width, height);
        add(label);

        JLabel text1 = new JLabel("Enter the amount to deposit");
        text1.setBounds(210,100,600,50);
        text1.setForeground(Color.WHITE);
        text1.setFont(new Font("Roboto", Font.BOLD,35));
        add(text1);

        JLabel text2 = new JLabel("Rs. ");
        text2.setBounds(280,191,100,50);
        text2.setForeground(Color.WHITE);
        text2.setFont(new Font("Roboto", Font.BOLD,30));
        add(text2);

        textField = new JTextField();
        textField.setFont(new Font("Roboto", Font.BOLD,30));
        textField.setForeground(Color.WHITE);
        //textField.setBorder(null);
        textField.setBounds(330, 191, 250, 50); // Adjust the bounds as needed
        textField.setBackground(new Color(11,58,151));
        add(textField);

        deposit = new JButton("Deposit");
        deposit.setForeground(Color.DARK_GRAY);
        deposit.setBackground(Color.white);
        deposit.setFont(new Font("Raleway",Font.BOLD,20));
        deposit.setBounds(600,353,258,50);
        deposit.addActionListener(this);
        add(deposit);

        goback = new JButton("Back");
        goback.setForeground(Color.DARK_GRAY);
        goback.setBackground(Color.white);
        goback.setFont(new Font("Raleway",Font.BOLD,20));
        goback.setBounds(600,413,258,50);
        goback.addActionListener(this);
        add(goback);

        JPanel rectangle = new JPanel();
        rectangle.setBounds(10,10,867,483);
        rectangle.setBackground(new Color(11,58,151));
        add(rectangle);

        one = new JButton("1");
        one.setForeground(Color.BLACK);
        one.setFont(new Font("Raleway", Font.BOLD,20));
        one.setBackground(Color.white);
        one.setBounds(242,505,88,60);
        one.addActionListener(e -> appendToTextField(one.getText()));
        add(one);

        four = new JButton("4");
        four.setForeground(Color.BLACK);
        four.setFont(new Font("Raleway", Font.BOLD,20));
        four.setBackground(Color.white);
        four.setBounds(242,575,88,60);
        four.addActionListener(e -> appendToTextField(four.getText()));
        add(four);

        seven = new JButton("7");
        seven.setForeground(Color.BLACK);
        seven.setFont(new Font("Raleway", Font.BOLD,20));
        seven.setBackground(Color.white);
        seven.setBounds(242,645,88,60);
        seven.addActionListener(e -> appendToTextField(seven.getText()));
        add(seven);

//        star = new JButton("*");
//        star.setForeground(Color.BLACK);
//        star.setFont(new Font("Raleway", Font.BOLD,20));
//        star.setBackground(Color.white);
//        star.setBounds(242,715,88,60);
//        star.addActionListener(e -> appendToTextField(star.getText()));
//        add(star);

        two = new JButton("2");
        two.setForeground(Color.BLACK);
        two.setFont(new Font("Raleway", Font.BOLD,20));
        two.setBackground(Color.white);
        two.setBounds(340,505,88,60);
        two.addActionListener(e -> appendToTextField(two.getText()));
        add(two);

        five = new JButton("5");
        five.setForeground(Color.BLACK);
        five.setFont(new Font("Raleway", Font.BOLD,20));
        five.setBackground(Color.white);
        five.setBounds(340,575,88,60);
        five.addActionListener(e -> appendToTextField(five.getText()));
        add(five);

        eight = new JButton("8");
        eight.setForeground(Color.BLACK);
        eight.setFont(new Font("Raleway", Font.BOLD,20));
        eight.setBackground(Color.white);
        eight.setBounds(340,645,88,60);
        eight.addActionListener(e -> appendToTextField(eight.getText()));
        add(eight);

        zero = new JButton("0");
        zero.setForeground(Color.BLACK);
        zero.setFont(new Font("Raleway", Font.BOLD,20));
        zero.setBackground(Color.white);
        zero.setBounds(340,715,88,60);
        zero.addActionListener(e -> appendToTextField(zero.getText()));
        add(zero);

        three = new JButton("3");
        three.setForeground(Color.BLACK);
        three.setFont(new Font("Raleway", Font.BOLD,20));
        three.setBackground(Color.white);
        three.setBounds(440,505,88,60);
        three.addActionListener(e -> appendToTextField(three.getText()));
        add(three);

        six = new JButton("6");
        six.setForeground(Color.BLACK);
        six.setFont(new Font("Raleway", Font.BOLD,20));
        six.setBackground(Color.white);
        six.setBounds(440,575,88,60);
        six.addActionListener(e -> appendToTextField(six.getText()));
        add(six);

        nine = new JButton("9");
        nine.setForeground(Color.BLACK);
        nine.setFont(new Font("Raleway", Font.BOLD,20));
        nine.setBackground(Color.white);
        nine.setBounds(440,645,88,60);
        nine.addActionListener(e -> appendToTextField(nine.getText()));
        add(nine);

//        hashtag = new JButton("#");
//        hashtag.setForeground(Color.BLACK);
//        hashtag.setFont(new Font("Raleway", Font.BOLD,20));
//        hashtag.setBackground(Color.white);
//        hashtag.setBounds(440,715,88,60);
//        hashtag.addActionListener(e -> appendToTextField(one.getText()));
//        add(hashtag);

        cancel = new JButton("Cancel");
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(new Color(255,87,0));
        cancel.setFont(new Font("Raleway", Font.BOLD,20));
        cancel.addActionListener(this);
        cancel.setBounds(540,505,120,60);
        add(cancel);

//        back = new JButton("Back");
//        back.setForeground(Color.WHITE);
//        back.setFont(new Font("Raleway", Font.BOLD,20));
//        back.setBackground(new Color(19,105,245));
//        back.addActionListener(this);
//        back.setBounds(540,575,120,60);
//        add(back);

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




    }

    private void appendToTextField(String text) {
        textField.setText(textField.getText() + text);
    }
    public static void main(String[] args){
        new Deposit("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==clear){
            textField.setText("");
        }
        if (ae.getSource()==cancel){
            JOptionPane.showMessageDialog(null,"Your Transaction was canceled");
            System.exit(1);
        }
        if (ae.getSource()==back || ae.getSource()==goback){
            setVisible(false);
            new Trans("").setVisible(true);
        }
        if(ae.getSource()==deposit || ae.getSource()==enter){
            String amount = textField.getText();
            Date date = new Date();
            if(amount.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the amount");
            } else {
                Conn conn = new Conn();
                String query = "insert into  bank values('"+PIN+"', '" + date +"','Deposit','"+amount+"')";
                try{
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Amount "+ amount+" was successfully added");
                    System.exit(1);
                } catch (Exception e){
                    System.out.println(e);
                }

            }
        }
    }
}
