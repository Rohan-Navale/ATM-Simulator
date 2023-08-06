import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame {
JTextField ffield, rfield,cfield, ifield, ofield, pfield,aafield;
JButton sub;
JDateChooser date;
JRadioButton male,female,maried,single;
    SignUpOne(){

        setLayout(null);/// VVImp otherwise the text will be at the center

        JLabel a = new JLabel("Personal Details:");
        a.setForeground(Color.white);
        a.setFont(new Font("Roboto",Font.BOLD,28));
        a.setBounds(44,48,239,35);
        add(a);

        JLabel f = new JLabel("Name");
        f.setForeground(Color.white);
        f.setFont(new Font("Roboto",Font.PLAIN,24));
        f.setBounds(44,120,320,33);
        add(f);

        ffield = new JTextField();
        ffield.setBounds(404,120,370,33);
        ffield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(ffield);


        JLabel r = new JLabel("Father's Name");
        r.setForeground(Color.white);
        r.setFont(new Font("Roboto",Font.PLAIN,24));
        r.setBounds(44,183,320,33);
        add(r);

        rfield = new JTextField();
        rfield.setBounds(404,183,370,33);
        rfield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(rfield);

        JLabel c = new JLabel("Date of Birth");
        c.setForeground(Color.white);
        c.setFont(new Font("Roboto",Font.PLAIN,24));
        c.setBounds(44,246,320,33);
        add(c);

        date = new JDateChooser(); //Jcalender.jar file was not available. Downloaded and added. File-> Project Structure -> Library -> Add -> Apply
        date.setBounds(404,246,370,33);
        date.setForeground(Color.BLACK);
        date.setFont(new Font("Roboto",Font.PLAIN,22));
        add(date);

        JLabel g = new JLabel("Gender");
        g.setForeground(Color.white);
        g.setFont(new Font("Roboto",Font.PLAIN,24));
        g.setBounds(44,309,320,33);
        add(g);

        male = new JRadioButton("Male");
        male.setFont(new Font("Roboto",Font.PLAIN,18));
        male.setForeground(Color.white);
        male.setBounds(404,316,80,20);
        male.setBackground(Color.darkGray);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(574,316,100,20);
        female.setFont(new Font("Roboto",Font.PLAIN,18));
        female.setForeground(Color.white);
        female.setBackground(Color.darkGray);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup(); // This will remove the option of selecting both the options
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel i = new JLabel("Email Address");
        i.setForeground(Color.white);
        i.setFont(new Font("Roboto",Font.PLAIN,24));
        i.setBounds(44,372,320,33);
        add(i);

        ifield = new JTextField();
        ifield.setBounds(404,372,370,33);
        ifield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(ifield);

        JLabel e = new JLabel("Marital Occupation");
        e.setForeground(Color.white);
        e.setFont(new Font("Roboto",Font.PLAIN,24));
        e.setBounds(44,435,320,33);
        add(e);

        maried = new JRadioButton("Married");
        maried.setFont(new Font("Roboto",Font.PLAIN,18));
        maried.setForeground(Color.white);
        maried.setBounds(404,442,100,20);
        maried.setBackground(Color.darkGray);
        add(maried);

        single = new JRadioButton("Unmarried");
        single.setBounds(574,442,150,20);
        single.setFont(new Font("Roboto",Font.PLAIN,18));
        single.setForeground(Color.white);
        single.setBackground(Color.darkGray);
        add(single);

        ButtonGroup maritalgroup = new ButtonGroup(); // This will remove the option of selecting both the options
        maritalgroup.add(maried);
        maritalgroup.add(single);

        JLabel o = new JLabel("Address");
        o.setForeground(Color.white);
        o.setFont(new Font("Roboto",Font.PLAIN,24));
        o.setBounds(44,498,320,33);
        add(o);

        ofield = new JTextField();
        ofield.setBounds(404,498,370,33);
        ofield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(ofield);

        JLabel p = new JLabel("City");
        p.setForeground(Color.white);
        p.setFont(new Font("Roboto",Font.PLAIN,24));
        p.setBounds(44,561,320,33);
        add(p);

        pfield = new JTextField();
        pfield.setBounds(404,561,370,33);
        pfield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(pfield);

        JLabel aa = new JLabel("PIN Code");
        aa.setForeground(Color.white);
        aa.setFont(new Font("Roboto",Font.PLAIN,24));
        aa.setBounds(44,624,320,33);
        add(aa);

        aafield = new JTextField();
        aafield.setBounds(404,624,370,33);
        aafield.setFont(new Font("Roboto", Font.PLAIN,22));
        add(aafield);

        sub = new JButton("Next");
        sub.setBounds(604,690,170,40);
        sub.setBackground(Color.DARK_GRAY);
        sub.setForeground(Color.white);
        sub.setFont(new Font("Roboto", Font.PLAIN,18));
        add(sub);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        getContentPane().setBackground(Color.darkGray);

    }

    public static void main(String[] args){
        new SignUpOne();
    }
}
