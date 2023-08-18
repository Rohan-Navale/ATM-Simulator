import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BalanceEnquiry extends JFrame implements ActionListener {
    JTextField textField;
    JButton one,two,three,four,five,six,seven,eight,nine,zero,star,hashtag, goback;
    String PIN;
    BalanceEnquiry(String pin){

        PIN=pin;

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
        int height = 70;
        Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel label = new JLabel(scaledIcon);
        label.setBounds(352, 30, width, height);
        add(label);

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
        four.addActionListener(e -> appendToTextField(one.getText()));
        add(four);

        seven = new JButton("7");
        seven.setForeground(Color.BLACK);
        seven.setFont(new Font("Raleway", Font.BOLD,20));
        seven.setBackground(Color.white);
        seven.setBounds(242,645,88,60);
        seven.addActionListener(e -> appendToTextField(one.getText()));
        add(seven);

        star = new JButton("*");
        star.setForeground(Color.BLACK);
        star.setFont(new Font("Raleway", Font.BOLD,20));
        star.setBackground(Color.white);
        star.setBounds(242,715,88,60);
        star.addActionListener(e -> appendToTextField(one.getText()));
        add(star);

        two = new JButton("2");
        two.setForeground(Color.BLACK);
        two.setFont(new Font("Raleway", Font.BOLD,20));
        two.setBackground(Color.white);
        two.setBounds(340,505,88,60);
        two.addActionListener(e -> appendToTextField(one.getText()));
        add(two);

        five = new JButton("5");
        five.setForeground(Color.BLACK);
        five.setFont(new Font("Raleway", Font.BOLD,20));
        five.setBackground(Color.white);
        five.setBounds(340,575,88,60);
        five.addActionListener(e -> appendToTextField(one.getText()));
        add(five);

        eight = new JButton("8");
        eight.setForeground(Color.BLACK);
        eight.setFont(new Font("Raleway", Font.BOLD,20));
        eight.setBackground(Color.white);
        eight.setBounds(340,645,88,60);
        eight.addActionListener(e -> appendToTextField(one.getText()));
        add(eight);

        zero = new JButton("0");
        zero.setForeground(Color.BLACK);
        zero.setFont(new Font("Raleway", Font.BOLD,20));
        zero.setBackground(Color.white);
        zero.setBounds(340,715,88,60);
        zero.addActionListener(e -> appendToTextField(one.getText()));
        add(zero);

        three = new JButton("3");
        three.setForeground(Color.BLACK);
        three.setFont(new Font("Raleway", Font.BOLD,20));
        three.setBackground(Color.white);
        three.setBounds(440,505,88,60);
        three.addActionListener(e -> appendToTextField(one.getText()));
        add(three);

        six = new JButton("6");
        six.setForeground(Color.BLACK);
        six.setFont(new Font("Raleway", Font.BOLD,20));
        six.setBackground(Color.white);
        six.setBounds(440,575,88,60);
        six.addActionListener(e -> appendToTextField(one.getText()));
        add(six);

        nine = new JButton("9");
        nine.setForeground(Color.BLACK);
        nine.setFont(new Font("Raleway", Font.BOLD,20));
        nine.setBackground(Color.white);
        nine.setBounds(440,645,88,60);
        nine.addActionListener(e -> appendToTextField(one.getText()));
        add(nine);

        hashtag = new JButton("#");
        hashtag.setForeground(Color.BLACK);
        hashtag.setFont(new Font("Raleway", Font.BOLD,20));
        hashtag.setBackground(Color.white);
        hashtag.setBounds(440,715,88,60);
        hashtag.addActionListener(e -> appendToTextField(one.getText()));
        add(hashtag);

        JButton cancel = new JButton("Cancel");
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(new Color(255,87,0));
        cancel.setFont(new Font("Raleway", Font.BOLD,20));
        cancel.setBounds(540,505,120,60);
        add(cancel);

        JButton clear = new JButton("Clear");
        clear.setForeground(Color.WHITE);
        clear.setFont(new Font("Raleway", Font.BOLD,20));
        clear.setBackground(new Color(19,105,245));
        clear.setBounds(540,575,120,60);
        add(clear);

        JButton enter = new JButton("Enter");
        enter.setForeground(Color.WHITE);
        enter.setFont(new Font("Raleway", Font.BOLD,20));
        enter.setBackground(new Color(133,193,13));
        enter.setBounds(540,645,120,60);
        add(enter);

    }
    private void appendToTextField(String text) {
        textField.setText(textField.getText() + text);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {

    }
    public static void main(String[] args){
        new BalanceEnquiry("");
    }


}