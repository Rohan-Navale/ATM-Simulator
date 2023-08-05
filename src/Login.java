//Sign In -> Application Form -> Additional Details -> Account Details -> ATM Interface Deposit
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton login,clear,register; // since it should be accessed by the actionlistner so it is declared globally
    JTextField cardTextField;
    JPasswordField pinTextField; //since password should be hidden while typing JPasswordField should be used.
    Login(){

        setTitle("Automated Teller Machine");
        setLayout(null); // to use customized layout

//        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png")); // Fetch th image frm address
//        Image I2 = I1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT); // Sets images in pre sized box
//        ImageIcon I3 = new ImageIcon(I2); //Conversion of Image to icon since JLable is not compatible with Image
//        JLabel label = new JLabel(I3);   // used to get image on the frame
//        label.setBounds(70, 10, 100, 100);
//        add(label);

        JLabel text = new JLabel("CENTRAL BANK ATM Systems"); // JLable is used to get text or image on frame
        text.setFont(new Font("Roboto", Font.BOLD,24));
        text.setForeground(Color.WHITE);    //foregroundColor means text color only
        text.setBounds(219,38, 362, 70);
        add(text);

        JLabel text1 = new JLabel("Welcomes You");
        text1.setFont(new Font("Roboto", Font.BOLD,24));
        text1.setForeground(Color.WHITE);
        text1.setBounds(300,65, 362, 70);
        add(text1);

        JLabel cardno = new JLabel("Card Number :");
        cardno.setFont(new Font("Roboto", Font.BOLD,20));
        cardno.setForeground(Color.WHITE);
        cardno.setBounds(219,133, 156, 35);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(362,136,192,30);
        cardTextField.setFont(new Font("Roboto", Font.BOLD,18));
        add(cardTextField);

        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Roboto", Font.BOLD,20));
        pin.setForeground(Color.WHITE);
        pin.setBounds(311,183, 53, 35);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(362,186,192,30);
        pinTextField.setFont(new Font("Roboto", Font.BOLD,18));
        add(pinTextField);

        login = new JButton("Sign In");
        login.setBounds(450, 238, 100, 28);
        login.addActionListener(this);
        login.setFont(new Font("Roboto", Font.PLAIN,14));
        login.setForeground(Color.white);
        login.setBackground(Color.DARK_GRAY);
        add(login);

        clear = new JButton("Clear");
        clear.setBounds(360, 238, 80, 28);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        clear.setFont(new Font("Roboto", Font.PLAIN,14));
        clear.setBackground(Color.DARK_GRAY);
        add(clear);

        register = new JButton("Register");
        register.setBounds(360, 276, 190, 28);
        register.setForeground(Color.white);
        register.addActionListener(this);
        register.setFont(new Font("Roboto", Font.PLAIN,14));
        register.setBackground(Color.darkGray);
        add(register);


        setSize(800,400); // Set the Frame Size
        getContentPane().setBackground(Color.darkGray);
        setVisible(true);
        setLocation(350,200);







    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(ae.getSource() == register){

        }else if(ae.getSource() == login){

        }
    }
    public static void main(String[] args){
        new Login();
    }
}