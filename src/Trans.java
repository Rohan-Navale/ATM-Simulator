import javax.swing.*;
import java.awt.*;

public class Trans extends JFrame {
    Trans(){
        setLayout(null);
        setLayout(null);
        setVisible(true);
        setSize(900,850);
        setLocation(300,0);
        setTitle("ATM Interface");
        getContentPane().setBackground(new Color(12,19,79));


        JButton withdraw = new JButton("Cash Withdrawl");
        withdraw.setBounds(554,169,300,60);
        withdraw.setBackground(new Color(137,58,218));
        withdraw.setFont(new Font("Raleway",Font.BOLD,22));
        withdraw.setForeground(Color.WHITE);
        add(withdraw);

        JButton mini = new JButton("Mini Statement");
        mini.setBounds(554,249,300,60);
        mini.setBackground(new Color(137,58,218));
        mini.setFont(new Font("Raleway",Font.BOLD,22));
        mini.setForeground(Color.WHITE);
        add(mini);

        JButton balance = new JButton("Balance Enquiry");
        balance.setBounds(554,329,300,60);
        balance.setBackground(new Color(137,58,218));
        balance.setFont(new Font("Raleway",Font.BOLD,22));
        balance.setForeground(Color.WHITE);
        add(balance);

        JButton exit = new JButton("Exit");
        exit.setBounds(554,409,300,60);
        exit.setBackground(new Color(137,58,218));
        exit.setFont(new Font("Raleway",Font.BOLD,22));
        exit.setForeground(Color.WHITE);
        add(exit);

        JButton dep = new JButton("Deposit");
        dep.setBounds(30,169,300,60);
        dep.setBackground(new Color(137,58,218));
        dep.setFont(new Font("Raleway",Font.BOLD,22));
        dep.setForeground(Color.WHITE);
        add(dep);

        JButton cash = new JButton("Fast Cash");
        cash.setBounds(30,249,300,60);
        cash.setBackground(new Color(137,58,218));
        cash.setFont(new Font("Raleway",Font.BOLD,22));
        cash.setForeground(Color.WHITE);
        add(cash);

        JButton change = new JButton("PIN Change");
        change.setBounds(30,329,300,60);
        change.setBackground(new Color(137,58,218));
        change.setFont(new Font("Raleway",Font.BOLD,22));
        change.setForeground(Color.WHITE);
        add(change);

        JButton one = new JButton("1");
        one.setForeground(Color.BLACK);
        one.setFont(new Font("Raleway", Font.BOLD,20));
        one.setBackground(Color.white);
        one.setBounds(242,505,88,60);
        add(one);

        JButton four = new JButton("4");
        four.setForeground(Color.BLACK);
        four.setFont(new Font("Raleway", Font.BOLD,20));
        four.setBackground(Color.white);
        four.setBounds(242,575,88,60);
        add(four);

        JButton seven = new JButton("7");
        seven.setForeground(Color.BLACK);
        seven.setFont(new Font("Raleway", Font.BOLD,20));
        seven.setBackground(Color.white);
        seven.setBounds(242,645,88,60);
        add(seven);

        JButton star = new JButton("*");
        star.setForeground(Color.BLACK);
        star.setFont(new Font("Raleway", Font.BOLD,20));
        star.setBackground(Color.white);
        star.setBounds(242,715,88,60);
        add(star);

        JButton two = new JButton("2");
        two.setForeground(Color.BLACK);
        two.setFont(new Font("Raleway", Font.BOLD,20));
        two.setBackground(Color.white);
        two.setBounds(340,505,88,60);
        add(two);

        JButton five = new JButton("5");
        five.setForeground(Color.BLACK);
        five.setFont(new Font("Raleway", Font.BOLD,20));
        five.setBackground(Color.white);
        five.setBounds(340,575,88,60);
        add(five);

        JButton eight = new JButton("8");
        eight.setForeground(Color.BLACK);
        eight.setFont(new Font("Raleway", Font.BOLD,20));
        eight.setBackground(Color.white);
        eight.setBounds(340,645,88,60);
        add(eight);

        JButton zero = new JButton("0");
        zero.setForeground(Color.BLACK);
        zero.setFont(new Font("Raleway", Font.BOLD,20));
        zero.setBackground(Color.white);
        zero.setBounds(340,715,88,60);
        add(zero);

        JButton three = new JButton("3");
        three.setForeground(Color.BLACK);
        three.setFont(new Font("Raleway", Font.BOLD,20));
        three.setBackground(Color.white);
        three.setBounds(440,505,88,60);
        add(three);

        JButton six = new JButton("6");
        six.setForeground(Color.BLACK);
        six.setFont(new Font("Raleway", Font.BOLD,20));
        six.setBackground(Color.white);
        six.setBounds(440,575,88,60);
        add(six);

        JButton nine = new JButton("9");
        nine.setForeground(Color.BLACK);
        nine.setFont(new Font("Raleway", Font.BOLD,20));
        nine.setBackground(Color.white);
        nine.setBounds(440,645,88,60);
        add(nine);

        JButton hashtag = new JButton("#");
        hashtag.setForeground(Color.BLACK);
        hashtag.setFont(new Font("Raleway", Font.BOLD,20));
        hashtag.setBackground(Color.white);
        hashtag.setBounds(440,715,88,60);
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

        JPanel rectangle = new JPanel();
        rectangle.setBounds(10,10,867,483);
        rectangle.setBackground(new Color(11,58,151));
        add(rectangle);

    }
    public static void main(String[] args){
        new Trans();
    }
}






