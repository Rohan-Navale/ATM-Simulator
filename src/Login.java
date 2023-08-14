//Sign In -> Application Form -> Additional Details -> Account Details -> ATM Interface Deposit
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JButton login,clear,register; // since it should be accessed by the actionlistner so it is declared globally
    JTextField cardTextField;
    JPasswordField pinTextField; //since password should be hidden while typing JPasswordField should be used.
    Login(){

        setTitle("Automated Teller Machine");
        setLayout(null); // to use customized layout
//
//        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/EASE Bank LOGO.png")); // Fetch th image frm address
//        Image I2 = I1.getImage().getScaledInstance(546,146, Image.SCALE_DEFAULT); // Sets images in pre sized box
//        ImageIcon I3 = new ImageIcon(I2); //Conversion of Image to icon since JLable is not compatible with Image
//        JLabel label = new JLabel(I3);   // used to get image on the frame
//        label.setBounds(70, 10, 100, 100);
//        add(label);

        ImageIcon originalIcon = new ImageIcon(ClassLoader.getSystemResource("icons/EASE Bank LOGO.png")); // Load the image
        Image originalImage = originalIcon.getImage(); // Get the original image
// Scale the original image to your preferred size
        int width = 162; // Preferred width
        int height = 44; // Preferred height
        Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
// Create a new ImageIcon from the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
// Create a JLabel and set the scaled ImageIcon to it
        JLabel label = new JLabel(scaledIcon);
        label.setBounds(23, 21, width, height); // Set the position and size of the JLabel
        add(label); // Add the JLabel to your frame


        JLabel text = new JLabel("EASE BANK "); // JLable is used to get text or image on frame
        text.setFont(new Font("Roboto", Font.BOLD,24));
        text.setForeground(new Color(244,121,32));    //foregroundColor means text color only
        text.setBounds(219,30, 400, 70);
        add(text);

        JLabel text2 = new JLabel("ATM SYSTEMS"); // JLable is used to get text or image on frame
        text2.setFont(new Font("Roboto", Font.BOLD,24));
        text2.setForeground(Color.WHITE);    //foregroundColor means text color only
        text2.setBounds(370,30, 400, 70);
        add(text2);

        JLabel text1 = new JLabel("WELCOMES YOU");
        text1.setFont(new Font("Roboto", Font.BOLD,24));
        text1.setForeground(Color.WHITE);
        text1.setBounds(280,65, 362, 70);
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
        login.setBounds(450, 238, 104, 28);
        login.addActionListener(this);
        login.setFont(new Font("Roboto", Font.BOLD,14));
        login.setForeground(Color.white);
        login.setBackground(new Color(137,58,218));
        add(login);

        clear = new JButton("Clear");
        clear.setBounds(362, 238, 80, 28);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        clear.setFont(new Font("Roboto", Font.BOLD,14));
        clear.setBackground(new Color(92,70,156));
        add(clear);

        register = new JButton("Register");
        register.setBounds(362, 276, 193, 28);
        register.setForeground(Color.white);
        register.addActionListener(this);
        register.setFont(new Font("Roboto", Font.BOLD,14));
        register.setBackground(new Color(29,38,125));
        add(register);


        setSize(800,400); // Set the Frame Size
        getContentPane().setBackground(new Color(12,19,79));
        setVisible(true);
        setLocation(350,200);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(ae.getSource() == register){
            setVisible(false);
            new SignUpOne().setVisible(true);
        }else if(ae.getSource() == login){
            Conn conn = new Conn();
            String cardNumber = cardTextField.getText();
            String pinNumber = pinTextField.getText();
            String query1 = "SELECT * FROM logIn WHERE cardNo = '"+cardNumber+"' AND pinNo = '"+pinNumber+"'";
            try{
               ResultSet rs = conn.s.executeQuery(query1);
               if(rs.next()){
                   setVisible(false);
                   new Trans(cardNumber,pinNumber).setVisible(true);
               } else {
                   JOptionPane.showMessageDialog(null,"Invalid Card Number or PIN");
               }
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args){
        new Login();
    }
}