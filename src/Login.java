import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    Login(){

        setTitle("Automated Teller Machine");
        setLayout(null); // to use customized layout

//        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png")); // Fetch th image frm address
//        Image I2 = I1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT); // Sets images in pre sized box
//        ImageIcon I3 = new ImageIcon(I2); //Conversion of Image to icon since JLable is not compatible with Image
//        JLabel label = new JLabel(I3);   // used to get image on the frame
//        label.setBounds(70, 10, 100, 100);
//        add(label);

        JLabel text = new JLabel("CENTRAL BANK ATM Systems"); // JLanble is used to get text or image on frame
        text.setFont(new Font("Roboto", Font.BOLD,24));
        text.setForeground(Color.WHITE);
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

        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Roboto", Font.BOLD,20));
        pin.setForeground(Color.WHITE);
        pin.setBounds(219,183, 53, 35);
        add(pin);


        setSize(800,400); // Set the Frame Size
        getContentPane().setBackground(Color.getColor("clr", 333333));
        setVisible(true);
        setLocation(350,200);



    }
    public static void main(String[] args){
        new Login();
    }
}