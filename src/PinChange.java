import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class PinChange extends JFrame implements ActionListener {
    JTextField pinText, repinText;
    JButton one,two,three,four,five,six,seven,eight,nine,zero,cancel,clear,enter,deposit,goback;
    boolean isPinTextActive = true;
    PinChange(String pin){
        setLayout(null);
        setLayout(null);
        setVisible(true);
        setSize(900,850);
        setLocation(300,0);
        setTitle("ATM Interface");
        getContentPane().setBackground(new Color(12,19,79));





        JLabel text1 = new JLabel("CHANGE YOUR PIN");
        text1.setBounds(300,130,600,50);
        text1.setForeground(Color.WHITE);
        text1.setFont(new Font("Roboto", Font.BOLD,30));
        add(text1);

        JLabel text2 = new JLabel("Enter your New PIN:");
        text2.setBounds(190,214,600,50);
        text2.setForeground(Color.WHITE);
        text2.setFont(new Font("Roboto", Font.BOLD,26));
        add(text2);

        pinText = new JTextField();
        pinText.setFont(new Font("Roboto", Font.BOLD,18));
        pinText.setBounds(490, 214, 150, 40); // Adjust the bounds as needed
        pinText.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isPinTextActive = true;
            }
        });
        add(pinText);

        JLabel text3 = new JLabel("Re-enter your New PIN:");
        text3.setBounds(190,268,600,50);
        text3.setForeground(Color.WHITE);
        text3.setFont(new Font("Roboto", Font.BOLD,26));
        add(text3);

        repinText = new JTextField();
        repinText.setFont(new Font("Roboto", Font.BOLD,18));
        repinText.setBounds(490, 268, 150, 40); // Adjust the bounds as needed
        repinText.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isPinTextActive = false;
            }
        });
        add(repinText);



        deposit = new JButton("Change");
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
        one.addActionListener(e -> appendToActiveTextField(one.getText()));

        add(one);

        four = new JButton("4");
        four.setForeground(Color.BLACK);
        four.setFont(new Font("Raleway", Font.BOLD,20));
        four.setBackground(Color.white);
        four.setBounds(242,575,88,60);
        four.addActionListener(e -> appendToActiveTextField(four.getText()));
        add(four);

        seven = new JButton("7");
        seven.setForeground(Color.BLACK);
        seven.setFont(new Font("Raleway", Font.BOLD,20));
        seven.setBackground(Color.white);
        seven.setBounds(242,645,88,60);
        seven.addActionListener(e -> appendToActiveTextField(seven.getText()));
        add(seven);

        two = new JButton("2");
        two.setForeground(Color.BLACK);
        two.setFont(new Font("Raleway", Font.BOLD,20));
        two.setBackground(Color.white);
        two.setBounds(340,505,88,60);
        two.addActionListener(e -> appendToActiveTextField(two.getText()));
        add(two);

        five = new JButton("5");
        five.setForeground(Color.BLACK);
        five.setFont(new Font("Raleway", Font.BOLD,20));
        five.setBackground(Color.white);
        five.setBounds(340,575,88,60);
        five.addActionListener(e -> appendToActiveTextField(five.getText()));
        add(five);

        eight = new JButton("8");
        eight.setForeground(Color.BLACK);
        eight.setFont(new Font("Raleway", Font.BOLD,20));
        eight.setBackground(Color.white);
        eight.setBounds(340,645,88,60);
        eight.addActionListener(e -> appendToActiveTextField(eight.getText()));
        add(eight);

        zero = new JButton("0");
        zero.setForeground(Color.BLACK);
        zero.setFont(new Font("Raleway", Font.BOLD,20));
        zero.setBackground(Color.white);
        zero.setBounds(340,715,88,60);
        zero.addActionListener(e -> appendToActiveTextField(zero.getText()));
        add(zero);

        three = new JButton("3");
        three.setForeground(Color.BLACK);
        three.setFont(new Font("Raleway", Font.BOLD,20));
        three.setBackground(Color.white);
        three.setBounds(440,505,88,60);
        three.addActionListener(e -> appendToActiveTextField(three.getText()));
        add(three);

        six = new JButton("6");
        six.setForeground(Color.BLACK);
        six.setFont(new Font("Raleway", Font.BOLD,20));
        six.setBackground(Color.white);
        six.setBounds(440,575,88,60);
        six.addActionListener(e -> appendToActiveTextField(six.getText()));
        add(six);

        nine = new JButton("9");
        nine.setForeground(Color.BLACK);
        nine.setFont(new Font("Raleway", Font.BOLD,20));
        nine.setBackground(Color.white);
        nine.setBounds(440,645,88,60);
        nine.addActionListener(e -> appendToActiveTextField(nine.getText()));
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

    }
    private void appendToActiveTextField(String text) {
        if (isPinTextActive) {
            pinText.setText(pinText.getText() + text);
        } else {
            repinText.setText(repinText.getText() + text);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }



    public static void main(String[] args){
        new PinChange("");
    }


}