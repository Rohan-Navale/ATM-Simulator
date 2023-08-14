import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame implements ActionListener{
JTextField nameField, fatherField,cfield, emailField, addressField, cityField,aafield,stateTextfield;
JButton sub;
JDateChooser date;
JRadioButton male,female,maried,single;
    Random ran   = new Random();
    long random = Math.abs((ran.nextLong()%9000L)+1000L);
    String formno = ""+random;
    SignUpOne(){
        setTitle("New User Registration - Page 1");
        setLayout(null);/// VVImp otherwise the text will be at the center

        ImageIcon originalIcon = new ImageIcon(ClassLoader.getSystemResource("icons/EASE Bank LOGO.png"));
        Image originalImage = originalIcon.getImage();
        int width = 162;
        int height = 44;
        Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel label = new JLabel(scaledIcon);
        label.setBounds(660, 10, width, height);
        add(label);

        JLabel a = new JLabel("Personal Details:");
        a.setForeground(Color.white);
        a.setFont(new Font("Roboto",Font.BOLD,28));
        a.setBounds(44,48,239,35);
        add(a);

        JLabel x = new JLabel("Your Application No. "+ random);
        x.setForeground(Color.white);
        x.setFont(new Font("Roboto",Font.PLAIN,20));
        x.setBounds(404,48,320,33);
        add(x);

        JLabel f = new JLabel("Name");
        f.setForeground(Color.white);
        f.setFont(new Font("Roboto",Font.PLAIN,24));
        f.setBounds(44,120,320,33);
        add(f);

        nameField = new JTextField();
        nameField.setBounds(404,120,370,33);
        nameField.setFont(new Font("Roboto", Font.PLAIN,22));
        add(nameField);

        JLabel r = new JLabel("Father's Name");
        r.setForeground(Color.white);
        r.setFont(new Font("Roboto",Font.PLAIN,24));
        r.setBounds(44,183,320,33);
        add(r);

        fatherField = new JTextField();
        fatherField.setBounds(404,183,370,33);
        fatherField.setFont(new Font("Roboto", Font.PLAIN,22));
        add(fatherField);

        JLabel c = new JLabel("Date of Birth");
        c.setForeground(Color.white);
        c.setFont(new Font("Roboto",Font.PLAIN,24));
        c.setBounds(44,246,320,33);
        add(c);

        date = new JDateChooser(); //Jcalender.jar file was not available. Downloaded and added. File-> Project Structure -> Library -> Add -> Apply
        date.setBounds(404,246,370,33);
        date.setForeground(Color.BLACK);
        date.setFont(new Font("Roboto",Font.PLAIN,18));
        add(date);

        JLabel g = new JLabel("Gender");
        g.setForeground(Color.white);
        g.setFont(new Font("Roboto",Font.PLAIN,24));
        g.setBounds(44,300,320,33);
        add(g);

        male = new JRadioButton("Male");
        male.setFont(new Font("Roboto",Font.PLAIN,18));
        male.setForeground(Color.white);
        male.setBounds(404,306,80,20);
        male.setBackground(new Color(46,51,90));
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(574,306,100,20);
        female.setFont(new Font("Roboto",Font.PLAIN,18));
        female.setForeground(Color.white);
        female.setBackground(new Color(46,51,90));
        add(female);

        ButtonGroup gendergroup = new ButtonGroup(); // This will remove the option of selecting both the options
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel i = new JLabel("Email Address");
        i.setForeground(Color.white);
        i.setFont(new Font("Roboto",Font.PLAIN,24));
        i.setBounds(44,352,320,33);
        add(i);

        emailField = new JTextField();
        emailField.setBounds(404,352,370,33);
        emailField.setFont(new Font("Roboto", Font.PLAIN,22));
        add(emailField);

        JLabel e = new JLabel("Marital Status");
        e.setForeground(Color.white);
        e.setFont(new Font("Roboto",Font.PLAIN,24));
        e.setBounds(44,405,320,33);
        add(e);

        maried = new JRadioButton("Married");
        maried.setFont(new Font("Roboto",Font.PLAIN,18));
        maried.setForeground(Color.white);
        maried.setBounds(404,412,100,20);
        maried.setBackground(new Color(46,51,90));
        add(maried);

        single = new JRadioButton("Unmarried");
        single.setBounds(574,412,150,20);
        single.setFont(new Font("Roboto",Font.PLAIN,18));
        single.setForeground(Color.white);
        single.setBackground(new Color(46,51,90));
        add(single);

        ButtonGroup maritalgroup = new ButtonGroup(); // This will remove the option of selecting both the options
        maritalgroup.add(maried);
        maritalgroup.add(single);

        JLabel o = new JLabel("Address");
        o.setForeground(Color.white);
        o.setFont(new Font("Roboto",Font.PLAIN,24));
        o.setBounds(44,458,320,33);
        add(o);

        addressField = new JTextField();
        addressField.setBounds(404,458,370,33);
        addressField.setFont(new Font("Roboto", Font.PLAIN,22));
        add(addressField);

        JLabel p = new JLabel("City");
        p.setForeground(Color.white);
        p.setFont(new Font("Roboto",Font.PLAIN,24));
        p.setBounds(44,521,320,33);
        add(p);

        cityField = new JTextField();
        cityField.setBounds(404,521,370,33);
        cityField.setFont(new Font("Roboto", Font.PLAIN,22));
        add(cityField);

        JLabel aa = new JLabel("PIN Code");
        aa.setForeground(Color.white);
        aa.setFont(new Font("Roboto",Font.PLAIN,24));
        aa.setBounds(44,584,320,33);
        add(aa);

        aafield = new JTextField();
        aafield.setBounds(404,584,370,33);
        aafield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(aafield);

        JLabel statefield = new JLabel("State");
        statefield.setForeground(Color.white);
        statefield.setFont(new Font("Roboto",Font.PLAIN,24));
        statefield.setBounds(44,647,320,33);
        add(statefield);

        stateTextfield = new JTextField();
        stateTextfield.setBounds(404,647,370,33);
        stateTextfield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(stateTextfield);

        sub = new JButton("Next");
        sub.setBounds(604,710,170,40);
        sub.setBackground(new Color(92,70,156));
        sub.setForeground(Color.white);
        sub.addActionListener(this); ///////////MUST ADD BUTTON else data will not be added to db
        sub.setFont(new Font("Raleway", Font.BOLD,20));
        add(sub);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        getContentPane().setBackground(new Color(46,51,90));

    }

    @Override
    public void actionPerformed(ActionEvent ac) {

        String name = nameField.getText();
        String fname = fatherField.getText();
        String dob = ((JTextField) date.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        } else if(female.isSelected()) {
            gender = "Female";
        }
        String email=emailField.getText();
        String marital = null;
        if(maried.isSelected()){
            marital="Married";
        } else if(single.isSelected()){
            marital="Unmarried";
        }
        String address = addressField.getText();
        String city = cityField.getText();
        String pin = aafield.getText();
        String state = stateTextfield.getText();

        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name cannot be empty");
            } else {
                Conn c = new Conn();
               String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"','"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignUpTwo(formno).setVisible(true);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        new SignUpOne();
    }
}
